package proyecto;

public class frmMenu extends javax.swing.JFrame
{

    private frmIngreso ingreso;
    Alumnos alumnosP = new Alumnos();
    Libro libroP = new Libro();
    Prestamo prestamoP = new Prestamo();
    
    public frmMenu(String usr, frmIngreso ingreso)
    {
        initComponents();
        
        this.ingreso = ingreso;
        jlbUser.setText("@" + usr);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jlbWelcome = new javax.swing.JLabel();
        jlbUser = new javax.swing.JLabel();
        menuBarraNavegacion = new javax.swing.JMenuBar();
        menuAlumnos = new javax.swing.JMenu();
        addAlumnos = new javax.swing.JMenuItem();
        showAlumnos = new javax.swing.JMenuItem();
        menuLibro = new javax.swing.JMenu();
        addLibro = new javax.swing.JMenuItem();
        showLibro = new javax.swing.JMenuItem();
        menuPrestamo = new javax.swing.JMenu();
        addPrestamo = new javax.swing.JMenuItem();
        showPrestamo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbWelcome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jlbWelcome.setText("Bienvenido");

        jlbUser.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        menuAlumnos.setText("Proyectos");

        addAlumnos.setText("Registrar");
        addAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAlumnosActionPerformed(evt);
            }
        });
        menuAlumnos.add(addAlumnos);

        showAlumnos.setText("Mostrar");
        showAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAlumnosActionPerformed(evt);
            }
        });
        menuAlumnos.add(showAlumnos);

        menuBarraNavegacion.add(menuAlumnos);

        menuLibro.setText("Tareas");

        addLibro.setText("Registrar");
        addLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLibroActionPerformed(evt);
            }
        });
        menuLibro.add(addLibro);

        showLibro.setText("Mostrar");
        showLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showLibroActionPerformed(evt);
            }
        });
        menuLibro.add(showLibro);

        menuBarraNavegacion.add(menuLibro);

        menuPrestamo.setText("Recursos");

        addPrestamo.setText("Registrar");
        addPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPrestamoActionPerformed(evt);
            }
        });
        menuPrestamo.add(addPrestamo);

        showPrestamo.setText("Mostrar");
        showPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPrestamoActionPerformed(evt);
            }
        });
        menuPrestamo.add(showPrestamo);

        menuBarraNavegacion.add(menuPrestamo);

        jMenu3.setText("Informes");
        menuBarraNavegacion.add(jMenu3);

        setJMenuBar(menuBarraNavegacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbWelcome))
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jlbWelcome)
                .addGap(18, 18, 18)
                .addComponent(jlbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAlumnosActionPerformed
        frmAddAlumnos addAlumnos = new frmAddAlumnos(this, alumnosP);
        this.setVisible(false);
        addAlumnos.setVisible(true);
    }//GEN-LAST:event_addAlumnosActionPerformed

    private void showAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAlumnosActionPerformed
        frmShowAlumnos showAlumnos = new frmShowAlumnos(this, alumnosP);
        this.setVisible(false);
        showAlumnos.setVisible(true);
    }//GEN-LAST:event_showAlumnosActionPerformed

    private void addLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLibroActionPerformed
        frmAddLibro addLibro = new frmAddLibro(this, libroP);
        this.setVisible(false);
        addLibro.setVisible(true);
    }//GEN-LAST:event_addLibroActionPerformed

    private void showLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showLibroActionPerformed
        frmShowLibro showLibro = new frmShowLibro(this, libroP);
        this.setVisible(false);
        showLibro.setVisible(true);
    }//GEN-LAST:event_showLibroActionPerformed

    private void addPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPrestamoActionPerformed
        frmAddPrestamo addPrestamo = new frmAddPrestamo(this, prestamoP);
        this.setVisible(false);
        addPrestamo.setVisible(true);
    }//GEN-LAST:event_addPrestamoActionPerformed

    private void showPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPrestamoActionPerformed
        frmShowPrestamo showPrestamo = new frmShowPrestamo(this, prestamoP);
        this.setVisible(false);
        showPrestamo.setVisible(true);
    }//GEN-LAST:event_showPrestamoActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                // new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addAlumnos;
    private javax.swing.JMenuItem addLibro;
    private javax.swing.JMenuItem addPrestamo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JLabel jlbUser;
    private javax.swing.JLabel jlbWelcome;
    private javax.swing.JMenu menuAlumnos;
    private javax.swing.JMenuBar menuBarraNavegacion;
    private javax.swing.JMenu menuLibro;
    private javax.swing.JMenu menuPrestamo;
    private javax.swing.JMenuItem showAlumnos;
    private javax.swing.JMenuItem showLibro;
    private javax.swing.JMenuItem showPrestamo;
    // End of variables declaration//GEN-END:variables
}
