package proyecto;

public class Recursos
{
    private String nombre;
    private int Dispon;
    private String proy;
    private String Ubi;
    private int Costo;
    private Recursos next;

    public Recursos(String nombre, int Dispon, String proy, String Ubi, int Costo)
    {
        this.nombre = nombre;
        this.Dispon = Dispon;
        this.proy = proy;
        this.Ubi = Ubi;
        this.Costo = Costo;
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

    

    public Recursos getNext()
    {
        return next;
    }

    public void setNext(Recursos next)
    {
        this.next = next;
    }  
}