/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraaplicacioncs.Formularios;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import miprimeraaplicacioncs.ClienteBeans;

/**
 *
 * @author Usuario
 */
public class FrmClientesC extends javax.swing.JFrame {

    ClienteBeans clienteBeans;

    /**
     * Creates new form FrmClientesC
     */
    public FrmClientesC() {
        initComponents();
        try {
            clienteBeans = new ClienteBeans();
            cargarDatosComboBox();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al inicializar el formulario: " + e.getMessage());
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
        cbid = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblcedula_ruc = new javax.swing.JLabel();
        txtcedularuc = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        lblnombres = new javax.swing.JLabel();
        lblapellidos = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        lbldireccion = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Regresar = new javax.swing.JMenuItem();
        MenuP = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbid.setEditable(true);
        cbid.setMinimumSize(new java.awt.Dimension(56, 25));
        cbid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbidActionPerformed(evt);
            }
        });
        jPanel1.add(cbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 190, 20, -1));

        jtCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Cedula", "Nombres", "Apellidos", "Direccion", "Telefono"
            }
        ));
        jtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtCliente);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 640, 100));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("CLIENTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 190, -1));

        lblcedula_ruc.setText("Cedula_Ruc");
        jPanel1.add(lblcedula_ruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, 20));
        jPanel1.add(txtcedularuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 190, 20));
        jPanel1.add(txtnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 190, -1));

        lblnombres.setText("Nombres");
        jPanel1.add(lblnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 70, 20));

        lblapellidos.setText("Apellidos");
        jPanel1.add(lblapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 70, 20));
        jPanel1.add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 190, -1));
        jPanel1.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 190, -1));

        lbldireccion.setText("Direccion");
        jPanel1.add(lbldireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 60, 20));

        lbltelefono.setText("Telefono");
        jPanel1.add(lbltelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 60, 20));
        jPanel1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 190, -1));

        jMenu1.setText("Menu");

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        jMenu1.add(Regresar);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClienteMouseClicked
        // TODO add your handling code here:
        this.MouseClick();

    }//GEN-LAST:event_jtClienteMouseClicked

    private void cbidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbidActionPerformed
        // TODO add your handling code here:
        int idCliente = Integer.parseInt(cbid.getSelectedItem().toString());
        mostrarDatosCliente(idCliente);
    }//GEN-LAST:event_cbidActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        this.Actualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        this.Eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // TODO add your handling code here:
        FrmCliente fc = new FrmCliente();
        this.setVisible(false);
        fc.setVisible(true);
    }//GEN-LAST:event_RegresarActionPerformed

    private void MenuPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPActionPerformed
        // TODO add your handling code here:
        FrmMenu fm = new FrmMenu();
        this.setVisible(false);
        fm.setVisible(true);
    }//GEN-LAST:event_MenuPActionPerformed

    private void Actualizar() {
        try {
            ClienteBeans cb = new ClienteBeans();
            cb.setId_Cliente(Integer.parseInt(cbid.getSelectedItem().toString()));
            cb.setCedula_Ruc(txtcedularuc.getText());
            cb.setNombres(txtnombres.getText());
            cb.setApellidos(txtapellidos.getText());
            cb.setDireccion(txtdireccion.getText());
            cb.setTelefono(txttelefono.getText());
            cb.Actualizar_Cliente();
            this.mostrar(jtCliente, "SELECT * FROM cliente WHERE id_cliente = " + cb.getId_Cliente());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion RollBack..." + e.toString());
        }
    }

    private void Eliminar() {
        try {
            ClienteBeans cb = new ClienteBeans();
            cb.setId_Cliente(Integer.parseInt(cbid.getSelectedItem().toString()));
            cb.Eliminar_Cliente();
            this.mostrar(jtCliente, "SELECT * FROM cliente WHERE id_cliente = " + cb.getId_Cliente());
        } catch (Exception e) {
        }
    }

    private void mostrar(javax.swing.JTable JT, String sql) {
        try {
            ClienteBeans cb = new ClienteBeans();
            ResultSet rs;
            DefaultTableModel modelo = new DefaultTableModel();
            JT.setModel(modelo);
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

    private void cargarDatosComboBox() {
        try {
            ResultSet rs = clienteBeans.obtenerClientes();
            cbid.removeAllItems();
            while (rs.next()) {
                int idCliente = rs.getInt("id_cliente");
                cbid.addItem(String.valueOf(idCliente));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos del ComboBox: " + e.toString());
        }
    }

    private void mostrarDatosCliente(int idCliente) {
        try {
            ResultSet rs = clienteBeans.obtenerCliente(idCliente);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Cedula");
            modelo.addColumn("Nombres");
            modelo.addColumn("Apellidos");
            modelo.addColumn("Direccion");
            modelo.addColumn("Telefono");

            while (rs.next()) {
                Object[] fila = {
                    rs.getInt("id_cliente"),
                    rs.getString("cedula"),
                    rs.getString("nombres"),
                    rs.getString("apellidos"),
                    rs.getString("direccion"),
                    rs.getString("telefono")
                };
                modelo.addRow(fila);
            }

            jtCliente.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos del cliente: " + e.toString());
        }
    }

    private void MouseClick() {
        int fila = jtCliente.getSelectedRow();
        txtcedularuc.setText(jtCliente.getModel().getValueAt(fila, 1).toString());
        txtnombres.setText(jtCliente.getModel().getValueAt(fila, 2).toString());
        txtapellidos.setText(jtCliente.getModel().getValueAt(fila, 3).toString());
        txtdireccion.setText(jtCliente.getModel().getValueAt(fila, 4).toString());
        txttelefono.setText(jtCliente.getModel().getValueAt(fila, 5).toString());
        String idSeleccionado = cbid.getSelectedItem().toString();
        mostrar(jtCliente, "SELECT * FROM cliente WHERE id_cliente = " + idSeleccionado);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuP;
    private javax.swing.JMenuItem Regresar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtCliente;
    private javax.swing.JLabel lblapellidos;
    private javax.swing.JLabel lblcedula_ruc;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblnombres;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcedularuc;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}