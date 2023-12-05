package proyecto;

public class Recursos
{
    private String nombre;
    private String proy;
    private int Dispon;
    private int Costo;
    private String Ubi;
    private Recursos next;
    private int numNodes;

    public Recursos(String nombre, String proy, int Dispon, int Costo, String Ubi)
    {
        this.nombre = nombre;
        this.Dispon = Dispon;
        this.proy = proy;
        this.Ubi = Ubi;
        this.Costo = Costo;
        this.numNodes = 0;
        this.next = null;
    }

    public Recursos()
    {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDispon() {
        return Dispon;
    }

    public void setDispon(int Dispon) {
        this.Dispon = Dispon;
    }

    public String getProy() {
        return proy;
    }

    public void setProy(String proy) {
        this.proy = proy;
    }

    public String getUbi() {
        return Ubi;
    }

    public void setUbi(String Ubi) {
        this.Ubi = Ubi;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public int getNumNodes() {
        return numNodes;
    }

    public void setNumNodes(int numNodes) {
        this.numNodes = numNodes;
    }
    
    public Recursos getNext() {
        return next;
    }

    public void setNext(Recursos next) {
        this.next = next;
    }
    
    public void push (String nombre, String proy, int Dispon, int Costo, String Ubi) {
        Recursos node = new Recursos(nombre, proy, Dispon, Costo, Ubi);
        
        if(next == null)
            next = node;
        else {
            Recursos aux = next;
            next = node;
            node.setNext(aux);
        }
        numNodes ++;
    }
    
    public String traverseStack() {
        Recursos aux = next;
        String text = "";
        
        if(next == null)
            text = "La PILA de RECURSOS está vacía.";
        else {
            text = "Alumnos registrados:";
            while (aux != null) {
                text += "\nNombre: " + aux.getNombre();
                text += "\nProyecto asignado: " + aux.getProy();
                text += "\nDisposicion: " + aux.getDispon();
                text += "\nCosto: " + aux.getCosto();
                text += "\nUbicacion: " + aux.getUbi();
                text += "\n----------\n";
                aux = aux.getNext();
            }
        }
        return text;
    }
    
    public Recursos[] recorrerPila() {
        Recursos[] alumnos = new Recursos[numNodes];
        Recursos aux = next;
        int i = 0;
        
        while(aux != null) {
            alumnos[i] = aux;
            aux = aux.getNext();
            i++;
        }
        return alumnos;
    }
}