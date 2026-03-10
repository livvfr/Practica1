package com.upiiz.Practica1.Models;

public class EtiquetaHTML {
    private String  nombre;
    private String categoria;
    private String descripcion;
    private String sintaxis;
    private String atributos;
    private String ejemploCodigo;
    private String ejemploRenderizado;

    public EtiquetaHTML(String nombre, String categoria, String descripcion, String sintaxis, String atributos,String ejemploCodigo, String ejemploRenderizado) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.sintaxis = sintaxis;
        this.atributos = atributos;
        this.ejemploCodigo = ejemploCodigo;
        this.ejemploRenderizado = ejemploRenderizado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSintaxis() {
        return sintaxis;
    }

    public void setSintaxis(String sintaxis) {
        this.sintaxis = sintaxis;
    }

    public String getAtributos() {
        return atributos;
    }

    public void setAtributos(String atributos) {
        this.atributos = atributos;
    }


    public String getEjemploCodigo() {
        return ejemploCodigo;
    }

    public void setEjemploCodigo(String ejemploCodigo) {
        this.ejemploCodigo = ejemploCodigo;
    }

    public String getEjemploRenderizado() {
        return ejemploRenderizado;
    }

    public void setEjemploRenderizado(String ejemploRenderizado) {
        this.ejemploRenderizado = ejemploRenderizado;
    }
}
