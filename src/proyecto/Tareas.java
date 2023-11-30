package proyecto;

public class Tareas
{
    private String title;
    private boolean disp;
    private int pages;
    private String code;
    private Tareas next;

    public Tareas(String title, boolean disp, int pages, String code)
    {
        this.title = title;
        this.disp = disp;
        this.pages = pages;
        this.code = code;
        this.next = null;
    }

    public Tareas(String code)
    {
        this.code = code;
    }

    public Tareas()
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

    public Tareas getNext()
    {
        return next;
    }

    public void setNext(Tareas next)
    {
        this.next = next;
    }
    
    public void push (String title, boolean disp, int pages, String code)
    {
        Tareas node = new Tareas(title, disp, pages, code);
        
        if(next == null)
            next = node;
        else
        {
            Tareas aux = next;
            next = node;
            node.setNext(aux);
        }
    }
    
    public String traverseStack()
    {
        Tareas aux = next;
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
        Tareas aux = next;
        
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