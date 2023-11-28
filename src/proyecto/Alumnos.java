package proyecto;

public class Alumnos
{
    private String name;
    private String lastname;
    private char genre;
    private int reg;
    private boolean status;
    private Alumnos next;

    public Alumnos(String name, String lastname, char genre, int reg, boolean status)
    {
        this.name = name;
        this.lastname = lastname;
        this.genre = genre;
        this.reg = reg;
        this.status = status;
        this.next = null;
    }

    public Alumnos()
    {
        
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public char getGenre()
    {
        return genre;
    }

    public void setGenre(char genre)
    {
        this.genre = genre;
    }

    public int getReg()
    {
        return reg;
    }

    public void setReg(int reg)
    {
        this.reg = reg;
    }

    public boolean isStatus()
    {
        return status;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

    public Alumnos getNext()
    {
        return next;
    }

    public void setNext(Alumnos next)
    {
        this.next = next;
    }
    
    public void push (String name, String lastname, char genre, int reg, boolean status)
    {
        Alumnos node = new Alumnos(name, lastname, genre, reg, status);
        
        if(next == null)
            next = node;
        else
        {
            Alumnos aux = next;
            next = node;
            node.setNext(aux);
        }
    }
    
    public String traverseStack()
    {
        Alumnos aux = next;
        String text = "";
        
        if(next == null)
            text = "La PILA de ALUMNOS está vacía.";
        else
        {
            text = "Alumnos registrados:";
            while (aux != null) {
                text += "\nNombre: " + aux.getName();
                text += "\nApellido: " + aux.getLastname();
                text += "\nGénero: " + aux.getGenre();
                text += "\nRegistro: " + aux.getReg();
                if (aux.isStatus())
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
        Alumnos aux = next;
        
        if(next == null)
            System.out.println("La PILA de ALUMNOS está vacía.");
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