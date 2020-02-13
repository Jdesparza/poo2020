package deber_seleccion;

public class Empleado {
    // Definir atributos globales
    private String nombre;
    private int horas;
    private double cuota;
    private double sueldo;

    /**
     * Método para actualizar la variable nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para actualizar la variable horas
     * @param horas
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * Método para actualizar la variable cuota
     * @param cuota
     */
    public void setCuota(double cuota) {
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
            if (horas <= 50) {
                sueldo = (40 * cuota) + ((horas - 40) * (cuota * 2));
            } else {
                sueldo = (40 * cuota) + (10 * cuota * 2) + ((horas - 50) * (cuota * 3));
            }
        }
        return sueldo;
    }

    /**
     *  Método para obtener el valor de la variable nombre
     * @return this.nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener el valor de la variable sueldo
     * @return this.sueldo
     */
    public double getSueldo() {
        return sueldo;
    }
}
