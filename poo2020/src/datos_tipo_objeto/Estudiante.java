package datos_tipo_objeto;

public class Estudiante {
    // Atributos propios de la clase
    private String nombre;
    private String cedula;
    private int edad;
    private String carrera;
    private String correo;

    /**
     * Constructor normal
     */
    public Estudiante(){

    }

    /**
     * Constructor con todas las variables
     * @param nombre
     * @param cedula
     * @param edad
     * @param carrera
     * @param correo
     */
    public Estudiante(String nombre, String cedula, int edad, String carrera, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.carrera = carrera;
        this.correo = correo;
    }

    /**
     * Sobrecarga de constructor que contiene solo un atributo
     * @param nombre
     */
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
