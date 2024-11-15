package ar.edu.unlar.paradigmas3.sistemagal.ui;

import ar.edu.unlar.paradigmas3.sistemagal.grillas.ZonaCuerpoGrilla;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Accidente;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Parte_Cuerpo;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Zona_Cuerpo;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.controladores.Accidente_Controller;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.controladores.ParteCuerpo_Controller;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.controladores.ZonaCuerpo_Controller;
import ar.edu.unlar.paradigmas3.sistemagal.ui.forms.AccidentesForm;
import ar.edu.unlar.paradigmas3.sistemagal.ui.forms.PartesCuerpoForm;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Mateo.Bazan
 */
public class ABMZonaCuerpo extends javax.swing.JInternalFrame {

    private ZonaCuerpo_Controller zonaCuerpo_Controller = new ZonaCuerpo_Controller();
    private ZonaCuerpoGrilla zonaCuerpoGrilla;

    public ABMZonaCuerpo() {

        initComponents();
        boxGet();
        zonaCuerpoGrilla = new ZonaCuerpoGrilla();
        tblZonaCuerpo.setModel(zonaCuerpoGrilla);

        txtFieldZonaCuerpo.setEditable(false);
        btnAceptar.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zonaCuerpoGrilla1 = new ar.edu.unlar.paradigmas3.sistemagal.grillas.ZonaCuerpoGrilla();
        jPanel1 = new javax.swing.JPanel();
        tittleABM = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblZonaCuerpo = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        lblParteCuerpo = new javax.swing.JLabel();
        txtFieldZonaCuerpo = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        boxCodigoAccidente = new javax.swing.JComboBox<>();
        lblCodigoAccidente = new javax.swing.JLabel();
        boxCodigoParte = new javax.swing.JComboBox<>();
        lblCodigoParte = new javax.swing.JLabel();
        btnAccidentes = new javax.swing.JButton();
        btnPartesCuerpo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("ABM Zonas Cuerpo");

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        tittleABM.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        tittleABM.setForeground(new java.awt.Color(255, 255, 255));
        tittleABM.setText("ABM Zonas Cuerpo");

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

        tblZonaCuerpo.setModel(zonaCuerpoGrilla1);
        tblZonaCuerpo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblZonaCuerpoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblZonaCuerpo);
        if (tblZonaCuerpo.getColumnModel().getColumnCount() > 0) {
            tblZonaCuerpo.getColumnModel().getColumn(0).setHeaderValue("Legajo");
        }

        btnUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mateo.Bazan\\OneDrive\\OneDrive - TSOFT\\Escritorio\\SistemaGAL\\src\\main\\java\\ar\\edu\\unlar\\paradigmas3\\sistemagal\\ui\\img\\actualizar.png")); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblParteCuerpo.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        lblParteCuerpo.setForeground(new java.awt.Color(255, 255, 255));
        lblParteCuerpo.setText("Zonas cuerpos");

        btnAceptar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mateo.Bazan\\OneDrive\\OneDrive - TSOFT\\Escritorio\\SistemaGAL\\src\\main\\java\\ar\\edu\\unlar\\paradigmas3\\sistemagal\\ui\\img\\lapiz.png")); // NOI18N
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

        boxCodigoAccidente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblCodigoAccidente.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        lblCodigoAccidente.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigoAccidente.setText("Codigo Accidente");

        boxCodigoParte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblCodigoParte.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        lblCodigoParte.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigoParte.setText("Codigo Parte");

