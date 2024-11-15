/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ar.edu.unlar.paradigmas3.sistemagal.ui.forms;

import ar.edu.unlar.paradigmas3.sistemagal.objetos.Tipo_Accidente;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.controladores.Tipo_Accidente_Controller;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mateo.Bazan
 */
public class TipoAccidenteForm extends javax.swing.JFrame {

    /**
     * Creates new form TipoAccidenteForm
     */
    public TipoAccidenteForm() {
        initComponents();

        Tipo_Accidente_Controller  tipo_Accidente_Controller = new Tipo_Accidente_Controller();
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Codigo");
        model.addColumn("Tipo");

        ArrayList<Tipo_Accidente> data = tipo_Accidente_Controller.getTipo_Accidentes();

        for (Tipo_Accidente tipo_Accidente : data) {

            Object[] rowData = {
                tipo_Accidente.getCodigo(), tipo_Accidente.getTipo()};

            model.addRow(rowData);

        }

        tblTipoAccidentes.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoAccidenteGrilla1 = new ar.edu.unlar.paradigmas3.sistemagal.grillas.TipoAccidenteGrilla();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTipoAccidentes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tipos Accidente");

        tblTipoAccidentes.setModel(tipoAccidenteGrilla1);
        jScrollPane1.setViewportView(tblTipoAccidentes);
        if (tblTipoAccidentes.getColumnModel().getColumnCount() > 0) {
            tblTipoAccidentes.getColumnModel().getColumn(0).setHeaderValue("Codigo");
            tblTipoAccidentes.getColumnModel().getColumn(1).setHeaderValue("Tipo");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TipoAccidenteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoAccidenteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoAccidenteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoAccidenteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipoAccidenteForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTipoAccidentes;
    private ar.edu.unlar.paradigmas3.sistemagal.grillas.TipoAccidenteGrilla tipoAccidenteGrilla1;
    // End of variables declaration//GEN-END:variables
}