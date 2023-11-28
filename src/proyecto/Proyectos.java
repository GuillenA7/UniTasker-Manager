package proyecto;

public class Proyectos
{
    private String nombre;
    private String descripcion;
    private boolean estado;
    private Proyectos next;
    private int diainicio;
    private String mesinicio;
    private int diafin;
    private String mesfin;

    public Proyectos(String nombre, String descripcion, int diainicio, String mesinicio, int diafin, String mesfin, boolean estado)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.diainicio = diainicio;
        this.mesinicio = mesinicio;
        this.diafin = diafin;
        this.mesfin = mesfin;
        this.estado = estado;
        this.next = null;
    }

    public Proyectos()
    {
        
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public int getDiainicio() {
        return diainicio;
    }

    public void setDiainicio(int diainicio) {
        this.diainicio = diainicio;
    }

    public String getMesinicio() {
        return mesinicio;
    }

    public void setMesinicio(String mesinicio) {
        this.mesinicio = mesinicio;
    }

    public int getDiafin() {
        return diafin;
    }

    public void setDiafin(int diafin) {
        this.diafin = diafin;
    }

    public String getMesfin() {
        return mesfin;
    }

    public void setMesfin(String mesfin) {
        this.mesfin = mesfin;
    }

    public boolean isEstado()
    {
        return estado;
    }

    public void setEstado(boolean estado)
    {
        this.estado = estado;
    }

    public Proyectos getNext()
    {
        return next;
    }

    public void setNext(Proyectos next)
    {
        this.next = next;
    }
    
    public void push (String nombre, String descripcion, int diainicio, String mesinicio, int diafin, String mesfin, boolean estado)
    {
        Proyectos node = new Proyectos(nombre, descripcion, diainicio, mesinicio, diafin, mesfin, estado);
        
        if(next == null)
            next = node;
        else
        {
            Proyectos aux = next;
            next = node;
            node.setNext(aux);
        }
    }
    
    public String traverseStack()
    {
        Proyectos aux = next;
        String text = "";
        
        if(next == null)
            text = "La PILA de PROYECTOS está vacía.";
        else
        {
            text = "Proyecto registrado:";
            while (aux != null) {
                text += "\nNombre: " + aux.getNombre();
                text += "\nDescripción: " + aux.getDescripcion();
                text += "\nDia de inicio: " + aux.getDiainicio();
                text += "\nMes de inicio: " + aux.getMesinicio();
                text += "\nDia de Finalización: " + aux.getDiafin();
                text += "\nMes de Finalización: " + aux.getMesfin();
                if (aux.isEstado())
                    text += "\nEstado: Activo";
                else
                    text += "\nEstado: Inactivo";
                text += "\n----------\n";
                aux = aux.getNext();
            }
        }
        return text;
    }
    
    public void pop()
    {
        Proyectos aux = next;
        
        if(next == null)
            System.out.println("La PILA de PROYECTOS está vacía.");
        else
        {
            if(aux.getNext() == null)
                next = null;
            else
                next = aux.getNext();
            System.out.println("Primer elemento eliminado.");
        }
    }
}