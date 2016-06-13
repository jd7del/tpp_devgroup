package com.projectsandroid.www.tupromo.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Jason Delgado M on 04/06/2016.
 */
public class Usuario {

    private int id;
    private String e_mail;
    private String nick_user;
    private String password;
    private String salt;
    private Date fecha_inscripcion;

    private ArrayList<Tienda> favoritos;
    private ArrayList<Interes> intereses;

    public Usuario(String nombres, String apellidos, String e_mail, String nick_user, String password) {
        this.e_mail = e_mail;
        this.nick_user = nick_user;
        this.password = password;
        this.fecha_inscripcion = new Date();
    }

    public Usuario() {
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

    public Date getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public void setFecha_inscripcion(Date fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }

    public ArrayList<Tienda> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList<Tienda> favoritos) {
        this.favoritos = favoritos;
    }

    public void agregar_favorito(Tienda tienda){
        favoritos.add(tienda);
    }

    public void quitar_favorito(Tienda tienda){
        favoritos.remove(tienda);
    }

    public ArrayList<Interes> getIntereses() {
        return intereses;
    }

    public void setIntereses(ArrayList<Interes> intereses) {
        this.intereses = intereses;
    }

    public void agrega_interes(Interes interes){
        intereses.add(interes);
    }

    public void quitar_interes(Interes interes){
        intereses.remove(interes);
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
