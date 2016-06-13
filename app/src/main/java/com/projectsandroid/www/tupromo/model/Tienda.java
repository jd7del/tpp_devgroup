package com.projectsandroid.www.tupromo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Jason Delgado M on 04/06/2016.
 */
public class Tienda implements Serializable {

    private int id;
    private String nombre;
    private String direccion;
    private String telefono1;
    private String telefono2;
    private String imagen;
    private String descripcion;
    private Date fecha_matricula;
    private Cliente cliente;
    private double coordenada_x;
    private double coordenada_y;

    private ArrayList<Promocion> promociones;
    private ArrayList<Categoria> categorias;

    public Tienda() {
    }

    public Tienda(String nombre, String direccion, String telefono1, String telefono2, String imagen, String descripcion) {
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

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public Date getFecha_matricula() {
        return fecha_matricula;
    }

    public void setFecha_matricula(Date fecha_matricula) {
        this.fecha_matricula = fecha_matricula;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getCoordenada_x() {
        return coordenada_x;
    }

    public void setCoordenada_x(double coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    public double getCoordenada_y() {
        return coordenada_y;
    }

    public void setCoordenada_y(double coordenada_y) {
        this.coordenada_y = coordenada_y;
    }

    public ArrayList<Promocion> getPromociones() {
        return promociones;
    }

    public void setPromociones(ArrayList<Promocion> promociones) {
        this.promociones = promociones;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public void agregar_categoria(Categoria categoria){
        categorias.add(categoria);
    }

    public void quitar_categoria(Categoria categoria){
       categorias.remove(categoria);
    }

    public void agregar_promocion(Promocion promocion){
        promociones.add(promocion);
    }

    public void quitar_promocion(Promocion promocion){
        promociones.remove(promocion);
    }
}

