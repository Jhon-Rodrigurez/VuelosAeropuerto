
package com.unab.vuelos;

import com.unab.vuelos.controladores.ControladorApp;
import com.unab.vuelos.vistas.JFrameApp;

public class App {
    
    public static void main(String[] args) {
                
        JFrameApp jFrameApp=new JFrameApp();
        ControladorApp controladorApp=new ControladorApp(jFrameApp);
        controladorApp.iniciar();
        jFrameApp.setVisible(true);
    }

}
