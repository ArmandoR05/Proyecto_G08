package com.proyecto_g08.proyecto_g08.model;

import java.time.LocalDateTime;

public class Tiquete {
    private String nombreCliente;
    private int id;
    private int edad;
    private LocalDateTime horaCreacion;
    private int horaAtencion = -1;
    private String tramite;
    private char tipoCliente;

    public Tiquete(String nombreCliente, int id, int edad, LocalDateTime horaCreacion, int horaAtencion, String tramite, char tipoCliente) {
        this.nombreCliente = nombreCliente;
        this.id = id;
        this.edad = edad;
        this.horaCreacion = horaCreacion;
        this.horaAtencion = horaAtencion;
        this.tramite = tramite;
        this.tipoCliente = tipoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDateTime getHoraCreacion() {
        return horaCreacion;
    }

    public void setHoraCreacion(LocalDateTime horaCreacion) {
        this.horaCreacion = horaCreacion;
    }

    public int getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(int horaAtencion) {
        this.horaAtencion = horaAtencion;
    }

    public String getTramite() {
        return tramite;
    }

    public void setTramite(String tramite) {
        this.tramite = tramite;
    }

    public char getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int obtenerTiempoEspera(){
        /* Agregar la logica */
        return 0;
    }
}