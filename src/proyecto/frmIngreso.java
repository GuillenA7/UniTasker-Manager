package proyecto;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class frmIngreso extends javax.swing.JFrame
{
    
    private int size = 20, count = 0, i = -1;
    private Usuario[] aUsuarios = new Usuario[size];
    
    public frmIngreso()
    {
        
        setIconImage(new ImageIcon(getClass().getResource("/icons/Icon.png")).getImage());
        
        initComponents();
        
        for(i = 0; i < size; i++)
            aUsuarios[i] = new Usuario();
        
        aUsuarios[0] = new Usuario("user01", "12345");
        aUsuarios[1] = new Usuario("user02", "12345");
        aUsuarios[2] = new Usuario("user03", "12345");
        aUsuarios[3] = new Usuario("user04", "12345");
        aUsuarios[4] = new Usuario("user05", "12345");
        count = 5;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlbUsuario = new javax.swing.JLabel();
        jlbContrasena = new javax.swing.JLabel();
        jpfContrasena = new javax.swing.JPasswordField();
        jtfUsuario = new javax.swing.JTextField();
        jlbMensaje = new javax.swing.JLabel();
        jbnIngresar = new javax.swing.JButton();
        jbnSalir = new javax.swing.JButton();
        jlbAlumnos = new javax.swing.JLabel();
        jlbAdd1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jlbUsuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_icon_251962.png"))); // NOI18N
        jlbUsuario.setText("Usuario:");
        jlbUsuario.setToolTipText("");

        jlbContrasena.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbContrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock_padlock_icon_251975.png"))); // NOI18N
        jlbContrasena.setText("Contraseña:");
        jlbContrasena.setToolTipText("");

        jpfContrasena.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jpfContrasena.setMinimumSize(new java.awt.Dimension(64, 22));
        jpfContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpfContrasenaKeyTyped(evt);
            }
        });

        jtfUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtfUsuario.setMinimumSize(new java.awt.Dimension(64, 22));

        jlbMensaje.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlbMensaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jbnIngresar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbnIngresar.setText("Ingresar");
        jbnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnIngresarActionPerformed(evt);
            }
        });

        jbnSalir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbnSalir.setText("Salir");
        jbnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnSalirActionPerformed(evt);
            }
        });

        jlbAlumnos.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlbAlumnos.setText("Inicio");

        jlbAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-inicio-sesión-30.png"))); // NOI18N
        jlbAdd1.setText("Ingresa a tu cuenta");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlbAlumnos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlbAdd1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbUsuario)
                                    .addComponent(jlbContrasena))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jpfContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jtfUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jbnIngresar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlbMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addGap(253, 253, 253))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jbnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbAlumnos)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jlbAdd1)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbUsuario)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbContrasena)
                    .addComponent(jpfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbnIngresar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbnSalir)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jpfContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfContrasenaKeyTyped
        if(evt.getKeyChar() == KeyEvent.VK_ENTER)
        jbnIngresar.requestFocus();
    }//GEN-LAST:event_jpfContrasenaKeyTyped

    private void jbnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnIngresarActionPerformed
        // obtener textos de usuario y contraseña
        String usr = jtfUsuario.getText();
        String ctr = jpfContrasena.getText();
        jlbMensaje.setText(jpfContrasena.getPassword().toString());

        // bandera para determinar validez de usuario
        boolean valido = false;
        // validar el acceso o no
        for(int i = 0; i < count; i++)
        {
            if (aUsuarios[i].getNombre().equals(usr) && aUsuarios[i].getContrasena().equals(ctr))
            {
                jlbMensaje.setText("Ingresa al sistema");
                frmMenu f = new frmMenu(usr, this);
                f.setVisible(true);
                this.setVisible(false);
                valido = true;
            }
        }
        if (!valido)
        {
            jlbMensaje.setText("Cuenta sin acceso.");
        }
    }//GEN-LAST:event_jbnIngresarActionPerformed

    private void jbnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbnSalirActionPerformed

    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(frmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new frmIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbnIngresar;
    private javax.swing.JButton jbnSalir;
    private javax.swing.JLabel jlbAdd1;
    private javax.swing.JLabel jlbAlumnos;
    private javax.swing.JLabel jlbContrasena;
    private javax.swing.JLabel jlbMensaje;
    private javax.swing.JLabel jlbUsuario;
    private javax.swing.JPasswordField jpfContrasena;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
