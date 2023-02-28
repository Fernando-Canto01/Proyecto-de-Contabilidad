/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package contabilidad.principal;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import contabilidad.operaciones.ActivoCirculante;
import contabilidad.operaciones.ActivoNoCirculante;
import contabilidad.operaciones.PasivoLargoPlazo;
import contabilidad.operaciones.PasivoCortoPlazo;
import contabilidad.operaciones.CapitalSocial;
//import contabilidad.principal.prueba;

/**
 *
 * @author fernando
 */
public class menu extends javax.swing.JFrame {

    DefaultTableModel tablaModelo;

    public menu() {
        initComponents();
        this.tablaModelo = new DefaultTableModel();
        this.tablaModelo.addColumn("Catalogo  de cuentas");
        this.tabla1.setModel(tablaModelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(744, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        this.tablaModelo.addTableModelListener(this.tabla1);
        String[] AsignarTabla = new String[1];
        ActivoCirculante ob1 = new ActivoCirculante();
        ob1.setActivoCirculante(this.txtCodigo.getText());
        if (ob1.getActivoCirculante() != null) {
            AsignarTabla[0] = ob1.getActivoCirculante();
            this.tablaModelo.addRow(AsignarTabla);
        }
        ActivoNoCirculante ob2 = new ActivoNoCirculante();
        ob2.setActivoNoCirculante(this.txtCodigo.getText());
        if (ob2.getActivoNoCirculante() != null) {
            AsignarTabla[0] = ob2.getActivoNoCirculante();
            this.tablaModelo.addRow(AsignarTabla);
        }
        PasivoLargoPlazo ob3 = new PasivoLargoPlazo();
        ob3.setPasivoLargoPlazo(this.txtCodigo.getText());
        if (ob3.getPasivoLargoPlazo() != null) {
            AsignarTabla[0] = ob3.getPasivoLargoPlazo();
            this.tablaModelo.addRow(AsignarTabla);
        }
        PasivoCortoPlazo ob4 = new PasivoCortoPlazo();
        ob4.setPasivoCortoPlazo(this.txtCodigo.getText());
        if (ob4.getPasivoCortoPlazo() != null) {
            AsignarTabla[0] = ob4.getPasivoCortoPlazo();
            this.tablaModelo.addRow(AsignarTabla);

        }
        CapitalSocial ob5 = new CapitalSocial();
        ob5.setCapitalSocial(this.txtCodigo.getText());
        if (ob5.getCapitalSocial() != null) {
            AsignarTabla[0] = ob5.getCapitalSocial();
            this.tablaModelo.addRow(AsignarTabla);
        }
        // 
        /*
        cs[9] = "Capital Social: 20000";
        //this.setTabla(ac.length, anc.length, plp.length, pcp.length, cs.length); //GENERAL- TABLA*/
        //tablaModelo.setValueAt(ac, 0, 0);

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed

    }//GEN-LAST:event_txtCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });

    }

    private int tamaño;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
