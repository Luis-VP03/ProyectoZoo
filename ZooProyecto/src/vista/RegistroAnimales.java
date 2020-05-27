/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Slide;

/**
 *
 * @author beatl
 */
public class RegistroAnimales extends javax.swing.JPanel {

    /**
     * Creates new form RegistroAnimales
     */
    private Slide sl = new Slide();
    public RegistroAnimales() {
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
        btnProcedenciaLocal = new javax.swing.JButton();
        btnProcedenciaRescate = new javax.swing.JButton();
        btnProcedenciaForanea = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSelector = new javax.swing.JToggleButton();
        pnlRegistroAnimales = new javax.swing.JPanel();
        pnlRegistro1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtAniosCautiverio = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtAlimentacion = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        cmbCuidador = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        cmbHabitat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        pnlRegistro2 = new javax.swing.JPanel();
        pnlDefault = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlForanea = new javax.swing.JPanel();
        jSeparator9 = new javax.swing.JSeparator();
        txtNombreZoologico = new javax.swing.JTextField();
        cldFechaTraslado = new com.toedter.calendar.JDateChooser();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        pnlLocal = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cmbVeterinarioNacimeinto = new javax.swing.JComboBox<>();
        cldFechaNacimientos = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        txtPesoNacimiento = new javax.swing.JTextField();
        pnlRescate = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        txtEdadRescate = new javax.swing.JTextField();
        cldFechaRescate = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cmbCondicionRescate = new javax.swing.JComboBox<>();
        pnlImagen = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlVistaAnimales = new javax.swing.JPanel();

        setBackground(new java.awt.Color(212, 255, 204));
        setPreferredSize(new java.awt.Dimension(850, 640));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBarraTitulo.setBackground(new java.awt.Color(0, 179, 61));
        pnlBarraTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Animales");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlBarraTitulo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 40));

        add(pnlBarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 40));

