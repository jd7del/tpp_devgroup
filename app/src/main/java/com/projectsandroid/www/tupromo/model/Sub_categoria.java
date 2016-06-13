package com.projectsandroid.www.tupromo.model;

/**
 * Created by Jason Delgado M on 13/06/2016.
 */
public class Sub_categoria {

    private int id;
    private String nombre;
    private Categoria categoria;

    public Sub_categoria() {

    }

    public Sub_categoria(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
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

    public Categoria get_categoria() {
        return categoria;
    }

    public void set_categoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
