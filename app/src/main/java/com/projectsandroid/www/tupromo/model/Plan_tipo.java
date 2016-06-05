package com.projectsandroid.www.tupromo.model;

/**
 * Created by Jason Delgado M on 05/06/2016.
 */
public enum Plan_tipo {
    FREE(1),
    PREMIUM(2),
    STANDARD(3);

    //Campos tipo constante
    private final int val; //codigo del plan

    /**
     * Constructor. Al asignarle uno de los valores posibles a una variable del tipo enumerado el constructor asigna
     * automáticamente valores de los campos
     */
    Plan_tipo(int val) {
        this.val = val;
    } //Cierre del constructor

    //Métodos de la clase tipo Enum
    public int getValor() {
        return val;
    }
}

