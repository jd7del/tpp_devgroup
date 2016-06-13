package com.projectsandroid.www.tupromo.model;

import java.util.Date;

/**
 * Created by Jason Delgado M on 04/06/2016.
 */
public class Promocion {

    private int id;
    private String titulo;
    private String detalle;
    private String imagen;
    private int porcentaje;
    private int precio_anterior;
    private int precio_actual;
    private Date fecha_inicia;
    private Date fecha_finaliza;
    private boolean estado;
    private int tipo;

    private Tienda tienda;
    private Categoria categoria;
    private Sub_categoria subcategoria;


    public Promocion(String titulo, String detalle, String imagen, Date fecha_inicia, Date fecha_finaliza, boolean estado, int tipo) {
        this.titulo = titulo;
        this.detalle = detalle;
        this.imagen = imagen;
        this.fecha_inicia = fecha_inicia;
        this.fecha_finaliza = fecha_finaliza;
        this.estado = estado;
        this.tipo = tipo;
    }

    public Promocion() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Date getFecha_inicia() {
        return fecha_inicia;
    }

    public void setFecha_inicia(Date fecha_inicia) {
        this.fecha_inicia = fecha_inicia;
    }

    public Date getFecha_finaliza() {
        return fecha_finaliza;
    }

    public void setFecha_finaliza(Date fecha_finaliza) {
        this.fecha_finaliza = fecha_finaliza;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getPrecio_anterior() {
        return precio_anterior;
    }

    public void setPrecio_anterior(int precio_anterior) {
        this.precio_anterior = precio_anterior;
    }

    public int getPrecio_actual() {
        return precio_actual;
    }

    public void setPrecio_actual(int precio_actual) {
        this.precio_actual = precio_actual;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Sub_categoria getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(Sub_categoria subcategoria) {
        this.subcategoria = subcategoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
