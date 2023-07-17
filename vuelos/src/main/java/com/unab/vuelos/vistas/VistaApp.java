
package com.unab.vuelos.vistas;

import java.util.Scanner;

public class VistaApp {

    public String getMenu(){
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("**Avizpao**"+
                           "\n1. Mostrar Vuelos"+
                           "\n2. Hacer Reserva"+
                           "\n3. Mostrar Reservas");
         
         return teclado.nextLine();
    }
    
    public String getEntrada(String texto){
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println(texto);
        
        return teclado.nextLine();
    }
    
    public void setTexto(String texto){
        
        System.out.println(texto);
    }
    
    public void setMostrarVuelo(String[] datos){
        
        System.out.println("\nVuelo: "+datos[0]+" - Fecha: "+datos[1]+
                                "\nOrigen: "+datos[2]+" - Destino: "+datos[3]+
                                "\nEstado: "+datos[4]);
    }
       
    public void setMostrarReserva(String[] datos){
        
         System.out.println("\nNumero: "+datos[0]+" - Cedula: "+datos[1]+
                                "\nNombre: "+datos[2]+" "+datos[3]+
                                "\nTipo: "+datos[4]);
    }
}
