package proyecto;

public class ListaProyectos {
    private Proyectos proyectosLista;
    private Tareas tareasLista;
    private Recursos recursosLista;
    private Informe informesLista;

    public ListaProyectos() {
        this.proyectosLista = null;
        this.tareasLista = null;
        this.recursosLista = null;
        this.informesLista = null;
    }

    public void push(String nombre, String descripcion, String diainicio, String mesinicio, String diafin, String mesfin, String estado) {
        Proyectos nodo = new Proyectos(nombre, descripcion, diainicio, mesinicio, diafin, mesfin, estado);
        if (this.proyectosLista == null)
            proyectosLista = nodo;
        else {
            nodo.setNext(proyectosLista);
            proyectosLista = nodo;
        }
    }
        
    public void push (String nombre, String proy, String Dispon, String Costo, String Ubi) {
        Recursos node = new Recursos(nombre, proy, Dispon, Costo, Ubi);
        
        if (this.proyectosLista == null)
            recursosLista = node;
        else {
            node.setNext(recursosLista);
            recursosLista = node;
        }
    } 
    public void push (String nombre, String descripcion, String diainicio, String mesinicio, String diafin, String mesfin, String estado, String responsable) {
        Tareas node = new Tareas(nombre, descripcion, diainicio, mesinicio, diafin, mesfin, estado, responsable );
        
        if (this.proyectosLista == null)
            tareasLista = node;
        else {
            node.setNext(tareasLista);
            tareasLista = node;
        }
    }  
    
    public void push (String autor, String informe, String proyecto) {
        Informe node = new Informe(autor, informe, proyecto);
        
        if (this.proyectosLista == null)
            informesLista = node;
        else {
            node.setNext(informesLista);
            informesLista = node;
        }
    } 

    public void popProyectos() {
        if (proyectosLista != null && proyectosLista.getNext() != null)
            proyectosLista = proyectosLista.getNext();
        else
            proyectosLista = null;
    }

    public String recorrerProyectos() {
        Proyectos aux = proyectosLista;
        String datos = "";
    
        while(aux != null) {
            datos += "Proyecto: ";
            datos += "\n\tNombre: " + aux.getNombre();
            datos += "\n\tDescripcion: " + aux.getDescripcion();
            datos += "\n\tEstado: " + aux.getEstado();
            datos += "\n\tDia Inicio: " + aux.getDiaInicio();
            datos += "\n\tMes Inicio: " + aux.getMesinicio();
            datos += "\n\tDia Fin: " + aux.getDiafin();
            datos += "\n\tMes Fin: " + aux.getMesfin() + "\n\n";
            aux = aux.getNext();
        }
        return datos;
    }
    public String recorrerTareas() {
        Tareas aux = tareasLista;
        String datos = "";
    
        while(aux != null) {
            datos += "Tareas: ";
            datos += "\n\tNombre: " + aux.getNombre();
            datos += "\n\tDescripcion: " + aux.getDescripcion();
            datos += "\n\tEstado: " + aux.getEstado();
            datos += "\n\tDia Inicio: " + aux.getDiaInicio();
            datos += "\n\tMes Inicio: " + aux.getMesinicio();
            datos += "\n\tDia Fin: " + aux.getDiafin();
            datos += "\n\tMes Fin: " + aux.getMesfin();
            datos += "\n\tResponsable: " + aux.getResponsable() + "\n\n";
            aux = aux.getNext();
        }
        return datos;
    }
    public String recorrerRecursos() {
        Recursos aux = recursosLista;
        String datos = "";
    
        while(aux != null) {
            datos += "Recursos: ";
            datos += "\n\tNombre: " + aux.getNombre();
            datos += "\n\tDisponibilidad: " + aux.getDispon();
            datos += "\n\tProyecto: " + aux.getProy();
            datos += "\n\tUbicacion: " + aux.getUbi();
            datos += "\n\tCosto: " + aux.getCosto()+ "\n\n";
            aux = aux.getNext();
        }
        return datos;
    }
    public String recorrerInformes() {
        Informe aux = informesLista;
        String datos = "";
    
        while(aux != null) {
            datos += "Informes: ";
            datos += "\nAutor: " + aux.getAutor();
            datos += "\n\tInforme: " + aux.getInforme();
            datos += "\n\tProyecto: " + aux.getProyecto()+ "\n\n";
            aux = aux.getNext();
        }
        return datos;
    }
}