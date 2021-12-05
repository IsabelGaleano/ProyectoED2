package com.estructuras.proyecto.entities;

import java.io.Serializable;

public class DireccionModel implements Serializable {

    private PlayaModel playa;
    private int costo;

    public DireccionModel() {
    }

    public DireccionModel(PlayaModel playa, int costo) {
        this.playa = playa;
        this.costo = costo;
    }

    public PlayaModel getPlaya() {
        return playa;
    }

    public void setPlaya(PlayaModel playa) {
        this.playa = playa;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
