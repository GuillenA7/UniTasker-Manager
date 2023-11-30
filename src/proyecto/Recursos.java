package proyecto;

public class Recursos
{
    private int reg;
    private int egressDay;
    private String egressMonth;
    private int entryDay;
    private String entryMonth;
    private float fees;
    private Recursos next;

    public Recursos(int reg, int egressDay, String egressMonth, int entryDay, String entryMonth, float fees)
    {
        this.reg = reg;
        this.egressDay = egressDay;
        this.egressMonth = egressMonth;
        this.entryDay = entryDay;
        this.entryMonth = entryMonth;
        this.fees = fees;
        this.next = null;
    }

    public Recursos()
    {
        
    }

    public int getReg()
    {
        return reg;
    }

    public void setReg(int reg)
    {
        this.reg = reg;
    }
    
    public int getEgressDay()
    {
        return egressDay;
    }

    public void setEgressDay(int egressDay)
    {
        this.egressDay = egressDay;
    }

    public String getEgressMonth()
    {
        return egressMonth;
    }

    public void setEgressMonth(String egressMonth)
    {
        this.egressMonth = egressMonth;
    }

    public int getEntryDay()
    {
        return entryDay;
    }

    public void setEntryDay(int entryDay)
    {
        this.entryDay = entryDay;
    }

    public String getEntryMonth()
    {
        return entryMonth;
    }

    public void setEntryMonth(String entryMonth)
    {
        this.entryMonth = entryMonth;
    }

    public float getFees()
    {
        return fees;
    }

    public void setFees(float fees)
    {
        this.fees = fees;
    }

    public Recursos getNext()
    {
        return next;
    }

    public void setNext(Recursos next)
    {
        this.next = next;
    }  
    
    public void push (int reg, int egressDay, String egressMonth, int entryDay, String entryMonth, float fees)
    {
        Recursos node = new Recursos(reg, egressDay, egressMonth, entryDay, entryMonth, fees);
        
        if(next == null)
            next = node;
        else
        {
            Recursos aux = next;
            next = node;
            node.setNext(aux);
        }
    }
    
    public String traverseStack()
    {
        Recursos aux = next;
        String text = "";
        
        if(next == null)
            text = "La PILA de PRÉSTAMOS está vacía.";
        else
        {
            text = "Préstamos registrados:";
            while (aux != null) {
                text += "\nRegistro del estudiante: " + aux.getReg();
                text += "\nDía de salida del libro: " + aux.getEgressDay();
                text += "\nMes de salida del libro: " + aux.getEgressMonth();
                text += "\nDía de entrada del libro: " + aux.getEntryDay();
                text += "\nMes de entrada del libro: " + aux.getEntryMonth();
                text += "\nMulta por día de retraso: " + aux.getFees();
                text += "\n----------\n";
                aux = aux.getNext();
            }
        }
        return text;
    }
    
    public void pop()
    {
        Recursos aux = next;
        
        if(next == null)
            System.out.println("La PILA de PRÉSTAMOS está vacía.");
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