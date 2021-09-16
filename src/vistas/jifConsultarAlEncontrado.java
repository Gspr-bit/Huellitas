/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import huellitas.Animal;
import huellitas.AnimalEncontrado;
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
public class jifConsultarAlEncontrado extends javax.swing.JInternalFrame {
    private Validaciones validar = new Validaciones(); 
    private Animal animal = new Animal();
    private AnimalEncontrado encontrado = new AnimalEncontrado();
    private jifVerImagen verFoto;
    
    private ResultSet rs;
    private int id;
    private Image img;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }
    /**
     * Creates new form jifNuevo
     */
    public jifConsultarAlEncontrado(int id) {
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txtEdad = new javax.swing.JTextField();
        lblFoto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbEsterilizado = new javax.swing.JCheckBox();
        lblEspecie = new javax.swing.JLabel();
        lblRaza = new javax.swing.JLabel();
        lblSize = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblColonia = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        lblMunicipio = new javax.swing.JLabel();
        txtMunicipio = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblNuevo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblCaracteristicas = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCaracteristicas = new javax.swing.JTextArea();
        txtEspecie = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        lblDireccion1 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblMunicipio1 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();

        setClosable(true);
        setResizable(true);
        setTitle("Animal localizado - Agregar");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Huellita.png"))); // NOI18N

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        txtEdad.setEditable(false);
        txtEdad.setBackground(new java.awt.Color(19, 19, 19));
        txtEdad.setForeground(new java.awt.Color(204, 204, 204));

        lblFoto.setToolTipText("Ver foto del animal");
        lblFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        jcbEsterilizado.setBackground(new java.awt.Color(0, 0, 0));
        jcbEsterilizado.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        jcbEsterilizado.setForeground(new java.awt.Color(255, 255, 255));
        jcbEsterilizado.setText("Esterilizado");

        lblEspecie.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblEspecie.setForeground(new java.awt.Color(255, 255, 255));
        lblEspecie.setText("Especie:");

        lblRaza.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblRaza.setForeground(new java.awt.Color(255, 255, 255));
        lblRaza.setText("Raza:");

        lblSize.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblSize.setForeground(new java.awt.Color(255, 255, 255));
        lblSize.setText("Tamaño:");

        lblFecha.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha: ");

        lblSexo.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(255, 255, 255));
        lblSexo.setText("Sexo:");

        lblColonia.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblColonia.setForeground(new java.awt.Color(255, 255, 255));
        lblColonia.setText("Colonia: ");

        lblEdad.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(255, 255, 255));
        lblEdad.setText("Edad (meses):");

        txtColonia.setEditable(false);
        txtColonia.setBackground(new java.awt.Color(19, 19, 19));
        txtColonia.setForeground(new java.awt.Color(204, 204, 204));

        lblDireccion.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setText("Direccion:");

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(19, 19, 19));
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));

        txtDireccion.setEditable(false);
        txtDireccion.setBackground(new java.awt.Color(19, 19, 19));
        txtDireccion.setForeground(new java.awt.Color(204, 204, 204));

        lblMunicipio.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblMunicipio.setForeground(new java.awt.Color(255, 255, 255));
        lblMunicipio.setText("Municipio: ");

        txtMunicipio.setEditable(false);
        txtMunicipio.setBackground(new java.awt.Color(19, 19, 19));
        txtMunicipio.setForeground(new java.awt.Color(204, 204, 204));

        txtRaza.setEditable(false);
        txtRaza.setBackground(new java.awt.Color(19, 19, 19));
        txtRaza.setForeground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        lblNuevo.setFont(new java.awt.Font("Amatic SC", 1, 36)); // NOI18N
        lblNuevo.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevo.setText("Animal localizado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Amatic SC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Datos del animal");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(19, 19, 19));
        txtFecha.setForeground(new java.awt.Color(204, 204, 204));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Amatic SC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Datos del animal");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblCaracteristicas.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblCaracteristicas.setForeground(new java.awt.Color(255, 255, 255));
        lblCaracteristicas.setText("Características:");

        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(txtCaracteristicas);

        txtEspecie.setEditable(false);
        txtEspecie.setBackground(new java.awt.Color(19, 19, 19));
        txtEspecie.setForeground(new java.awt.Color(204, 204, 204));

        txtSize.setEditable(false);
        txtSize.setBackground(new java.awt.Color(19, 19, 19));
        txtSize.setForeground(new java.awt.Color(204, 204, 204));

        txtSexo.setEditable(false);
        txtSexo.setBackground(new java.awt.Color(19, 19, 19));
        txtSexo.setForeground(new java.awt.Color(204, 204, 204));

        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblDireccion1.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblDireccion1.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion1.setText("Teléfono:");

        txtTelefono.setEditable(false);
        txtTelefono.setBackground(new java.awt.Color(19, 19, 19));
        txtTelefono.setForeground(new java.awt.Color(204, 204, 204));

        lblMunicipio1.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblMunicipio1.setForeground(new java.awt.Color(255, 255, 255));
        lblMunicipio1.setText("Correo:");

        txtCorreo.setEditable(false);
        txtCorreo.setBackground(new java.awt.Color(19, 19, 19));
        txtCorreo.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCaracteristicas)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblEdad)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblRaza, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblSize, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblSexo, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblEspecie, javax.swing.GroupLayout.Alignment.TRAILING))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                            .addComponent(txtRaza, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jcbEsterilizado, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtEspecie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                            .addComponent(txtSize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                            .addComponent(txtSexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDireccion1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(txtFecha)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMunicipio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblColonia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMunicipio1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtColonia, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(txtMunicipio, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAceptar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEdad)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbEsterilizado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCaracteristicas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFecha)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccion1)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColonia)
                            .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMunicipio))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMunicipio1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCaracteristicasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaracteristicasKeyReleased
        
    }//GEN-LAST:event_txtCaracteristicasKeyReleased

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void lblFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoMouseClicked
        // TODO add your handling code here:
        verFoto = new jifVerImagen(getImg(), txtNombre.getText());
        JDesktopPane desktopPane = this.getDesktopPane();
        desktopPane.add(verFoto);
        verFoto.setVisible(true);
    }//GEN-LAST:event_lblFotoMouseClicked
    
    private void myInitComponents() {         
        Image imgAceptar = new ImageIcon("src/iconos/check.png").getImage();
        ImageIcon iconoAceptar = new ImageIcon(imgAceptar.getScaledInstance(32, 32, Image.SCALE_SMOOTH));
        btnAceptar.setIcon(iconoAceptar);
        
        Image imgCancelar = new ImageIcon("src/iconos/cruss.png").getImage();
        ImageIcon iconoCancelar = new ImageIcon(imgCancelar.getScaledInstance(32, 32, Image.SCALE_SMOOTH));
        btnCancelar.setIcon(iconoCancelar);    
        btnCancelar.setSize(32, 32);
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
                    icon = new ImageIcon(img.getScaledInstance(150, 200, Image.SCALE_SMOOTH));
                } else {
                    byte[] data = blob.getBytes(1, (int) blob.length());
                    blob.free();

                    BufferedImage img = ImageIO.read(new ByteArrayInputStream(data));
                    setImg(img);
                    icon = new ImageIcon(img.getScaledInstance(150, 200, Image.SCALE_SMOOTH));
                }
                lblFoto.setIcon(icon);
                setTitle("Animal localizado - " + txtNombre.getText());
            }
            
            rs = encontrado.consultarId(getId());
            if (rs.next()) {
                txtDireccion.setText(rs.getString("direccion"));
                txtColonia.setText(rs.getString("colonia"));
                txtMunicipio.setText(rs.getString("municipio"));
                txtCorreo.setText(rs.getString("correo"));
                txtTelefono.setText(rs.getString("telefono"));
            }
        } catch (SQLException | IOException ex) {
            System.out.println("Error en jifConsultarAlEncontrado.llenarCajas:\n" + ex.getMessage());
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JCheckBox jcbEsterilizado;
    private javax.swing.JLabel lblCaracteristicas;
    private javax.swing.JLabel lblColonia;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDireccion1;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblMunicipio1;
    private javax.swing.JLabel lblNuevo;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSize;
    private javax.swing.JTextArea txtCaracteristicas;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
