package com.projectsandroid.www.tupromo.model;

import java.util.ArrayList;

/**
 * Created by Jason Delgado M on 13/06/2016.
 */
public class Centro_comercial {

    private int id;
    private String nombre;

    private ArrayList<Tienda> tiendas;

    public Centro_comercial() {
    }

    public Centro_comercial(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    public ArrayList<Tienda> getTiendas() {
        return tiendas;
    }

    public void setTiendas(ArrayList<Tienda> tiendas) {
        this.tiendas = tiendas;
    }

    private void agregar_tienda(Tienda tienda){
        tiendas.add(tienda);
    }

    private void quitar_tienda(Tienda tienda){
        tiendas.remove(tienda);
    }
}
