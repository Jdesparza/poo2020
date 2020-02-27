package herenciaempleado;

public class EmpleadoPorHora extends Empleado{
    // Atributos propios de la clase EmpleadoPorHora
    private int horas;
    private double cuota;
    private double sueldo;

    /**
     * Constructor de la clase EmpleadoPorHora
     * @param horas
     * @param cuota
     */
    public EmpleadoPorHora(String nombre, String cargo, String dependencia, int horas, double cuota) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.horas = horas;
        this.cuota = cuota;
    }

    /**
     * Método para calcular el sueldo
     */
    public void calcularSueldo() {
        sueldo = (horas * cuota);
    }

    public int getHoras() {
        return horas;
    }

    public double getCuota() {
        return cuota;
    }

    public double getSueldo() {
        return sueldo;
    }
}
