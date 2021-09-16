/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import huellitas.Animal;
import huellitas.Validaciones;
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

/**
 *
 * @author Alumno
 */
public class jifConsultarAlPermanente extends javax.swing.JInternalFrame {
    private Validaciones validar = new Validaciones();
    private Animal animal = new Animal();
    
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
     * Creates new form jifAgregarAlPermanente
     */
    public jifConsultarAlPermanente(int id) {
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

        jPanel1 = new javax.swing.JPanel();
        lblEspecie = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblRaza = new javax.swing.JLabel();
        lblCaracteristicas = new javax.swing.JLabel();
        lblSize = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCaracteristicas = new javax.swing.JTextArea();
        txtRaza = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        jcbEsterilizado = new javax.swing.JCheckBox();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();
        txtEspecie = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Albergue permanente - Consultar");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Huellita.png"))); // NOI18N
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                submit(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblEspecie.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblEspecie.setForeground(new java.awt.Color(255, 255, 255));
        lblEspecie.setText("Especie:");

        txtEdad.setEditable(false);
        txtEdad.setBackground(new java.awt.Color(19, 19, 19));
        txtEdad.setForeground(new java.awt.Color(204, 204, 204));

        lblRaza.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblRaza.setForeground(new java.awt.Color(255, 255, 255));
        lblRaza.setText("Raza:");

        lblCaracteristicas.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblCaracteristicas.setForeground(new java.awt.Color(255, 255, 255));
        lblCaracteristicas.setText("Características:");

        lblSize.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblSize.setForeground(new java.awt.Color(255, 255, 255));
        lblSize.setText("Tamaño:");

        jScrollPane1.setBackground(new java.awt.Color(19, 19, 19));
        jScrollPane1.setForeground(new java.awt.Color(204, 204, 204));

        txtCaracteristicas.setEditable(false);
        txtCaracteristicas.setBackground(new java.awt.Color(13, 13, 13));
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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCaracteristicasKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtCaracteristicas);

        txtRaza.setEditable(false);
        txtRaza.setBackground(new java.awt.Color(19, 19, 19));
        txtRaza.setForeground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

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

        jLabel2.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha de ingreso:");

        lblFoto.setToolTipText("Ver foto del animal");
        lblFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Amatic SC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ALBERGUE PERMANENTE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(19, 19, 19));
        txtFecha.setForeground(new java.awt.Color(204, 204, 204));

        txtEspecie.setEditable(false);
        txtEspecie.setBackground(new java.awt.Color(19, 19, 19));
        txtEspecie.setForeground(new java.awt.Color(204, 204, 204));

        txtSize.setEditable(false);
        txtSize.setBackground(new java.awt.Color(19, 19, 19));
        txtSize.setForeground(new java.awt.Color(204, 204, 204));

        txtSexo.setEditable(false);
        txtSexo.setBackground(new java.awt.Color(19, 19, 19));
        txtSexo.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEdad)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(lblEspecie)
                                                .addGap(2, 2, 2))
                                            .addComponent(lblSexo, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblSize, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addComponent(lblRaza, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtEdad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbEsterilizado))
                                    .addComponent(txtRaza)
                                    .addComponent(txtEspecie)
                                    .addComponent(txtSize)
                                    .addComponent(txtSexo))))
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCaracteristicas)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAceptar)))
                        .addContainerGap())))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEspecie)
                            .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRaza)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSize)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSexo)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEdad)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbEsterilizado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCaracteristicas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAceptar)
                            .addComponent(btnCancelar))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCaracteristicasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaracteristicasKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtCaracteristicasKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtCaracteristicasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaracteristicasKeyReleased
        // TODO add your handling code here:        
    }//GEN-LAST:event_txtCaracteristicasKeyReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void submit(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_submit
        // TODO add your handling code here:        
    }//GEN-LAST:event_submit

    private void lblFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoMouseClicked
        // TODO add your handling code here:
        verFoto = new jifVerImagen(getFoto(), txtNombre.getText());
        JDesktopPane desktopPane = this.getDesktopPane();
        desktopPane.add(verFoto);
        verFoto.setVisible(true);
    }//GEN-LAST:event_lblFotoMouseClicked
        
    public void myInitComponents() {
        Image imgCancelar = new ImageIcon("src/iconos/cruss.png").getImage();
        ImageIcon iconoCancelar = new ImageIcon(imgCancelar.getScaledInstance(32, 32, Image.SCALE_SMOOTH));
        btnCancelar.setIcon(iconoCancelar);    
        btnCancelar.setSize(32, 32);
        
        Image imgAceptar = new ImageIcon("src/iconos/check.png").getImage();
        ImageIcon iconoAceptar = new ImageIcon(imgAceptar.getScaledInstance(32, 32, Image.SCALE_SMOOTH));
        btnAceptar.setIcon(iconoAceptar);
        
        Image imgGaleria = new ImageIcon("src/iconos/gallery.png").getImage();
        ImageIcon iconoGaleria = new ImageIcon(imgGaleria.getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        lblFoto.setIcon(iconoGaleria);    
    }
    
    public void llenarCajas() {
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jcbEsterilizado;
    private javax.swing.JLabel lblCaracteristicas;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSize;
    private javax.swing.JTextArea txtCaracteristicas;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtSize;
    // End of variables declaration//GEN-END:variables
}
