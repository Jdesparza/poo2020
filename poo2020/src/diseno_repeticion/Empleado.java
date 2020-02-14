package diseno_repeticion;

public class Empleado {
    // Declaración de atributos globales
    private String nombre;
    private int horas;
    private double cuota;
    private double sueldo;

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    /**
     * Método para calcular el sueldo del empleado
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
     * Primer Método constructor de la clase Empleado
     * @param nombre
     * @param horas
     * @param cuota
     */
    public Empleado(String nombre, int horas, double cuota){
        this.nombre = nombre;
        this.horas = horas;
        this.setCuota(cuota);
    }

    /**
     * Segundo Método constructor de la clase Empleado
     * @param nombre
     * @param horas
     */
    public Empleado(String nombre, int horas){
        this.nombre = nombre;
        this.horas = horas;
    }


    public void setCuota(double cuota) {
        this.cuota = cuota;
    }
}
