package herenciaautomotriz;

public class EmpMecanico extends Empleados {
    // Atributos propios de la clase EmpMecanico
    private int trabajos;
    private double [] precio;
    private double totalPrecio;
    private double sueldoQuincenal;

    /**
     * Constructor de la clase EmpMecanico
     * @param rfc
     * @param nombre
     * @param departamento
     * @param puesto
     * @param trabajos
     * @param precio
     */
    public EmpMecanico(String rfc, String nombre, String departamento, String puesto, int trabajos, double [] precio) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.trabajos = trabajos;
        this.precio = precio;
    }

    /**
     * Método para sumar los precios de todos los trabajos
     */
    public void sumaPrecio() {
        totalPrecio = 0;
        for (int i = 0; i < trabajos; i++) {
            totalPrecio += precio[i];
        }
    }

    /**
     * Método para calcular el sueldo quincenal
     */
    public void calcularSueldoQuincenal() {
        sueldoQuincenal = (totalPrecio * 4) / 100;
    }

    public void setTrabajos(int trabajos) {
        this.trabajos = trabajos;
    }


    public double getSueldoQuincenal() {
        return sueldoQuincenal;
    }

    public void setPrecio(double[] precio) {
        this.precio = precio;
    }
}
