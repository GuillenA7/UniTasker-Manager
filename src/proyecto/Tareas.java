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
}