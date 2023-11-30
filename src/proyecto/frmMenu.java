package proyecto;

public class frmMenu extends javax.swing.JFrame
{

    private frmIngreso ingreso;
    
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
        showProyectos = new javax.swing.JMenuItem();
        menuTareas = new javax.swing.JMenu();
        addTareas = new javax.swing.JMenuItem();
        showTareas = new javax.swing.JMenuItem();
        menuRecurso = new javax.swing.JMenu();
        addRecurso = new javax.swing.JMenuItem();
        showRecurso = new javax.swing.JMenuItem();
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

        showProyectos.setText("Mostrar");
        showProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showProyectosActionPerformed(evt);
            }
        });
        menuAlumnos.add(showProyectos);

        menuBarraNavegacion.add(menuAlumnos);

        menuTareas.setText("Tareas");

        addTareas.setText("Registrar");
        addTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTareasActionPerformed(evt);
            }
        });
        menuTareas.add(addTareas);

        showTareas.setText("Mostrar");
        showTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTareasActionPerformed(evt);
            }
        });
        menuTareas.add(showTareas);

        menuBarraNavegacion.add(menuTareas);

        menuRecurso.setText("Recursos");

        addRecurso.setText("Registrar");
        addRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecursoActionPerformed(evt);
            }
        });
        menuRecurso.add(addRecurso);

        showRecurso.setText("Mostrar");
        showRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showRecursoActionPerformed(evt);
            }
        });
        menuRecurso.add(showRecurso);

        menuBarraNavegacion.add(menuRecurso);

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
        frmAddProyectos proyecto = new frmAddProyectos();
        
        jDesktopPane1.add(proyecto);
        
        proyecto.show();
    }//GEN-LAST:event_addProyectosActionPerformed

    private void showProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showProyectosActionPerformed
        frmShowProyectos showAlumnos = new frmShowProyectos(this, alumnosP);
        
        showAlumnos.setVisible(true);
    }//GEN-LAST:event_showProyectosActionPerformed

    private void addTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTareasActionPerformed
        frmAddTareas tareas = new frmAddTareas();
        
        jDesktopPane1.add(tareas);
        
        tareas.show();
    }//GEN-LAST:event_addTareasActionPerformed

    private void showTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTareasActionPerformed
        frmShowTarea showLibro = new frmShowTarea(this, libroP);
        
        showLibro.setVisible(true);
    }//GEN-LAST:event_showTareasActionPerformed

    private void addRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecursoActionPerformed
        frmAddRecursos recursos = new frmAddRecursos();
        
        jDesktopPane1.add(recursos);
        
        recursos.show();
    }//GEN-LAST:event_addRecursoActionPerformed

    private void showRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showRecursoActionPerformed
        frmShowRecursos showPrestamo = new frmShowRecursos(this, prestamoP);
        
        showPrestamo.setVisible(true);
    }//GEN-LAST:event_showRecursoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addProyectos;
    private javax.swing.JMenuItem addRecurso;
    private javax.swing.JMenuItem addTareas;
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu menuAlumnos;
    private javax.swing.JMenuBar menuBarraNavegacion;
    private javax.swing.JMenu menuRecurso;
    private javax.swing.JMenu menuTareas;
    private javax.swing.JMenuItem showProyectos;
    private javax.swing.JMenuItem showRecurso;
    private javax.swing.JMenuItem showTareas;
    // End of variables declaration//GEN-END:variables
}