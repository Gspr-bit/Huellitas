/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import huellitas.Animal;
import huellitas.AnimalEncontrado;
import huellitas.Notificaciones;
import huellitas.Validaciones;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Alumno
 */
public class jifAgregarAlEncontrado extends javax.swing.JInternalFrame {
    private Validaciones validar = new Validaciones(); 
    private Animal animal = new Animal();
    private AnimalEncontrado encontrado = new AnimalEncontrado();
    private Notificaciones notificacion = new Notificaciones();
    
    private jifConsultarAlExtraviado consultarPerdido;
    private jifVerImagen verFoto;

    private JFileChooser selector = new JFileChooser();
    private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imágenes", "jpg","jpeg","png");
    private String ruta;
    
    private Image foto;
    private String tipo;

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }
    
    /**
     * Creates new form jifNuevo
     */
    public jifAgregarAlEncontrado() {
        initComponents();
        
        Image imgGaleria = new ImageIcon("src/iconos/camera.png").getImage();
        ImageIcon iconoGaleria = new ImageIcon(imgGaleria.getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        lblFoto.setIcon(iconoGaleria);
          
        Image imgAceptar = new ImageIcon("src/iconos/check.png").getImage();
        ImageIcon iconoAceptar = new ImageIcon(imgAceptar.getScaledInstance(32, 32, Image.SCALE_SMOOTH));
        btnAceptar.setIcon(iconoAceptar);
        
        Image imgCancelar = new ImageIcon("src/iconos/cruss.png").getImage();
        ImageIcon iconoCancelar = new ImageIcon(imgCancelar.getScaledInstance(32, 32, Image.SCALE_SMOOTH));
        btnCancelar.setIcon(iconoCancelar);    
        btnCancelar.setSize(32, 32);
        
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
        cboSexo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jcbEsterilizado = new javax.swing.JCheckBox();
        lblEspecie = new javax.swing.JLabel();
        cboSize = new javax.swing.JComboBox<>();
        lblRaza = new javax.swing.JLabel();
        lblSize = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblColonia = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        btnSeleccionarFoto = new javax.swing.JButton();
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
        cboEspecie = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblCaracteristicas = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCaracteristicas = new javax.swing.JTextArea();
        btnAceptar = new javax.swing.JButton();
        lblMunicipio1 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblDireccion1 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();

        setClosable(true);
        setResizable(true);
        setTitle("Animal localizado - Agregar");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Huellita.png"))); // NOI18N

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        txtEdad.setToolTipText("Edad del animal en meses");

        lblFoto.setToolTipText("Ver foto del animal");
        lblFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoMouseClicked(evt);
            }
        });

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hembra", "Macho" }));

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

        cboSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Miniatura", "Pequeño", "Mediano", "Grande", "Gigante" }));
        cboSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSizeActionPerformed(evt);
            }
        });

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

        btnSeleccionarFoto.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        btnSeleccionarFoto.setText("Seleccionar Foto");
        btnSeleccionarFoto.setToolTipText("Subir la foto del animal");
        btnSeleccionarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarFotoActionPerformed(evt);
            }
        });

        lblDireccion.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setText("Direccion:");

        txtNombre.setToolTipText("");

        lblMunicipio.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblMunicipio.setForeground(new java.awt.Color(255, 255, 255));
        lblMunicipio.setText("Municipio: ");

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        lblNuevo.setFont(new java.awt.Font("Amatic SC", 1, 36)); // NOI18N
        lblNuevo.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevo.setText("Animal localizado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        cboEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perro", "Gato", "Cuyo", "Otro" }));

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

        txtCaracteristicas.setColumns(20);
        txtCaracteristicas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCaracteristicas.setLineWrap(true);
        txtCaracteristicas.setRows(5);
        txtCaracteristicas.setWrapStyleWord(true);
        txtCaracteristicas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCaracteristicasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtCaracteristicas);

        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblMunicipio1.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblMunicipio1.setForeground(new java.awt.Color(255, 255, 255));
        lblMunicipio1.setText("Correo:");

        lblDireccion1.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblDireccion1.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion1.setText("Teléfono:");

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
                                .addComponent(btnSeleccionarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                            .addComponent(cboEspecie, 0, 175, Short.MAX_VALUE)
                                            .addComponent(txtRaza, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                            .addComponent(cboSize, 0, 175, Short.MAX_VALUE)
                                            .addComponent(cboSexo, 0, 175, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jcbEsterilizado, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSeleccionarFoto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEspecie)
                            .addComponent(cboEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRaza)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSize)
                            .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSexo)
                            .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addGap(33, 33, 33))
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSizeActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        if (validarCajas().equals("true")) {
            int registro = encontrado.registroExiste(txtNombre.getText());
            if (registro == 0) {
                agregar();
            } else {
                int opcion = JOptionPane.showConfirmDialog(this, "Se encontró un registro en los animales extraviados con el nombre de " + txtNombre.getText() + " ¿Desea revisar?");
                switch (opcion) {
                    case 0:
                        consultarPerdido = new jifConsultarAlExtraviado(registro);
                        JDesktopPane desktopPane = this.getDesktopPane();
                        desktopPane.add(consultarPerdido);
                        consultarPerdido.setVisible(true);
                        break;
                    case 1:
                        agregar();
                        break;
                    default:
                        notificacion.setFecha(validar.fechaActual(false));
                        notificacion.setIdNotificacion(0);
                        notificacion.setRepetir(false);
                        notificacion.setMensaje(txtNombre.getText() + "podría ser un registro repetido en los animales encontrados y los extraviados");
                        agregar();
                        break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, validarCajas());
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSeleccionarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarFotoActionPerformed
        // TODO add your handling code here:
        File archivo;
        Image img;
        ImageIcon imgR;
        this.selector.setFileFilter(this.filtro);
        int respuesta = this.selector.showOpenDialog(this);
        archivo = this.selector.getSelectedFile();
        if (archivo == null || archivo.getName().trim().equals("") || archivo.length() > 1048576) {
                JOptionPane.showMessageDialog(this, "Selecciona un archivo","Archivo incorrecto, el archivo es demaciado pesado, máximo 1024 KB", JOptionPane.ERROR_MESSAGE);
        } else {
            this.ruta = archivo.getAbsolutePath();
            try {
                this.tipo = Files.probeContentType(archivo.toPath());
            } catch (IOException ex) {
                System.out.println("Error en jifAgregarAlEncontrado.btnCredencial:\n" + ex.getMessage());
            }
            img = new ImageIcon(archivo.getAbsolutePath()).getImage();
            setFoto(img);
            imgR = new ImageIcon(img.getScaledInstance(150, 200, Image.SCALE_SMOOTH));
            lblFoto.setIcon(imgR);
        }
    }//GEN-LAST:event_btnSeleccionarFotoActionPerformed

    private void txtCaracteristicasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaracteristicasKeyReleased
        // TODO add your handling code here:
        if ((txtCaracteristicas.getText().length()) < 257) {
            lblCaracteristicas.setText("Caracteristicas: " + (256 - (txtCaracteristicas.getText().length())) + " caracteres restantes");
        } else {
            lblCaracteristicas.setText("Características: Solo se permiten máximo 256 carácteres");
        }
    }//GEN-LAST:event_txtCaracteristicasKeyReleased

    private void lblFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoMouseClicked
        // TODO add your handling code here:
        verFoto = new jifVerImagen(getFoto(), txtNombre.getText());
        JDesktopPane desktopPane = this.getDesktopPane();
        desktopPane.add(verFoto);
        verFoto.setVisible(true);
    }//GEN-LAST:event_lblFotoMouseClicked

    private void agregar() {
        boolean comp;
        animal.setIdAnimal(0);
        animal.setNombre(txtNombre.getText());
        animal.setFoto(this.ruta);
        animal.setTipoFoto(this.tipo);
        animal.setEspecie(cboEspecie.getSelectedItem().toString());
        animal.setRaza(txtRaza.getText());
        animal.setSize(cboSize.getSelectedItem().toString());
        animal.setSexo(cboSexo.getSelectedItem().toString());
        animal.setEdad(Integer.parseInt(txtEdad.getText()));
        animal.setEsterilizado(jcbEsterilizado.isSelected());
        animal.setFecha(validar.getFecha());
        animal.setCaracteristicas(txtCaracteristicas.getText());
        animal.setLocalizacion("Encontrados");
        comp = animal.agregar().startsWith("Se agrego");
        encontrado.setDireccion(txtDireccion.getText());
        encontrado.setColonia(txtColonia.getText());
        encontrado.setMunicipio(txtMunicipio.getText());
        encontrado.setTelefono(txtTelefono.getText());
        encontrado.setCorreo(txtCorreo.getText());
        encontrado.setAnimal_idAnimal(animal.regresarId());                        
        if (encontrado.agregar().startsWith("Se agrego:") && comp) {
            validar.agregarRecordatorio(txtNombre.getText(), "Encontrados");
            JOptionPane.showMessageDialog(this, "Se han guardado los cambios");
        } else {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al guardar los cambios");
        }         
        dispose();
    }
    
    private String validarCajas() {
        String resultado = "true";
        if (!(validar.size("El campo características", txtCaracteristicas.getText(), 0, 256)).equals("true")) {
            resultado = validar.size("El campo características", txtCaracteristicas.getText(), 0, 255);
            txtCaracteristicas.requestFocus();
        }
        if (!validar.noVacio(txtEdad.getText())) {
            resultado = "Faltan datos";
            txtEdad.requestFocus();
        } else if (!validar.isNumber(txtEdad.getText())){
            resultado = "La edad debe ser un número";
            txtEdad.requestFocus();
        } 
        if (!validar.noVacio(txtRaza.getText())) {
            resultado = "Faltan datos";
            txtRaza.requestFocus();
        } else if (txtRaza.getText().length() > 50) {
            resultado = "La raza es demaciado larga (máximo 50 carácteres";
        }
        if (!validar.noVacio(txtNombre.getText())) {
            resultado = "Faltan datos";
            txtNombre.requestFocus();
        } else if (txtNombre.getText().length() > 50) {
            resultado = "El nombre es demaciado largo (máximo 50 carácteres";
        }
        if (!validar.isEmail(txtCorreo.getText())) {
            resultado = "Ingresa un correo electrónico";
            txtCorreo.requestFocus();
        }
        if (!(txtTelefono.getText().length() == 10 || txtTelefono.getText().length() == 7)) {
            resultado = "Debe ingresar un telefono fijo o celular, no ingreses carácteres entre los números";
            txtTelefono.requestFocus();
        }
        if (!validar.noVacio(txtMunicipio.getText())) {
            resultado = "Faltan datos";
            txtMunicipio.requestFocus();
        } else if (txtMunicipio.getText().length() > 100) {
            resultado = "El municipio es demaciado largo (máximo 100 carácteres";
        }
        if (!validar.noVacio(txtColonia.getText())) {
            resultado = "Faltan datos";
            txtColonia.requestFocus();
        } else if (txtColonia.getText().length() > 100) {
            resultado = "La colonia es demaciado larga (máximo 100 carácteres";
        }
        if (!validar.noVacio(txtDireccion.getText())) {
            resultado = "Faltan datos";
            txtDireccion.requestFocus();
        } else if (txtDireccion.getText().length() > 100) {
            resultado = "La dirección es demaciado larga (máximo 100 carácteres";
        }
        if (!validar.esFecha(txtFecha.getText()).equals("true")){
            resultado = validar.esFecha(txtFecha.getText());
            txtFecha.requestFocus();
        }
        if (this.ruta == null) {
            resultado = "Elige una foto";
            btnSeleccionarFoto.requestFocus();
        }
        return resultado;
    }     
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSeleccionarFoto;
    private javax.swing.JComboBox<String> cboEspecie;
    private javax.swing.JComboBox<String> cboSexo;
    private javax.swing.JComboBox<String> cboSize;
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
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
