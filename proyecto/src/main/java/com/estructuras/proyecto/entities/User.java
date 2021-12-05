package com.estructuras.proyecto.entities;

import java.io.Serializable;

public class User implements Serializable {
    private String name;

    private String surname;

    private String email;

    private Boolean enabled;

    public User() {
    }

    public User(String name, String surname, String email, Boolean enabled) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.enabled = enabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
