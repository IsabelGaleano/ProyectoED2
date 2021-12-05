package com.estructuras.proyecto.entities;

public class TablaHash {

    private DatoHash[] vector;

    public TablaHash() {
        this.vector = new DatoHash[13];
    }

    public DatoHash[] getVector() {
        return vector;
    }

    public void setVector(DatoHash[] vector) {
        this.vector = vector;
    }

    public void insertar(int indice, DatoHash valor){
        if(this.getVector()[indice] == null){
            this.getVector()[indice] = valor;
        }else {

            DatoHash aux =  vector[indice];
            while(aux.getSig() != null){
                aux = aux.getSig();
            }
            aux.setSig(valor);
        }
    }

    public PlayaModel getValor(int indice, String nombrePlaya){
        DatoHash aux = vector[indice];

        while(aux != null && !aux.getPlaya().getNombre().equals(nombrePlaya)){
            aux = aux.getSig();
        }
        return aux.getPlaya();
    }

    public PlayaModel getByID(int indice, String idPlaya){
        DatoHash aux = vector[indice];

        while(aux != null && !aux.getPlaya().getIdPlaya().equals(idPlaya)){
            aux = aux.getSig();
        }
        return aux.getPlaya();
    }



}
