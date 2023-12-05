package proyecto;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class frmMenu extends javax.swing.JFrame
{
    
    private frmIngreso ingreso;
    
    public frmMenu(String usr, frmIngreso ingreso)
    {
        setIconImage(new ImageIcon(getClass().getResource("/icons/Icon.png")).getImage());
        
        initComponents();
        
        this.ingreso = ingreso;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
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
        addInforme = new javax.swing.JMenuItem();
        showInforme = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenu();
        jSalir = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.png"))); // NOI18N

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menuAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/storage_file_office_document_documents_extension_folder_icon_256872.png"))); // NOI18N
        menuAlumnos.setText("Proyectos");

        addProyectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/square_plus_icon_251998.png"))); // NOI18N
        addProyectos.setText("Nuevo Proyecto");
        addProyectos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProyectosActionPerformed(evt);
            }
        });
        menuAlumnos.add(addProyectos);

        showProyectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eye_line_icon_235423.png"))); // NOI18N
        showProyectos.setText("Mostrar");
        showProyectos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showProyectosActionPerformed(evt);
            }
        });
        menuAlumnos.add(showProyectos);

        menuBarraNavegacion.add(menuAlumnos);

        menuTareas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/document_file_icon_256882.png"))); // NOI18N
        menuTareas.setText("Tareas");

        addTareas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/square_plus_icon_251998.png"))); // NOI18N
        addTareas.setText("Agregar Tarea");
        addTareas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTareasActionPerformed(evt);
            }
        });
        menuTareas.add(addTareas);

        showTareas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eye_line_icon_235423.png"))); // NOI18N
        showTareas.setText("Mostrar");
        showTareas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTareasActionPerformed(evt);
            }
        });
        menuTareas.add(showTareas);

        menuBarraNavegacion.add(menuTareas);

        menuRecurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rocket_launch_icon_251995.png"))); // NOI18N
        menuRecurso.setText("Recursos");

        addRecurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/square_plus_icon_251998.png"))); // NOI18N
        addRecurso.setText("Agregar Recursos");
        addRecurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecursoActionPerformed(evt);
            }
        });
        menuRecurso.add(addRecurso);

        showRecurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eye_line_icon_235423.png"))); // NOI18N
        showRecurso.setText("Mostrar");
        showRecurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showRecursoActionPerformed(evt);
            }
        });
        menuRecurso.add(showRecurso);

        menuBarraNavegacion.add(menuRecurso);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/notes_icon_251990.png"))); // NOI18N
        jMenu3.setText("Informes");

        addInforme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/square_plus_icon_251998.png"))); // NOI18N
        addInforme.setText("Crear Informe");
        addInforme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInformeActionPerformed(evt);
            }
        });
        jMenu3.add(addInforme);

        showInforme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eye_line_icon_235423.png"))); // NOI18N
        showInforme.setText("Mostrar");
        showInforme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showInformeActionPerformed(evt);
            }
        });
        jMenu3.add(showInforme);

        menuBarraNavegacion.add(jMenu3);

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu_icon_251951.png"))); // NOI18N
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/square_delete_remove_icon_251967.png"))); // NOI18N
        jSalir.setText("Salir");
        jSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        Salir.add(jSalir);

        menuBarraNavegacion.add(Salir);

        setJMenuBar(menuBarraNavegacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
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
        frmShowProyectos proyecto = new frmShowProyectos();
        
        jDesktopPane1.add(proyecto);
        
        proyecto.show();
    }//GEN-LAST:event_showProyectosActionPerformed

    private void addTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTareasActionPerformed
        frmAddTareas tareas = new frmAddTareas();
        
        jDesktopPane1.add(tareas);
        
        tareas.show();
    }//GEN-LAST:event_addTareasActionPerformed

    private void showTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTareasActionPerformed
        frmShowTareas tareas = new frmShowTareas();
        
        jDesktopPane1.add(tareas);
        
        tareas.show();
    }//GEN-LAST:event_showTareasActionPerformed

    private void addRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecursoActionPerformed
        frmAddRecursos recursos = new frmAddRecursos();
        
        jDesktopPane1.add(recursos);
        
        recursos.show();
    }//GEN-LAST:event_addRecursoActionPerformed

    private void showRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showRecursoActionPerformed
        frmShowRecursos recursos = new frmShowRecursos();
        
        jDesktopPane1.add(recursos);
        
        recursos.show();
    }//GEN-LAST:event_showRecursoActionPerformed

    private void addInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInformeActionPerformed
        frmAddInforme recursos = new frmAddInforme();
        
        jDesktopPane1.add(recursos);
        
        recursos.show();
    }//GEN-LAST:event_addInformeActionPerformed

    private void showInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showInformeActionPerformed
        frmShowInforme recursos = new frmShowInforme();
        
        jDesktopPane1.add(recursos);
        
        recursos.show();
    }//GEN-LAST:event_showInformeActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Salir;
    private javax.swing.JMenuItem addInforme;
    private javax.swing.JMenuItem addProyectos;
    private javax.swing.JMenuItem addRecurso;
    private javax.swing.JMenuItem addTareas;
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem jSalir;
    private javax.swing.JMenu menuAlumnos;
    private javax.swing.JMenuBar menuBarraNavegacion;
    private javax.swing.JMenu menuRecurso;
    private javax.swing.JMenu menuTareas;
    private javax.swing.JMenuItem showInforme;
    private javax.swing.JMenuItem showProyectos;
    private javax.swing.JMenuItem showRecurso;
    private javax.swing.JMenuItem showTareas;
    // End of variables declaration//GEN-END:variables

    private JDesktopPane JDesktopPane() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}