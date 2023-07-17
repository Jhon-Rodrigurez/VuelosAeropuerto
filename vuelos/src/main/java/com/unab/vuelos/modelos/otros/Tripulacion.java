
package com.unab.vuelos.modelos.otros;

import com.unab.vuelos.modelos.Usuario;
import java.util.ArrayList;


public class Tripulacion extends Usuario{
    
    private String cargo;
    private int sueldo;

    public Tripulacion(){
    }        

    public Tripulacion(String cedula, String nombre, String apellido, String cargo, int sueldo) {
        super(cedula, nombre, apellido);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }  

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    public ArrayList<Tripulacion> laTripulacion(){
        
        ArrayList<Tripulacion> arrayListTripulacion=new ArrayList<>();
        
        arrayListTripulacion.add(new Tripulacion("60123123","German", "Suarez","Piloto", 2500000));
        arrayListTripulacion.add(new Tripulacion("60123456","Wilson", "Perez","Piloto", 2500000));
        arrayListTripulacion.add(new Tripulacion("60123456","Jose", "Martinez","Operador", 2500000));
        arrayListTripulacion.add(new Tripulacion("60123456","Jeferson", "Acevedo","Comisarios", 2000000));
        arrayListTripulacion.add(new Tripulacion("60123456","Rodolfo", "Carrillo","Comisarios", 2000000));
        arrayListTripulacion.add(new Tripulacion("60123456","Rubiela", "Gomez","Azafatas", 1500000));
        arrayListTripulacion.add(new Tripulacion("60123456","Yuly", "Sanchez","Azafatas", 1500000));
        arrayListTripulacion.add(new Tripulacion("60123456","Gladys", "Niño","Azafatas", 1500000));
        arrayListTripulacion.add(new Tripulacion("60123456","Maricela", "Rojas","Azafatas", 1500000));
                       
        return arrayListTripulacion;
    }
    
}
