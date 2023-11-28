package proyecto;

public class Usuario
{
    private String cuenta;
    private String contrasena;

    public Usuario()
    {
        
    }

    public Usuario(String cuenta, String contrasena)
    {
        this.cuenta = cuenta;
        this.contrasena = contrasena;
    }

    public String getCuenta()
    {
        return cuenta;
    }

    public void setCuenta(String cuenta)
    {
        this.cuenta = cuenta;
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