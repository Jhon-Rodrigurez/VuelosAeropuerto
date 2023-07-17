
package com.unab.vuelos.dao;

import com.unab.vuelos.modelos.Pasajero;
import com.unab.vuelos.modelos.Reserva;
import com.unab.vuelos.modelos.Vuelo;


public interface IDaoReserva {
    
    public boolean hacerReserva(Pasajero pasajero, Vuelo vuelo);
    
    public Reserva verReserva();
    
}
