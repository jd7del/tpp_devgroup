package com.projectsandroid.www.tupromo.model;

import java.io.Serializable;

/**
 * Created by Jason Delgado M on 07/06/2016.
 */
public class Interes implements Serializable {

    private int id;
    private String nombre;

    public Interes() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
