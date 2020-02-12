package disenio_seleccion;

public class Empleado {
    // Definir atributos globales
    private String nombre;
    private double horas;
    private double cuota;
    private double sueldo;

    /**
     * Método para actualizar nombre
     * @param nombre
     */
    public void establecerNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Método para actualizar horas
     * @param horas
     */
    public void establecerHoras(double horas){
        this.horas = horas;
    }

    /**
     * Método para actualizar cuota
     * @param cuota
     */
    public void establecerCuota(double cuota){
        this.cuota = cuota;
    }

    /**
     * Método para calcular el sueldo del Empleado
     * @return sueldo
     */
    public double calcularSueldo(){
        if (horas <= 40) {
            sueldo = horas * cuota;
        } else {
            sueldo = (40 * cuota) + ((horas - 40) * (cuota * 2));
        }
        return sueldo;
    }

    /**
     *  Método para obtener nombre
     * @return this.nombre
     */
    public String obtenerNombre(){
        return this.nombre;
    }

    /**
     * Método para obtener sueldo
     * @return this.sueldo
     */
    public double obtenerSueldo(){
        return this.sueldo;
    }
}
