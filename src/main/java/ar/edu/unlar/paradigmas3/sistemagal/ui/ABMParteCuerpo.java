package ar.edu.unlar.paradigmas3.sistemagal.ui;

import ar.edu.unlar.paradigmas3.sistemagal.grillas.ParteCuerpoGrilla;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Parte_Cuerpo;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.controladores.ParteCuerpo_Controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Mateo.Bazan
 */
public class ABMParteCuerpo extends javax.swing.JInternalFrame {

    private ParteCuerpo_Controller parteCuerpo_Controller = new ParteCuerpo_Controller();
    private ParteCuerpoGrilla parteCuerpoGrilla;

    public ABMParteCuerpo() {

        initComponents();

        parteCuerpoGrilla = new ParteCuerpoGrilla();
        tblParteCuerpo.setModel(parteCuerpoGrilla);

        txtFieldParteCuerpo.setEditable(false);
        txtFieldCodigo.setEditable(false);
        btnAceptar.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parteCuerpoGrilla1 = new ar.edu.unlar.paradigmas3.sistemagal.grillas.ParteCuerpoGrilla();
        jPanel1 = new javax.swing.JPanel();
        tittleABM = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblParteCuerpo = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        txtFieldCodigo = new javax.swing.JTextField();
        lblParteCuerpo = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtFieldParteCuerpo = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("ABM Partes cuerpo");

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        tittleABM.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        tittleABM.setForeground(new java.awt.Color(255, 255, 255));
        tittleABM.setText("ABM Partes Cuerpo");

        btnCancelar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mateo.Bazan\\OneDrive\\OneDrive - TSOFT\\Escritorio\\SistemaGAL\\src\\main\\java\\ar\\edu\\unlar\\paradigmas3\\sistemagal\\ui\\img\\cruz.png")); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mateo.Bazan\\OneDrive\\OneDrive - TSOFT\\Escritorio\\SistemaGAL\\src\\main\\java\\ar\\edu\\unlar\\paradigmas3\\sistemagal\\ui\\img\\lapiz.png")); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        tblParteCuerpo.setModel(parteCuerpoGrilla1);
        tblParteCuerpo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblParteCuerpoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblParteCuerpo);
        if (tblParteCuerpo.getColumnModel().getColumnCount() > 0) {
            tblParteCuerpo.getColumnModel().getColumn(0).setHeaderValue("Legajo");
            tblParteCuerpo.getColumnModel().getColumn(1).setHeaderValue("Apellidos y Nombres");
        }

        btnUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mateo.Bazan\\OneDrive\\OneDrive - TSOFT\\Escritorio\\SistemaGAL\\src\\main\\java\\ar\\edu\\unlar\\paradigmas3\\sistemagal\\ui\\img\\actualizar.png")); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblParteCuerpo.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        lblParteCuerpo.setForeground(new java.awt.Color(255, 255, 255));
        lblParteCuerpo.setText("Partes cuerpo");

        lblCodigo.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Codigo");

        btnAceptar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mateo.Bazan\\OneDrive\\OneDrive - TSOFT\\Escritorio\\SistemaGAL\\src\\main\\java\\ar\\edu\\unlar\\paradigmas3\\sistemagal\\ui\\img\\controlar.png")); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnBorrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mateo.Bazan\\OneDrive\\OneDrive - TSOFT\\Escritorio\\SistemaGAL\\src\\main\\java\\ar\\edu\\unlar\\paradigmas3\\sistemagal\\ui\\img\\basura.png")); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mateo.Bazan\\OneDrive\\OneDrive - TSOFT\\Escritorio\\SistemaGAL\\src\\main\\java\\ar\\edu\\unlar\\paradigmas3\\sistemagal\\ui\\img\\mas.png")); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtFieldParteCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(291, 291, 291)
                                .addComponent(lblParteCuerpo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnModificar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tittleABM)
                .addGap(200, 200, 200))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tittleABM)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(lblParteCuerpo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldParteCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        btnAceptar.setEnabled(true);
        txtFieldParteCuerpo.setEditable(true);
        txtFieldCodigo.setEditable(true);
        btnModificar.setEnabled(true);
        btnAgregar.setEnabled(false);
        btnBorrar.setEnabled(false);

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        parteCuerpo_Controller = new ParteCuerpo_Controller();
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Codigo");
        model.addColumn("Parte");

        ArrayList<Parte_Cuerpo> data = parteCuerpo_Controller.getParteCuerpos();

        for (Parte_Cuerpo parte_Cuerpo : data) {

            Object[] rowData = {
                parte_Cuerpo.getCodigo(), parte_Cuerpo.getParte()
            };

            model.addRow(rowData);

        }

        tblParteCuerpo.setModel(model);

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblParteCuerpoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblParteCuerpoMouseClicked
        if (evt.getClickCount() == 1) {
            JTable receptor = (JTable) evt.getSource();
            txtFieldCodigo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtFieldParteCuerpo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
        }
    }//GEN-LAST:event_tblParteCuerpoMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtFieldCodigo.setText("");
        txtFieldParteCuerpo.setText("");
        txtFieldParteCuerpo.setEditable(false);
        txtFieldCodigo.setEditable(false);
        btnAceptar.setEnabled(false);
        btnBorrar.setEnabled(true);
        btnAgregar.setEnabled(true);
        btnModificar.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        parteCuerpo_Controller = new ParteCuerpo_Controller();

        if (btnAgregar.isEnabled()) {

            int codigo = Integer.parseInt(txtFieldCodigo.getText());
            String parte = txtFieldParteCuerpo.getText();

            try {

                Parte_Cuerpo parte_Cuerpo = new Parte_Cuerpo(codigo, parte);
                parte_Cuerpo.setCodigo(codigo);
                parte_Cuerpo.setParte(parte);
                if (parte.length() >= 3) {
                    JOptionPane.showMessageDialog(this, "Parte cuerpo ingresada", "OK", HEIGHT);

                    parteCuerpo_Controller.addParteCuerpo(parte_Cuerpo);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Parte del cuerpo debe tener más de 3 caracteres", "ERROR", HEIGHT);
                }
            } catch (Exception e) {

                JOptionPane.showMessageDialog(rootPane, "Error al ingresar parte cuerpo", "ERROR", HEIGHT);

            }

            txtFieldParteCuerpo.setText("");
            txtFieldCodigo.setText("");
            txtFieldCodigo.setEditable(false);
            btnAceptar.setEnabled(true);
            btnModificar.setEnabled(true);
            btnBorrar.setEnabled(true);

        } else if (btnModificar.isEnabled()) {

            int codigo = Integer.parseInt(txtFieldCodigo.getText());
            String parte = txtFieldParteCuerpo.getText();

            Parte_Cuerpo parte_Cuerpo = new Parte_Cuerpo(codigo, parte);
            parte_Cuerpo.setCodigo(codigo);
            parte_Cuerpo.setParte(parte);

            ParteCuerpo_Controller parteCuerpo_Controller = new ParteCuerpo_Controller();
            if (parte.length() >= 3) {
                parteCuerpo_Controller.updateParteCuerpo(parte_Cuerpo);

                JOptionPane.showMessageDialog(this, "Parte cuerpo modificada", "OK", HEIGHT);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Parte del cuerpo debe tener más de 3 caracteres", "ERROR", HEIGHT);
            }

            txtFieldCodigo.setText("");
            txtFieldParteCuerpo.setText("");
            btnBorrar.setEnabled(true);
            btnAgregar.setEnabled(true);
            btnAceptar.setEnabled(false);
            btnModificar.setEnabled(true);
            txtFieldCodigo.setEditable(false);
            txtFieldParteCuerpo.setEditable(false);

        } else if (btnBorrar.isEnabled()) {

            int codigo = Integer.parseInt(txtFieldCodigo.getText());
            Parte_Cuerpo parte_Cuerpo = new Parte_Cuerpo();
            parte_Cuerpo.setCodigo(codigo);

            ParteCuerpo_Controller parteCuerpo_Controller = new ParteCuerpo_Controller();

            parteCuerpo_Controller.deleteParteCuerpo(parte_Cuerpo);

            JOptionPane.showMessageDialog(this, "Parte cuerpo eliminada", "OK", HEIGHT);

            txtFieldCodigo.setText("");
            btnAceptar.setEnabled(false);
            btnBorrar.setEnabled(true);

            txtFieldCodigo.setText("");
            txtFieldParteCuerpo.setText("");
            btnAceptar.setEnabled(false);
            btnBorrar.setEnabled(true);
            btnAgregar.setEnabled(true);
            btnModificar.setEnabled(true);

        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        btnAceptar.setEnabled(true);
        btnBorrar.setEnabled(true);
        btnAgregar.setEnabled(false);
        btnModificar.setEnabled(false);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        btnAceptar.setEnabled(true);
        btnBorrar.setEnabled(false);
        btnAgregar.setEnabled(true);
        btnModificar.setEnabled(false);
        txtFieldParteCuerpo.setEditable(true);
        txtFieldCodigo.setEditable(true);
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblParteCuerpo;
    private ar.edu.unlar.paradigmas3.sistemagal.grillas.ParteCuerpoGrilla parteCuerpoGrilla1;
    private javax.swing.JTable tblParteCuerpo;
    private javax.swing.JLabel tittleABM;
    private javax.swing.JTextField txtFieldCodigo;
    private javax.swing.JTextField txtFieldParteCuerpo;
    // End of variables declaration//GEN-END:variables
}
