package ar.edu.unlar.paradigmas3.sistemagal.ui;

import ar.edu.unlar.paradigmas3.sistemagal.grillas.TipoAccidenteGrilla;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Tipo_Accidente;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.controladores.Tipo_Accidente_Controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Mateo.Bazan
 */
public class ABMTipoAccidente extends javax.swing.JInternalFrame {

    private Tipo_Accidente_Controller tipo_Accidente_Controller = new Tipo_Accidente_Controller();
    private TipoAccidenteGrilla tipoAccidenteGrilla;

    public ABMTipoAccidente() {

        initComponents();

        tipoAccidenteGrilla = new TipoAccidenteGrilla();
        tblTipoAccidentes.setModel(tipoAccidenteGrilla);

        txtFieldTipoAccidente.setEditable(false);
        txtFieldCodigo.setEditable(false);
        btnAceptar.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoAccidenteGrilla1 = new ar.edu.unlar.paradigmas3.sistemagal.grillas.TipoAccidenteGrilla();
        jPanel1 = new javax.swing.JPanel();
        tittleABM = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTipoAccidentes = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        txtFieldCodigo = new javax.swing.JTextField();
        lblTipoAccidente = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtFieldTipoAccidente = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("ABM Tipo accidente");

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        tittleABM.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        tittleABM.setForeground(new java.awt.Color(255, 255, 255));
        tittleABM.setText("ABM Tipo Accidente");

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

        tblTipoAccidentes.setModel(tipoAccidenteGrilla1);
        tblTipoAccidentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTipoAccidentesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTipoAccidentes);
        if (tblTipoAccidentes.getColumnModel().getColumnCount() > 0) {
            tblTipoAccidentes.getColumnModel().getColumn(0).setHeaderValue("Legajo");
            tblTipoAccidentes.getColumnModel().getColumn(1).setHeaderValue("Apellidos y Nombres");
        }

        btnUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mateo.Bazan\\OneDrive\\OneDrive - TSOFT\\Escritorio\\SistemaGAL\\src\\main\\java\\ar\\edu\\unlar\\paradigmas3\\sistemagal\\ui\\img\\actualizar.png")); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCodigoActionPerformed(evt);
            }
        });

        lblTipoAccidente.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        lblTipoAccidente.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoAccidente.setText("Tipo accidente");

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

        btnBorrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mateo.Bazan\\OneDrive\\OneDrive - TSOFT\\Escritorio\\SistemaGAL\\src\\main\\java\\ar\\edu\\unlar\\paradigmas3\\sistemagal\\ui\\img\\cruz.png")); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tittleABM)
                .addGap(234, 234, 234))
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
                            .addComponent(txtFieldTipoAccidente, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(291, 291, 291)
                                .addComponent(lblTipoAccidente))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tittleABM)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(lblTipoAccidente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldTipoAccidente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        txtFieldTipoAccidente.setEditable(true);
        txtFieldCodigo.setEditable(true);
        btnModificar.setEnabled(true);
        btnAgregar.setEnabled(false);
        btnBorrar.setEnabled(false);

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        tipo_Accidente_Controller = new Tipo_Accidente_Controller();
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

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblTipoAccidentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTipoAccidentesMouseClicked
        if (evt.getClickCount() == 1) {
            JTable receptor = (JTable) evt.getSource();
            txtFieldCodigo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtFieldTipoAccidente.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
        }
    }//GEN-LAST:event_tblTipoAccidentesMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtFieldCodigo.setText("");
        txtFieldTipoAccidente.setText("");
        txtFieldTipoAccidente.setEditable(false);
        txtFieldCodigo.setEditable(false);
        btnAceptar.setEnabled(false);
        btnBorrar.setEnabled(true);
        btnAgregar.setEnabled(true);
        btnModificar.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        tipo_Accidente_Controller = new Tipo_Accidente_Controller();

        if (btnAgregar.isEnabled()) {

            int codigo = Integer.parseInt(txtFieldCodigo.getText());
            String tipo = txtFieldTipoAccidente.getText();

            try {

                Tipo_Accidente tipo_Accidente = new Tipo_Accidente(codigo, tipo);
                tipo_Accidente.setCodigo(codigo);
                tipo_Accidente.setTipo(tipo);

                JOptionPane.showMessageDialog(this, "Tipo accidente ingresado", "OK", HEIGHT);

                tipo_Accidente_Controller.addTipoAccidente(tipo_Accidente);

            } catch (Exception e) {

                JOptionPane.showMessageDialog(rootPane, "Error al ingresar empleado", "ERROR", HEIGHT);

            }

            txtFieldTipoAccidente.setText("");
            txtFieldCodigo.setText("");
            txtFieldTipoAccidente.setEditable(false);
            txtFieldCodigo.setEditable(false);
            btnAceptar.setEnabled(true);
            btnModificar.setEnabled(true);
            btnBorrar.setEnabled(true);

        } else if (btnModificar.isEnabled()) {
            int codigo = Integer.parseInt(txtFieldCodigo.getText());
            String tipo = txtFieldTipoAccidente.getText();

            Tipo_Accidente tipo_Accidente = new Tipo_Accidente(codigo, tipo);
            tipo_Accidente.setCodigo(codigo);
            tipo_Accidente.setTipo(tipo);

            tipo_Accidente_Controller.updateTipoAccidente(tipo_Accidente);

            JOptionPane.showMessageDialog(this, "Tipo accidente modificado", "OK", HEIGHT);

            txtFieldCodigo.setText("");
            txtFieldTipoAccidente.setText("");
            btnAceptar.setEnabled(true);
            btnModificar.setEnabled(true);
            btnBorrar.setEnabled(true);
            btnAgregar.setEnabled(true);
            txtFieldTipoAccidente.setEditable(false);
            txtFieldCodigo.setEditable(false);

        } else if (btnBorrar.isEnabled()) {

            int codigo = Integer.parseInt(txtFieldCodigo.getText());

            Tipo_Accidente tipo_Accidente = new Tipo_Accidente();
            tipo_Accidente.setCodigo(codigo);

            tipo_Accidente_Controller.deleteTipoAccidente(tipo_Accidente);

            JOptionPane.showMessageDialog(this, "Tipo accidente eliminado", "OK", HEIGHT);

            txtFieldCodigo.setText("");
            btnAceptar.setEnabled(false);
            btnBorrar.setEnabled(true);

            txtFieldCodigo.setText("");
            txtFieldTipoAccidente.setText("");
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
        txtFieldTipoAccidente.setEditable(true);
        txtFieldCodigo.setEditable(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldCodigoActionPerformed


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
    private javax.swing.JLabel lblTipoAccidente;
    private javax.swing.JTable tblTipoAccidentes;
    private ar.edu.unlar.paradigmas3.sistemagal.grillas.TipoAccidenteGrilla tipoAccidenteGrilla1;
    private javax.swing.JLabel tittleABM;
    private javax.swing.JTextField txtFieldCodigo;
    private javax.swing.JTextField txtFieldTipoAccidente;
    // End of variables declaration//GEN-END:variables
}
