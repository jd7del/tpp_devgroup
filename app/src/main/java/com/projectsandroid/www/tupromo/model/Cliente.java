package com.projectsandroid.www.tupromo.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Jason Delgado M on 13/06/2016.
 */
public class Cliente extends Usuario implements Serializable {

    private String nombres;
    private String apellidos;
    private String telefono;
    private String foto;
    private Plan plan;
    private int saldo;
    private Date fecha_matricula;
    private boolean estado;

    public Cliente() {
    }

    public Cliente(String nombres, String apellidos, String e_mail, String nick_user, String password, String nombres1, String apellidos1, String telefono, String foto, Plan plan, int saldo) {
        super(nombres, apellidos, e_mail, nick_user, password);
        this.telefono = telefono;
        this.foto = foto;
        this.plan = plan;
        this.saldo = saldo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Date getFecha_matricula() {
        return fecha_matricula;
    }

    public void setFecha_matricula(Date fecha_matricula) {
        this.fecha_matricula = fecha_matricula;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
