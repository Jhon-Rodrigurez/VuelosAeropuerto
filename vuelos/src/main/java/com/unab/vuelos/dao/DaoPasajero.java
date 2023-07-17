
package com.unab.vuelos.dao;

import com.unab.vuelos.modelos.Pasajero;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DaoPasajero extends Conexion implements IDaoPasajero{

    @Override
    public boolean pasajeroRegistrado(Pasajero pasajero) {
        
        String sql="SELECT * FROM "+
                    Constantes.T_PASAJERO+
                    " WHERE "+Constantes.TP_CEDULA+"='"+pasajero.getCedula()+"'";
        
        try {
            PreparedStatement ps=getConexion().prepareStatement(sql);
            ResultSet resultSet=ps.executeQuery();
            
            while (resultSet.next()) {                
                
                pasajero.setId(resultSet.getInt(Constantes.TP_ID));
                pasajero.setCedula(resultSet.getString(Constantes.TP_CEDULA));
                pasajero.setNombre(resultSet.getString(Constantes.TP_NOMBRE));
                pasajero.setApellido(resultSet.getString(Constantes.TP_APELLIDO));
                pasajero.setTipo(resultSet.getString(Constantes.TP_TIPO));
                
                return true;
            }
            
            return false;
            
        } catch (SQLException e) {
            System.out.println("Error al leer los datos "+e.getMessage());
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
    public boolean resgisrarPasajero(Pasajero pasajero) {
        
        String sql="INSERT INTO "+Constantes.T_PASAJERO+"("+
                    Constantes.TP_CEDULA+","+
                    Constantes.TP_NOMBRE+","+
                    Constantes.TP_APELLIDO+","+
                    Constantes.TP_TIPO+") VALUES(?,?,?,?)";
        
        try {
            PreparedStatement ps=getConexion().prepareStatement(sql);
            ps.setString(1, pasajero.getCedula());
            ps.setString(2, pasajero.getNombre());
            ps.setString(3, pasajero.getApellido());
            ps.setString(4, pasajero.getTipo());
            ps.executeUpdate();
            
            System.out.println("Pasajero creado con exito");
            
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error al crear el pasajero "+e.getMessage());
            return false;
        }finally{
            try {
                getConexion().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion "+e);
            }
        }
    }
    
}
