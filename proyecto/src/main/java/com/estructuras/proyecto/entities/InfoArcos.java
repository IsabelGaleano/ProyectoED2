package com.estructuras.proyecto.entities;

import java.io.Serializable;

public class InfoArcos implements Serializable {
    private PlayaModel inicio;
    private PlayaModel fin;
    private int costo;

    public InfoArcos() {
    }

    public InfoArcos(PlayaModel inicio, PlayaModel fin, int costo) {
        this.inicio = inicio;
        this.fin = fin;
        this.costo = costo;
    }

    public PlayaModel getInicio() {
        return inicio;
    }

    public void setInicio(PlayaModel inicio) {
        this.inicio = inicio;
    }

    public PlayaModel getFin() {
        return fin;
    }

    public void setFin(PlayaModel fin) {
        this.fin = fin;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
