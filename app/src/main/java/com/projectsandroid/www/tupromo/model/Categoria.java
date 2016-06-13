package com.projectsandroid.www.tupromo.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Jason Delgado M on 13/06/2016.
 */
public class Categoria implements Serializable {

    private int id;
    private String nombre;
    private String imagen;
    private String descripcion;
    private Date fecha_creada;

    public Categoria() {
    }

    public Categoria(int id, String nombre, String imagen, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_creada() {
        return fecha_creada;
    }

    public void setFecha_creada(Date fecha_creada) {
        this.fecha_creada = fecha_creada;
    }

}
