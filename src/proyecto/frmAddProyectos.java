package proyecto;

import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;

public class frmAddProyectos extends javax.swing.JFrame
{

    private frmMenu menu;
    Proyectos Proyect = new Proyectos();
    
    
    public frmAddProyectos(frmMenu menu, Proyectos alumnosP)
    {
        initComponents();
        this.menu = menu;
        this.Proyect = alumnosP;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbAlumnos = new javax.swing.JLabel();
        jlbName = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jlbLastname = new javax.swing.JLabel();
        jlbStatus = new javax.swing.JLabel();
        jrbAct = new javax.swing.JRadioButton();
        jrbInact = new javax.swing.JRadioButton();
        jbtPush = new javax.swing.JButton();
        jbtPop = new javax.swing.JButton();
        jbtBack = new javax.swing.JButton();
        jlbMensaje = new javax.swing.JLabel();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbAlumnos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlbAlumnos.setText("Registrar proyecto");

        jlbName.setText("Nombre:");

        jlbLastname.setText("Descripción:");

        jlbStatus.setText("Estado:");

        jrbAct.setText("Activo");

        jrbInact.setText("Inactivo");

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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbEntryDay))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlEgressMonth)
                                    .addComponent(jcbMesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jlbEgress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbEntry)
                            .addComponent(jcbDiaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbEgressDay))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbEntryMonth)
                            .addComponent(jcbMesFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(jlbAlumnos))
                            .addComponent(jlbStatus)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbAct)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbtPush)
                                        .addGap(33, 33, 33)
                                        .addComponent(jbtPop)
                                        .addGap(45, 45, 45)
                                        .addComponent(jbtBack))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(140, 140, 140)
                                        .addComponent(jlbMensaje))
                                    .addComponent(jrbInact))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbLastname)
                                .addGap(294, 423, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbName)
                                .addGap(36, 36, 36)
                                .addComponent(jtfName))
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbAlumnos)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbName))
                .addGap(18, 18, 18)
                .addComponent(jlbLastname)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
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
                .addComponent(jlbStatus)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbAct)
                    .addComponent(jrbInact))
                .addGap(18, 18, 18)
                .addComponent(jlbMensaje)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtPush)
                    .addComponent(jbtPop)
                    .addComponent(jbtBack))
                .addGap(115, 115, 115))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPopActionPerformed
        Proyect.pop();
    }//GEN-LAST:event_jbtPopActionPerformed

    private void jbtPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPushActionPerformed
        String nombre = jtfName.getText(), descripcion = jtfDesc.getText();
        int diainicio = 
        
        char genre = 'O';
        boolean status = true;
        
        if(jrbMasc.isSelected())
            genre = 'M';
        else if (jrbFem.isSelected())
            genre = 'F';
        
        if jtfDescsSelected())
            status = false;
        
        int reg = Integer.parseInt(jtfReg.getText());
        
        Proyect.push(String nombre, String descripcion, int diainicio, String mesinicio, int diafin, String mesfin, boolean estado);
        jlbMensaje.setText("Registrado");
        limpiarCampos();
    }//GEN-LAST:event_jbtPushActionPerformed

    private void jbtBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBackActionPerformed
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtBackActionPerformed

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
        jtfDesc.setText("");
        jtfReg.setText("");
        jrbAct.setSelected(false);
        jrbInact.setSelected(false);
        jrbFem.setSelected(false);
        jrbMasc.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtBack;
    private javax.swing.JButton jbtPop;
    private javax.swing.JButton jbtPush;
    private javax.swing.JComboBox<String> jcbDiaFin;
    private javax.swing.JComboBox<String> jcbDiaInicio;
    private javax.swing.JComboBox<String> jcbMesFin;
    private javax.swing.JComboBox<String> jcbMesInicio;
    private javax.swing.JLabel jlEgressMonth;
    private javax.swing.JLabel jlbAlumnos;
    private javax.swing.JLabel jlbEgress;
    private javax.swing.JLabel jlbEgressDay;
    private javax.swing.JLabel jlbEntry;
    private javax.swing.JLabel jlbEntryDay;
    private javax.swing.JLabel jlbEntryMonth;
    private javax.swing.JLabel jlbLastname;
    private javax.swing.JLabel jlbMensaje;
    private javax.swing.JLabel jlbName;
    private javax.swing.JLabel jlbStatus;
    private javax.swing.JRadioButton jrbAct;
    private javax.swing.JRadioButton jrbInact;
    private javax.swing.JTextField jtfName;
    // End of variables declaration//GEN-END:variables
}