package com.unab.vuelos.modelos;

import java.sql.Date;
import java.util.ArrayList;

public class Vuelo {
    
    private int id;
    private String numero;
    private Date fechaVuelo;
    private String ciudadOrigen;
    private String ciudadDestino;
    private boolean disponible;

    public Vuelo() {
    }
    
    public Vuelo(int id, String numero, Date fechaVuelo, String ciudadOrigen, String ciudadDestino, boolean disponible) {
        this.id = id;
        this.numero = numero;
        this.fechaVuelo = fechaVuelo;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(Date fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public boolean isDisponible() {        
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public ArrayList<Vuelo> listaVuelos(){
        
        Date fecha1=Date.valueOf("2022-09-01");
        Date fecha2=Date.valueOf("2022-09-15");
        
        ArrayList<Vuelo> arrayListVuelos=new ArrayList<>();
        arrayListVuelos.add(new Vuelo(1, "502", fecha1, "cucuta", "bogota", true));
        arrayListVuelos.add(new Vuelo(1, "139", fecha2, "medellin", "bucaramanga", true));
        
        return arrayListVuelos;
    }
    
}
