/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.unab.vuelos.vistas;

/**
 *
 * @author ingel
 */
public class JFrameApp extends javax.swing.JFrame {

    /**
     * Creates new form JFrameApp
     */
    public JFrameApp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipo = new javax.swing.ButtonGroup();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPaneReservas = new javax.swing.JScrollPane();
        jtReservas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPaneVuelos = new javax.swing.JScrollPane();
        jlVueloNumero = new javax.swing.JList<>();
        jScrollPaneVuelos1 = new javax.swing.JScrollPane();
        jlVueloFecha = new javax.swing.JList<>();
        jScrollPaneVuelos2 = new javax.swing.JScrollPane();
        jlVueloDestino = new javax.swing.JList<>();
        jScrollPaneVuelos3 = new javax.swing.JScrollPane();
        jlVueloOrigen = new javax.swing.JList<>();
        jScrollPaneVuelos4 = new javax.swing.JScrollPane();
        jlVueloEstado = new javax.swing.JList<>();
        jPanelReservar = new javax.swing.JPanel();
        jcbCiudadOrigen = new javax.swing.JComboBox<>();
        jcbCiudadDestino = new javax.swing.JComboBox<>();
        jtfNombre = new javax.swing.JTextField();
        jtfCedula = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtbReservar = new javax.swing.JToggleButton();
        jbLimpiar = new javax.swing.JButton();
        jrbTipo1 = new javax.swing.JRadioButton();
        jrbTipo2 = new javax.swing.JRadioButton();
        jrbTipo3 = new javax.swing.JRadioButton();
        jsFecha = new javax.swing.JSpinner();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Avizpao");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Avizpao");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 100, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reserva", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 18))); // NOI18N

        jtReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneReservas.setViewportView(jtReservas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneReservas, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneReservas, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 490, 230));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vuelos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 18))); // NOI18N

        jlVueloNumero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numero", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 10))); // NOI18N
        jlVueloNumero.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneVuelos.setViewportView(jlVueloNumero);

        jlVueloFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 10))); // NOI18N
        jlVueloFecha.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneVuelos1.setViewportView(jlVueloFecha);

        jlVueloDestino.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Destino", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 10))); // NOI18N
        jlVueloDestino.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneVuelos2.setViewportView(jlVueloDestino);

        jlVueloOrigen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Origen", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 10))); // NOI18N
        jlVueloOrigen.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneVuelos3.setViewportView(jlVueloOrigen);

        jlVueloEstado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 10))); // NOI18N
        jlVueloEstado.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneVuelos4.setViewportView(jlVueloEstado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPaneVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneVuelos1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneVuelos3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneVuelos2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneVuelos4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneVuelos, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
            .addComponent(jScrollPaneVuelos1)
            .addComponent(jScrollPaneVuelos3)
            .addComponent(jScrollPaneVuelos2)
            .addComponent(jScrollPaneVuelos4)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 500, 220));

        jPanelReservar.setBackground(new java.awt.Color(255, 255, 255));
        jPanelReservar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reservar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 18))); // NOI18N

        jcbCiudadOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbCiudadOrigen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ciudad de origen", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        jcbCiudadDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbCiudadDestino.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ciudad de destino", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        jtfNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 12))); // NOI18N
        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });

        jtfCedula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cedula", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 12))); // NOI18N
        jtfCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCedulaActionPerformed(evt);
            }
        });

        jtfApellido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 12))); // NOI18N
        jtfApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfApellidoActionPerformed(evt);
            }
        });

        jtbReservar.setText("Reservar");
        jtbReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbReservarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");

        bgTipo.add(jrbTipo1);
        jrbTipo1.setText("Bebe");

        bgTipo.add(jrbTipo2);
        jrbTipo2.setText("Niño");
        jrbTipo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTipo2ActionPerformed(evt);
            }
        });

        bgTipo.add(jrbTipo3);
        jrbTipo3.setText("Adulto");

        jsFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 12))); // NOI18N

        javax.swing.GroupLayout jPanelReservarLayout = new javax.swing.GroupLayout(jPanelReservar);
        jPanelReservar.setLayout(jPanelReservarLayout);
        jPanelReservarLayout.setHorizontalGroup(
            jPanelReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReservarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelReservarLayout.createSequentialGroup()
                        .addComponent(jbLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtbReservar))
                    .addGroup(jPanelReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtfApellido, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtfCedula, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jsFecha, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jcbCiudadDestino, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)
                        .addComponent(jcbCiudadOrigen, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelReservarLayout.createSequentialGroup()
                        .addComponent(jrbTipo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbTipo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbTipo3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelReservarLayout.setVerticalGroup(
            jPanelReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReservarLayout.createSequentialGroup()
                .addComponent(jcbCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbCiudadDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jsFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbTipo1)
                    .addComponent(jrbTipo2)
                    .addComponent(jrbTipo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanelReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar)
                    .addComponent(jtbReservar))
                .addContainerGap())
        );

        getContentPane().add(jPanelReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, -1));

        fondo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fondo.setMaximumSize(new java.awt.Dimension(640, 480));
        fondo.setMinimumSize(new java.awt.Dimension(640, 480));
        fondo.setPreferredSize(new java.awt.Dimension(640, 480));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtbReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbReservarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbReservarActionPerformed

    private void jrbTipo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTipo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbTipo2ActionPerformed

    private void jtfCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCedulaActionPerformed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jtfApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfApellidoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup bgTipo;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelReservar;
    private javax.swing.JScrollPane jScrollPaneReservas;
    private javax.swing.JScrollPane jScrollPaneVuelos;
    private javax.swing.JScrollPane jScrollPaneVuelos1;
    private javax.swing.JScrollPane jScrollPaneVuelos2;
    private javax.swing.JScrollPane jScrollPaneVuelos3;
    private javax.swing.JScrollPane jScrollPaneVuelos4;
    public javax.swing.JButton jbLimpiar;
    public javax.swing.JComboBox<String> jcbCiudadDestino;
    public javax.swing.JComboBox<String> jcbCiudadOrigen;
    public javax.swing.JList<String> jlVueloDestino;
    public javax.swing.JList<String> jlVueloEstado;
    public javax.swing.JList<String> jlVueloFecha;
    public javax.swing.JList<String> jlVueloNumero;
    public javax.swing.JList<String> jlVueloOrigen;
    public javax.swing.JRadioButton jrbTipo1;
    public javax.swing.JRadioButton jrbTipo2;
    public javax.swing.JRadioButton jrbTipo3;
    public javax.swing.JSpinner jsFecha;
    public javax.swing.JTable jtReservas;
    public javax.swing.JToggleButton jtbReservar;
    public javax.swing.JTextField jtfApellido;
    public javax.swing.JTextField jtfCedula;
    public javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
