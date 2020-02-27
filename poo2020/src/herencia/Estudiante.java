package herencia;

/**
 * Clase que hereda de la clase Persona.
 * Contendra todos los atributos y métodos definidos en Persona
 */
public class Estudiante extends  Persona{
    // Atributos propios de la clase Estudiante
    private String carrera;

    /**
     * COnstructor de la clase Estudiante
     * @param carrera
     * @param nombre
     * @param identificacion
     * @param estado_civil
     * @param fecha_nac
     */
    public Estudiante(String carrera, String nombre, String identificacion, String estado_civil, String fecha_nac) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.identificacion = identificacion;
        this.estado_civil = estado_civil;
        this.fecha_nac = fecha_nac;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void matricular(){
        System.out.println("Método para matricular");
    }

    public void aprender() {
        System.out.println("método para aprender");
    }


}
