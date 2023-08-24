package miprimeraaplicacioncs.Formularios;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import miprimeraaplicacioncs.ClienteBeans;
import miprimeraaplicacioncs.EmpleadoBeans;
import miprimeraaplicacioncs.HabitacionesBeans;
import miprimeraaplicacioncs.RegistrarBeans;
import miprimeraaplicacioncs.accesobd;

/**
 *
 * @author Usuario
 */
public final class FrmRegistrar extends javax.swing.JFrame {

    accesobd bd;
    private final EmpleadoBeans empleadoBeans;
    private final ClienteBeans clienteBeans;
    private HabitacionesBeans habitacionBeans = new HabitacionesBeans();

    /**
     * Creates new form FrmRegistrar
     *
     * @throws java.lang.Exception
     */
    public FrmRegistrar() throws Exception {
        initComponents();
        empleadoBeans = new EmpleadoBeans();
        clienteBeans = new ClienteBeans();
        habitacionBeans = new HabitacionesBeans();
        cargarEmpleado();
        cargarCliente();
        cargarHabitacion();
        obtenerMetodo();
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
        jLabel8 = new javax.swing.JLabel();
        cbmetodo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtidcliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtidregistro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtpiso = new javax.swing.JTextField();
        txtidhabi = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cbnumero = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtpago = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtfechai = new javax.swing.JTextField();
        txtfechaf = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtidempleado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbempleado = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txtruc = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtcargo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtRegistro = new javax.swing.JTable();
        cbcliente = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        hab_disponible = new javax.swing.JMenuItem();
        Factura = new javax.swing.JMenuItem();
        Registrados = new javax.swing.JMenuItem();
        MenuP = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Clliente");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 40, 30));

        cbmetodo.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(cbmetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 180, 30));

