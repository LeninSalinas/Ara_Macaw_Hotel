/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author RAY
 */
public class Clientes extends javax.swing.JDialog {

    Conexion conect = new Conexion("ejeautos");
Connection con = null;
Statement st = null;
Statement st2 = null;
 String cod2;
    public Clientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        lblMensaje.setVisible(false);
        this.setBounds(0, 0, 1602, 700);
        
        setLocationRelativeTo(null);
        
        System.out.println("X= "+jffTelefono.getX()+" Y = "+this.getY()+" ancho "+this.getWidth()+" alto "+this.getHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMensaje = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfDir = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jffTelefono = new javax.swing.JFormattedTextField();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(897, 637));
        setMinimumSize(new java.awt.Dimension(897, 637));
        getContentPane().setLayout(null);

        lblMensaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMensaje.setText("Escriba el numero telefonico");
        getContentPane().add(lblMensaje);
        lblMensaje.setBounds(140, 340, 210, 30);

        jtfNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(153, 153, 153));
        jtfNombre.setText("Escriba el nombre del cliente");
        jtfNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfNombreMouseClicked(evt);
            }
        });
        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreKeyTyped(evt);
            }
        });
        getContentPane().add(jtfNombre);
        jtfNombre.setBounds(140, 220, 220, 50);

        jtfDir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfDir.setForeground(new java.awt.Color(153, 153, 153));
        jtfDir.setText("Escriba la direccion del cliente");
        jtfDir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfDirMouseClicked(evt);
            }
        });
        jtfDir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfDirKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDirKeyTyped(evt);
            }
        });
        getContentPane().add(jtfDir);
        jtfDir.setBounds(140, 280, 220, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar 46px.png"))); // NOI18N
        jButton1.setText("Consultar por codigo");
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar 64px.png"))); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 290, 180, 100);

        try {
            jffTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jffTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jffTelefonoMouseClicked(evt);
            }
        });
        getContentPane().add(jffTelefono);
        jffTelefono.setBounds(140, 340, 220, 40);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar por codigo 46px.png"))); // NOI18N
        jButton7.setText("Consultar por Nombre");
        jButton7.setContentAreaFilled(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar por codigo 64px.png"))); // NOI18N
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(410, 200, 180, 90);

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 180, 500, 230);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida 46px.png"))); // NOI18N
        jButton2.setText("Salir");
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida 64px.png"))); // NOI18N
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(560, 440, 100, 100);

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar 46px.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar 64px.png"))); // NOI18N
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(110, 440, 100, 100);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar 46.png"))); // NOI18N
        jButton4.setText("Modificar");
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(210, 440, 110, 100);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpio 46px.png"))); // NOI18N
        jButton6.setText("Limpiar");
        jButton6.setContentAreaFilled(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpio 64px.png"))); // NOI18N
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(330, 440, 90, 100);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Screenshot_76.png"))); // NOI18N
        jButton8.setText("Eliminar");
        jButton8.setContentAreaFilled(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar 64.png"))); // NOI18N
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(440, 440, 100, 100);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home.png"))); // NOI18N
        jButton9.setText("Inicio");
        jButton9.setBorder(null);
        jButton9.setContentAreaFilled(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(1470, 20, 90, 80);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seccionCliente.jpg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 1620, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents
String Cod;
String encontrado="no";
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Cod = JOptionPane.showInputDialog("Ingres el codigo");
        

BuscarCod(Cod);

if(encontrado.equals("no")){
JOptionPane.showMessageDialog(null, "No encontrado");
}
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Cod = JOptionPane.showInputDialog("Ingres el Nombre");
        BuscarNombre(Cod);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jtfNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfNombreMouseClicked
        // TODO add your handling code here:
        jtfNombre.setText("");
        jtfNombre.setForeground(Color.black);
    }//GEN-LAST:event_jtfNombreMouseClicked

    private void jtfDirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfDirMouseClicked
        // TODO add your handling code here:
        jtfDir.setText("");
        jtfDir.setForeground(Color.black);
    }//GEN-LAST:event_jtfDirMouseClicked

    private void jffTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jffTelefonoMouseClicked
        // TODO add your handling code here:
        lblMensaje.setVisible(true);
        jffTelefono.setBounds(new Rectangle(jffTelefono.getX(), jffTelefono.getY()+35, jffTelefono.getWidth(), jffTelefono.getHeight()));
    }//GEN-LAST:event_jffTelefonoMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);       // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        crearCliente();       // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        limpiar();       // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
