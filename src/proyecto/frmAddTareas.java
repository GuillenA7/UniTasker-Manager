package proyecto;

import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;

public class frmAddTareas extends javax.swing.JInternalFrame
{

    private frmMenu menu;
    Recursos prestamoP = new Recursos();
    
    public frmAddTareas()
    {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbMensaje = new javax.swing.JLabel();
        jbtPush = new javax.swing.JButton();
        jlbReg1 = new javax.swing.JLabel();
        jbtPop = new javax.swing.JButton();
        jbtBack = new javax.swing.JButton();
        jtfRes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jlbPrestamo = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jlbAdd = new javax.swing.JLabel();
        jlbReg = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jlbFee = new javax.swing.JLabel();
        jtaDesc = new javax.swing.JTextField();
        jlbEgress = new javax.swing.JLabel();
        jlbEgressDay = new javax.swing.JLabel();
        jcbDiaInicio = new javax.swing.JComboBox<>();
        jlEgressMonth = new javax.swing.JLabel();
        jcbMesInicio = new javax.swing.JComboBox<>();
        jlbEntry = new javax.swing.JLabel();
        jlbEntryDay = new javax.swing.JLabel();
        jcbDiaFin = new javax.swing.JComboBox<>();
        jlbEntryMonth = new javax.swing.JLabel();
        jcbMesFin = new javax.swing.JComboBox<>();

        setClosable(true);

        jlbMensaje.setText("-");

        jbtPush.setText("Agregar");
        jbtPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPushActionPerformed(evt);
            }
        });

        jlbReg1.setText("Responsable:");

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

        jtfRes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfResKeyTyped(evt);
            }
        });

        jLabel1.setText("Estado:");

        jRadioButton1.setText("En proceso");

        jlbPrestamo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlbPrestamo.setText("Tarea");

        jRadioButton2.setText("Finalizado");

        jlbAdd.setText("Registro");

        jlbReg.setText("Nombre:");

        jtfName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNameKeyTyped(evt);
            }
        });

        jlbFee.setText("Descripción:");

        jlbEgress.setText("Fecha de inicio");

        jlbEgressDay.setText("Día:");

        jcbDiaInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29" }));

        jlEgressMonth.setText("Mes:");

        jcbMesInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jcbMesInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMesInicioActionPerformed(evt);
            }
        });

        jlbEntry.setText("Fecha de finalizaccion");

        jlbEntryDay.setText("Día:");

        jlbEntryMonth.setText("Mes:");

        jcbMesFin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jcbMesFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMesFinActionPerformed(evt);
            }
        });

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
                                        .addComponent(jcbDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlEgressMonth)
                                            .addComponent(jcbMesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jlbEgress)
                                    .addComponent(jlbEntryDay))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbEntry)
                                    .addComponent(jcbDiaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbEgressDay))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbEntryMonth)
                                    .addComponent(jcbMesFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jtaDesc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbReg)
                                .addGap(18, 18, 18)
                                .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbPrestamo)
                            .addComponent(jlbAdd)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlbReg1)
                        .addGap(18, 18, 18)
                        .addComponent(jtfRes, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jbtPush)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jlbMensaje))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jbtPop)
                                .addGap(73, 73, 73)
                                .addComponent(jbtBack)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlbFee)
                .addGap(18, 18, 18)
                .addComponent(jtaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jcbDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbMesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlbEntryMonth)
                            .addGap(18, 18, 18)
                            .addComponent(jcbMesFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlbEntry)
                            .addGap(18, 18, 18)
                            .addComponent(jlbEgressDay)
                            .addGap(18, 18, 18)
                            .addComponent(jcbDiaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbReg1)
                    .addComponent(jtfRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlbMensaje)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtPush)
                    .addComponent(jbtPop)
                    .addComponent(jbtBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPushActionPerformed
        int reg = Integer.parseInt(jtfName.getText());

        int egressDay = Integer.parseInt(jcbDiaInicio.getSelectedItem().toString());
        String egressMonth = jcbMesInicio.getSelectedItem().toString();
        int entryDay = Integer.parseInt(jcbDiaFin.getSelectedItem().toString());
        String entryMonth = jcbMesFin.getSelectedItem().toString();

        float fees = Float.parseFloat(jtaDesc.getText());

        prestamoP.push(reg, egressDay, egressMonth, entryDay, entryMonth, fees);
        jlbMensaje.setText("Registrado");

        limpiarCampos();
    }//GEN-LAST:event_jbtPushActionPerformed

    private void jbtPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPopActionPerformed
        prestamoP.pop();
    }//GEN-LAST:event_jbtPopActionPerformed

    private void jbtBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtBackActionPerformed

    private void jtfResKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfResKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfResKeyTyped

    private void jtfNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNameKeyTyped
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

            if(jtfName.getText().length() >= size && charac != KeyEvent.VK_ENTER)
            {
                getToolkit().beep();
                evt.consume();
                jlbMensaje.setVisible(true);
                jlbMensaje.setText("Máximo 8 dígitos.");
            }
        }
    }//GEN-LAST:event_jtfNameKeyTyped

    private void jcbMesInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMesInicioActionPerformed
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
        switch(jcbMesInicio.getSelectedIndex())
        {
            case 0: case 2: case 4: case 6: case 7: case 9: case 11:
            egress.addElement("30");
            egress.addElement("31");
            break;
            case 3: case 5: case 8: case 10:
            egress.addElement("30");
            break;

        }
        jcbDiaInicio.setModel(egress);
    }//GEN-LAST:event_jcbMesInicioActionPerformed

    private void jcbMesFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMesFinActionPerformed
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
        switch(jcbMesFin.getSelectedIndex())
        {
            case 0: case 2: case 4: case 6: case 7: case 9: case 11:
            entry.addElement("30");
            entry.addElement("31");
            break;
            case 3: case 5: case 8: case 10:
            entry.addElement("30");
            break;

        }
        jcbDiaFin.setModel(entry);
    }//GEN-LAST:event_jcbMesFinActionPerformed

    public void limpiarCampos()
    {
        jtfName.setText("");
        jtaDesc.setText("");
        jcbDiaInicio.setSelectedIndex(1);
        jcbMesInicio.setSelectedIndex(1);
        jcbDiaFin.setSelectedIndex(1);
        jcbMesFin.setSelectedIndex(1);
        jtfRes.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JButton jbtBack;
    private javax.swing.JButton jbtPop;
    private javax.swing.JButton jbtPush;
    private javax.swing.JComboBox<String> jcbDiaFin;
    private javax.swing.JComboBox<String> jcbDiaInicio;
    private javax.swing.JComboBox<String> jcbMesFin;
    private javax.swing.JComboBox<String> jcbMesInicio;
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
    private javax.swing.JLabel jlbReg1;
    private javax.swing.JTextField jtaDesc;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfRes;
    // End of variables declaration//GEN-END:variables
}
