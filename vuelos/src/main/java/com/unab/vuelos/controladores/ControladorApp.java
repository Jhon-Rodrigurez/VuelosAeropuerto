
package com.unab.vuelos.controladores;

import com.unab.vuelos.dao.DaoPasajero;
import com.unab.vuelos.dao.DaoReserva;
import com.unab.vuelos.dao.DaoVuelo;
import com.unab.vuelos.dao.IDaoPasajero;
import com.unab.vuelos.dao.IDaoReserva;
import com.unab.vuelos.dao.IDaoVuelo;
import com.unab.vuelos.modelos.Pasajero;
import com.unab.vuelos.modelos.Reserva;
import com.unab.vuelos.modelos.Vuelo;
import com.unab.vuelos.vistas.JFrameApp;
import com.unab.vuelos.vistas.VistaApp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;
import javax.swing.table.DefaultTableModel;


public class ControladorApp implements ActionListener{
    
    private Vuelo vuelo;
    private Pasajero pasajero;
    //dao
    private IDaoVuelo iDaoVuelo;
    private IDaoPasajero iDaoPasajero;
    private IDaoReserva iDaoReserva;
    //vista
    private JFrameApp jFrameApp;
    private DefaultListModel listModelVuelosNumero, listModelVuelosFecha, listModelVuelosOrigen, listModelVuelosDestino, listModelVuelosEstado;
    private DefaultTableModel tableModelReservas;

    
    public ControladorApp(JFrameApp jFrameApp) {
        this.vuelo = new Vuelo();
        this.pasajero = new Pasajero();
        this.iDaoVuelo = new DaoVuelo();
        this.iDaoPasajero = new DaoPasajero();
        this.iDaoReserva = new DaoReserva();
        this.jFrameApp=jFrameApp;
        this.jFrameApp.jbLimpiar.addActionListener(this);
        this.jFrameApp.jtbReservar.addActionListener(this);
        this.listModelVuelosNumero= new DefaultListModel();
        this.listModelVuelosFecha= new DefaultListModel();
        this.listModelVuelosOrigen= new DefaultListModel();
        this.listModelVuelosDestino= new DefaultListModel();
        this.listModelVuelosEstado= new DefaultListModel();
        this.tableModelReservas=new DefaultTableModel();
    }
         
    
    public void iniciar(){        

        tableModelReservas.addColumn("Vuelo");
        tableModelReservas.addColumn("Cedula");
        tableModelReservas.addColumn("Nombre");
        tableModelReservas.addColumn("Apellido");
        tableModelReservas.addColumn("Tipo");
        
        jFrameApp.jtReservas.setModel(tableModelReservas);
        
        setJcbCiudadOrigen();     
        setJcbCiudadDestino();     
        setJsFecha();
        
        mostrarVuelos(iDaoVuelo.verVuelos());
        mostrarReservas(iDaoReserva.verReserva());
    }
   
    
    private void mostrarVuelos(ArrayList<Vuelo> arrayListVuelos) {
 
        for (int i = 0; i<arrayListVuelos.size(); i++) {
            
            String datos[]=new String[5];
            datos[0]=String.valueOf(arrayListVuelos.get(i).getNumero());
            datos[1]=String.valueOf(arrayListVuelos.get(i).getFechaVuelo());
            datos[2]= arrayListVuelos.get(i).getCiudadOrigen();
            datos[3]= arrayListVuelos.get(i).getCiudadDestino();
            datos[4]= arrayListVuelos.get(i).isDisponible() ? "Disponible" : "No disponible";

            listModelVuelosNumero.addElement(datos[0]);
            jFrameApp.jlVueloNumero.setModel(listModelVuelosNumero);
            listModelVuelosFecha.addElement(datos[1]);
            jFrameApp.jlVueloFecha.setModel(listModelVuelosFecha);
            listModelVuelosOrigen.addElement(datos[2]);
            jFrameApp.jlVueloOrigen.setModel(listModelVuelosOrigen);
            listModelVuelosDestino.addElement(datos[3]);
            jFrameApp.jlVueloDestino.setModel(listModelVuelosDestino);
            listModelVuelosEstado.addElement(datos[4]);
            jFrameApp.jlVueloEstado.setModel(listModelVuelosEstado);
            
        }
    }
    
