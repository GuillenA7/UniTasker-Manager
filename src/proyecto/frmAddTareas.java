package proyecto;

import java.awt.event.KeyEvent;

public class frmAddTareas extends javax.swing.JFrame
{

    private frmMenu menu;
    Tareas libroP = new Tareas();
    
    public frmAddTareas(frmMenu menu, Tareas libroP)
    {
        initComponents();
        this.menu = menu;
        this.libroP = libroP;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbLibro = new javax.swing.JLabel();
        jlbAdd = new javax.swing.JLabel();
        jlbTitle = new javax.swing.JLabel();
        jtfTitle = new javax.swing.JTextField();
        jlbCode = new javax.swing.JLabel();
        jtfCode = new javax.swing.JTextField();
        jlbDisp = new javax.swing.JLabel();
        jrbYes = new javax.swing.JRadioButton();
        jrbNo = new javax.swing.JRadioButton();
        jlbPages = new javax.swing.JLabel();
        jtfPages = new javax.swing.JTextField();
        jbtPush = new javax.swing.JButton();
        jbtPop = new javax.swing.JButton();
        jbtBack = new javax.swing.JButton();
        jlbMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbLibro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlbLibro.setText("Proyecto");

        jlbAdd.setText("Registro");

        jlbTitle.setText("Nombre:");

        jlbCode.setText("Descripcion");

        jlbDisp.setText("¿Está disponible?");

        jrbYes.setText("Si");

        jrbNo.setText("No");

        jlbPages.setText("Páginas:");

        jtfPages.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPagesKeyTyped(evt);
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
                        .addGroup(layout.createSequentialGroup()
                            .addGap(164, 164, 164)
                            .addComponent(jlbLibro))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(176, 176, 176)
                            .addComponent(jlbAdd))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jlbTitle))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jtfTitle))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jlbCode))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jtfCode))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jrbNo)
                                    .addGap(27, 27, 27))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jbtPush)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlbDisp)
                                            .addComponent(jrbYes)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(99, 99, 99)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jlbPages)
                                                .addComponent(jtfPages)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(55, 55, 55)
                                            .addComponent(jbtPop)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                            .addComponent(jbtBack)
                                            .addGap(29, 29, 29)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jlbMensaje)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbLibro)
                .addGap(18, 18, 18)
                .addComponent(jlbAdd)
                .addGap(18, 18, 18)
                .addComponent(jlbTitle)
                .addGap(18, 18, 18)
                .addComponent(jtfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbCode)
                .addGap(18, 18, 18)
                .addComponent(jtfCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbDisp)
                    .addComponent(jlbPages))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbYes)
                    .addComponent(jtfPages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jrbNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jlbMensaje)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtPush)
                    .addComponent(jbtPop)
                    .addComponent(jbtBack))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPopActionPerformed
        libroP.pop();
    }//GEN-LAST:event_jbtPopActionPerformed

    private void jtfPagesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPagesKeyTyped
        int size = 5;
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

            if(jtfPages.getText().length() >= size && charac != KeyEvent.VK_ENTER)
            {
                getToolkit().beep();
                evt.consume();
                jlbMensaje.setVisible(true);
                jlbMensaje.setText("Máximo 5 dígitos.");
            }
        }
    }//GEN-LAST:event_jtfPagesKeyTyped

    private void jbtBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBackActionPerformed
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtBackActionPerformed

    private void jbtPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPushActionPerformed
        String title = jtfTitle.getText(), code = jtfCode.getText();
        boolean disp = true;

        if(jrbNo.isSelected())
            disp = false;

        int pages = Integer.parseInt(jtfPages.getText());

        libroP.push(title,disp, pages, code);
        jlbMensaje.setText("Registrado");
        
        limpiarCampos();
    }//GEN-LAST:event_jbtPushActionPerformed

    public void limpiarCampos()
    {
        jtfCode.setText("");
        jtfTitle.setText("");
        jtfPages.setText("");
        jrbNo.setSelected(false);
        jrbYes.setSelected(false);
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
            java.util.logging.Logger.getLogger(frmAddTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAddTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAddTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAddTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                // new frmAddTareas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtBack;
    private javax.swing.JButton jbtPop;
    private javax.swing.JButton jbtPush;
    private javax.swing.JLabel jlbAdd;
    private javax.swing.JLabel jlbCode;
    private javax.swing.JLabel jlbDisp;
    private javax.swing.JLabel jlbLibro;
    private javax.swing.JLabel jlbMensaje;
    private javax.swing.JLabel jlbPages;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JRadioButton jrbNo;
    private javax.swing.JRadioButton jrbYes;
    private javax.swing.JTextField jtfCode;
    private javax.swing.JTextField jtfPages;
    private javax.swing.JTextField jtfTitle;
    // End of variables declaration//GEN-END:variables
}
