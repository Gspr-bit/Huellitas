/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import huellitas.Comandos;
import javax.swing.ImageIcon;

/**
 *
 * @author Gspr-bit
 */
public class MdiLineaDeComandos extends javax.swing.JFrame {
    private final Comandos procesa;
    private Vector <String> historial = new Vector <String> (1,1);
    
    private int rowSelected;
    private int columnSelected;
    private Image foto;

    public int getRowSelected() {
        return rowSelected;
    }

    public void setRowSelected(int rowSelected) {
        this.rowSelected = rowSelected;
    }

    public int getColumnSelected() {
        return columnSelected;
    }

    public void setColumnSelected(int columnSelected) {
        this.columnSelected = columnSelected;
    }
    
    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }
    
    /**
     * Creates new form MdiDbui
     */
    public MdiLineaDeComandos() {
        this.procesa = new Comandos();
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Línea de comandos");
        
        Image imgIconoApp = new ImageIcon("src/iconos/code.png").getImage();
        setIconImage(imgIconoApp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtComando = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnEjecutar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultado = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        editMenu = new javax.swing.JMenu();
        mniOpenImage = new javax.swing.JMenuItem();
        mniHistory = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(19, 19, 19));

        jLabel1.setFont(new java.awt.Font("Amatic SC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Línea de comandos");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Patrick Hand SC", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Ingresa tu comando:");

        txtComando.setBackground(new java.awt.Color(57, 57, 57));
        txtComando.setFont(new java.awt.Font("Roboto Mono", 0, 12)); // NOI18N
        txtComando.setForeground(new java.awt.Color(204, 204, 204));
        txtComando.setCaretColor(new java.awt.Color(255, 255, 255));
        txtComando.setSelectedTextColor(new java.awt.Color(38, 38, 38));
        txtComando.setSelectionColor(new java.awt.Color(204, 204, 204));
        txtComando.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtComandoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtComandoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtComandoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText(";");

        btnEjecutar.setFont(new java.awt.Font("Patrick Hand SC", 1, 14)); // NOI18N
        btnEjecutar.setForeground(new java.awt.Color(38, 38, 38));
        btnEjecutar.setText("Ejecutar");
        btnEjecutar.setToolTipText("Ejecutar el comando actual");
        btnEjecutar.setBorderPainted(false);
        btnEjecutar.setEnabled(false);
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Patrick Hand SC", 1, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(38, 38, 38));
        btnBorrar.setText("Borrar");
        btnBorrar.setToolTipText("Borrar el comando actual");
        btnBorrar.setBorderPainted(false);
        btnBorrar.setEnabled(false);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        btnBorrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBorrarKeyPressed(evt);
            }
        });

        tblResultado.setFont(new java.awt.Font("Roboto Mono", 0, 12)); // NOI18N
        tblResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResultadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblResultado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtComando))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEjecutar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrar)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtComando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnEjecutar)
                    .addComponent(btnBorrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
        );

        desktopPane.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        editMenu.setMnemonic('f');
        editMenu.setText("Archivo");

        mniOpenImage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        mniOpenImage.setMnemonic('t');
        mniOpenImage.setText("Ver imagen");
        mniOpenImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniOpenImageActionPerformed(evt);
            }
        });
        editMenu.add(mniOpenImage);

        mniHistory.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        mniHistory.setMnemonic('y');
        mniHistory.setText("Historial");
        mniHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHistoryActionPerformed(evt);
            }
        });
        editMenu.add(mniHistory);

        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtComandoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComandoKeyPressed
        // This is just for accesibility
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { 
            btnEjecutar.doClick(); // Executes the actual command
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtComando.setText(historial.lastElement()); // Fills txtComando with the last command introduced
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            txtComando.setText(""); // Deletes the current command
        }
    }//GEN-LAST:event_txtComandoKeyPressed

    private void txtComandoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComandoKeyReleased
        // This is for enabling or disabling the buttons, is just for validating
        if (txtComando.getText().equals("")) {
            btnBorrar.setEnabled(false);
            btnEjecutar.setEnabled(false);
        } else {
            btnBorrar.setEnabled(true);
            btnEjecutar.setEnabled(true);
        }
    }//GEN-LAST:event_txtComandoKeyReleased

    private void txtComandoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComandoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComandoKeyTyped

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        // This method calls the dbui.java class for executing the command introduced in txtComando
        String resultado;
        if (txtComando.getText().equalsIgnoreCase("history")) {
            showHistory();
        } else {
            setTitle("Línea de comandos - "+txtComando.getText());
            resultado = procesa.consola(txtComando.getText());
            if (resultado.equals("ResultSet")) {
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(this, resultado);
            }
            historial.add(txtComando.getText());
            btnBorrar.requestFocus();
        }
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // Erases txtComando's Text
        txtComando.setText("");
        setTitle("Línea de comandos");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBorrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBorrarKeyPressed
        // This method is just for accesibility
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtComando.setText("");
            txtComando.requestFocus();
            setTitle("Línea de comandos");
        } else {
            txtComando.requestFocus();
        }
    }//GEN-LAST:event_btnBorrarKeyPressed

    private void tblResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResultadoMouseClicked
        // This method sets the the column and row selected, necesary for opening a image
        if (tblResultado.getColumnName(0).equals("History")) {
            txtComando.setText(tblResultado.getValueAt(tblResultado.getSelectedRow(), 0).toString());
        }
        setColumnSelected(tblResultado.getSelectedColumn());
        setRowSelected(tblResultado.getSelectedRow());
    }//GEN-LAST:event_tblResultadoMouseClicked

    private void mniHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHistoryActionPerformed
        // This method shows the command history of the actual sesion, same that executing HISTORY in the command line
        showHistory();
    }//GEN-LAST:event_mniHistoryActionPerformed

    private void mniOpenImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniOpenImageActionPerformed
        // This method opens the jifWatchImage for watching the selected LONGBLOB as an image, 
        // its execution requires having previously selected a row and a column of type LONGBLOB
        System.out.println(getColumnSelected());
        System.out.println(getRowSelected());
        try {
            ResultSet rs = procesa.getConsulta();
            
            rs.absolute(getRowSelected() + 1);
            Blob blob;
            blob = rs.getBlob(getColumnSelected() + 1);
            byte[] data = blob.getBytes(1, (int) blob.length());
            blob.free();
        
            BufferedImage img;
            img = ImageIO.read(new ByteArrayInputStream(data));
            setFoto(img);
            
            jifVerImagen verImagen = new jifVerImagen(getFoto(),"Imagen en fila: " + getRowSelected() + ". columna: " + getColumnSelected());
            desktopPane.add(verImagen);
            verImagen.setVisible(true);
        } catch (SQLException | IOException ex) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error, por favor verifica que seleccionaste un LONGBLOB\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mniOpenImageActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MdiLineaDeComandos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MdiLineaDeComandos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MdiLineaDeComandos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MdiLineaDeComandos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MdiLineaDeComandos().setVisible(true);
            }
        });
    }
    
    /**
     * This method fills the table when the dbui.consola method returns "ResultSet"
     * @see dbui.consola
     */
    private void llenarTabla() {
        ResultSet rs = procesa.getConsulta();
        int columnsNumber;
        ResultSetMetaData rsmd;
                
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
               return false;
            }
        };
        tblResultado.setModel(modelo);
        
        try {
            rsmd = rs.getMetaData(); 
            columnsNumber = rsmd.getColumnCount(); 
            for (int i = 0; i < columnsNumber; i++) {
                modelo.addColumn(rsmd.getColumnName(i+1));
            } 
            
            while (rs.next()) {
                Object ob [] = new Object[columnsNumber];
                for (int i = 0; i < columnsNumber; i++) {
                    ob[i] = rs.getString(i+1);
                }           
                modelo.addRow(ob);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }
    
    /**
     * This method fills the table hith the command's history
     */
    private void showHistory() {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
               return false;
            }
        };
        tblResultado.setModel(modelo);
        modelo.addColumn("History",this.historial);
    }

    /**
     * This method calls getHost(), getDb(), getUser() and getPassword()
     * Only the first and the thirth are required, others are optional
     * @see setHost(), getHost(), setDb(), getDb(), setUser(), getUser(), setPassword(), getPassword()
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mniHistory;
    private javax.swing.JMenuItem mniOpenImage;
    private javax.swing.JTable tblResultado;
    private javax.swing.JTextField txtComando;
    // End of variables declaration//GEN-END:variables

}
