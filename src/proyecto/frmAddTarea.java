package proyecto;

import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;

public class frmAddTarea extends javax.swing.JFrame
{

    private frmMenu menu;
    Prestamo prestamoP = new Prestamo();
    
    public frmAddTarea(frmMenu menu, Prestamo prestamoP)
    {
        initComponents();
        this.menu = menu;
        this.prestamoP = prestamoP;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbPrestamo = new javax.swing.JLabel();
        jlbAdd = new javax.swing.JLabel();
        jlbReg = new javax.swing.JLabel();
        jtfReg = new javax.swing.JTextField();
        jlbFee = new javax.swing.JLabel();
        jtfFee = new javax.swing.JTextField();
        jlbEgress = new javax.swing.JLabel();
        jlbEgressDay = new javax.swing.JLabel();
        jcbEgressDay = new javax.swing.JComboBox<>();
        jlEgressMonth = new javax.swing.JLabel();
        jcbEgressMonth = new javax.swing.JComboBox<>();
        jlbEntry = new javax.swing.JLabel();
        jlbEntryDay = new javax.swing.JLabel();
        jcbEntryDay = new javax.swing.JComboBox<>();
        jlbEntryMonth = new javax.swing.JLabel();
        jcbEntryMonth = new javax.swing.JComboBox<>();
        jlbMensaje = new javax.swing.JLabel();
        jbtPush = new javax.swing.JButton();
        jbtPop = new javax.swing.JButton();
        jbtBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbPrestamo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlbPrestamo.setText("Tarea");

        jlbAdd.setText("Registro");

        jlbReg.setText("Nombre:");

        jtfReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfRegKeyTyped(evt);
            }
        });

        jlbFee.setText("Descripción:");

        jlbEgress.setText("Fecha de inicio");

        jlbEgressDay.setText("Día:");

        jcbEgressDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29" }));

        jlEgressMonth.setText("Mes:");

        jcbEgressMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jcbEgressMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEgressMonthActionPerformed(evt);
            }
        });

        jlbEntry.setText("Fecha de finalizaccion");

        jlbEntryDay.setText("Día:");

        jlbEntryMonth.setText("Mes:");

        jcbEntryMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jcbEntryMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEntryMonthActionPerformed(evt);
            }
        });

        jlbMensaje.setText("-");

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

        jLabel1.setText("Estado:");

        jRadioButton1.setText("En proceso");

        jRadioButton2.setText("Finalizado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlbFee))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jcbEgressDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlEgressMonth)
                                            .addComponent(jcbEgressMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jlbEgress)
                                    .addComponent(jlbEntryDay))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbEntry)
                                    .addComponent(jcbEntryDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbEgressDay))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbEntryMonth)
                                    .addComponent(jcbEntryMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jtfFee, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbReg)
                                .addGap(18, 18, 18)
                                .addComponent(jtfReg, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jlbMensaje))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtPush)
                                .addGap(50, 50, 50)
                                .addComponent(jbtPop)
                                .addGap(73, 73, 73)
                                .addComponent(jbtBack))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbPrestamo)
                            .addComponent(jlbAdd))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbPrestamo)
                .addGap(18, 18, 18)
                .addComponent(jlbAdd)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbReg)
                    .addComponent(jtfReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlbFee)
                .addGap(18, 18, 18)
                .addComponent(jtfFee, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbEgress)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEgressMonth)
                            .addComponent(jlbEntryDay))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbEgressDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbEgressMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlbEntryMonth)
                            .addGap(18, 18, 18)
                            .addComponent(jcbEntryMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlbEntry)
                            .addGap(18, 18, 18)
                            .addComponent(jlbEgressDay)
                            .addGap(18, 18, 18)
                            .addComponent(jcbEntryDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)))
                .addGap(18, 18, 18)
                .addComponent(jlbMensaje)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtPush)
                    .addComponent(jbtPop)
                    .addComponent(jbtBack))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPopActionPerformed
        prestamoP.pop();
    }//GEN-LAST:event_jbtPopActionPerformed

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

    private void jbtBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBackActionPerformed
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtBackActionPerformed

    private void jbtPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPushActionPerformed
        int reg = Integer.parseInt(jtfReg.getText());

        int egressDay = Integer.parseInt(jcbEgressDay.getSelectedItem().toString());
        String egressMonth = jcbEgressMonth.getSelectedItem().toString();
        int entryDay = Integer.parseInt(jcbEntryDay.getSelectedItem().toString());
        String entryMonth = jcbEntryMonth.getSelectedItem().toString();
        
        float fees = Float.parseFloat(jtfFee.getText());

        prestamoP.push(reg, egressDay, egressMonth, entryDay, entryMonth, fees);
        jlbMensaje.setText("Registrado");
        
        limpiarCampos();
    }//GEN-LAST:event_jbtPushActionPerformed

    private void jcbEgressMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEgressMonthActionPerformed
        DefaultComboBoxModel egress = new DefaultComboBoxModel();
        egress.addElement("1");
        egress.addElement("2");
        egress.addElement("3");
        egress.addElement("4");
        egress.addElement("5");
        egress.addElement("6");
        egress.addElement("7");
        egress.addElement("8");
        egress.addElement("9");
        egress.addElement("10");
        egress.addElement("11");
        egress.addElement("12");
        egress.addElement("13");
        egress.addElement("14");
        egress.addElement("15");
        egress.addElement("16");
        egress.addElement("17");
        egress.addElement("18");
        egress.addElement("19");
        egress.addElement("20");
        egress.addElement("21");
        egress.addElement("22");
        egress.addElement("23");
        egress.addElement("24");
        egress.addElement("25");
        egress.addElement("26");
        egress.addElement("27");
        egress.addElement("28");
        egress.addElement("29");
        switch(jcbEgressMonth.getSelectedIndex())
        {
            case 0: case 2: case 4: case 6: case 7: case 9: case 11:
                egress.addElement("30");
                egress.addElement("31");
                break;
            case 3: case 5: case 8: case 10:
                egress.addElement("30");
                break;
            
        }
        jcbEgressDay.setModel(egress);
    }//GEN-LAST:event_jcbEgressMonthActionPerformed

    private void jcbEntryMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEntryMonthActionPerformed
        DefaultComboBoxModel entry = new DefaultComboBoxModel();
        entry.addElement("1");
        entry.addElement("2");
        entry.addElement("3");
        entry.addElement("4");
        entry.addElement("5");
        entry.addElement("6");
        entry.addElement("7");
        entry.addElement("8");
        entry.addElement("9");
        entry.addElement("10");
        entry.addElement("11");
        entry.addElement("12");
        entry.addElement("13");
        entry.addElement("14");
        entry.addElement("15");
        entry.addElement("16");
        entry.addElement("17");
        entry.addElement("18");
        entry.addElement("19");
        entry.addElement("20");
        entry.addElement("21");
        entry.addElement("22");
        entry.addElement("23");
        entry.addElement("24");
        entry.addElement("25");
        entry.addElement("26");
        entry.addElement("27");
        entry.addElement("28");
        entry.addElement("29");
        switch(jcbEntryMonth.getSelectedIndex())
        {
            case 0: case 2: case 4: case 6: case 7: case 9: case 11:
                entry.addElement("30");
                entry.addElement("31");
                break;
            case 3: case 5: case 8: case 10:
                entry.addElement("30");
                break;
            
        }
        jcbEntryDay.setModel(entry);
    }//GEN-LAST:event_jcbEntryMonthActionPerformed

    public void limpiarCampos()
    {
        jtfFee.setText("");
        jtfReg.setText("");
        jcbEgressDay.setSelectedIndex(1);
        jcbEgressMonth.setSelectedIndex(1);
        jcbEntryDay.setSelectedIndex(1);
        jcbEntryMonth.setSelectedIndex(1);
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
            java.util.logging.Logger.getLogger(frmAddTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAddTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAddTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAddTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                // new frmAddPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JButton jbtBack;
    private javax.swing.JButton jbtPop;
    private javax.swing.JButton jbtPush;
    private javax.swing.JComboBox<String> jcbEgressDay;
    private javax.swing.JComboBox<String> jcbEgressMonth;
    private javax.swing.JComboBox<String> jcbEntryDay;
    private javax.swing.JComboBox<String> jcbEntryMonth;
    private javax.swing.JLabel jlEgressMonth;
    private javax.swing.JLabel jlbAdd;
    private javax.swing.JLabel jlbEgress;
    private javax.swing.JLabel jlbEgressDay;
    private javax.swing.JLabel jlbEntry;
    private javax.swing.JLabel jlbEntryDay;
    private javax.swing.JLabel jlbEntryMonth;
    private javax.swing.JLabel jlbFee;
    private javax.swing.JLabel jlbMensaje;
    private javax.swing.JLabel jlbPrestamo;
    private javax.swing.JLabel jlbReg;
    private javax.swing.JTextField jtfFee;
    private javax.swing.JTextField jtfReg;
    // End of variables declaration//GEN-END:variables
}
