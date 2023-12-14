package proyecto;

public class frmShowProyectos extends javax.swing.JInternalFrame
{
    private frmMenu menu;
    private ListaProyectos proyectos;

   public frmShowProyectos()
    {
        initComponents();
    }

    public frmShowProyectos(ListaProyectos proyectos,frmMenu menu) {
        initComponents();
        this.menu = menu;
        this.proyectos = proyectos;  // Agrega esta línea
        jtaResultado.setText(this.proyectos.recorrerProyectos());
        jtaResultado.setEditable(false);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtClean = new javax.swing.JButton();
        jbtBack = new javax.swing.JButton();
        jlbPrestamo = new javax.swing.JLabel();
        jlbShow = new javax.swing.JLabel();
        jScrollPane1 = new java.awt.ScrollPane();
        jtaResultado = new java.awt.TextArea();

        setClosable(true);
        setTitle("Proyectos");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jbtClean.setText("Limpiar");
        jbtClean.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCleanActionPerformed(evt);
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
        jlbPrestamo.setText("Proyectos");

        jlbShow.setText("Mostrar");

        jScrollPane1.add(jtaResultado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jlbPrestamo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(jlbShow)))
                        .addGap(0, 137, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jbtClean)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtBack)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbPrestamo)
                .addGap(18, 18, 18)
                .addComponent(jlbShow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtClean)
                    .addComponent(jbtBack))
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCleanActionPerformed
        jtaResultado.setText("");
    }//GEN-LAST:event_jbtCleanActionPerformed

    private void jbtBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private java.awt.ScrollPane jScrollPane1;
    private javax.swing.JButton jbtBack;
    private javax.swing.JButton jbtClean;
    private javax.swing.JLabel jlbPrestamo;
    private javax.swing.JLabel jlbShow;
    private java.awt.TextArea jtaResultado;
    // End of variables declaration//GEN-END:variables
}