package proyecto;

/**
 *
 * @author Usuario
 */
public class Informe {
    private String autor;
    private String informe;
    private String proyecto;
    private Informe next;

    public Informe(String autor, String informe, String proyecto) {
        this.autor = autor;
        this.informe = informe;
        this.proyecto = proyecto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public Informe getNext() {
        return next;
    }

    public void setNext(Informe next) {
        this.next = next;
    }
    
    
}
