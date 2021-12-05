package com.estructuras.proyecto.entities;

public class NodoArco {
    private PlayaModel playa;
    private int costo;
    private NodoArco sig;

    public NodoArco() {
    }

    public NodoArco(PlayaModel playa, int costo) {
        this.playa = playa;
        this.costo = costo;
        this.sig = null;
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

    public NodoArco getSig() {
        return sig;
    }

    public void setSig(NodoArco sig) {
        this.sig = sig;
    }
}