Eliminar(cod2);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    
Modificar(cod2);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Principal().setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if (Character.isDigit(validar)) {
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Error, no se permiten numeros solo letras", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jtfNombreKeyTyped

    private void jtfDirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDirKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtfDirKeyPressed

    private void jtfDirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDirKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if (Character.isDigit(validar)) {
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Error, no se permiten numeros solo letras", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jtfDirKeyTyped
 public void crearCliente() {
     Conexion conect = new Conexion("ejeautos");
        try {
            con = conect.getConexion();
            //COLOQUE EN LA SENTENCIA SQL EL NOMBRE DE SU BD Y LOS NOMBRE DE LOS CAMPOS
            String sql = "INSERT INTO clientes (codcliente,nombre,direccion,telefono,estado) VALUES (?,?,?,?,?)";
            PreparedStatement ps = conect.getConexion().prepareStatement(sql);
            //COLOQUE LOS NOMBRES DE SUS CUADROS DE DIALOGO (JTEXTFIELD)
            ps.setInt(1, 0);
            ps.setString(2, jtfNombre.getText());
            ps.setString(3, jtfDir.getText());
            ps.setString(4, jffTelefono.getText());
            ps.setString(5, "Activo");           
            ps.execute();
            JOptionPane.showMessageDialog(null, "REGISTRO INGRESADO CORRECTAMENTE", "ATENCION!", 1);
            limpiar();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "REGISTRO NO SE PUDO GUARDAR"+e, "ATENCION!" + e, 0);
            System.out.println(e);
        }
    }
 
 private void BuscarCod(String cod) {
        Conexion conect = new Conexion("ejeautos");
            try {
                
                String senten = "SELECT * FROM clientes WHERE codcliente = "+cod;
                encontrado = "NO";
                con = conect.getConexion();
                st = con.createStatement();
                ResultSet rs = st.executeQuery(senten);

                while (rs.next()) {
                    jtfNombre.setText(rs.getString("nombre"));
                    jtfDir.setText(rs.getString("direccion"));
                    jffTelefono.setText(rs.getString("telefono"));
                    encontrado = "SI";
                    cod2 = String.valueOf(rs.getInt("codcliente"));
                    jtfNombre.setForeground(Color.black);
        jtfDir.setForeground(Color.black);
                }
                
                if (encontrado.equals("NO")) {
                    JOptionPane.showMessageDialog(null, "NO ENCONTRADO", "ATENCION!", JOptionPane.ERROR_MESSAGE);
                }

                con.close();
            } catch (HeadlessException | SQLException x) {
                System.out.println(x);
            }
        
    }

 private void BuscarNombre(String cod) {
        Conexion conect = new Conexion("ejeautos");
        
            try {
                String senten2 = "SELECT * FROM clientes WHERE nombre LIKE '"+cod+"'";
                encontrado = "NO";
                con = conect.getConexion();
                st2 = con.createStatement();

                ResultSet rs2 = st2.executeQuery(senten2);
                while (rs2.next()) {
                    jtfNombre.setText(rs2.getString("nombre"));
                    jtfDir.setText(rs2.getString("direccion"));
                    jffTelefono.setText(rs2.getString("telefono"));
                    encontrado = "SI";
                    cod2 = String.valueOf(rs2.getInt("codcliente"));
                    System.out.println(cod2);
        jtfNombre.setForeground(Color.black);
        jtfDir.setForeground(Color.black);

                }
                
                if (encontrado.equals("NO")) {
                    JOptionPane.showMessageDialog(null, "NO ENCONTRADO", "ATENCION!", JOptionPane.ERROR_MESSAGE);
                }

                con.close();
            } catch (HeadlessException | SQLException x) {
                System.out.println(x);
            }
        
    }
 
 public void Eliminar(String cod) {
        try {
            //COLOQUE EL NOMBRE DE SU BD
            Conexion conect = new Conexion("ejeautos");
            con = conect.getConexion();
            st = con.createStatement();
            PreparedStatement ps;

            //COLOQUE EL NOMBRE DE SU TABLA Y EL NOMBRE DE SUS CAMPOS
            String sql = "UPDATE clientes SET estado = 'Inactivo' WHERE codcliente =" + cod;
            ps = conect.getConexion().prepareStatement(sql);
           // ps.setString(1, "estado");

            ps.execute();
            JOptionPane.showMessageDialog(null, "REGISTRO Eliminado CORRECTAMENTE", "ATENCION!", 1);
            limpiar();
            con.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "REGISTRO NO SE PUDO Eliminar" + e, "ATENCION!", 0);
        }
    }
 
 public void Modificar(String cod){        
            try {
		//COLOQUE EL NOMBRE DE SU BD
                Conexion conect = new Conexion("ejeautos");
                con = conect.getConexion();
                st = con.createStatement();
                PreparedStatement ps;

		//COLOQUE EL NOMBRE DE SU TABLA Y EL NOMBRE DE SUS CAMPOS
                String sql = "UPDATE clientes SET nombre=?, direccion=?, telefono=? WHERE codcliente ="+ cod;
                ps = conect.getConexion().prepareStatement(sql);
                ps.setString(1, jtfNombre.getText());
                ps.setString(2, jtfDir.getText());
                ps.setString(3, jffTelefono.getText());

                ps.execute();
                JOptionPane.showMessageDialog(null, "REGISTRO ACTUALIZADO CORRECTAMENTE", "ATENCION!", 1);
                limpiar();
                con.close();                
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "REGISTRO NO SE PUDO ACTUALIZAR" + e, "ATENCION!", 0);
            }        
    }
 
 public void limpiar(){
 jtfNombre.setText("Escriba el nombre del cliente");
 jtfDir.setText("Escriba la direccion del cliente");
 jffTelefono.setText("");
 }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Clientes dialog = new Clientes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JFormattedTextField jffTelefono;
    private javax.swing.JTextField jtfDir;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JLabel lblMensaje;
    // End of variables declaration//GEN-END:variables
}
