/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author beatl
 */
public class RegistroVeterinarios extends javax.swing.JPanel {

    /**
     * Creates new form RegistroVeterinarios
     */
    public RegistroVeterinarios() {
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

        pnlBarraTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlBarraOpciones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSelector = new javax.swing.JToggleButton();
        pnlPrincipal = new javax.swing.JPanel();
        pnlRegistro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtApellido2 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtCedulaProfesional = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pnlImagen = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pnlVerVeterinario = new javax.swing.JPanel();

        setBackground(new java.awt.Color(212, 255, 204));
        setPreferredSize(new java.awt.Dimension(850, 640));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBarraTitulo.setBackground(new java.awt.Color(0, 179, 61));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Control de Veterinarios");

        javax.swing.GroupLayout pnlBarraTituloLayout = new javax.swing.GroupLayout(pnlBarraTitulo);
        pnlBarraTitulo.setLayout(pnlBarraTituloLayout);
        pnlBarraTituloLayout.setHorizontalGroup(
            pnlBarraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        pnlBarraTituloLayout.setVerticalGroup(
            pnlBarraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(pnlBarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 40));

        pnlBarraOpciones.setBackground(new java.awt.Color(0, 179, 61));
        pnlBarraOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setBackground(new java.awt.Color(0, 179, 61));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setDefaultCapable(false);
        btnGuardar.setFocusPainted(false);
        btnGuardar.setFocusable(false);
        btnGuardar.setOpaque(true);
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/saveOn.png"))); // NOI18N
        pnlBarraOpciones.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        btnLimpiar.setBackground(new java.awt.Color(0, 179, 61));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setDefaultCapable(false);
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.setFocusable(false);
        btnLimpiar.setOpaque(true);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarOn.png"))); // NOI18N
        pnlBarraOpciones.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, 40));

        btnSelector.setBackground(new java.awt.Color(0, 179, 61));
        btnSelector.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSelector.setForeground(new java.awt.Color(255, 255, 255));
        btnSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vision.png"))); // NOI18N
        btnSelector.setText("Ver Veterinarios");
        btnSelector.setBorder(null);
        btnSelector.setBorderPainted(false);
        btnSelector.setContentAreaFilled(false);
        btnSelector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelector.setFocusPainted(false);
        btnSelector.setFocusable(false);
        btnSelector.setOpaque(true);
        pnlBarraOpciones.add(btnSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 160, 40));

        add(pnlBarraOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 850, 40));

        pnlPrincipal.setBackground(new java.awt.Color(212, 255, 204));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRegistro.setBackground(new java.awt.Color(0, 153, 102));
        pnlRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        pnlRegistro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 26));

        txtNombre.setBackground(new java.awt.Color(212, 255, 204));
        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.setOpaque(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        pnlRegistro.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 190, 25));

        jSeparator1.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnlRegistro.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 190, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("2do Nombre");
        pnlRegistro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 26));

        txtNombre2.setBackground(new java.awt.Color(212, 255, 204));
        txtNombre2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNombre2.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre2.setBorder(null);
        txtNombre2.setOpaque(false);
        txtNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre2ActionPerformed(evt);
            }
        });
        pnlRegistro.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 190, 25));

        jSeparator2.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnlRegistro.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 190, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido Paterno");
        pnlRegistro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 150, 26));

        txtApellido1.setBackground(new java.awt.Color(212, 255, 204));
        txtApellido1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtApellido1.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido1.setBorder(null);
        txtApellido1.setOpaque(false);
        txtApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido1ActionPerformed(evt);
            }
        });
        pnlRegistro.add(txtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 190, 25));

        jSeparator3.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnlRegistro.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 190, 25));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido Materno");
        pnlRegistro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 150, 26));

        txtApellido2.setBackground(new java.awt.Color(212, 255, 204));
        txtApellido2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtApellido2.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido2.setBorder(null);
        txtApellido2.setOpaque(false);
        txtApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido2ActionPerformed(evt);
            }
        });
        pnlRegistro.add(txtApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 190, 25));

        jSeparator4.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnlRegistro.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 190, 25));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cedula Profesional");
        pnlRegistro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 150, 26));

        txtCedulaProfesional.setBackground(new java.awt.Color(212, 255, 204));
        txtCedulaProfesional.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtCedulaProfesional.setForeground(new java.awt.Color(255, 255, 255));
        txtCedulaProfesional.setBorder(null);
        txtCedulaProfesional.setOpaque(false);
        txtCedulaProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaProfesionalActionPerformed(evt);
            }
        });
        pnlRegistro.add(txtCedulaProfesional, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 190, 25));

        jSeparator5.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnlRegistro.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 190, 25));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Correo Electronico ");
        pnlRegistro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 150, 26));

        txtCorreoElectronico.setBackground(new java.awt.Color(212, 255, 204));
        txtCorreoElectronico.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtCorreoElectronico.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreoElectronico.setBorder(null);
        txtCorreoElectronico.setOpaque(false);
        txtCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoElectronicoActionPerformed(evt);
            }
        });
        pnlRegistro.add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 190, 25));

        jSeparator6.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnlRegistro.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 190, 25));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Telefono ");
        pnlRegistro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 150, 26));

        txtTelefono.setBackground(new java.awt.Color(212, 255, 204));
        txtTelefono.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setBorder(null);
        txtTelefono.setOpaque(false);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        pnlRegistro.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 190, 25));

        jSeparator7.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnlRegistro.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 190, 25));

        jLabel10.setBackground(new java.awt.Color(0, 51, 51));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("   Registro");
        jLabel10.setOpaque(true);
        pnlRegistro.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Llene todos los campos ");
        pnlRegistro.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        pnlPrincipal.add(pnlRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 400, 500));

        pnlImagen.setBackground(new java.awt.Color(0, 153, 102));
        pnlImagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg4.jpg"))); // NOI18N
        pnlImagen.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 270, 470));

        pnlPrincipal.add(pnlImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 310, 500));

        add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 850, 560));

        pnlVerVeterinario.setLayout(new java.awt.BorderLayout());
        add(pnlVerVeterinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 850, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre2ActionPerformed

    private void txtApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido1ActionPerformed

    private void txtApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido2ActionPerformed

    private void txtCedulaProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaProfesionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaProfesionalActionPerformed

    private void txtCorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoElectronicoActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JToggleButton btnSelector;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel pnlBarraOpciones;
    public javax.swing.JPanel pnlBarraTitulo;
    private javax.swing.JPanel pnlImagen;
    public javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlRegistro;
    public javax.swing.JPanel pnlVerVeterinario;
    public javax.swing.JTextField txtApellido1;
    public javax.swing.JTextField txtApellido2;
    public javax.swing.JTextField txtCedulaProfesional;
    public javax.swing.JTextField txtCorreoElectronico;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNombre2;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
