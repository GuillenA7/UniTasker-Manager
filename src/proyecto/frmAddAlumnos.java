package proyecto;

import java.awt.event.KeyEvent;

public class frmAddAlumnos extends javax.swing.JFrame
{

    private frmMenu menu;
    Alumnos alumnosP = new Alumnos();
    
    
    public frmAddAlumnos(frmMenu menu, Alumnos alumnosP)
    {
        initComponents();
        this.menu = menu;
        this.alumnosP = alumnosP;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbAlumnos = new javax.swing.JLabel();
        jlbAdd = new javax.swing.JLabel();
        jlbName = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jlbLastname = new javax.swing.JLabel();
        jtfLastname = new javax.swing.JTextField();
        jlbGenre = new javax.swing.JLabel();
        jlbStatus = new javax.swing.JLabel();
        jrbMasc = new javax.swing.JRadioButton();
        jrbFem = new javax.swing.JRadioButton();
        jrbAct = new javax.swing.JRadioButton();
        jrbInact = new javax.swing.JRadioButton();
        jlbReg = new javax.swing.JLabel();
        jtfReg = new javax.swing.JTextField();
        jbtPush = new javax.swing.JButton();
        jbtPop = new javax.swing.JButton();
        jbtBack = new javax.swing.JButton();
        jlbMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbAlumnos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlbAlumnos.setText("Alumnos");

        jlbAdd.setText("Registro");

        jlbName.setText("Nombre:");

        jlbLastname.setText("Apellido:");

        jlbGenre.setText("Genero:");

        jlbStatus.setText("Estado:");

        jrbMasc.setText("Masculino");

        jrbFem.setText("Femenino");

        jrbAct.setText("Activo");

        jrbInact.setText("Inactivo");

        jlbReg.setText("Número de registro:");

        jtfReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfRegKeyTyped(evt);
            }
        });

        jbtPush.setText("Agregar");
        jbtPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPushActionPerformed(evt);
            }
        });

        jbtPop.setText("Eliminar");
        jbtPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPopActionPerformed(evt);
            }
        });

        jbtBack.setText("Regresar");
        jbtBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBackActionPerformed(evt);
            }
        });

        jlbMensaje.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfReg, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jlbName))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jlbLastname))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jtfName))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jtfLastname))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlbGenre)
                                            .addComponent(jrbMasc)
                                            .addComponent(jrbFem))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrbAct)
                                            .addComponent(jlbStatus)
                                            .addComponent(jrbInact))
                                        .addGap(45, 45, 45))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(124, 124, 124)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlbAlumnos)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jlbAdd)
                                                .addGap(24, 24, 24)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jlbReg))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jbtPush)
                            .addGap(33, 33, 33)
                            .addComponent(jbtPop)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtBack)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jlbMensaje)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbAlumnos)
                .addGap(18, 18, 18)
                .addComponent(jlbAdd)
                .addGap(18, 18, 18)
                .addComponent(jlbName)
                .addGap(18, 18, 18)
                .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbLastname)
                .addGap(18, 18, 18)
                .addComponent(jtfLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbGenre)
                    .addComponent(jlbStatus))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMasc)
                    .addComponent(jrbAct))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbFem)
                    .addComponent(jrbInact))
                .addGap(18, 18, 18)
                .addComponent(jlbReg)
                .addGap(18, 18, 18)
                .addComponent(jtfReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtPush)
                    .addComponent(jbtPop)
                    .addComponent(jbtBack))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPopActionPerformed
        alumnosP.pop();
    }//GEN-LAST:event_jbtPopActionPerformed

    private void jbtPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPushActionPerformed
        String name = jtfName.getText(), lastname = jtfLastname.getText();
        char genre = 'O';
        boolean status = true;
        
        if(jrbMasc.isSelected())
            genre = 'M';
        else if (jrbFem.isSelected())
            genre = 'F';
        
        if(jrbInact.isSelected())
            status = false;
        
        int reg = Integer.parseInt(jtfReg.getText());
        
        alumnosP.push(name, lastname, genre, reg, status);
        jlbMensaje.setText("Registrado");
        limpiarCampos();
    }//GEN-LAST:event_jbtPushActionPerformed

    private void jbtBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBackActionPerformed
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtBackActionPerformed

    private void jtfRegKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfRegKeyTyped
        int size = 8;
        char charac = evt.getKeyChar();
        jlbMensaje.setVisible(false);
        
        if(charac == KeyEvent.VK_ENTER)
            jbtPush.requestFocus();
        else
        {
            if(!Character.isDigit(charac))
            {
                getToolkit().beep();
                evt.consume();
                jlbMensaje.setVisible(true);
                jlbMensaje.setText("Solo capturar números.");
            }
            
            if(jtfReg.getText().length() >= size && charac != KeyEvent.VK_ENTER)
            {
                getToolkit().beep();
                evt.consume();
                jlbMensaje.setVisible(true);
                jlbMensaje.setText("Máximo 8 dígitos.");
            }
        }
    }//GEN-LAST:event_jtfRegKeyTyped

    public void limpiarCampos()
    {
        jtfName.setText("");
        jtfLastname.setText("");
        jtfReg.setText("");
        jrbAct.setSelected(false);
        jrbInact.setSelected(false);
        jrbFem.setSelected(false);
        jrbMasc.setSelected(false);
    }
    
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
            java.util.logging.Logger.getLogger(frmAddAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAddAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAddAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAddAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                // new frmAddAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtBack;
    private javax.swing.JButton jbtPop;
    private javax.swing.JButton jbtPush;
    private javax.swing.JLabel jlbAdd;
    private javax.swing.JLabel jlbAlumnos;
    private javax.swing.JLabel jlbGenre;
    private javax.swing.JLabel jlbLastname;
    private javax.swing.JLabel jlbMensaje;
    private javax.swing.JLabel jlbName;
    private javax.swing.JLabel jlbReg;
    private javax.swing.JLabel jlbStatus;
    private javax.swing.JRadioButton jrbAct;
    private javax.swing.JRadioButton jrbFem;
    private javax.swing.JRadioButton jrbInact;
    private javax.swing.JRadioButton jrbMasc;
    private javax.swing.JTextField jtfLastname;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfReg;
    // End of variables declaration//GEN-END:variables
}
