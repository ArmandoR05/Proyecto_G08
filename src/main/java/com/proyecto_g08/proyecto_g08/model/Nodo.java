package com.proyecto_g08.proyecto_g08.model;

public class Nodo {
    private Tiquete dato;
    private Nodo siguiente;

    public Nodo(Tiquete dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

