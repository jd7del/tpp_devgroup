package com.projectsandroid.www.tupromo.web_service;

import com.projectsandroid.www.tupromo.model.Promocion;

import java.util.List;

/**
 * Created by Jason Delgado M on 13/06/2016.
 */
public class Util_promociones {

    // Encapsulamiento de promociones
    private List<Promocion> promociones;

    public Util_promociones(List<Promocion> items) {
        this.promociones = items;
    }

    public void setPromociones(List<Promocion> items) {
        this.promociones = items;
    }

    public List<Promocion> getPromociones() {
        return promociones;
    }

}
