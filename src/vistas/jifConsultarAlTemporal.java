/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import huellitas.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class jifConsultarAlTemporal extends javax.swing.JInternalFrame {
    private Animal animal = new Animal();
    private AlbergueTemporal temporal = new AlbergueTemporal();
    private Validaciones validar = new Validaciones();
    
    private jifVerImagen verFoto;
    
    private ResultSet rs;
    private int id;
    private Image foto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }
    
    /**
     * Creates new form jifAgregarAlTemporal
     */
    public jifConsultarAlTemporal(int id) {  
        this.id = id;
        initComponents();
        myInitComponents();    
        llenarCajas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnlFondo = new javax.swing.JPanel();
        lblSexo = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        jcbEsterilizado = new javax.swing.JCheckBox();
        txtNombre = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblEspecie = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblRaza = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        lblCaracteristicas = new javax.swing.JLabel();
        lblSize = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtCaracteristicas = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblDiagnostico = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAvance = new javax.swing.JTextArea();
        lblAvance = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtEspecie = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();

        setClosable(true);
        setResizable(true);
        setTitle("Albergue temporal - Consultar");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Huellita.png"))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlFondo.setBackground(new java.awt.Color(0, 0, 0));
        pnlFondo.setPreferredSize(new java.awt.Dimension(400, 648));

        lblSexo.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(255, 255, 255));
        lblSexo.setText("Sexo:");

        lblEdad.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(255, 255, 255));
        lblEdad.setText("Edad (meses):");

        jcbEsterilizado.setBackground(new java.awt.Color(0, 0, 0));
        jcbEsterilizado.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        jcbEsterilizado.setForeground(new java.awt.Color(255, 255, 255));
        jcbEsterilizado.setText("Esterilizado");
        jcbEsterilizado.setEnabled(false);

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(19, 19, 19));
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));

        txtRaza.setEditable(false);
        txtRaza.setBackground(new java.awt.Color(19, 19, 19));
        txtRaza.setForeground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        lblEspecie.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblEspecie.setForeground(new java.awt.Color(255, 255, 255));
        lblEspecie.setText("Especie:");

        txtEdad.setEditable(false);
        txtEdad.setBackground(new java.awt.Color(19, 19, 19));
        txtEdad.setForeground(new java.awt.Color(204, 204, 204));

        lblRaza.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblRaza.setForeground(new java.awt.Color(255, 255, 255));
        lblRaza.setText("Raza:");

        lblFoto.setBackground(new java.awt.Color(255, 255, 255));
        lblFoto.setToolTipText("Ver foto del animal");
        lblFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoMouseClicked(evt);
            }
        });

        lblCaracteristicas.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblCaracteristicas.setForeground(new java.awt.Color(255, 255, 255));
        lblCaracteristicas.setText("Características:");

        lblSize.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblSize.setForeground(new java.awt.Color(255, 255, 255));
        lblSize.setText("Tamaño:");

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Amatic SC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ALBERGUE TEMPORAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Amatic SC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DATOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );

        txtCaracteristicas.setEditable(false);
        txtCaracteristicas.setBackground(new java.awt.Color(19, 19, 19));
        txtCaracteristicas.setColumns(20);
        txtCaracteristicas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCaracteristicas.setForeground(new java.awt.Color(204, 204, 204));
        txtCaracteristicas.setLineWrap(true);
        txtCaracteristicas.setRows(5);
        txtCaracteristicas.setWrapStyleWord(true);
        txtCaracteristicas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCaracteristicasKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(txtCaracteristicas);

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        jLabel4.setFont(new java.awt.Font("Amatic SC", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("DIAGNOSTICO MEDICO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel6.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de ingreso:");

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(19, 19, 19));
        txtFecha.setForeground(new java.awt.Color(204, 204, 204));

        lblDiagnostico.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblDiagnostico.setForeground(new java.awt.Color(255, 255, 255));
        lblDiagnostico.setText("Diagnostico:");

        txtDiagnostico.setEditable(false);
        txtDiagnostico.setBackground(new java.awt.Color(19, 19, 19));
        txtDiagnostico.setColumns(20);
        txtDiagnostico.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtDiagnostico.setForeground(new java.awt.Color(204, 204, 204));
        txtDiagnostico.setLineWrap(true);
        txtDiagnostico.setRows(5);
        txtDiagnostico.setWrapStyleWord(true);
        txtDiagnostico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiagnosticoKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(txtDiagnostico);

        txtAvance.setEditable(false);
        txtAvance.setBackground(new java.awt.Color(19, 19, 19));
        txtAvance.setColumns(20);
        txtAvance.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtAvance.setForeground(new java.awt.Color(204, 204, 204));
        txtAvance.setLineWrap(true);
        txtAvance.setRows(5);
        txtAvance.setWrapStyleWord(true);
        txtAvance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAvanceKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(txtAvance);

        lblAvance.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblAvance.setForeground(new java.awt.Color(255, 255, 255));
        lblAvance.setText("Avance:");

        btnAceptar.setToolTipText("");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtEspecie.setEditable(false);
        txtEspecie.setBackground(new java.awt.Color(19, 19, 19));
        txtEspecie.setForeground(new java.awt.Color(204, 204, 204));

        txtSize.setEditable(false);
        txtSize.setBackground(new java.awt.Color(19, 19, 19));
        txtSize.setForeground(new java.awt.Color(204, 204, 204));

        txtSexo.setEditable(false);
        txtSexo.setBackground(new java.awt.Color(19, 19, 19));
        txtSexo.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFondoLayout.createSequentialGroup()
                                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEdad, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSexo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSize, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblRaza, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEspecie, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlFondoLayout.createSequentialGroup()
                                        .addComponent(txtEdad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbEsterilizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtRaza)
                                    .addComponent(txtNombre)
                                    .addComponent(txtEspecie)
                                    .addComponent(txtSize)
                                    .addComponent(txtSexo, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(lblCaracteristicas)
                            .addComponent(jScrollPane4)))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(lblDiagnostico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAvance)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAceptar))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEspecie)
                            .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRaza))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSize)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSexo)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblEdad)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbEsterilizado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCaracteristicas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDiagnostico)
                    .addComponent(lblAvance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(pnlFondo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtAvanceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAvanceKeyReleased
        // TODO add your handling code here:        
    }//GEN-LAST:event_txtAvanceKeyReleased

    private void txtDiagnosticoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiagnosticoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiagnosticoKeyReleased

    private void txtCaracteristicasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaracteristicasKeyReleased
        // TODO add your handling code here:        }
    }//GEN-LAST:event_txtCaracteristicasKeyReleased

    private void lblFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoMouseClicked
        // TODO add your handling code here:
        verFoto = new jifVerImagen(getFoto(), txtNombre.getText());
        JDesktopPane desktopPane = this.getDesktopPane();
        desktopPane.add(verFoto);
        verFoto.setVisible(true);
    }//GEN-LAST:event_lblFotoMouseClicked
    
    private void myInitComponents() {
        Image imgCancelar = new ImageIcon("src/iconos/cruss.png").getImage();
        ImageIcon iconoCancelar = new ImageIcon(imgCancelar.getScaledInstance(32, 32, Image.SCALE_SMOOTH));
        btnCancelar.setIcon(iconoCancelar);    
        btnCancelar.setSize(32, 32);
        
        Image imgAceptar = new ImageIcon("src/iconos/check.png").getImage();
        ImageIcon iconoAceptar = new ImageIcon(imgAceptar.getScaledInstance(32, 32, Image.SCALE_SMOOTH));
        btnAceptar.setIcon(iconoAceptar);
        btnAceptar.setSize(32, 32);        
        
        Image imgGaleria = new ImageIcon("src/iconos/gallery.png").getImage();
        ImageIcon iconoGaleria = new ImageIcon(imgGaleria.getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        lblFoto.setIcon(iconoGaleria);
    }    
    
    private void llenarCajas() {
        try {
            rs = animal.consultarId(getId());
            if (rs.next()) {
                txtNombre.setText(rs.getString("nombre"));
                txtEspecie.setText(rs.getString("especie"));
                txtRaza.setText(rs.getString("raza"));
                txtSize.setText(rs.getString("size"));
                txtSexo.setText(rs.getString("sexo"));
                txtEdad.setText(rs.getString("edad"));
                jcbEsterilizado.setSelected(rs.getBoolean("esterilizado"));
                txtCaracteristicas.setText(rs.getString("caracteristicas"));
                txtFecha.setText(validar.cambiarFecha(rs.getString("fecha")));
                Blob blob = rs.getBlob("foto");
                ImageIcon icon;
                if (blob == null) {
                    Image img = new ImageIcon("src/iconos/gallery.png").getImage();
                    setFoto(img);
                    icon = new ImageIcon(img.getScaledInstance(150, 200, Image.SCALE_SMOOTH));
                } else {
                    byte[] data = blob.getBytes(1, (int) blob.length());
                    blob.free();

                    BufferedImage img = ImageIO.read(new ByteArrayInputStream(data));
                    setFoto(img);
                    icon = new ImageIcon(img.getScaledInstance(150, 200, Image.SCALE_SMOOTH));
                }
                lblFoto.setIcon(icon);
                setTitle("Albergue temporal - " + txtNombre.getText());
            }
            
            rs = temporal.consultarId(getId());
            if (rs.next()) {
                txtAvance.setText(rs.getString("avance"));
                txtDiagnostico.setText(rs.getString("diagnostico"));
            }
        } catch (SQLException | IOException ex) {
            System.out.println("Error en jifConsultarAlTemporal.llenarCajas:\n" + ex.getMessage());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JCheckBox jcbEsterilizado;
    private javax.swing.JLabel lblAvance;
    private javax.swing.JLabel lblCaracteristicas;
    private javax.swing.JLabel lblDiagnostico;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSize;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTextArea txtAvance;
    private javax.swing.JTextArea txtCaracteristicas;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtSize;
    // End of variables declaration//GEN-END:variables
}
