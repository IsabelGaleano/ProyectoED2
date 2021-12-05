package com.estructuras.proyecto.entities;

public class DatoHash {

    private PlayaModel playa;
    private DatoHash sig;

    public DatoHash(PlayaModel playa) {
        this.playa = playa;
        this.sig = null;
    }

    public PlayaModel getPlaya() {
        return playa;
    }

    public void setPlaya(PlayaModel playa) {
        this.playa = playa;
    }

    public DatoHash getSig() {
        return sig;
    }

    public void setSig(DatoHash sig) {
        this.sig = sig;
    }
}
