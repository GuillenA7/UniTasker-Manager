package proyecto;

public class Lista {
    public Proyectos lista;
    
     public Lista() {
        this.lista = null;
    }
    
    public boolean estaVacia() {
        if(lista == null) {
            return true;
        }
        return false;
    }
    
    public void agregar(String nombre, String descripcion, int diainicio, String mesinicio, int diafin, String mesfin, boolean estado) {
        Proyectos nodo = new Proyectos(nombre, descripcion, diainicio, mesinicio, diafin, mesfin, estado);
        
        if(lista == null)
            lista = nodo;
        else {
            Proyectos aux = lista;
            nodo.setNext(aux);
            lista = nodo;
        }
    }
}   