     private void mostrarReservas(Reserva reserva) {
         
        limpiarTexto();
        
         if (tableModelReservas.getRowCount() > 0) {
            for (int i = tableModelReservas.getRowCount()-1; i > -1; i--) {
                tableModelReservas.removeRow(i);
            }
        }
                
        for (int i=0; i<reserva.getArrayListPasajeros().size(); i++) {
            
            String datos[]=new String[5];
            datos[0]=reserva.getArrayListVuelos().get(i).getNumero();
            datos[1]=reserva.getArrayListPasajeros().get(i).getCedula();
            datos[2]=reserva.getArrayListPasajeros().get(i).getNombre();
            datos[3]=reserva.getArrayListPasajeros().get(i).getApellido();
            
            switch(reserva.getArrayListPasajeros().get(i).getTipo()){
                case "1": datos[4]="Bebe";
                    break;
                case "2": datos[4]="Niño";
                    break;
                case "3": datos[4]="Adulto";
                    break;
            }
            
            tableModelReservas.addRow(datos);
            
            jFrameApp.jtReservas.setModel(tableModelReservas);
        }
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == jFrameApp.jtbReservar) {
        
            String ciudadOrigen=getJcbCiudadOrigen();
            String ciudadDestino=getJcbCiudadDestino();   
            Date fecha= new Date(getJsFecha());
            String cedula=jFrameApp.jtfCedula.getText();
            String nombre=jFrameApp.jtfNombre.getText();
            String apellido=jFrameApp.jtfApellido.getText();
            String tipo=getJrbTipo();
                
            if(!ciudadOrigen.equals("") && !ciudadDestino.equals("") &&
               fecha.getTime()!=0 && !cedula.equals("") && !nombre.equals("") && !apellido.equals("") && !tipo.equals("")){

                if(iDaoVuelo.vueloDisponible(fecha, ciudadOrigen, ciudadDestino, vuelo)){

                JOptionPane.showMessageDialog(null, "Vuelo disponible");

                    pasajero.setCedula(cedula);
                    pasajero.setNombre(nombre);
                    pasajero.setApellido(apellido);
                    pasajero.setTipo(tipo);

                    while(true){

                        if(iDaoPasajero.pasajeroRegistrado(pasajero)){
                         
                           JOptionPane.showMessageDialog(null, "Pasajero encontrado");
                            
                           if(iDaoReserva.hacerReserva(pasajero, vuelo)){    
                               
                               mostrarReservas(iDaoReserva.verReserva());    
                               
                               JOptionPane.showMessageDialog(null, "Reserva realizada con exito");
                               break;
                            }else{
                                JOptionPane.showMessageDialog(null, "Error al realizar la reserva");
                                break;
                            }  

                        }else{
                            if (iDaoPasajero.resgisrarPasajero(pasajero)) {
                                JOptionPane.showMessageDialog(null, "Pasajero registrado con exito");
                            }else{
                                JOptionPane.showMessageDialog(null, "Error al registrar pasajero");
                                break;
                            }
                        }      
                    }                                                                 

                }else{                    
                    JOptionPane.showMessageDialog(null, "No hay vuelos disponibles para la fecha y localizacion ingresada");
                }      

            }else{                 
                 JOptionPane.showMessageDialog(null, "No se permiten campos vacios");
            }        
        }

        if (e.getSource() == jFrameApp.jbLimpiar) {
            limpiarTexto();
        }
     
    }

    public void limpiarTexto(){
        jFrameApp.jcbCiudadOrigen.setSelectedIndex(0);
        jFrameApp.jcbCiudadDestino.setSelectedIndex(0);
        jFrameApp.jtfCedula.setText(null);
        jFrameApp.jtfNombre.setText(null);
        jFrameApp.jtfApellido.setText(null);
        jFrameApp.bgTipo.clearSelection();
    }
        
    public void setJcbCiudadOrigen(){
            jFrameApp.jcbCiudadOrigen.removeAllItems();
            jFrameApp.jcbCiudadOrigen.addItem("Seleccione");
            jFrameApp.jcbCiudadOrigen.addItem("cucuta");
            jFrameApp.jcbCiudadOrigen.addItem("bogota");
            jFrameApp.jcbCiudadOrigen.addItem("bucaramanga");
            jFrameApp.jcbCiudadOrigen.addItem("medellin");
    }
    
    public String getJcbCiudadOrigen(){
            return jFrameApp.jcbCiudadOrigen.getSelectedItem().toString();
    }
        
    public void setJcbCiudadDestino(){
            jFrameApp.jcbCiudadDestino.removeAllItems();
            jFrameApp.jcbCiudadDestino.addItem("Seleccione");
            jFrameApp.jcbCiudadDestino.addItem("cucuta");
            jFrameApp.jcbCiudadDestino.addItem("bogota");
            jFrameApp.jcbCiudadDestino.addItem("bucaramanga");
            jFrameApp.jcbCiudadDestino.addItem("medellin");
    }
    
    public String getJcbCiudadDestino(){
            return jFrameApp.jcbCiudadDestino.getSelectedItem().toString();
    }
    
    public void setJsFecha(){
        Calendar calendar = Calendar.getInstance();
        java.util.Date inicio = calendar.getTime();
        calendar.add(Calendar.YEAR, -1);
        java.util.Date fechaAnterior = calendar.getTime();
        calendar.add(Calendar.YEAR, 2);
        java.util.Date fechaPosterior = calendar.getTime();
        SpinnerModel fechaModel = new SpinnerDateModel(inicio, fechaAnterior, fechaPosterior, Calendar.YEAR);
        jFrameApp.jsFecha.setModel(fechaModel);
        jFrameApp.jsFecha.setEditor(new JSpinner.DateEditor(jFrameApp.jsFecha, "dd/MM/yyyy"));
  
    }
    
    public Long getJsFecha(){
        
        java.util.Date fecha= (java.util.Date) jFrameApp.jsFecha.getValue();
         
        return fecha.getTime();
    }
    
    public String getJrbTipo(){

        if(jFrameApp.jrbTipo1.isSelected()){
            return "1";
        }else if(jFrameApp.jrbTipo2.isSelected()){
            return "2";
        }else if(jFrameApp.jrbTipo3.isSelected()){
            return "3";
        }

        return "0";
    }
    
  
}
