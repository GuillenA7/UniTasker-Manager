package proyecto;

import java.awt.event.KeyEvent;

public class frmIngreso extends javax.swing.JFrame
{
    
    private int size = 20, count = 0, i = -1;
    private Usuario[] aUsuarios = new Usuario[size];
    
    public frmIngreso()
    {
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

        jlbTitulo = new javax.swing.JLabel();
        jlbUsuario = new javax.swing.JLabel();
        jlbContrasena = new javax.swing.JLabel();
        jpfContrasena = new javax.swing.JPasswordField();
        jtfUsuario = new javax.swing.JTextField();
        jlbMensaje = new javax.swing.JLabel();
        jbnIngresar = new javax.swing.JButton();
        jbnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jlbTitulo.setText("Inicio de sesión");

        jlbUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlbUsuario.setText("Usuario:");

        jlbContrasena.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlbContrasena.setText("Contraseña:");

        jpfContrasena.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jpfContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpfContrasenaKeyTyped(evt);
            }
        });

        jtfUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jlbMensaje.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jbnIngresar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbnIngresar.setText("Ingresar");
        jbnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnIngresarActionPerformed(evt);
            }
        });

        jbnSalir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbnSalir.setText("Salir");
        jbnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbContrasena)
                            .addComponent(jlbUsuario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbnIngresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbnSalir))
                            .addComponent(jlbMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbTitulo)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbUsuario)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbContrasena)
                    .addComponent(jpfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbnSalir)
                    .addComponent(jbnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            if (aUsuarios[i].getCuenta().equals(usr) && aUsuarios[i].getContrasena().equals(ctr))
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

    private void jpfContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfContrasenaKeyTyped
        if(evt.getKeyChar() == KeyEvent.VK_ENTER)
            jbnIngresar.requestFocus();
    }//GEN-LAST:event_jpfContrasenaKeyTyped

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
    private javax.swing.JButton jbnIngresar;
    private javax.swing.JButton jbnSalir;
    private javax.swing.JLabel jlbContrasena;
    private javax.swing.JLabel jlbMensaje;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JLabel jlbUsuario;
    private javax.swing.JPasswordField jpfContrasena;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
