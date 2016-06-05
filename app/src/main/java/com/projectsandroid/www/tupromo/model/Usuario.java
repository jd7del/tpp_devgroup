package com.projectsandroid.www.tupromo.model;

/**
 * Created by Jason Delgado M on 04/06/2016.
 */
public class Usuario {

    private String nombres;
    private String apellidos;
    private String e_mail;
    private String nick_user;
    private String password;
    private String[] intereses;

    public Usuario(String nombres, String apellidos, String e_mail, String nick_user, String password, String[] intereses) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.e_mail = e_mail;
        this.nick_user = nick_user;
        this.password = password;
        this.intereses = intereses;
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

    public String[] getIntereses() {
        return intereses;
    }

    public void setIntereses(String[] intereses) {
        this.intereses = intereses;
    }
}
