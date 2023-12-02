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
}