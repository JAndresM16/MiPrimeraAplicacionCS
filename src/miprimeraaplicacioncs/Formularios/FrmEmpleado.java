/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraaplicacioncs.Formularios;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import miprimeraaplicacioncs.EmpleadoBeans;

/**
 *
 * @author Usuario
 */
public class FrmEmpleado extends javax.swing.JFrame {

    private EmpleadoBeans empleadoBeans;

    /**
     * Creates new form FrmEmpleado
     */
    public FrmEmpleado() {
        initComponents();
        try {
            empleadoBeans = new EmpleadoBeans();
            cargarComboCargo();
            cargarComboHorario();
            nuevo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al inicializar el formulario: " + e.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtEmpleado = new javax.swing.JTable();
        lblnombres = new javax.swing.JLabel();
        lblapellidos = new javax.swing.JLabel();
        lblcedula_ruc = new javax.swing.JLabel();
        lblid_cliente = new javax.swing.JLabel();
        lbldireccion = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        txtidclempleado = new javax.swing.JTextField();
        txtcedularuc = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtcargo = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lbltelefono1 = new javax.swing.JLabel();
        txthorai = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbidhorario = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txthoraf = new javax.swing.JTextField();
        cbidcargo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtsueldo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtdias = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Act_Elim = new javax.swing.JMenuItem();
        MenuP = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Apellidos y Nombres", "Cargo", "Hora Inicio", "Hora Fin", "Sueldo"
            }
        ));
        jtEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtEmpleado);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 680, 110));

        lblnombres.setText("Apellidos y Nombres");
        jPanel1.add(lblnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 140, 20));

        lblapellidos.setText("Telefono");
        jPanel1.add(lblapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 80, 20));

        lblcedula_ruc.setText("Cedula_Ruc");
        jPanel1.add(lblcedula_ruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 110, 20));

        lblid_cliente.setText("Id_Empleado");
        jPanel1.add(lblid_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, 20));

        lbldireccion.setText("Direccion");
        jPanel1.add(lbldireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 110, 20));

        lbltelefono.setText("Cargo");
        jPanel1.add(lbltelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 40, 20));
        jPanel1.add(txtidclempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 50, -1));
        jPanel1.add(txtcedularuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 140, 20));
        jPanel1.add(txtnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 440, -1));
        jPanel1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 160, -1));
        jPanel1.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 440, -1));

        txtcargo.setEditable(false);
        jPanel1.add(txtcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 130, -1));

        btnNuevo.setText("Nuevo  Empleado");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        lbltelefono1.setText("Horario");
        jPanel1.add(lbltelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 50, 20));

        txthorai.setEditable(false);
        jPanel1.add(txthorai, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 70, 20));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("EMPLEADO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 210, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Informacion Personal");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 630, 150));

        cbidhorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbidhorarioMousePressed(evt);
            }
        });
        cbidhorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbidhorarioActionPerformed(evt);
            }
        });
        jPanel1.add(cbidhorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, 20));

        jLabel4.setText("Hora Inicio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, 20));

        jLabel5.setText("Hora Fin");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, 20));

        txthoraf.setEditable(false);
        jPanel1.add(txthoraf, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 70, 20));

        cbidcargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbidcargoMousePressed(evt);
            }
        });
        cbidcargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbidcargoActionPerformed(evt);
            }
        });
        jPanel1.add(cbidcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 90, -1));

        jLabel6.setText("Sueldo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 40, 20));

        txtsueldo.setEditable(false);
        jPanel1.add(txtsueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 50, -1));

        jLabel7.setText("$");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 10, -1));

        jLabel8.setText("Dias");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 30, 20));

        txtdias.setEditable(false);
        jPanel1.add(txtdias, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 100, 20));

        jMenu1.setText("Menu");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        Act_Elim.setText("Actualizar / Eliminar");
        Act_Elim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Act_ElimActionPerformed(evt);
            }
        });
        jMenu1.add(Act_Elim);

        MenuP.setText("Menu Principal");
        MenuP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPActionPerformed(evt);
            }
        });
        jMenu1.add(MenuP);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEmpleadoMouseClicked
        // TODO add your handling code here:
        this.MouseClick();

    }//GEN-LAST:event_jtEmpleadoMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this.nuevo();

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        this.enviar();

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbidcargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbidcargoActionPerformed
        // TODO add your handling code here:
        try {
            String cargoId = cbidcargo.getSelectedItem().toString();
            ResultSet rs = empleadoBeans.consultaTabla("SELECT cargo, sueldo FROM cargo WHERE id_cargo = " + cargoId);
            if (rs.next()) {
                txtcargo.setText(rs.getString("cargo"));
                txtsueldo.setText(String.valueOf(rs.getDouble("sueldo")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el cargo: " + e.toString());
        }

    }//GEN-LAST:event_cbidcargoActionPerformed

    private void cbidhorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbidhorarioActionPerformed
        // TODO add your handling code here:
        try {
            String horarioId = cbidhorario.getSelectedItem().toString();
            ResultSet rs = empleadoBeans.consultaTabla("SELECT horaInicio, horaFin, dias FROM horario WHERE id_horario = " + horarioId);
            if (rs.next()) {
                txthorai.setText(rs.getString("horaInicio"));
                txthoraf.setText(rs.getString("horaFin"));
                txtdias.setText(rs.getString("dias"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el horario: " + e.toString());
        }
    }//GEN-LAST:event_cbidhorarioActionPerformed

    private void cbidcargoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbidcargoMousePressed
        // TODO add your handling code here:
        FrmCargo fc = new FrmCargo();
        this.setVisible(false);
        fc.setVisible(true);
    }//GEN-LAST:event_cbidcargoMousePressed

    private void cbidhorarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbidhorarioMousePressed
        try {
            // TODO add your handling code here:
            FrmHorario fc = new FrmHorario();
            this.setVisible(false);
            fc.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(FrmEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbidhorarioMousePressed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void MenuPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPActionPerformed
        // TODO add your handling code here:
        FrmMenu fm = new FrmMenu();
        this.setVisible(false);
        fm.setVisible(true);
    }//GEN-LAST:event_MenuPActionPerformed

    private void Act_ElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Act_ElimActionPerformed
        // TODO add your handling code here:
        FrmEmpleadosC fm = new FrmEmpleadosC();
        this.setVisible(false);
        fm.setVisible(true);
    }//GEN-LAST:event_Act_ElimActionPerformed

    /**
     * @param args the command line arguments
     */
    private void nuevo() {
        try {
            txtidclempleado.setText("" + empleadoBeans.Incremento_Empleado());
            if (cbidcargo.getItemCount() > 0) {
                cbidcargo.setSelectedIndex(0);
            }
            if (cbidhorario.getItemCount() > 0) {
                cbidhorario.setSelectedIndex(0);
            }
            txtcedularuc.setText("");
            txtnombres.setText("");
            txttelefono.setText("");
            txtdireccion.setText("");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al generar un nuevo empleado: " + e.toString());
        }
    }

    private void enviar() {
        try {
            empleadoBeans.setId_Empleado(Integer.parseInt(txtidclempleado.getText()));
            empleadoBeans.setId_cargo(Integer.parseInt(cbidcargo.getSelectedItem().toString()));
            empleadoBeans.setId_horario(Integer.parseInt(cbidhorario.getSelectedItem().toString()));
            empleadoBeans.setCedula(txtcedularuc.getText());
            empleadoBeans.setNombres(txtnombres.getText());
            empleadoBeans.setTelefono(txttelefono.getText());
            empleadoBeans.setDireccion(txtdireccion.getText());
            empleadoBeans.Insertar_Empleado();
            this.mostrar(jtEmpleado, "SELECT e.cedula, e.nombres, c.cargo, h.horaInicio, h.horaFin, c.sueldo FROM empleado e JOIN cargo c ON e.id_cargo = c.id_cargo JOIN horario h ON e.id_horario = h.id_horario");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transacción RollBack..." + e.toString());
        }
    }

    private void cargarComboCargo() {
        try {
            ResultSet rs = empleadoBeans.consultaTabla("SELECT * FROM cargo");
            while (rs.next()) {
                cbidcargo.addItem(rs.getString("id_cargo"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los cargos: " + e.toString());
        }
    }

    private void cargarComboHorario() {
        try {
            ResultSet rs = empleadoBeans.consultaTabla("SELECT * FROM horario");
            while (rs.next()) {
                cbidhorario.addItem(rs.getString("id_horario"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los horarios: " + e.toString());
        }
    }

    private void mostrar(javax.swing.JTable jt, String sql) {
        try {
            EmpleadoBeans cb = new EmpleadoBeans();
            ResultSet rs;
            DefaultTableModel modelo = new DefaultTableModel();
            jt.setModel(modelo);
            rs = cb.consultaTabla(sql);
            ResultSetMetaData rsMd;
            rsMd = rs.getMetaData();
            int cantcolumnas = rsMd.getColumnCount();
            for (int i = 1; i <= cantcolumnas; i++) {
                modelo.addColumn(rsMd.getColumnLabel(i));
            }
            while (rs.next()) {
                Object[] columna = new Object[cantcolumnas];
                for (int i = 0; i < cantcolumnas; i++) {
                    columna[i] = rs.getObject(i + 1);
                }
                modelo.addRow(columna);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
    }

    private void MouseClick() {
        int fila = jtEmpleado.getSelectedRow();
        txtcedularuc.setText(jtEmpleado.getModel().getValueAt(fila, 0).toString());
        txtnombres.setText(jtEmpleado.getModel().getValueAt(fila, 1).toString());
        txtcargo.setText(jtEmpleado.getModel().getValueAt(fila, 2).toString());
        txthorai.setText(jtEmpleado.getModel().getValueAt(fila, 3).toString());
        txthoraf.setText(jtEmpleado.getModel().getValueAt(fila, 4).toString());
        txtsueldo.setText(jtEmpleado.getModel().getValueAt(fila, 5).toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Act_Elim;
    private javax.swing.JMenuItem MenuP;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbidcargo;
    private javax.swing.JComboBox<String> cbidhorario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtEmpleado;
    private javax.swing.JLabel lblapellidos;
    private javax.swing.JLabel lblcedula_ruc;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblid_cliente;
    private javax.swing.JLabel lblnombres;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JLabel lbltelefono1;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JTextField txtcedularuc;
    private javax.swing.JTextField txtdias;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txthoraf;
    private javax.swing.JTextField txthorai;
    private javax.swing.JTextField txtidclempleado;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtsueldo;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
