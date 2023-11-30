package proyecto;

public class frmMenu extends javax.swing.JFrame
{

    private frmIngreso ingreso;
    Proyectos proyecto = new Proyectos();
    Tareas libroP = new Tareas();
    Recursos prestamoP = new Recursos();
    
    
    public frmMenu(String usr, frmIngreso ingreso)
    {
        initComponents();
        
        this.ingreso = ingreso;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        menuBarraNavegacion = new javax.swing.JMenuBar();
        menuAlumnos = new javax.swing.JMenu();
        addProyectos = new javax.swing.JMenuItem();
        showAlumnos = new javax.swing.JMenuItem();
        menuLibro = new javax.swing.JMenu();
        addLibro = new javax.swing.JMenuItem();
        showLibro = new javax.swing.JMenuItem();
        menuPrestamo = new javax.swing.JMenu();
        addPrestamo = new javax.swing.JMenuItem();
        showPrestamo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1020, 640));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
        );

        menuAlumnos.setText("Proyectos");

        addProyectos.setText("Registrar");
        addProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProyectosActionPerformed(evt);
            }
        });
        menuAlumnos.add(addProyectos);

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

        jMenuItem2.setText("Registrar");
        jMenu3.add(jMenuItem2);

        jMenuItem1.setText("Mostrar");
        jMenu3.add(jMenuItem1);

        menuBarraNavegacion.add(jMenu3);

        setJMenuBar(menuBarraNavegacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProyectosActionPerformed
        AddProyectos proyecto = new AddProyectos();
        
        jDesktopPane1.add(proyecto);
        
        proyecto.show();
    }//GEN-LAST:event_addProyectosActionPerformed

    private void showAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAlumnosActionPerformed
        frmShowProyectos showAlumnos = new frmShowProyectos(this, alumnosP);
        this.setVisible(false);
        showAlumnos.setVisible(true);
    }//GEN-LAST:event_showAlumnosActionPerformed

    private void addLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLibroActionPerformed
        frmAddTareas addLibro = new frmAddTareas(this, libroP);
        this.setVisible(false);
        addLibro.setVisible(true);
    }//GEN-LAST:event_addLibroActionPerformed

    private void showLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showLibroActionPerformed
        frmShowTarea showLibro = new frmShowTarea(this, libroP);
        this.setVisible(false);
        showLibro.setVisible(true);
    }//GEN-LAST:event_showLibroActionPerformed

    private void addPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPrestamoActionPerformed
        frmAddRecursos addPrestamo = new frmAddRecursos(this, prestamoP);
        
        addPrestamo.setVisible(true);
    }//GEN-LAST:event_addPrestamoActionPerformed

    private void showPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPrestamoActionPerformed
        frmShowRecursos showPrestamo = new frmShowRecursos(this, prestamoP);
        this.setVisible(false);
        showPrestamo.setVisible(true);
    }//GEN-LAST:event_showPrestamoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addLibro;
    private javax.swing.JMenuItem addPrestamo;
    private javax.swing.JMenuItem addProyectos;
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu menuAlumnos;
    private javax.swing.JMenuBar menuBarraNavegacion;
    private javax.swing.JMenu menuLibro;
    private javax.swing.JMenu menuPrestamo;
    private javax.swing.JMenuItem showAlumnos;
    private javax.swing.JMenuItem showLibro;
    private javax.swing.JMenuItem showPrestamo;
    // End of variables declaration//GEN-END:variables
}