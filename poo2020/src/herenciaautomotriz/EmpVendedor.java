package herenciaautomotriz;

public class EmpVendedor extends Empleados {
    // Atributos propios de la clase EmpVendedor
    private int autos;
    private double [] precio;
    private double salarioMinimo;
    double totalPrecio;
    private double sueldoQuincenal;

    /**
     * Constructor de la clase EmpVendedor
     * @param rfc
     * @param nombre
     * @param departamento
     * @param puesto
     * @param autos
     * @param precio
     * @param salarioMinimo
     */
    public EmpVendedor(String rfc, String nombre, String departamento, String puesto, int autos, double [] precio,
                       double salarioMinimo) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.autos = autos;
        this.precio = precio;
        this.salarioMinimo = salarioMinimo;
    }

    /**
     * Método para sumar los precios de cada auto vendido
     */
    public void sumaPrecio() {
        totalPrecio = 0;
        for (int i = 0; i < autos; i++) {
            totalPrecio += precio[i];
        }
    }

    /**
     * Método para calcular el sueldo quincenal
     */
    public void calcularSueldoQuincenal() {
        sueldoQuincenal = salarioMinimo + ((totalPrecio * 2) / 100);
    }

    public void setAutos(int autos) {
        this.autos = autos;
    }

    public void setPrecio(double [] precio) {
        this.precio = precio;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public double getSueldoQuincenal() {
        return sueldoQuincenal;
    }
}
