package com.projectsandroid.www.tupromo.model;

import java.util.Date;

/**
 * Created by Jason Delgado M on 07/06/2016.
 */
public class Plan {

    private String nombre;
    private String descripcion;
    private int valor;
    private int numero_publicaciones;
    private Date fecha_creado;
    private boolean estado;

    public Plan(String nombre, String descripcion, int valor, int numero_publicaciones) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
        this.numero_publicaciones = numero_publicaciones;
        this.estado=true;
        this.fecha_creado = new Date();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getNumero_publicaciones() {
        return numero_publicaciones;
    }

    public void setNumero_publicaciones(int numero_publicaciones) {
        this.numero_publicaciones = numero_publicaciones;
    }

    public Date getFecha_creado() {
        return fecha_creado;
    }

    public void setFecha_creado(Date fecha_creado) {
        this.fecha_creado = fecha_creado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
