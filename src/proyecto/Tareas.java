package proyecto;

public class Tareas
{
    private String nombre;
    private String descripcion;
    private String estado;
    private Tareas next;
    private String diainicio;
    private String mesinicio;
    private String diafin;
    private String mesfin;
    private String responsable;

    public Tareas(String nombre, String descripcion, String diainicio, String mesinicio, String diafin, String mesfin, String estado,String responsable)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.diainicio = diainicio;
        this.mesinicio = mesinicio;
        this.diafin = diafin;
        this.mesfin = mesfin;
        this.estado = estado;
        this.responsable = responsable;
        this.next = null;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public Tareas()
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

    public String getDiaInicio() {
        return diainicio;
    }

    public void setDiaInicio(String diainicio) {
        this.diainicio = diainicio;
    }

    public String getMesinicio() {
        return mesinicio;
    }

    public void setMesinicio(String mesinicio) {
        this.mesinicio = mesinicio;
    }

    public String getDiafin() {
        return diafin;
    }

    public void setDiafin(String diafin) {
        this.diafin = diafin;
    }

    public String getMesfin() {
        return mesfin;
    }

    public void setMesfin(String mesfin) {
        this.mesfin = mesfin;
    }

    public String getEstado()
    {
        return estado;
    }

    public void setEstado(String estado)
    {
        this.estado = estado;
    }

    public Tareas getNext()
    {
        return next;
    }

    public void setNext(Tareas next)
    {
        this.next = next;
    }
}