        jLabel9.setText("ID Registro");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 70, 30));

        txtidcliente.setEditable(false);
        jPanel1.add(txtidcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 30, 30));

        jLabel11.setText("Metodo de Pago");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 80, 30));

        jLabel10.setText("Cedula_Ruc");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, 30));

        jLabel4.setText("Apellidos");
        jLabel4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 60, 20));

        jLabel3.setText("Registrado por el Empleado");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setText("REGISTROS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 210, 70));

        txtcedula.setEditable(false);
        jPanel1.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 220, 30));

        btnNuevo.setText("Nuevo Registro");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, 30));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 670, 110));
        jPanel1.add(txtidregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 30, 30));

        jLabel13.setText("Piso");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 30, 30));

        txtpiso.setEditable(false);
        jPanel1.add(txtpiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 40, 30));

        txtidhabi.setEditable(false);
        jPanel1.add(txtidhabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 30, 30));

        jLabel14.setText("Numero");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 40, 30));

        cbnumero.setBorder(new javax.swing.border.MatteBorder(null));
        cbnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnumeroActionPerformed(evt);
            }
        });
        jPanel1.add(cbnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 60, 30));

        jLabel15.setText("$");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 20, 30));
        jPanel1.add(txtpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 90, 30));

        jLabel16.setText("Pagó");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 40, 30));

        jLabel17.setText("Fecha Inicio");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 80, 30));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 110, -1));
        jPanel1.add(txtfechai, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 110, 30));
        jPanel1.add(txtfechaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 110, 30));

        jLabel18.setText("Fecha Fin");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 80, 30));

        jLabel5.setText("dd/mm/aaaa");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 70, 30));

        jLabel6.setText("dd/mm/aaaa");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 70, 30));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 300, 180));

        txtidempleado.setEditable(false);
        jPanel1.add(txtidempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 20, 30));

        jLabel12.setText("Empleado");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 60, 30));

        cbempleado.setBorder(new javax.swing.border.MatteBorder(null));
        cbempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbempleadoActionPerformed(evt);
            }
        });
        jPanel1.add(cbempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 220, 30));

        jLabel19.setText("Cedula");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 50, 30));

        txtruc.setEditable(false);
        jPanel1.add(txtruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 220, 30));

        jLabel20.setText("Cargo");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 50, 30));

        txtcargo.setEditable(false);
        jPanel1.add(txtcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 220, 30));

        jLabel21.setText("Informacion del Cliente");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 330, 180));

        jLabel23.setText("Informacion de la Habitacion");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 20));

        jtRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Habitacion N°", "Fecha Inicio", "Fecha Fin", "Pagó", "Registrado Por"
            }
        ));
        jtRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtRegistroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtRegistro);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 680, 100));

        cbcliente.setBorder(new javax.swing.border.MatteBorder(null));
        cbcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbclienteActionPerformed(evt);
            }
        });
        jPanel1.add(cbcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 220, 30));

        jMenu1.setText("Menu");

        hab_disponible.setText("Hab. Disponible");
        hab_disponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hab_disponibleActionPerformed(evt);
            }
        });
        jMenu1.add(hab_disponible);

        Factura.setText("Factura");
        Factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturaActionPerformed(evt);
            }
        });
        jMenu1.add(Factura);

        Registrados.setText("Registrados");
        Registrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistradosActionPerformed(evt);
            }
        });
        jMenu1.add(Registrados);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbempleadoActionPerformed
        // TODO add your handling code here:
        try {
            String empleado = cbempleado.getSelectedItem().toString();
            ResultSet rs = empleadoBeans.consultaTabla("SELECT e.id_empleado, e.cedula, c.cargo FROM empleado e JOIN cargo c ON e.id_cargo = c.id_cargo WHERE nombres = '" + empleado + "'");
            if (rs.next()) {
                txtidempleado.setText(rs.getString("id_empleado"));
                txtruc.setText(rs.getString("cedula"));
                txtcargo.setText(rs.getString("cargo"));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el empleado: " + e.toString());
        }
    }//GEN-LAST:event_cbempleadoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this.nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void cbclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbclienteActionPerformed
        // TODO add your handling code here:
        try {
            String cliente = cbcliente.getSelectedItem().toString();
            ResultSet rs = clienteBeans.consultaTabla("SELECT id_cliente, cedula FROM cliente WHERE apellidos = '" + cliente + "'");
            if (rs.next()) {
                txtidcliente.setText(rs.getString("id_cliente"));
                txtcedula.setText(rs.getString("cedula"));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el empleado: " + e.toString());
        }
    }//GEN-LAST:event_cbclienteActionPerformed

    private void cbnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnumeroActionPerformed
        // TODO add your handling code here:
        try {
            String habitaciones = cbnumero.getSelectedItem().toString();
            ResultSet rs = habitacionBeans.consultaTabla("SELECT id_habitacion, piso FROM habitaciones WHERE numero = '" + habitaciones + "'");
            if (rs.next()) {
                txtidhabi.setText(rs.getString("id_habitacion"));
                txtpiso.setText(rs.getString("piso"));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el habitacion: " + e.toString());
        }

    }//GEN-LAST:event_cbnumeroActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        this.enviar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jtRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtRegistroMouseClicked
        // TODO add your handling code here:
        this.MouseClick();
    }//GEN-LAST:event_jtRegistroMouseClicked

    private void RegistradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistradosActionPerformed
        try {
            // TODO add your handling code here:
            FrmRegistros fr = new FrmRegistros();
            this.setVisible(false);
            fr.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(FrmRegistrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RegistradosActionPerformed

    private void hab_disponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hab_disponibleActionPerformed
        // TODO add your handling code here:
        FrmHabitaciones fm = new FrmHabitaciones();
        this.setVisible(false);
        fm.setVisible(true);
    }//GEN-LAST:event_hab_disponibleActionPerformed

    private void FacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturaActionPerformed
        try {
            // TODO add your handling code here:
            FrmFactura fm = new FrmFactura();
            this.setVisible(false);
            fm.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(FrmRegistrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FacturaActionPerformed

    private void MenuPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPActionPerformed
        // TODO add your handling code here:
        FrmMenu fm = new FrmMenu();
        this.setVisible(false);
        fm.setVisible(true);
    }//GEN-LAST:event_MenuPActionPerformed

    /**
     * @param args the command line arguments
     */
    private void nuevo() {
        try {
            RegistrarBeans cb = new RegistrarBeans();
            txtidregistro.setText("" + cb.Incremento_Registro());
            txtidcliente.setText("");
            txtidhabi.setText("");
            txtidempleado.setText("");
            txtfechai.setText("");
            txtfechaf.setText("");
            cbmetodo.setSelectedItem("");
            txtpago.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error..." + e.toString());
        }
    }

    private void enviar() {
        try {
            RegistrarBeans cb = new RegistrarBeans();
            cb.setId_Registro(Integer.parseInt(txtidregistro.getText()));
            cb.setId_Cliente(Integer.parseInt(txtidcliente.getText()));
            cb.setId_Habitacion(Integer.parseInt(txtidhabi.getText()));
            cb.setId_Empleado(Integer.parseInt(txtidempleado.getText()));
            cb.setFecha_Inicio(txtfechai.getText());
            cb.setFecha_Fin(txtfechaf.getText());
            cb.setMetodo(cbmetodo.getSelectedItem().toString());
            cb.setPago(Double.parseDouble(txtpago.getText()));
            cb.Insertar_Registro();
            habitacionBeans.actualizarDisponibilidad(Integer.parseInt(txtidhabi.getText()), "No");
            this.mostrar(jtRegistro, "SELECT cliente.apellidos, habitaciones.numero, registros.fechaInicio, registros.fechaFin, registros.Pago, empleado.nombres FROM cliente, habitaciones, registros, empleado WHERE cliente.id_cliente = registros.id_cliente AND habitaciones.id_habitacion = registros.id_habitacion AND empleado.id_empleado = registros.id_empleado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion RollBack..." + e.toString());
        }
    }

    private void mostrar(javax.swing.JTable JT, String sql) {
        try {
            RegistrarBeans cb = new RegistrarBeans();
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

    private void MouseClick() {
        int fila = jtRegistro.getSelectedRow();
        cbcliente.setSelectedItem(jtRegistro.getModel().getValueAt(fila, 0).toString());
        cbnumero.setSelectedItem(jtRegistro.getModel().getValueAt(fila, 1).toString());
        txtfechai.setText(jtRegistro.getModel().getValueAt(fila, 2).toString());
        txtfechaf.setText(jtRegistro.getModel().getValueAt(fila, 3).toString());
        txtpago.setText(jtRegistro.getModel().getValueAt(fila, 4).toString());
        cbempleado.setSelectedItem(jtRegistro.getModel().getValueAt(fila, 5).toString());
    }

    private void cargarEmpleado() {
        try {
            ResultSet rs = empleadoBeans.consultaTabla("SELECT * FROM empleado");
            while (rs.next()) {
                cbempleado.addItem(rs.getString("nombres"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los cargos: " + e.toString());
        }
    }

    private void cargarCliente() {
        try {
            ResultSet rs = clienteBeans.consultaTabla("SELECT apellidos FROM cliente");
            while (rs.next()) {
                cbcliente.addItem(rs.getString("apellidos"));
            }
        } catch (SQLException e) {
            System.out.println("Error al cargar los clientes: " + e.toString());
        }
    }

    private void cargarHabitacion() {
        try {
            ResultSet rs = habitacionBeans.consultaTabla("SELECT numero FROM habitaciones");
            while (rs.next()) {
                cbnumero.addItem(rs.getString("numero"));
            }
        } catch (SQLException e) {
            System.out.println("Error al cargar los habitaciones: " + e.toString());
        }
    }

    public void obtenerMetodo() {
        cbmetodo.addItem("Efectivo");
        cbmetodo.addItem("Tarjeta");
        cbmetodo.addItem("Transferencia");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Factura;
    private javax.swing.JMenuItem MenuP;
    private javax.swing.JMenuItem Registrados;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbcliente;
    private javax.swing.JComboBox<String> cbempleado;
    private javax.swing.JComboBox<String> cbmetodo;
    private javax.swing.JComboBox<String> cbnumero;
    private javax.swing.JMenuItem hab_disponible;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtRegistro;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtfechaf;
    private javax.swing.JTextField txtfechai;
    private javax.swing.JTextField txtidcliente;
    private javax.swing.JTextField txtidempleado;
    private javax.swing.JTextField txtidhabi;
    private javax.swing.JTextField txtidregistro;
    private javax.swing.JTextField txtpago;
    private javax.swing.JTextField txtpiso;
    private javax.swing.JTextField txtruc;
    // End of variables declaration//GEN-END:variables
}