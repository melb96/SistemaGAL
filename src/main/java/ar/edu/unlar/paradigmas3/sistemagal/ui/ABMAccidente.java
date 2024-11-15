package ar.edu.unlar.paradigmas3.sistemagal.ui;

import ar.edu.unlar.paradigmas3.sistemagal.grillas.AccidenteGrilla;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Accidente;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Empleado;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Motivo;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Tipo_Accidente;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.controladores.Accidente_Controller;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.controladores.Empleado_Controller;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.controladores.Motivo_Controller;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.controladores.Tipo_Accidente_Controller;
import ar.edu.unlar.paradigmas3.sistemagal.ui.forms.EmpleadosForm;
import ar.edu.unlar.paradigmas3.sistemagal.ui.forms.MotivosForm;
import ar.edu.unlar.paradigmas3.sistemagal.ui.forms.TipoAccidenteForm;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Mateo.Bazan
 */
public class ABMAccidente extends javax.swing.JInternalFrame {

    private Accidente_Controller accidente_Controller = new Accidente_Controller();
    private AccidenteGrilla accidenteGrilla;

    public ABMAccidente() {

        initComponents();
        boxsDB();
        accidenteGrilla = new AccidenteGrilla();
        tblAccidentes.setModel(accidenteGrilla);

        txtFieldUbicacion.setEditable(false);
        txtFieldNumero.setEditable(false);
        btnAceptar.setEnabled(false);
        txtFieldFecha.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accidenteGrilla1 = new ar.edu.unlar.paradigmas3.sistemagal.grillas.AccidenteGrilla();
        jPanel1 = new javax.swing.JPanel();
        tittleABM = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAccidentes = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        txtFieldNumero = new javax.swing.JTextField();
        lblTipoAccidente = new javax.swing.JLabel();
        lblNumeroAccidente = new javax.swing.JLabel();
        txtFieldUbicacion = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        lblLegajo = new javax.swing.JLabel();
        boxLegajoEmpleados = new javax.swing.JComboBox<>();
        lblMotivo = new javax.swing.JLabel();
        boxMotivo = new javax.swing.JComboBox<>();
        boxTipoAccidente = new javax.swing.JComboBox<>();
        txtFieldFecha = new javax.swing.JTextField();
        lblUbicacion = new javax.swing.JLabel();
        lblFechaAccidente = new javax.swing.JLabel();
        btnEmpleados = new javax.swing.JButton();
        btnTiposAccidente = new javax.swing.JButton();
        btnMotivos = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("ABM Accidente");

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        tittleABM.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        tittleABM.setForeground(new java.awt.Color(255, 255, 255));
        tittleABM.setText("ABM Accidentes");

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

        tblAccidentes.setModel(accidenteGrilla1);
        tblAccidentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAccidentesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAccidentes);
        if (tblAccidentes.getColumnModel().getColumnCount() > 0) {
            tblAccidentes.getColumnModel().getColumn(0).setHeaderValue("Legajo");
            tblAccidentes.getColumnModel().getColumn(1).setHeaderValue("Apellidos y Nombres");
        }

        btnUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mateo.Bazan\\OneDrive\\OneDrive - TSOFT\\Escritorio\\SistemaGAL\\src\\main\\java\\ar\\edu\\unlar\\paradigmas3\\sistemagal\\ui\\img\\actualizar.png")); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNumeroActionPerformed(evt);
            }
        });

        lblTipoAccidente.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        lblTipoAccidente.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoAccidente.setText("Tipo accidente");

        lblNumeroAccidente.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        lblNumeroAccidente.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroAccidente.setText("Numero");

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

        lblLegajo.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        lblLegajo.setForeground(new java.awt.Color(255, 255, 255));
        lblLegajo.setText("Legajo");

        boxLegajoEmpleados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblMotivo.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        lblMotivo.setForeground(new java.awt.Color(255, 255, 255));
        lblMotivo.setText("Motivo");

        boxMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        boxTipoAccidente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtFieldFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldFechaActionPerformed(evt);
            }
        });

        lblUbicacion.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        lblUbicacion.setForeground(new java.awt.Color(255, 255, 255));
        lblUbicacion.setText("Ubicacion");

        lblFechaAccidente.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        lblFechaAccidente.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaAccidente.setText("Fecha");

        btnEmpleados.setText("i");
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });

        btnTiposAccidente.setText("i");
        btnTiposAccidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiposAccidenteActionPerformed(evt);
            }
        });

        btnMotivos.setText("i");
        btnMotivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMotivosActionPerformed(evt);
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
                            .addComponent(lblNumeroAccidente)
                            .addComponent(txtFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(lblFechaAccidente)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFieldUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tittleABM)
                                    .addComponent(lblUbicacion)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(boxMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblMotivo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnMotivos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblTipoAccidente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTiposAccidente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(boxTipoAccidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxLegajoEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblLegajo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblNumeroAccidente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tittleABM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblUbicacion))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblFechaAccidente)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLegajo)
                    .addComponent(lblMotivo)
                    .addComponent(lblTipoAccidente)
                    .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTiposAccidente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMotivos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxLegajoEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxTipoAccidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
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
        txtFieldUbicacion.setEditable(true);
        txtFieldNumero.setEditable(true);
        txtFieldFecha.setEditable(true);
        btnModificar.setEnabled(true);
        btnAgregar.setEnabled(false);
        btnBorrar.setEnabled(false);

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        accidente_Controller = new Accidente_Controller();
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Numero");
        model.addColumn("Fecha");
        model.addColumn("Ubicacion");
        model.addColumn("LegajoEmpleado");
        model.addColumn("CodigoMotivo");
        model.addColumn("CodigoTipoAccidente");
        model.addColumn("ZonaCuerpo");
        model.addColumn("ParteCuerpo");

        ArrayList<Accidente> data = accidente_Controller.getAccidentes();

        for (Accidente accidente : data) {

            Object[] rowData = {
                accidente.getNumero(), accidente.getFecha(), accidente.getUbicacion(), accidente.getLegajoEmpleado().getLegajo(), accidente.getCodigoMotivo().getCodigo(), accidente.getCodigoTipoAccidente().getCodigo(),
                accidente.getZonaCuerpo().isIzq_der(), accidente.getParteCuerpo().getParte()//getCodigo()
            };

            model.addRow(rowData);

        }

        tblAccidentes.setModel(model);

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblAccidentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccidentesMouseClicked
        if (evt.getClickCount() == 1) {
            JTable receptor = (JTable) evt.getSource();
            txtFieldNumero.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtFieldFecha.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            txtFieldUbicacion.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            boxLegajoEmpleados.setSelectedItem(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3));
            boxMotivo.setSelectedItem(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4));
            boxTipoAccidente.setSelectedItem(receptor.getModel().getValueAt(receptor.getSelectedRow(), 5));
        }
    }//GEN-LAST:event_tblAccidentesMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtFieldNumero.setText("");
        txtFieldUbicacion.setText("");
        txtFieldUbicacion.setEditable(false);
        txtFieldNumero.setEditable(false);
        txtFieldFecha.setEditable(false);
        btnAceptar.setEnabled(false);
        btnBorrar.setEnabled(true);
        btnAgregar.setEnabled(true);
        btnModificar.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        accidente_Controller = new Accidente_Controller();

        if (btnAgregar.isEnabled()) {
            try {

                int numero = Integer.parseInt(txtFieldNumero.getText());
                String ubicacion = txtFieldUbicacion.getText();
                // Validación y conversión de la fecha manual ingresada
                String fechaStr = txtFieldFecha.getText();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date fecha = null;

                try {
                    fecha = sdf.parse(fechaStr);
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(this, "Fecha inválida. Use el formato dd/MM/yyyy.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int legajoSeleccionado = (int) boxLegajoEmpleados.getSelectedItem();
                Empleado empleado = new Empleado(legajoSeleccionado);

                int motivoSeleccionado = (int) boxMotivo.getSelectedItem();
                Motivo motivo = new Motivo(motivoSeleccionado);

                int codigoTipoAccidente = (int) boxTipoAccidente.getSelectedItem();
                if (codigoTipoAccidente == 0) {
                    JOptionPane.showMessageDialog(this, "Por favor, seleccione un tipo de accidente.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                Tipo_Accidente tipo_Accidente = new Tipo_Accidente(codigoTipoAccidente);

                Accidente accidente = new Accidente(numero, fecha, ubicacion, empleado, motivo, tipo_Accidente);

                JOptionPane.showMessageDialog(this, "Tipo accidente ingresado", "OK", HEIGHT);

                accidente_Controller.addAccidente(accidente);

            } catch (Exception e) {

                JOptionPane.showMessageDialog(rootPane, "Error al ingresar empleado", "ERROR", HEIGHT);
                e.printStackTrace();
            }

            txtFieldUbicacion.setText("");
            txtFieldNumero.setText("");
            txtFieldUbicacion.setEditable(false);
            txtFieldNumero.setEditable(false);
            btnAceptar.setEnabled(true);
            btnModificar.setEnabled(true);
            btnBorrar.setEnabled(true);

        } else if (btnModificar.isEnabled()) {
            try {

                int numero = Integer.parseInt(txtFieldNumero.getText());
                String ubicacion = txtFieldUbicacion.getText();
                // Validación y conversión de la fecha manual ingresada
                String fechaStr = txtFieldFecha.getText();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date fecha = null;

                try {
                    fecha = sdf.parse(fechaStr);
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(this, "Fecha inválida. Use el formato dd/MM/yyyy.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int legajoSeleccionado = (int) boxLegajoEmpleados.getSelectedItem();
                Empleado empleado = new Empleado(legajoSeleccionado);

                int motivoSeleccionado = (int) boxMotivo.getSelectedItem();
                Motivo motivo = new Motivo(motivoSeleccionado);

                int codigoTipoAccidente = (int) boxTipoAccidente.getSelectedItem();
                if (codigoTipoAccidente == 0) {
                    JOptionPane.showMessageDialog(this, "Por favor, seleccione un tipo de accidente.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                Tipo_Accidente tipo_Accidente = new Tipo_Accidente(codigoTipoAccidente);

                Accidente accidente = new Accidente(numero, fecha, ubicacion, empleado, motivo, tipo_Accidente);

                // Llamar al método del controlador para actualizar
                accidente_Controller.updateAccidente(accidente);

                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(this, "Accidente modificado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                // Reiniciar la interfaz
                txtFieldNumero.setText("");
                txtFieldUbicacion.setText("");
                txtFieldFecha.setText("");
                btnAceptar.setEnabled(true);
                btnModificar.setEnabled(false);
                btnBorrar.setEnabled(true);
                btnAgregar.setEnabled(true);
                txtFieldUbicacion.setEditable(false);
                txtFieldNumero.setEditable(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al modificar el accidente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }

        } else if (btnBorrar.isEnabled()) {
            try {
                // Validar que el campo "Número" no esté vacío
                String numeroText = txtFieldNumero.getText();
                if (numeroText.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Debe ingresar un número para borrar.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int numero = Integer.parseInt(numeroText);

                // Confirmar la acción del usuario
                int confirm = JOptionPane.showConfirmDialog(
                        this,
                        "¿Está seguro de que desea borrar el accidente con número " + numero + "?",
                        "Confirmar borrado",
                        JOptionPane.YES_NO_OPTION
                );

                if (confirm == JOptionPane.YES_OPTION) {
                    // Llamar al método del controlador para borrar
                    accidente_Controller.deleteAccidente(numero);

                    // Mostrar mensaje de éxito
                    JOptionPane.showMessageDialog(this, "Accidente eliminado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                    // Limpiar los campos y deshabilitar botones si es necesario
                    txtFieldNumero.setText("");
                    txtFieldUbicacion.setText("");
                    txtFieldFecha.setText("");

                    btnAceptar.setEnabled(true);
                    btnModificar.setEnabled(false);
                    btnBorrar.setEnabled(false);
                    btnAgregar.setEnabled(true);

                    txtFieldUbicacion.setEditable(false);
                    txtFieldNumero.setEditable(false);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El número debe ser un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al borrar el accidente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
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
        txtFieldUbicacion.setEditable(true);
        txtFieldNumero.setEditable(true);
        txtFieldFecha.setEditable(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNumeroActionPerformed

    private void txtFieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldFechaActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        EmpleadosForm empleadosForm = new EmpleadosForm();
        empleadosForm.setVisible(true);
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnMotivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMotivosActionPerformed
        MotivosForm motivosForm = new MotivosForm();
        motivosForm.setVisible(true);
    }//GEN-LAST:event_btnMotivosActionPerformed

    private void btnTiposAccidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiposAccidenteActionPerformed
       TipoAccidenteForm tipoAccidenteForm = new TipoAccidenteForm();
       tipoAccidenteForm.setVisible(true);
    }//GEN-LAST:event_btnTiposAccidenteActionPerformed

    public void boxsDB() {

        //Metodo para llamar a motivos
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        boxMotivo.setModel(combo);
        Motivo_Controller motivo_Controller = new Motivo_Controller();
        ArrayList<Motivo> motivos = motivo_Controller.getMotivos();

        for (Motivo motivo : motivos) {

            combo.addElement(motivo.getCodigo());

        }

        //Metodo para llamar tipo accidentes
        DefaultComboBoxModel combo2 = new DefaultComboBoxModel();
        boxTipoAccidente.setModel(combo2);
        Tipo_Accidente_Controller tipo_Accidente_Controller = new Tipo_Accidente_Controller();
        ArrayList<Tipo_Accidente> tipo_Accidentes = tipo_Accidente_Controller.getTipo_Accidentes();

        for (Tipo_Accidente tipo_Accidente : tipo_Accidentes) {

            combo2.addElement(tipo_Accidente.getCodigo());
        }

        //Metodo para llamar legajo empleados
        DefaultComboBoxModel combo3 = new DefaultComboBoxModel();
        boxLegajoEmpleados.setModel(combo3);
        Empleado_Controller empleado_Controller = new Empleado_Controller();
        ArrayList<Empleado> empleados = empleado_Controller.getEmpleados();

        for (Empleado empleado : empleados) {

            combo3.addElement(empleado.getLegajo());

        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ar.edu.unlar.paradigmas3.sistemagal.grillas.AccidenteGrilla accidenteGrilla1;
    private javax.swing.JComboBox<String> boxLegajoEmpleados;
    private javax.swing.JComboBox<String> boxMotivo;
    private javax.swing.JComboBox<String> boxTipoAccidente;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMotivos;
    private javax.swing.JButton btnTiposAccidente;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFechaAccidente;
    private javax.swing.JLabel lblLegajo;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JLabel lblNumeroAccidente;
    private javax.swing.JLabel lblTipoAccidente;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JTable tblAccidentes;
    private javax.swing.JLabel tittleABM;
    private javax.swing.JTextField txtFieldFecha;
    private javax.swing.JTextField txtFieldNumero;
    private javax.swing.JTextField txtFieldUbicacion;
    // End of variables declaration//GEN-END:variables
}
