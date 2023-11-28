package proyecto;

public class Libro
{
    private String title;
    private boolean disp;
    private int pages;
    private String code;
    private Libro next;

    public Libro(String title, boolean disp, int pages, String code)
    {
        this.title = title;
        this.disp = disp;
        this.pages = pages;
        this.code = code;
        this.next = null;
    }

    public Libro(String code)
    {
        this.code = code;
    }

    public Libro()
    {
        
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public boolean isDisp()
    {
        return disp;
    }

    public void setDisp(boolean disp)
    {
        this.disp = disp;
    }

    public int getPages()
    {
        return pages;
    }

    public void setPages(int pages)
    {
        this.pages = pages;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public Libro getNext()
    {
        return next;
    }

    public void setNext(Libro next)
    {
        this.next = next;
    }
    
    public void push (String title, boolean disp, int pages, String code)
    {
        Libro node = new Libro(title, disp, pages, code);
        
        if(next == null)
            next = node;
        else
        {
            Libro aux = next;
            next = node;
            node.setNext(aux);
        }
    }
    
    public String traverseStack()
    {
        Libro aux = next;
        String text = "";
        
        if(next == null)
            text = "La PILA de LIBROS está vacía.";
        else
        {
            text = "Libros registrados:";
            while (aux != null) {
                text += "\nTítulo: " + aux.getTitle();
                text += "\npPáginas: " + aux.getPages();
                text += "\nCódigo: " + aux.getCode();
                if (aux.isDisp())
                    text += "\nEstá disponible";
                else
                    text += "\nNO está disponible";
                text += "\n----------\n";
                aux = aux.getNext();
            }
        }
        return text;
    }
    
    public void pop()
    {
        Libro aux = next;
        
        if(next == null)
            System.out.println("La PILA de LIBROS está vacía.");
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