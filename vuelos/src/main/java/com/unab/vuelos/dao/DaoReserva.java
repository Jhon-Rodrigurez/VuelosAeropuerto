
package com.unab.vuelos.dao;

import com.unab.vuelos.modelos.Pasajero;
import com.unab.vuelos.modelos.Reserva;
import com.unab.vuelos.modelos.Vuelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DaoReserva extends Conexion implements IDaoReserva{

    @Override
    public boolean hacerReserva(Pasajero pasajero, Vuelo vuelo) {
        
        String sql="INSERT INTO "+Constantes.T_RESERVA+"("+
                    Constantes.TR_CEDULA+","+
                    Constantes.TR_NUMERO+","+
                    Constantes.TR_ESTADO+") VALUES(?,?,?)";
        
        try {            
            PreparedStatement ps=getConexion().prepareStatement(sql);
            ps.setString(1, pasajero.getCedula());
            ps.setString(2, vuelo.getNumero());
            ps.setBoolean(3, true);
            ps.executeUpdate();
            
            System.out.println("Reserva creado con exito");
            
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error al hacer una reserva"+e.getMessage());
            return false;
        }finally{
            try {
                getConexion().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion "+e);
            }
        }
    }

    @Override
    public Reserva verReserva() {
        
        ArrayList<Vuelo> arrayListVuelos=new ArrayList<>();
        ArrayList<Pasajero> arrayListPasajeros=new ArrayList<>();
        
        String sql="SELECT "+Constantes.T_VUELO+".*, "+Constantes.T_PASAJERO+".*"+
                    " FROM "+Constantes.T_RESERVA+
                    " JOIN "+Constantes.T_VUELO+
                    " ON "+Constantes.T_VUELO+"."+Constantes.TV_NUMERO+"="+Constantes.T_RESERVA+"."+Constantes.TR_NUMERO+                                
                    " JOIN "+Constantes.T_PASAJERO+
                    " ON "+Constantes.T_PASAJERO+"."+Constantes.TP_CEDULA+"="+Constantes.T_RESERVA+"."+Constantes.TR_CEDULA+                  
                    " ORDER BY "+Constantes.T_RESERVA+"."+Constantes.TR_ID+" DESC";
        
        try {
            PreparedStatement ps=getConexion().prepareStatement(sql);
            ResultSet resultSet=ps.executeQuery();
            
            while (resultSet.next()) {                
                
                Vuelo vuelo=new Vuelo();
                vuelo.setId(resultSet.getInt(Constantes.TV_ID));
                vuelo.setNumero(resultSet.getString(Constantes.TV_NUMERO));
                vuelo.setFechaVuelo(resultSet.getDate(Constantes.TV_FECHAVUELO));
                vuelo.setCiudadOrigen(resultSet.getString(Constantes.TV_CIUDADORIGEN));
                vuelo.setCiudadDestino(resultSet.getString(Constantes.TV_CIUDADDESTINO));
                vuelo.setDisponible(resultSet.getBoolean(Constantes.TV_DISPONIBLE));
                
                arrayListVuelos.add(vuelo); 
                
                Pasajero pasajero=new Pasajero();
                pasajero.setId(resultSet.getInt(Constantes.TP_ID));
                pasajero.setCedula(resultSet.getString(Constantes.TP_CEDULA));
                pasajero.setNombre(resultSet.getString(Constantes.TP_NOMBRE));
                pasajero.setApellido(resultSet.getString(Constantes.TP_APELLIDO));
                pasajero.setTipo(resultSet.getString(Constantes.TP_TIPO));
                
                arrayListPasajeros.add(pasajero);                
            }
            
            return new Reserva(arrayListVuelos, arrayListPasajeros);
            
        } catch (SQLException e) {
            System.out.println("Error al leer los datos "+e.getMessage());
            return new Reserva(arrayListVuelos, arrayListPasajeros);
        }finally{
            try {
                getConexion().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion "+e);
            }
        }
    }
    
}
