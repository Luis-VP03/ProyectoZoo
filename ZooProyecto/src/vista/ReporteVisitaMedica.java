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
public class ReporteVisitaMedica extends javax.swing.JPanel {

    /**
     * Creates new form ReporteVisitaMedica
     */
    public ReporteVisitaMedica() {
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
        pnlPrincipal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbVeterinario = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbAnimal = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(212, 255, 204));
        setPreferredSize(new java.awt.Dimension(850, 640));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBarraTitulo.setBackground(new java.awt.Color(0, 179, 61));
        pnlBarraTitulo.setAlignmentX(0.0F);
        pnlBarraTitulo.setMinimumSize(new java.awt.Dimension(0, 0));
        pnlBarraTitulo.setPreferredSize(new java.awt.Dimension(850, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reporte Visita Médica");
        jLabel1.setMaximumSize(new java.awt.Dimension(282, 33));
        jLabel1.setMinimumSize(new java.awt.Dimension(282, 33));
        jLabel1.setPreferredSize(new java.awt.Dimension(282, 33));

        javax.swing.GroupLayout pnlBarraTituloLayout = new javax.swing.GroupLayout(pnlBarraTitulo);
        pnlBarraTitulo.setLayout(pnlBarraTituloLayout);
        pnlBarraTituloLayout.setHorizontalGroup(
            pnlBarraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarraTituloLayout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );
        pnlBarraTituloLayout.setVerticalGroup(
            pnlBarraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarraTituloLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(pnlBarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 40));

        pnlBarraOpciones.setBackground(new java.awt.Color(0, 179, 61));
        pnlBarraOpciones.setPreferredSize(new java.awt.Dimension(200, 40));
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
        btnGuardar.setFocusable(false);
        btnGuardar.setMaximumSize(new java.awt.Dimension(86, 32));
        btnGuardar.setMinimumSize(new java.awt.Dimension(86, 32));
        btnGuardar.setPreferredSize(new java.awt.Dimension(86, 32));
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
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.setFocusable(false);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarOn.png"))); // NOI18N
        pnlBarraOpciones.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, 40));

        add(pnlBarraOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 850, 40));

        pnlPrincipal.setBackground(new java.awt.Color(212, 255, 204));
        pnlPrincipal.setAlignmentX(0.0F);
        pnlPrincipal.setAlignmentY(0.0F);
        pnlPrincipal.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        pnlPrincipal.setMinimumSize(new java.awt.Dimension(0, 0));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(850, 850));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 179, 61));
        jLabel2.setText("Veterinario: ");
        jLabel2.setMaximumSize(new java.awt.Dimension(39, 25));
        jLabel2.setMinimumSize(new java.awt.Dimension(39, 25));
        jLabel2.setPreferredSize(new java.awt.Dimension(39, 25));
        pnlPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 220, 30));

        pnlPrincipal.add(cmbVeterinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 220, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 179, 61));
        jLabel3.setText("Animal: ");
        jLabel3.setMaximumSize(new java.awt.Dimension(39, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(39, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(39, 25));
        pnlPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 90, 30));

        pnlPrincipal.add(cmbAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 220, 30));

        add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 840, 530));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JComboBox<String> cmbAnimal;
    public javax.swing.JComboBox<String> cmbVeterinario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pnlBarraOpciones;
    private javax.swing.JPanel pnlBarraTitulo;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
