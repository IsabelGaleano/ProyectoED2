package com.estructuras.proyecto.entities;

public class ListaArcos {

    private NodoArco cabeza;

    public ListaArcos() {
    }

    public NodoArco getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoArco cabeza) {
        this.cabeza = cabeza;
    }

    private boolean estaVacio(){
        return this.getCabeza() == null ? true:false;
    }

    public void agregarArco(NodoArco nuevoArco){

        if(this.estaVacio()){
            this.setCabeza(nuevoArco);
        }else {
            nuevoArco.setSig(this.getCabeza());
            this.setCabeza(nuevoArco);
        }
    }
}