        pnlBarraOpciones.setBackground(new java.awt.Color(0, 179, 61));
        pnlBarraOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProcedenciaLocal.setBackground(new java.awt.Color(0, 179, 61));
        btnProcedenciaLocal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnProcedenciaLocal.setForeground(new java.awt.Color(255, 255, 255));
        btnProcedenciaLocal.setText("Procedencia Local");
        btnProcedenciaLocal.setBorder(null);
        btnProcedenciaLocal.setBorderPainted(false);
        btnProcedenciaLocal.setContentAreaFilled(false);
        btnProcedenciaLocal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProcedenciaLocal.setDefaultCapable(false);
        btnProcedenciaLocal.setFocusPainted(false);
        btnProcedenciaLocal.setFocusable(false);
        btnProcedenciaLocal.setOpaque(true);
        btnProcedenciaLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcedenciaLocalActionPerformed(evt);
            }
        });
        pnlBarraOpciones.add(btnProcedenciaLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 140, 40));

        btnProcedenciaRescate.setBackground(new java.awt.Color(0, 179, 61));
        btnProcedenciaRescate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnProcedenciaRescate.setForeground(new java.awt.Color(255, 255, 255));
        btnProcedenciaRescate.setText("Procedencia Rescate");
        btnProcedenciaRescate.setBorder(null);
        btnProcedenciaRescate.setBorderPainted(false);
        btnProcedenciaRescate.setContentAreaFilled(false);
        btnProcedenciaRescate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProcedenciaRescate.setDefaultCapable(false);
        btnProcedenciaRescate.setFocusPainted(false);
        btnProcedenciaRescate.setFocusable(false);
        btnProcedenciaRescate.setOpaque(true);
        btnProcedenciaRescate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcedenciaRescateActionPerformed(evt);
            }
        });
        pnlBarraOpciones.add(btnProcedenciaRescate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 140, 40));

        btnProcedenciaForanea.setBackground(new java.awt.Color(0, 179, 61));
        btnProcedenciaForanea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnProcedenciaForanea.setForeground(new java.awt.Color(255, 255, 255));
        btnProcedenciaForanea.setText("Procedencia Foranea");
        btnProcedenciaForanea.setBorder(null);
        btnProcedenciaForanea.setBorderPainted(false);
        btnProcedenciaForanea.setContentAreaFilled(false);
        btnProcedenciaForanea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProcedenciaForanea.setDefaultCapable(false);
        btnProcedenciaForanea.setFocusPainted(false);
        btnProcedenciaForanea.setFocusable(false);
        btnProcedenciaForanea.setOpaque(true);
        btnProcedenciaForanea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcedenciaForaneaActionPerformed(evt);
            }
        });
        pnlBarraOpciones.add(btnProcedenciaForanea, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 140, 40));

        btnGuardar.setBackground(new java.awt.Color(0, 179, 61));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setFocusPainted(false);
        btnGuardar.setFocusable(false);
        btnGuardar.setOpaque(true);
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/saveOn.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
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
        btnLimpiar.setFocusable(false);
        btnLimpiar.setOpaque(true);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarOn.png"))); // NOI18N
        btnLimpiar.setRequestFocusEnabled(false);
        btnLimpiar.setRolloverEnabled(false);
        pnlBarraOpciones.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, 40));

        btnSelector.setBackground(new java.awt.Color(0, 179, 61));
        btnSelector.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSelector.setForeground(new java.awt.Color(255, 255, 255));
        btnSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vision.png"))); // NOI18N
        btnSelector.setText("Ver Animales");
        btnSelector.setBorder(null);
        btnSelector.setBorderPainted(false);
        btnSelector.setContentAreaFilled(false);
        btnSelector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelector.setFocusable(false);
        btnSelector.setOpaque(true);
        pnlBarraOpciones.add(btnSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 150, 40));

        add(pnlBarraOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 850, 40));

        pnlRegistroAnimales.setBackground(new java.awt.Color(212, 255, 204));
        pnlRegistroAnimales.setOpaque(false);
        pnlRegistroAnimales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRegistro1.setBackground(new java.awt.Color(0, 153, 102));
        pnlRegistro1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Nombre ");
        pnlRegistro1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, -1));

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.setOpaque(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        pnlRegistro1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 170, 25));

        jSeparator1.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnlRegistro1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 173, 15));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Edad");
        pnlRegistro1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 150, -1));

        txtEdad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(255, 255, 255));
        txtEdad.setBorder(null);
        txtEdad.setOpaque(false);
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        pnlRegistro1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 170, 25));

        jSeparator7.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnlRegistro1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 173, 15));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Sexo");
        pnlRegistro1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 150, -1));

        txtEspecie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEspecie.setForeground(new java.awt.Color(255, 255, 255));
        txtEspecie.setBorder(null);
        txtEspecie.setOpaque(false);
        txtEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecieActionPerformed(evt);
            }
        });
        pnlRegistro1.add(txtEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 173, 25));

        jSeparator4.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        pnlRegistro1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 170, 17));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Especie");
        pnlRegistro1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 150, -1));

        txtPeso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(255, 255, 255));
        txtPeso.setBorder(null);
        txtPeso.setOpaque(false);
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        pnlRegistro1.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, 25));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Peso");
        pnlRegistro1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, 25));

        jSeparator2.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        pnlRegistro1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 173, 14));

        txtAniosCautiverio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAniosCautiverio.setForeground(new java.awt.Color(255, 255, 255));
        txtAniosCautiverio.setBorder(null);
        txtAniosCautiverio.setOpaque(false);
        pnlRegistro1.add(txtAniosCautiverio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 170, 27));

        jSeparator5.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        pnlRegistro1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 170, 10));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Años en Cautiverio");
        pnlRegistro1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 150, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Alimentacion");
        pnlRegistro1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 150, 25));

        txtAlimentacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAlimentacion.setForeground(new java.awt.Color(255, 255, 255));
        txtAlimentacion.setBorder(null);
        txtAlimentacion.setOpaque(false);
        txtAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlimentacionActionPerformed(evt);
            }
        });
        pnlRegistro1.add(txtAlimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 170, 25));

        jSeparator6.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        pnlRegistro1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 170, 14));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Habitat");
        pnlRegistro1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 150, 30));

        pnlRegistro1.add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 170, 30));

        pnlRegistro1.add(cmbCuidador, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 170, 30));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Observaciones");
        pnlRegistro1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 150, 30));

        pnlRegistro1.add(cmbHabitat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 170, 30));

        jScrollPane1.setBorder(null);

        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        pnlRegistro1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 300, 90));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Cuidador");
        pnlRegistro1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 150, 30));

        pnlRegistroAnimales.add(pnlRegistro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 350, 540));

        pnlRegistro2.setBackground(new java.awt.Color(212, 255, 204));
        pnlRegistro2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDefault.setBackground(new java.awt.Color(0, 153, 102));
        pnlDefault.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Seleccione Procedencia");
        pnlDefault.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 420, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/upload.png"))); // NOI18N
        pnlDefault.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 420, 80));

        pnlRegistro2.add(pnlDefault, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 420, 200));

        pnlForanea.setBackground(new java.awt.Color(0, 153, 102));
        pnlForanea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator9.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnlForanea.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 170, 15));

        txtNombreZoologico.setBackground(new java.awt.Color(212, 255, 204));
        txtNombreZoologico.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNombreZoologico.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreZoologico.setBorder(null);
        txtNombreZoologico.setOpaque(false);
        txtNombreZoologico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreZoologicoActionPerformed(evt);
            }
        });
        pnlForanea.add(txtNombreZoologico, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 170, 25));
        pnlForanea.add(cldFechaTraslado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 170, -1));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Nombre Zoologico");
        pnlForanea.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 160, -1));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Fecha de Traslado");
        pnlForanea.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 160, -1));

        pnlRegistro2.add(pnlForanea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 420, 200));

        pnlLocal.setBackground(new java.awt.Color(0, 153, 102));
        pnlLocal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Fecha de Nacimiento");
        pnlLocal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 170, -1));

        pnlLocal.add(cmbVeterinarioNacimeinto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 170, -1));
        pnlLocal.add(cldFechaNacimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 170, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Veterinario");
        pnlLocal.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 170, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        pnlLocal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 170, 14));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Peso");
        pnlLocal.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 170, -1));

        txtPesoNacimiento.setBackground(new java.awt.Color(212, 255, 204));
        txtPesoNacimiento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPesoNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        txtPesoNacimiento.setBorder(null);
        txtPesoNacimiento.setOpaque(false);
        txtPesoNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoNacimientoActionPerformed(evt);
            }
        });
        pnlLocal.add(txtPesoNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 170, 25));

        pnlRegistro2.add(pnlLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 420, 200));

        pnlRescate.setBackground(new java.awt.Color(0, 153, 102));
        pnlRescate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator8.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnlRescate.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 173, 15));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Condicion de Rescate");
        pnlRescate.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 170, -1));

        txtEdadRescate.setBackground(new java.awt.Color(212, 255, 204));
        txtEdadRescate.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtEdadRescate.setForeground(new java.awt.Color(255, 255, 255));
        txtEdadRescate.setBorder(null);
        txtEdadRescate.setOpaque(false);
        txtEdadRescate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadRescateActionPerformed(evt);
            }
        });
        pnlRescate.add(txtEdadRescate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 170, 25));
        pnlRescate.add(cldFechaRescate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 170, -1));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Edad Rescate");
        pnlRescate.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 170, -1));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Fecha de Rescate");
        pnlRescate.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 170, -1));

        pnlRescate.add(cmbCondicionRescate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 170, -1));

        pnlRegistro2.add(pnlRescate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 420, 200));

        pnlRegistroAnimales.add(pnlRegistro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, 220));

        pnlImagen.setBackground(new java.awt.Color(0, 153, 102));
        pnlImagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/animales.jpg"))); // NOI18N
        pnlImagen.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 400, 267));

        pnlRegistroAnimales.add(pnlImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 420, 290));

        add(pnlRegistroAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 850, 640));

        pnlVistaAnimales.setOpaque(false);
        pnlVistaAnimales.setLayout(new java.awt.BorderLayout());
        add(pnlVistaAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 850, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecieActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlimentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlimentacionActionPerformed

    private void txtPesoNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoNacimientoActionPerformed

    private void txtEdadRescateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadRescateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadRescateActionPerformed

    private void txtNombreZoologicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreZoologicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreZoologicoActionPerformed

    private void btnProcedenciaLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcedenciaLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProcedenciaLocalActionPerformed

    private void btnProcedenciaForaneaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcedenciaForaneaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProcedenciaForaneaActionPerformed

    private void btnProcedenciaRescateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcedenciaRescateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProcedenciaRescateActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnProcedenciaForanea;
    public javax.swing.JButton btnProcedenciaLocal;
    public javax.swing.JButton btnProcedenciaRescate;
    public javax.swing.JToggleButton btnSelector;
    public com.toedter.calendar.JDateChooser cldFechaNacimientos;
    public com.toedter.calendar.JDateChooser cldFechaRescate;
    public com.toedter.calendar.JDateChooser cldFechaTraslado;
    public javax.swing.JComboBox<String> cmbCondicionRescate;
    public javax.swing.JComboBox<String> cmbCuidador;
    public javax.swing.JComboBox<String> cmbHabitat;
    public javax.swing.JComboBox<String> cmbSexo;
    public javax.swing.JComboBox<String> cmbVeterinarioNacimeinto;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    public javax.swing.JPanel pnlBarraOpciones;
    private javax.swing.JPanel pnlBarraTitulo;
    public javax.swing.JPanel pnlDefault;
    public javax.swing.JPanel pnlForanea;
    private javax.swing.JPanel pnlImagen;
    public javax.swing.JPanel pnlLocal;
    private javax.swing.JPanel pnlRegistro1;
    public javax.swing.JPanel pnlRegistro2;
    public javax.swing.JPanel pnlRegistroAnimales;
    public javax.swing.JPanel pnlRescate;
    public javax.swing.JPanel pnlVistaAnimales;
    public javax.swing.JTextField txtAlimentacion;
    public javax.swing.JTextField txtAniosCautiverio;
    public javax.swing.JTextField txtEdad;
    public javax.swing.JTextField txtEdadRescate;
    public javax.swing.JTextField txtEspecie;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNombreZoologico;
    public javax.swing.JTextArea txtObservaciones;
    public javax.swing.JTextField txtPeso;
    public javax.swing.JTextField txtPesoNacimiento;
    // End of variables declaration//GEN-END:variables
}
