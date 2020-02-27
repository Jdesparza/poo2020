package herencia;

/**
 * Clase que hereda de la clase Persona.
 * Contendra todos los atributos y métodos definidos en Persona
 */
public class Administrativo extends Persona{
    // Atributos propios de la clase Administrativo
    private String dependencia;

    /**
     * Método constructor de la clase Administrativo
     * @param nombre
     * @param identificacion
     * @param estado_civil
     * @param fecha_nac
     * @param dependencia
     */
    public Administrativo(String nombre, String identificacion, String estado_civil, String fecha_nac,
                          String dependencia) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.estado_civil = estado_civil;
        this.fecha_nac = fecha_nac;
        this.dependencia = dependencia;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public void gestionar_procesos() {
        System.out.println("Método para gestionar procesos");
    }
}
