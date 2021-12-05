package com.estructuras.proyecto.entities;

import java.io.Serializable;

public class PlayaModel implements Serializable {
    private String idPlaya;
    private String nombre;
    private String latitud;
    private String longitud;

    public PlayaModel() {
    }

    public PlayaModel(String idPlaya, String nombre, String latitud, String longitud) {
        this.idPlaya = idPlaya;
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdPlaya() {
        return idPlaya;
    }

    public void setIdPlaya(String idPlaya) {
        this.idPlaya = idPlaya;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
}
