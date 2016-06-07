package com.projectsandroid.www.tupromo.model;

import java.util.Date;

/**
 * Created by Jason Delgado M on 04/06/2016.
 */
public class Promocion {

    private String titulo;
    private String detalle;
    private String imagen;
    private Date fecha_inicia;
    private Date fecha_finaliza;
    private boolean estado;
    private int tipo;

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
}
