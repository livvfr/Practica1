package com.upiiz.Practica1.Controller;

import org.springframework.stereotype.Controller;
import com.upiiz.Practica1.Models.EtiquetaHTML;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;


@Controller
public class EtiquetaController {
    private List<EtiquetaHTML> etiquetas;
    public EtiquetaController(){
        etiquetas = new ArrayList<>();
        // Categoría: Estructura
        etiquetas.add(new EtiquetaHTML("html", "Estructura", "Define la raíz de un documento HTML.", "&lt;html&gt;...&lt;/html&gt;", "lang", "&lt;html lang=\"es\"&gt;...&lt;/html&gt;", "(Elemento raíz)"));
        etiquetas.add(new EtiquetaHTML("head", "Estructura", "Contiene metadatos del documento.", "&lt;head&gt;...&lt;/head&gt;", "profile", "&lt;head&gt;&lt;title&gt;Título&lt;/title&gt;&lt;/head&gt;", "(No visible)"));
        etiquetas.add(new EtiquetaHTML("body", "Estructura", "Contiene el contenido visible del documento.", "&lt;body&gt;...&lt;/body&gt;", "global attributes", "&lt;body&gt;&lt;h1&gt;Hola&lt;/h1&gt;&lt;/body&gt;", "Hola (contenido visible)"));

        // Categoría: Semánticas
        etiquetas.add(new EtiquetaHTML("header", "Semánticas", "Define la cabecera de una página o sección.", "&lt;header&gt;...&lt;/header&gt;", "global attributes", "&lt;header&gt;&lt;h1&gt;Logo&lt;/h1&gt;&lt;/header&gt;", "Logo (en cabecera)"));
        etiquetas.add(new EtiquetaHTML("footer", "Semánticas", "Define el pie de página de una página o sección.", "&lt;footer&gt;...&lt;/footer&gt;", "global attributes", "&lt;footer&gt;&copy; 2024&lt;/footer&gt;", "© 2024"));
        etiquetas.add(new EtiquetaHTML("section", "Semánticas", "Define una sección genérica en el documento.", "&lt;section&gt;...&lt;/section&gt;", "global attributes", "&lt;section&gt;&lt;h2&gt;Título&lt;/h2&gt;&lt;p&gt;Contenido&lt;/p&gt;&lt;/section&gt;", "Título\nContenido"));
        etiquetas.add(new EtiquetaHTML("article", "Semánticas", "Define contenido independiente y autónomo.", "&lt;article&gt;...&lt;/article&gt;", "global attributes", "&lt;article&gt;&lt;h2&gt;Noticia&lt;/h2&gt;&lt;p&gt;Texto...&lt;/p&gt;&lt;/article&gt;", "Noticia\nTexto..."));
        etiquetas.add(new EtiquetaHTML("nav", "Semánticas", "Define un conjunto de enlaces de navegación.", "&lt;nav&gt;...&lt;/nav&gt;", "global attributes", "&lt;nav&gt;&lt;a href=\"#\"&gt;Inicio&lt;/a&gt;&lt;/nav&gt;", "Inicio (enlace)"));

        // Categoría: Texto
        etiquetas.add(new EtiquetaHTML("p", "Texto", "Define un párrafo.", "&lt;p&gt;...&lt;/p&gt;", "global attributes", "&lt;p&gt;Este es un párrafo.&lt;/p&gt;", "Este es un párrafo."));
        etiquetas.add(new EtiquetaHTML("h1", "Texto", "Define el encabezado más importante.", "&lt;h1&gt;...&lt;/h1&gt;", "global attributes", "&lt;h1&gt;Título 1&lt;/h1&gt;", "Título 1 (Grande)"));
        etiquetas.add(new EtiquetaHTML("h2", "Texto", "Define un encabezado de nivel 2.", "&lt;h2&gt;...&lt;/h2&gt;", "global attributes", "&lt;h2&gt;Título 2&lt;/h2&gt;", "Título 2"));
        etiquetas.add(new EtiquetaHTML("h3", "Texto", "Define un encabezado de nivel 3.", "&lt;h3&gt;...&lt;/h3&gt;", "global attributes", "&lt;h3&gt;Título 3&lt;/h3&gt;", "Título 3"));
        etiquetas.add(new EtiquetaHTML("h4", "Texto", "Define un encabezado de nivel 4.", "&lt;h4&gt;...&lt;/h4&gt;", "global attributes", "&lt;h4&gt;Título 4&lt;/h4&gt;", "Título 4"));
        etiquetas.add(new EtiquetaHTML("h5", "Texto", "Define un encabezado de nivel 5.", "&lt;h5&gt;...&lt;/h5&gt;", "global attributes", "&lt;h5&gt;Título 5&lt;/h5&gt;", "Título 5"));
        etiquetas.add(new EtiquetaHTML("h6", "Texto", "Define un encabezado de nivel 6.", "&lt;h6&gt;...&lt;/h6&gt;", "global attributes", "&lt;h6&gt;Título 6&lt;/h6&gt;", "Título 6"));
        etiquetas.add(new EtiquetaHTML("span", "Texto", "Contenedor en línea genérico para texto.", "&lt;span&gt;...&lt;/span&gt;", "global attributes", "&lt;p&gt;Texto &lt;span style=\"color:red\"&gt;rojo&lt;/span&gt;&lt;/p&gt;", "Texto rojo"));
        etiquetas.add(new EtiquetaHTML("strong", "Texto", "Define texto con gran importancia (negrita).", "&lt;strong&gt;...&lt;/strong&gt;", "global attributes", "&lt;strong&gt;Importante&lt;/strong&gt;", "Importante (negrita)"));
        etiquetas.add(new EtiquetaHTML("em", "Texto", "Define texto enfatizado (cursiva).", "&lt;em&gt;...&lt;/em&gt;", "global attributes", "&lt;em&gt;Enfático&lt;/em&gt;", "Enfático (cursiva)"));
        etiquetas.add(new EtiquetaHTML("b", "Texto", "Define texto en negrita sin importancia semántica extra.", "&lt;b&gt;...&lt;/b&gt;", "global attributes", "&lt;b&gt;Negrita&lt;/b&gt;", "Negrita"));
        etiquetas.add(new EtiquetaHTML("i", "Texto", "Define texto en cursiva (término técnico, etc.).", "&lt;i&gt;...&lt;/i&gt;", "global attributes", "&lt;i&gt;Cursiva&lt;/i&gt;", "Cursiva"));
        etiquetas.add(new EtiquetaHTML("mark", "Texto", "Define texto resaltado o marcado.", "&lt;mark&gt;...&lt;/mark&gt;", "global attributes", "&lt;p&gt;Texto &lt;mark&gt;resaltado&lt;/mark&gt;&lt;/p&gt;", "Texto resaltado"));
        etiquetas.add(new EtiquetaHTML("small", "Texto", "Define texto pequeño (comentarios, derechos de autor).", "&lt;small&gt;...&lt;/small&gt;", "global attributes", "&lt;small&gt;Letra pequeña&lt;/small&gt;", "Letra pequeña"));
        etiquetas.add(new EtiquetaHTML("del", "Texto", "Define texto que ha sido eliminado.", "&lt;del&gt;...&lt;/del&gt;", "cite, datetime", "&lt;del&gt;Borrado&lt;/del&gt;", "Borrado (tachado)"));
        etiquetas.add(new EtiquetaHTML("ins", "Texto", "Define texto que ha sido insertado.", "&lt;ins&gt;...&lt;/ins&gt;", "cite, datetime", "&lt;ins&gt;Nuevo&lt;/ins&gt;", "Nuevo (subrayado)"));
        etiquetas.add(new EtiquetaHTML("sub", "Texto", "Define texto subíndice.", "&lt;sub&gt;...&lt;/sub&gt;", "global attributes", "H&lt;sub&gt;2&lt;/sub&gt;O", "H2O"));
        etiquetas.add(new EtiquetaHTML("sup", "Texto", "Define texto superíndice.", "&lt;sup&gt;...&lt;/sup&gt;", "global attributes", "E=mc&lt;sup&gt;2&lt;/sup&gt;", "E=mc2"));

        // Categoría: Enlaces e Imágenes
        etiquetas.add(new EtiquetaHTML("a", "Enlaces e Imágenes", "Define un hipervínculo.", "&lt;a href=\"...\"&gt;...&lt;/a&gt;", "href, target, download", "&lt;a href=\"https://google.com\"&gt;Google&lt;/a&gt;", "Google (enlace)"));
        etiquetas.add(new EtiquetaHTML("img", "Enlaces e Imágenes", "Define una imagen.", "&lt;img src=\"...\" alt=\"...\"&gt;", "src, alt, width, height", "&lt;img src=\"logo.png\" alt=\"Logo\"&gt;", "(Imagen)"));
        etiquetas.add(new EtiquetaHTML("picture", "Enlaces e Imágenes", "Define un contenedor para múltiples recursos de imagen.", "&lt;picture&gt;...&lt;/picture&gt;", "global attributes", "&lt;picture&gt;&lt;img src=\"img.jpg\"&gt;&lt;/picture&gt;", "(Imagen responsiva)"));

        // Categoría: Listas
        etiquetas.add(new EtiquetaHTML("ul", "Listas", "Define una lista desordenada.", "&lt;ul&gt;...&lt;/ul&gt;", "global attributes", "&lt;ul&gt;&lt;li&gt;Item&lt;/li&gt;&lt;/ul&gt;", "• Item"));
        etiquetas.add(new EtiquetaHTML("ol", "Listas", "Define una lista ordenada.", "&lt;ol&gt;...&lt;/ol&gt;", "start, type, reversed", "&lt;ol&gt;&lt;li&gt;Item&lt;/li&gt;&lt;/ol&gt;", "1. Item"));
        etiquetas.add(new EtiquetaHTML("li", "Listas", "Define un elemento de lista.", "&lt;li&gt;...&lt;/li&gt;", "value", "&lt;li&gt;Elemento&lt;/li&gt;", "• Elemento"));
        etiquetas.add(new EtiquetaHTML("dl", "Listas", "Define una lista de descripción.", "&lt;dl&gt;...&lt;/dl&gt;", "global attributes", "&lt;dl&gt;&lt;dt&gt;Término&lt;/dt&gt;&lt;dd&gt;Definición&lt;/dd&gt;&lt;/dl&gt;", "Término\n  Definición"));
        etiquetas.add(new EtiquetaHTML("dt", "Listas", "Define un término en una lista de descripción.", "&lt;dt&gt;...&lt;/dt&gt;", "global attributes", "&lt;dt&gt;HTML&lt;/dt&gt;", "HTML"));
        etiquetas.add(new EtiquetaHTML("dd", "Listas", "Define la descripción de un término.", "&lt;dd&gt;...&lt;/dd&gt;", "global attributes", "&lt;dd&gt;Lenguaje de marcado...&lt;/dd&gt;", "  Lenguaje de marcado..."));

        // Categoría: Tablas
        etiquetas.add(new EtiquetaHTML("table", "Tablas", "Define una tabla.", "&lt;table&gt;...&lt;/table&gt;", "global attributes", "&lt;table&gt;&lt;tr&gt;&lt;td&gt;Dato&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;", "(Tabla)"));
        etiquetas.add(new EtiquetaHTML("tr", "Tablas", "Define una fila en una tabla.", "&lt;tr&gt;...&lt;/tr&gt;", "global attributes", "&lt;tr&gt;&lt;td&gt;Celda&lt;/td&gt;&lt;/tr&gt;", "Celda"));
        etiquetas.add(new EtiquetaHTML("td", "Tablas", "Define una celda de datos en una tabla.", "&lt;td&gt;...&lt;/td&gt;", "colspan, rowspan", "&lt;td&gt;Dato&lt;/td&gt;", "Dato"));
        etiquetas.add(new EtiquetaHTML("th", "Tablas", "Define una celda de encabezado en una tabla.", "&lt;th&gt;...&lt;/th&gt;", "scope, colspan, rowspan", "&lt;th&gt;Título&lt;/th&gt;", "Título (negrita)"));
        etiquetas.add(new EtiquetaHTML("thead", "Tablas", "Agrupa el contenido del encabezado en una tabla.", "&lt;thead&gt;...&lt;/thead&gt;", "global attributes", "&lt;thead&gt;&lt;tr&gt;&lt;th&gt;Col&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt;", "Col"));
        etiquetas.add(new EtiquetaHTML("tbody", "Tablas", "Agrupa el contenido del cuerpo en una tabla.", "&lt;tbody&gt;...&lt;/tbody&gt;", "global attributes", "&lt;tbody&gt;...&lt;/tbody&gt;", "(Cuerpo tabla)"));
        etiquetas.add(new EtiquetaHTML("tfoot", "Tablas", "Agrupa el contenido del pie en una tabla.", "&lt;tfoot&gt;...&lt;/tfoot&gt;", "global attributes", "&lt;tfoot&gt;...&lt;/tfoot&gt;", "(Pie tabla)"));
        etiquetas.add(new EtiquetaHTML("caption", "Tablas", "Define un título para la tabla.", "&lt;caption&gt;...&lt;/caption&gt;", "global attributes", "&lt;caption&gt;Tabla 1&lt;/caption&gt;", "Tabla 1"));

        // Categoría: Formularios
        etiquetas.add(new EtiquetaHTML("form", "Formularios", "Define un formulario HTML.", "&lt;form&gt;...&lt;/form&gt;", "action, method, enctype", "&lt;form action=\"/enviar\"&gt;...&lt;/form&gt;", "(Formulario)"));
        etiquetas.add(new EtiquetaHTML("input", "Formularios", "Define un control de entrada. Tipos: text, password, radio, checkbox, submit, etc.", "&lt;input type=\"...\"&gt;", "type, name, value", "&lt;input type=\"text\" placeholder=\"Nombre\"&gt;", "[Nombre]"));
        etiquetas.add(new EtiquetaHTML("label", "Formularios", "Define una etiqueta para un elemento &lt;input&gt;.", "&lt;label&gt;...&lt;/label&gt;", "for", "&lt;label for=\"id\"&gt;Nombre:&lt;/label&gt;", "Nombre:"));
        etiquetas.add(new EtiquetaHTML("button", "Formularios", "Define un botón clicable.", "&lt;button&gt;...&lt;/button&gt;", "type, disabled", "&lt;button&gt;Click&lt;/button&gt;", "[Click]"));
        etiquetas.add(new EtiquetaHTML("select", "Formularios", "Define una lista desplegable.", "&lt;select&gt;...&lt;/select&gt;", "name, multiple", "&lt;select&gt;&lt;option&gt;A&lt;/option&gt;&lt;/select&gt;", "[A v]"));

        // Categoría: Multimedia
        etiquetas.add(new EtiquetaHTML("audio", "Multimedia", "Define contenido de sonido.", "&lt;audio&gt;...&lt;/audio&gt;", "src, controls, autoplay, loop", "&lt;audio controls&gt;\\n  &lt;source src=\"https://www.w3schools.com/html/horse.mp3\" type=\"audio/mpeg\"&gt;\\n  Tu navegador no soporta el elemento audio.\\n&lt;/audio&gt;", "<audio controls>\\n  <source src=\"https://www.w3schools.com/html/horse.mp3\" type=\"audio/mpeg\">\\n  Tu navegador no soporta el elemento audio.\\n</audio>"));
        etiquetas.add(new EtiquetaHTML("video", "Multimedia", "Define contenido de video.", "&lt;video&gt;...&lt;/video&gt;", "src, controls, width, height", "&lt;video width=\"320\" height=\"240\" controls&gt;\\n  &lt;source src=\"https://www.w3schools.com/html/mov_bbb.mp4\" type=\"video/mp4\"&gt;\\n  Tu navegador no soporta la etiqueta de video.\\n&lt;/video&gt;", "<video width=\"320\" height=\"240\" controls>\\n  <source src=\"https://www.w3schools.com/html/mov_bbb.mp4\" type=\"video/mp4\">\\n  Tu navegador no soporta la etiqueta de video.\\n</video>"));
        etiquetas.add(new EtiquetaHTML("source", "Multimedia", "Define múltiples recursos multimedia para &lt;video&gt; y &lt;audio&gt;, permitiendo al navegador elegir el formato más adecuado.", "&lt;source src=\"...\" type=\"...\"&gt;", "src, type, media", "&lt;video controls&gt;\\n  &lt;source src=\"movie.mp4\" type=\"video/mp4\"&gt;\\n  &lt;source src=\"movie.ogg\" type=\"video/ogg\"&gt;\\n  Tu navegador no soporta la etiqueta de video.\\n&lt;/video&gt;", "Se usa dentro de &lt;audio&gt; o &lt;video&gt; para especificar múltiples formatos de archivo."));
    }

    
    @GetMapping("/")
    public String inicio(Model model){
        model.addAttribute("etiquetas", etiquetas);
        return "index";
        //llama a index.html y le pasa la lista de etiquetas para mostrarla en la vista
    }
    //ruta dinamica
    @GetMapping("/etiqueta/{nombre}")
    public String detalleEtiqueta(@PathVariable String nombre, Model model){
        EtiquetaHTML etiquetaActual = null;
        int indexActual = -1;
        //realizamos busqueda
        for(int i = 0; i < etiquetas.size(); i++){
            if(etiquetas.get(i).getNombre().equalsIgnoreCase(nombre)){
                etiquetaActual = etiquetas.get(i);
                indexActual = i;
                break;
            }
        }
        if(etiquetaActual == null){
            return "redirect:/"; //si no se encuentra la etiqueta, redirige al inicio
        }
        EtiquetaHTML anterior = (indexActual > 0) ? etiquetas.get(indexActual -1 ) : null;
        EtiquetaHTML siguiente = (indexActual < etiquetas.size() -1) ? etiquetas.get(indexActual +1): null;

        model.addAttribute("etiqueta", etiquetaActual);
        model.addAttribute("anterior", anterior);
        model.addAttribute("siguiente", siguiente);
        return "detalleEtiqueta";
        //llama a detalleEtiqueta.html y le pasa la etiqueta actual, la anterior y la
    }

    
}
