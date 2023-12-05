package proyecto;

import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class frmAddTareas extends javax.swing.JInternalFrame
{

    private frmMenu menu;
    Tareas tarea = new Tareas();
    
    public frmAddTareas()
    {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtPop = new javax.swing.JButton();
        jbtBack = new javax.swing.JButton();
        jtfRes = new javax.swing.JTextField();
        jlbPrestamo = new javax.swing.JLabel();
        jlbAdd = new javax.swing.JLabel();
        jlbReg = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jlbFee = new javax.swing.JLabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDesc = new javax.swing.JTextArea();
        jlbMensaje = new javax.swing.JLabel();
        jbtPush = new javax.swing.JButton();
        jlbReg1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Agregar tarea");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jbtPop.setText("Eliminar");
        jbtPop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPopActionPerformed(evt);
            }
        });

        jbtBack.setText("Regresar");
        jbtBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBackActionPerformed(evt);
            }
        });

        jlbPrestamo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlbPrestamo.setText("Registrar tarea");

        jlbAdd.setText("Registro");

        jlbReg.setText("Nombre:");

        jlbFee.setText("Descripción:");

        jlbEgress.setText("Fecha de inicio");

        jlbEgressDay.setText("Día:");

        jcbDiaInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29" }));
        jcbDiaInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jlEgressMonth.setText("Mes:");

        jcbMesInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jcbMesInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbMesInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMesInicioActionPerformed(evt);
            }
        });

        jlbEntry.setText("Fecha de finalizaccion");

        jlbEntryDay.setText("Día:");

        jcbDiaFin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jlbEntryMonth.setText("Mes:");

        jcbMesFin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jcbMesFin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbMesFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMesFinActionPerformed(evt);
            }
        });

        jtaDesc.setColumns(20);
        jtaDesc.setLineWrap(true);
        jtaDesc.setRows(5);
        jtaDesc.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jtaDesc);

        jlbMensaje.setText("-");

        jbtPush.setText("Agregar");
        jbtPush.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPushActionPerformed(evt);
            }
        });

        jlbReg1.setText("Responsable:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jlbFee))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(225, 225, 225)
                            .addComponent(jlbAdd))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jlbReg1)
                            .addGap(18, 18, 18)
                            .addComponent(jtfRes))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(jbtPush)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(84, 84, 84)
                                    .addComponent(jlbMensaje))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(49, 49, 49)
                                    .addComponent(jbtPop)
                                    .addGap(73, 73, 73)
                                    .addComponent(jbtBack))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jcbDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(27, 27, 27)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jlEgressMonth)
                                                .addComponent(jcbMesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jlbEgress)
                                        .addComponent(jlbEntryDay))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlbEntry)
                                        .addComponent(jcbDiaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlbEgressDay))
                                    .addGap(8, 8, 8)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlbEntryMonth)
                                        .addComponent(jcbMesFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlbReg)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jlbPrestamo)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbPrestamo)
                .addGap(18, 18, 18)
                .addComponent(jlbAdd)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbReg)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlbFee)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbEgress)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEgressMonth)
                            .addComponent(jlbEntryDay))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbMesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jlbEntryMonth)
                            .addGap(18, 18, 18)
                            .addComponent(jcbMesFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jlbEntry)
                            .addGap(18, 18, 18)
                            .addComponent(jlbEgressDay)
                            .addGap(18, 18, 18)
                            .addComponent(jcbDiaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbReg1)
                    .addComponent(jtfRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlbMensaje)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtPush)
                    .addComponent(jbtPop)
                    .addComponent(jbtBack))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPopActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbtPopActionPerformed

    private void jbtBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBackActionPerformed
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

    private void jbtPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPushActionPerformed
        // Obtener datos de los campos de texto y áreas de texto
        String nombre = jtfName.getText();
        String descripcion = jtaDesc.getText();
        String fechaInicioDia = (String) jcbDiaInicio.getSelectedItem();
        String fechaInicioMes = (String) jcbMesInicio.getSelectedItem();
        String fechaFinDia = (String) jcbDiaFin.getSelectedItem();
        String fechaFinMes = (String) jcbMesFin.getSelectedItem();
        boolean estado = true;
        // Crear una instancia de Proyecto con los datos obtenidos
        Tareas tarea = new Tareas();

        // Manipular las fechas según sea necesario y guardarlas en el objeto Proyecto
        // Ejemplo: nuevoProyecto.setFechaInicio(fechaInicioDia + "/" + fechaInicioMes);
        // Ejemplo: nuevoProyecto.setFechaFin(fechaFinDia + "/" + fechaFinMes);

        // Aquí podrías guardar el objeto Proyecto en tu sistema o hacer lo necesario con los datos
        // Por ejemplo, podrías añadirlo a una lista de proyectos, enviarlo a una base de datos, etc.

        // Ejemplo de cómo mostrar los datos para verificar:
        JOptionPane.showMessageDialog(null, "Tarea agregada");
        // Mostrar las fechas de inicio y fin si las has manipulado y almacenado en el objeto Proyecto

        // Aquí podrías realizar cualquier acción adicional que necesites después de guardar el proyecto
        // Por ejemplo, cerrar el formulario, actualizar la interfaz, etc.

        // Limpiar los campos del formulario después de agregar el proyecto
        limpiarCampos();
    }//GEN-LAST:event_jbtPushActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTextArea jtaDesc;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfRes;
    // End of variables declaration//GEN-END:variables
}
