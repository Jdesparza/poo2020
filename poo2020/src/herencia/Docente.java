package herencia;

/**
 * Clase que hereda de la clase Persona.
 * Contendra todos los atributos y métodos definidos en Persona
 */
public class Docente extends Persona{
    // Atributos propios de la clase Docente
    private String area;

    /**
     * Método constructor de la clase Docente
     * @param nombre
     * @param identificacion
     * @param estado_civil
     * @param fecha_nac
     * @param area
     */
    public Docente(String nombre, String identificacion, String estado_civil, String fecha_nac, String area) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.estado_civil = estado_civil;
        this.fecha_nac = fecha_nac;
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void enseniar() {
        System.out.println("Método para enseñar");
    }

    public void calificar() {
        System.out.println("Método para calificar");
    }
}
