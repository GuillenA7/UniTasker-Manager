package proyecto;

import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class frmAddRecursos extends javax.swing.JInternalFrame
{

    private frmMenu menu;
    private ListaProyectos recursosLista;
    Recursos recursos = new Recursos();
    
    public frmAddRecursos()
    {
        initComponents();
        this.recursosLista = new ListaProyectos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlbAdd = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlbReg = new javax.swing.JLabel();
        jtfProy = new javax.swing.JTextField();
        jtfName = new javax.swing.JTextField();
        jlbFee = new javax.swing.JLabel();
        jlbEgress = new javax.swing.JLabel();
        jcbUbi = new javax.swing.JComboBox<>();
        jlbEntry = new javax.swing.JLabel();
        jbtPush = new javax.swing.JButton();
        jbtPop = new javax.swing.JButton();
        jbtBack = new javax.swing.JButton();
        jlbPrestamo = new javax.swing.JLabel();
        jtfDis = new javax.swing.JTextField();
        jtfCosto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Agregar recurso");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setToolTipText("");

        jlbAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/square_plus_icon_251998.png"))); // NOI18N
        jlbAdd.setText("Agregar un nuevo recurso");

        jLabel2.setText("Nombre del proyecto al que esta destinado:");

        jlbReg.setText("Nombre:");

        jtfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNameActionPerformed(evt);
            }
        });

        jlbFee.setText("Disponibilidad:");

        jlbEgress.setText("Ubicacion:");

        jcbUbi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guadalajara", "Zapopan", "Tlaquepaque", "Tonalá", "Puerto Vallarta", "Hacienda Santa Fe", "Ciudad Guzmán", "Lagos de Moreno", "Tepatitlán de Morelos", "Ocotlán" }));
        jcbUbi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jlbEntry.setText("Costo:");

        jbtPush.setText("Agregar");
        jbtPush.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPushActionPerformed(evt);
            }
        });

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

        jlbPrestamo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlbPrestamo.setText("Recursos");

        jtfDis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDisKeyTyped(evt);
            }
        });

        jtfCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCostoActionPerformed(evt);
            }
        });
        jtfCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCostoKeyTyped(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbReg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfProy)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jlbFee)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfDis, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlbEntry)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jbtPush)
                                .addGap(66, 66, 66)
                                .addComponent(jbtPop)))
                        .addGap(47, 47, 47)
                        .addComponent(jbtBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlbEgress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbUbi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlbPrestamo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbAdd)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jlbAdd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlbPrestamo)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbReg)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfProy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbFee)
                            .addComponent(jtfDis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbEntry)
                            .addComponent(jtfCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbEgress)
                            .addComponent(jcbUbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtPop)
                            .addComponent(jbtBack)
                            .addComponent(jbtPush))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfDisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDisKeyTyped
        int size = 5;
        char charac = evt.getKeyChar();
        
        if(charac == KeyEvent.VK_ENTER)
            jbtPush.requestFocus();
        else
        {
            if(!Character.isDigit(charac))
            {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Solo capturar numeros");
            }
            
            if(jtfDis.getText().length() >= size && charac != KeyEvent.VK_ENTER)
            {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Maximo 5 digitos");
            }
        }
    }//GEN-LAST:event_jtfDisKeyTyped

    private void jbtBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtBackActionPerformed

    private void jbtPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPopActionPerformed

    }//GEN-LAST:event_jbtPopActionPerformed

    private void jbtPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPushActionPerformed
    String nombre = jtfName.getText();
    String proy = jtfProy.getText();
    String Dispon = jtfDis.getText();
    String Costo = jtfCosto.toString();
    String Ubi = (String) jcbUbi.getSelectedItem();
    if (!nombre.isEmpty() && !proy.isEmpty() && !Dispon.isEmpty() && !Costo.isEmpty() && !Ubi.isEmpty()) {
            recursosLista.push(nombre, proy, Dispon, Costo, Ubi);
            System.out.println("Proyecto agregado correctamente: " + nombre);
            System.out.println("Contenido de la lista de proyectos después de agregar:");
            System.out.println(recursosLista.recorrerRecursos());
            JOptionPane.showMessageDialog(null, "Proyecto agregado");

            // Obtén la instancia de frmShowProyectos y llama al método de actualización

        } else {
            JOptionPane.showMessageDialog(null, "Llena los campos");
            limpiarCampos();
        }
    }//GEN-LAST:event_jbtPushActionPerformed

    private void jtfCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCostoActionPerformed

    private void jtfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNameActionPerformed

    private void jtfCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCostoKeyTyped
        int size = 5;
        char charac = evt.getKeyChar();
        
        if(charac == KeyEvent.VK_ENTER)
            jbtPush.requestFocus();
        else
        {
            if(!Character.isDigit(charac))
            {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Solo capturar numeros");
            }
            
            if(jtfDis.getText().length() >= size && charac != KeyEvent.VK_ENTER)
            {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Maximo 5 digitos");
            }
        }
    }//GEN-LAST:event_jtfCostoKeyTyped

    public void limpiarCampos()
    {
        jtfName.setText("");
        jtfProy.setText("");
        jtfDis.setText("");
        jtfCosto.setText("");
        jcbUbi.setSelectedIndex(1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtBack;
    private javax.swing.JButton jbtPop;
    private javax.swing.JButton jbtPush;
    private javax.swing.JComboBox<String> jcbUbi;
    private javax.swing.JLabel jlbAdd;
    private javax.swing.JLabel jlbEgress;
    private javax.swing.JLabel jlbEntry;
    private javax.swing.JLabel jlbFee;
    private javax.swing.JLabel jlbPrestamo;
    private javax.swing.JLabel jlbReg;
    private javax.swing.JTextField jtfCosto;
    private javax.swing.JTextField jtfDis;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfProy;
    // End of variables declaration//GEN-END:variables
}
