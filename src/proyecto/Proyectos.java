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
}