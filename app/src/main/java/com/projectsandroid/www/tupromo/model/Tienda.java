package com.projectsandroid.www.tupromo.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Jason Delgado M on 04/06/2016.
 */
public class Tienda {

    private String nombre;
    private String direccion;
    private int plan_tipo;
    private double telefono1;
    private double telefono2;
    private Date fecha_matricula;
    private ArrayList<Promocion> promociones;



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

    public int getPlan_tipo() {
        return plan_tipo;
    }

    public void setPlan_tipo(int plan_tipo) {
        this.plan_tipo = plan_tipo;
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

    public ArrayList<Promocion> getPromociones() {
        return promociones;
    }

    public void setPromociones(ArrayList<Promocion> promociones) {
        this.promociones = promociones;
    }

    public void agregarPromocion(Promocion promocion){
        promociones.add(promocion);
    }

    public void eliminarPromocion(Promocion promocion){
        promociones.remove(promocion);
    }
}
