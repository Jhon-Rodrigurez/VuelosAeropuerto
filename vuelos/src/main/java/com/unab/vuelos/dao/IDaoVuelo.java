package com.unab.vuelos.dao;

import com.unab.vuelos.modelos.Reserva;
import com.unab.vuelos.modelos.Vuelo;
import java.sql.Date;
import java.util.ArrayList;

public interface IDaoVuelo {
    
    boolean crearVuelo(Vuelo vuelo);
    
    ArrayList<Vuelo> verVuelos();
    
    boolean vueloCreado(Vuelo vuelo, String numero);
    
    boolean vueloDisponible(Date fecha, String ciudadOrigen, String ciudadDestino, Vuelo vuelo);
    
    Reserva infoVuelo(String numero); 
    
}
