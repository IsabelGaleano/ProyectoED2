package com.estructuras.proyecto.entities;

public class NodoVertice {

    private String idVertice;
    private ListaArcos arcos;
    private NodoVertice sig;
    private PlayaModel playa;

    public NodoVertice() {
        this.idVertice = null;
        this.sig = null;
        this.playa = null;
        this.arcos = new ListaArcos();
    }

    public NodoVertice(String idVertice, PlayaModel playa) {
        this.playa = playa;
        this.idVertice = idVertice;
        this.sig = null;
        this.arcos = new ListaArcos();
    }

    public String getIdVertice() {
        return idVertice;
    }

    public void setIdVertice(String idVertice) {
        this.idVertice = idVertice;
    }

    public ListaArcos getArcos() {
        return arcos;
    }

    public void setArcos(ListaArcos arcos) {
        this.arcos = arcos;
    }

    public NodoVertice getSig() {
        return sig;
    }

    public void setSig(NodoVertice sig) {
        this.sig = sig;
    }

    public PlayaModel getPlaya() {
        return playa;
    }

    public void setPlaya(PlayaModel playa) {
        this.playa = playa;
    }

    public void agregarArco(NodoArco nuevoArco){
        this.getArcos().agregarArco(nuevoArco);
    }
}
