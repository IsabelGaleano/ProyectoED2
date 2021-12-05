package com.estructuras.proyecto.entities;

import java.io.Serializable;

public class NodoDijkstra implements Serializable {

    private String vertice;
    private String verticeAnterior;
    private int costo;


    public NodoDijkstra() {
    }

    public NodoDijkstra(int costo, String vertice, String verticeAnterior) {
        this.costo = costo;
        this.vertice = vertice;
        this.verticeAnterior = verticeAnterior;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getVertice() {
        return vertice;
    }

    public void setVertice(String vertice) {
        this.vertice = vertice;
    }

    public String getVerticeAnterior() {
        return verticeAnterior;
    }

    public void setVerticeAnterior(String verticeAnterior) {
        this.verticeAnterior = verticeAnterior;
    }
}
