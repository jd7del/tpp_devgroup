package com.projectsandroid.www.tupromo.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Jason Delgado M on 04/06/2016.
 */
public class Usuario {


    private String nombres;
    private String apellidos;
    private String e_mail;
    private String nick_user;
    private String password;
    private Date fecha_inscripcion;
    private int saldo_debe;
    private Plan plan;
    private ArrayList<Interes> intereses;
    private ArrayList<Tienda> favoritos;

    public Usuario(String nombres, String apellidos, String e_mail, String nick_user, String password) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.e_mail = e_mail;
        this.nick_user = nick_user;
        this.password = password;
        this.fecha_inscripcion = new Date();
        this.saldo_debe = 0;
    }

    public Usuario() {
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

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getNick_user() {
        return nick_user;
    }

    public void setNick_user(String nick_user) {
        this.nick_user = nick_user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Interes> getIntereses() {
        return intereses;
    }

    public void setIntereses(ArrayList<Interes> intereses) {
        this.intereses = intereses;
    }

    public ArrayList<Tienda> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList<Tienda> favoritos) {
        this.favoritos = favoritos;
    }

    public void agregar_favorito(Tienda tienda) {
        favoritos.add(tienda);
    }

    public void quitar_favorito(Tienda tienda) {
        favoritos.remove(tienda);
    }

    public Date getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public void setFecha_inscripcion(Date fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }

    public int getSaldo_debe() {
        return saldo_debe;
    }

    public void setSaldo_debe(int saldo_debe) {
        this.saldo_debe = saldo_debe;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}
