
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAY
 */
public class Login extends javax.swing.JFrame {

    Conexion conect;
    Connection con = null;
    Statement st = null;
    /**
     * Creates new form Login
     */
    public Login() {
        this.setUndecorated(true);
        initComponents();
        
        
        txtContra.setEchoChar((char)0);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFondo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        jbIngresar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setText("Usuario");
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(250, 350, 190, 30);

        txtContra.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtContra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContra.setText("Contrase??a");
        txtContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraMouseClicked(evt);
            }
        });
        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });
        txtContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraKeyPressed(evt);
            }
        });
        getContentPane().add(txtContra);
        txtContra.setBounds(250, 400, 190, 30);

        jbIngresar.setText("Ingresar");
        jbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jbIngresar);
        jbIngresar.setBounds(230, 450, 100, 40);

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir);
        jbSalir.setBounds(350, 450, 110, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        System.exit(0);       // TODO add your handling code here:
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarActionPerformed
        BuscarUsuario();        // TODO add your handling code here:
    }//GEN-LAST:event_jbIngresarActionPerformed

    private void txtContraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jbIngresar.requestFocus();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_txtContraKeyPressed

    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraActionPerformed

    private void txtContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraMouseClicked
        // TODO add your handling code here:
        validarContra();
    }//GEN-LAST:event_txtContraMouseClicked

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtContra.requestFocus();
            txtContra.setText("");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
        // TODO add your handling code here:
        txtUsuario.setText("");
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        // TODO add your handling code here:\
        txtUsuario.setText("");
    }//GEN-LAST:event_txtUsuarioKeyTyped
    public void validarContra(){
    txtContra.requestFocus();
    txtContra.setText(null);       
    txtContra.setEchoChar('\u2022');
    txtContra.setForeground(Color.black);
}
    
    String encontrado;

    private void BuscarUsuario() {
         conect = new Conexion("ejeautos");
        if (txtUsuario.getText().equals("Usuario") || txtContra.getText().equals("Contrasenia")) {
            JOptionPane.showMessageDialog(null, "Error\ncampos Vacios.", null, JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                String senten = "SELECT * FROM usuarios WHERE estado LIKE 'Activo'";
                encontrado = "NO";
                con = conect.getConexion();
                st = con.createStatement();
                ResultSet rs = st.executeQuery(senten);

                while (rs.next()) {
                    if (txtUsuario.getText().equals(rs.getString("usuario"))) {

                        if (txtContra.getText().equals(rs.getString("contrasenia"))) {

                            JOptionPane.showMessageDialog(null, "Bienvenido " + txtUsuario.getText());
                            this.dispose();
                            new Principal().setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Contrase??a incorrecta");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario incorrecto");
                    }
                    encontrado = "SI";
                    limpiar();
                }
                if (encontrado.equals("NO")) {
                    JOptionPane.showMessageDialog(null, "NO ENCONTRADO", "ATENCION!", JOptionPane.ERROR_MESSAGE);
                }

                con.close();
            } catch (HeadlessException | SQLException x) {
                System.out.println(x);
            }
        }
    }

    public void limpiar() {
        txtUsuario.setText("Usuario");
        txtContra.setEchoChar((char)0);
        txtContra.setText("Contrase??a");
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbIngresar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
