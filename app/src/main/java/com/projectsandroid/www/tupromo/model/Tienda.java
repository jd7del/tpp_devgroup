package com.projectsandroid.www.tupromo.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Jason Delgado M on 04/06/2016.
 */
public class Tienda {

    private String nombre;
    private String direccion;
    private double telefono1;
    private double telefono2;
    private String imagen;
    private String descripcion;
    private Date fecha_matricula;
    private ArrayList<String> promociones;

    public Tienda() {
    }

    public Tienda(String nombre, String direccion, double telefono1, double telefono2, String imagen, String descripcion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.imagen = imagen;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(double telefono1) {
        this.telefono1 = telefono1;
    }

    public double getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(double telefono2) {
        this.telefono2 = telefono2;
    }

    public Date getFecha_matricula() {
        return fecha_matricula;
    }

    public void setFecha_matricula(Date fecha_matricula) {
        this.fecha_matricula = fecha_matricula;
    }

    public ArrayList<String> getPromociones() {
        return promociones;
    }

    public void setPromociones(ArrayList<String> promociones) {
        this.promociones = promociones;
    }

    public void agregarPromocion(String promocion){
        promociones.add(promocion);
    }

    public void eliminarPromocion(Promocion promocion){
        promociones.remove(promocion);
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
}
