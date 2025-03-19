package com.proyecto_g08.proyecto_g08.model;

public class NodoT {
    private Tiquete tiquete;
    private NodoT siguiente;

    public NodoT(Tiquete dato, NodoT siguiente) {
        this.tiquete = dato;
        this.siguiente = siguiente;
    }

    public Tiquete getTiquete() {
        return tiquete;
    }

    public void setTiquete(Tiquete tiquete) {
        this.tiquete = tiquete;
    }

    public NodoT getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoT siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "dato=" + tiquete +
                ", siguiente=" + siguiente +
                '}';
    }
}

