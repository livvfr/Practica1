# Etapa 1: Compilación
# Usamos una imagen de Maven con Java 21 para compilar el proyecto
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

# Copiamos primero el pom.xml y descargamos dependencias para aprovechar la caché de Docker
COPY pom.xml .
RUN mvn dependency:go-offline

# Copiamos el código fuente y compilamos
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: Ejecución
# Usamos una imagen ligera de Java 21 (JRE en lugar de JDK)
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app

# Exponemos el puerto de Spring Boot
EXPOSE 8080

# Copiamos el archivo .jar generado en la etapa anterior
COPY --from=build /app/target/Practica1-0.0.1-SNAPSHOT.jar app.jar

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]