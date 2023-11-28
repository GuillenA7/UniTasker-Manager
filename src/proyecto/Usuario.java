package proyecto;

public class Usuario
{
    private String nombre;
    private String contrasena;

    public Usuario()
    {
        
    }

    public Usuario(String cuenta, String contrasena)
    {
        this.nombre = cuenta;
        this.contrasena = contrasena;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getContrasena()
    {
        return contrasena;
    }

    public void setContrasena(String contrasena)
    {
        this.contrasena = contrasena;
    }
}