        btnAccidentes.setText("i");
        btnAccidentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccidentesActionPerformed(evt);
            }
        });

        btnPartesCuerpo.setText("i");
        btnPartesCuerpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartesCuerpoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tittleABM)
                .addGap(218, 218, 218))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(5, 5, 5)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblParteCuerpo)
                            .addComponent(txtFieldZonaCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxCodigoAccidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCodigoAccidente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAccidentes)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblCodigoParte)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPartesCuerpo))
                                    .addComponent(boxCodigoParte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tittleABM)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblParteCuerpo)
                    .addComponent(lblCodigoAccidente)
                    .addComponent(lblCodigoParte)
                    .addComponent(btnAccidentes)
                    .addComponent(btnPartesCuerpo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldZonaCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxCodigoParte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxCodigoAccidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
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
        txtFieldZonaCuerpo.setEditable(true);
        btnModificar.setEnabled(true);
        btnAgregar.setEnabled(false);
        btnBorrar.setEnabled(false);

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        zonaCuerpo_Controller = new ZonaCuerpo_Controller();
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Codigo Accidente");
        model.addColumn("Codigo Parte");
        model.addColumn("Zonas Cuerpo");

        ArrayList<Zona_Cuerpo> data = zonaCuerpo_Controller.getZonaCuerpos();

        for (Zona_Cuerpo zona_Cuerpo : data) {

            Object[] rowData = {
                zona_Cuerpo.getCodigo_accidente().getNumero(), zona_Cuerpo.getCodigo_parte().getCodigo(), zona_Cuerpo.isIzq_der()
            };

            model.addRow(rowData);

        }

        tblZonaCuerpo.setModel(model);

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblZonaCuerpoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblZonaCuerpoMouseClicked
        if (evt.getClickCount() == 1) {
            JTable receptor = (JTable) evt.getSource();
            boxCodigoAccidente.setSelectedItem(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0));
            boxCodigoParte.setSelectedItem(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1));
            txtFieldZonaCuerpo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_tblZonaCuerpoMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        txtFieldZonaCuerpo.setText("");
        txtFieldZonaCuerpo.setEditable(false);
        btnAceptar.setEnabled(false);
        btnBorrar.setEnabled(true);
        btnAgregar.setEnabled(true);
        btnModificar.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        zonaCuerpo_Controller = new ZonaCuerpo_Controller();

        if (btnAgregar.isEnabled()) {

            String parte = txtFieldZonaCuerpo.getText();
            int codigoAccidente = (int) boxCodigoAccidente.getSelectedItem();
            Accidente accidente = new Accidente(codigoAccidente);
            int codigoParte = (int) boxCodigoParte.getSelectedItem();
            Parte_Cuerpo Parte_Cuerpo = new Parte_Cuerpo(codigoParte);

            try {

                Zona_Cuerpo zona_Cuerpo = new Zona_Cuerpo(accidente, Parte_Cuerpo, parte);

                zonaCuerpo_Controller.addZonaCuerpo(zona_Cuerpo);

                JOptionPane.showMessageDialog(this, "Parte cuerpo ingresada", "OK", HEIGHT);

            } catch (Exception e) {

                JOptionPane.showMessageDialog(rootPane, "Error al ingresar zona cuerpo", "ERROR", HEIGHT);

            }

            txtFieldZonaCuerpo.setText("");
            btnAceptar.setEnabled(true);
            btnModificar.setEnabled(true);
            btnBorrar.setEnabled(true);

        } else if (btnModificar.isEnabled()) {

            int codigo_accidente = (int) boxCodigoAccidente.getSelectedItem();
            int codigo_parte = (int) boxCodigoParte.getSelectedItem();
            Accidente accidente = new Accidente(codigo_accidente);
            Parte_Cuerpo parte_Cuerpo = new Parte_Cuerpo(codigo_parte);
            String izq_der = txtFieldZonaCuerpo.getText();

            Zona_Cuerpo zona_Cuerpo = new Zona_Cuerpo(accidente, parte_Cuerpo,izq_der);

            zonaCuerpo_Controller.updateZonaCuerpo(zona_Cuerpo);

            txtFieldZonaCuerpo.setText("");
            btnBorrar.setEnabled(true);
            btnAgregar.setEnabled(true);
            btnAceptar.setEnabled(false);
            btnModificar.setEnabled(true);
            txtFieldZonaCuerpo.setEditable(false);

        } else if (btnBorrar.isEnabled()) {

            int codigo_accidente = (int) boxCodigoAccidente.getSelectedItem();
            int codigo_parte = (int) boxCodigoParte.getSelectedItem();
            Accidente accidente = new Accidente(codigo_accidente);
            Parte_Cuerpo parte_Cuerpo = new Parte_Cuerpo(codigo_parte);

            Zona_Cuerpo zona_Cuerpo = new Zona_Cuerpo(accidente, parte_Cuerpo);

            zonaCuerpo_Controller.deleteZonaCuerpo(zona_Cuerpo);

            JOptionPane.showMessageDialog(this, "Zona cuerpo eliminada", "OK", HEIGHT);

            txtFieldZonaCuerpo.setText("");
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
        txtFieldZonaCuerpo.setEditable(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAccidentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccidentesActionPerformed
        AccidentesForm accidentesForm = new AccidentesForm();
        accidentesForm.setVisible(true);
    }//GEN-LAST:event_btnAccidentesActionPerformed

    private void btnPartesCuerpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartesCuerpoActionPerformed
        PartesCuerpoForm partesCuerpoForm = new PartesCuerpoForm();
        partesCuerpoForm.setVisible(true);
    }//GEN-LAST:event_btnPartesCuerpoActionPerformed

    public void boxGet() {

        // Método para llenar el ComboBox de ParteCuerpo
        DefaultComboBoxModel combo5 = new DefaultComboBoxModel();
        boxCodigoParte.setModel(combo5);
        ParteCuerpo_Controller partecuerpo_Controller = new ParteCuerpo_Controller();

        // Obtener la lista de partes del cuerpo
        ArrayList<Parte_Cuerpo> partecuerpos = partecuerpo_Controller.getParteCuerpos();

        // Agregar cada parte del cuerpo al modelo del ComboBox
        for (Parte_Cuerpo partecuerpo : partecuerpos) {
            combo5.addElement(partecuerpo.getCodigo());
        }

        // Obtener la lista de zonas del cuerpo
        DefaultComboBoxModel combo4 = new DefaultComboBoxModel();
        boxCodigoAccidente.setModel(combo4);
        Accidente_Controller accidenteController = new Accidente_Controller();
        ArrayList<Accidente> accidentes = accidenteController.getAccidentesPreZona();

        try {
            // Agregar cada zona del cuerpo al modelo del ComboBox
            for (Accidente accidente : accidentes) {
                combo4.addElement(accidente.getNumero());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCodigoAccidente;
    private javax.swing.JComboBox<String> boxCodigoParte;
    private javax.swing.JButton btnAccidentes;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnPartesCuerpo;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoAccidente;
    private javax.swing.JLabel lblCodigoParte;
    private javax.swing.JLabel lblParteCuerpo;
    private javax.swing.JTable tblZonaCuerpo;
    private javax.swing.JLabel tittleABM;
    private javax.swing.JTextField txtFieldZonaCuerpo;
    private ar.edu.unlar.paradigmas3.sistemagal.grillas.ZonaCuerpoGrilla zonaCuerpoGrilla1;
    // End of variables declaration//GEN-END:variables
}
