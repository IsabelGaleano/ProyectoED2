package com.estructuras.proyecto.entities;

import java.util.ArrayList;

public class ListaVertices {
    private NodoVertice cabeza;

    public ListaVertices() {

    }

    public NodoVertice getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoVertice cabeza) {
        this.cabeza = cabeza;
    }

    public void agregarVertice(String idPlaya, PlayaModel playa){
        NodoVertice nuevo = new NodoVertice(idPlaya, playa);

        if(this.estaVacio()){
            this.cabeza = nuevo;
        }else {
            nuevo.setSig(this.getCabeza());
            this.setCabeza(nuevo);
        }
    }

    public void agregarArco(String idPlaya, NodoArco nuevoArco){

        NodoVertice aux = new NodoVertice();
        aux = this.getCabeza();

        while(aux!= null){
            if(aux.getIdVertice().equals(idPlaya)){
                aux.getArcos().agregarArco(nuevoArco);
            }

            aux = aux.getSig();
        }
    }

    private boolean estaVacio(){
        return this.getCabeza() == null;
    }


    public ArrayList<DireccionModel> buscarAdyacentes(String idPlaya){

        ArrayList<DireccionModel> direcciones = new ArrayList<DireccionModel>();

        NodoVertice aux = new NodoVertice();
        aux = this.getCabeza();

        while(aux!=null){
            if(aux.getIdVertice().equals(idPlaya)){

                NodoArco auxArco = new NodoArco();
                auxArco = aux.getArcos().getCabeza();

                while(auxArco!=null){

                    direcciones.add(new DireccionModel(auxArco.getPlaya(), auxArco.getCosto()));
                    auxArco = auxArco.getSig();
                }
            }
            aux = aux.getSig();
        }
        return direcciones;
    }

    private PlayaModel generarPlayas(String idPlaya, String nombre, String latitud, String longitud){
        return new PlayaModel(idPlaya, nombre, latitud, longitud);
    }

    public PlayaModel buscarPlaya(String idPlaya){
        PlayaModel result = new PlayaModel();
        NodoVertice aux = new NodoVertice();
        aux = this.getCabeza();

        while(aux != null){
            if(idPlaya.equals(aux.getIdVertice())){
                result = aux.getPlaya();
            }
            aux = aux.getSig();
        }

        return result;
    }
}
