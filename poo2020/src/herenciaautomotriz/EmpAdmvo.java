package herenciaautomotriz;

public class EmpAdmvo extends Empleados {
    // Atributos propios de la clase EmpAdmvo
    private double sueldoMensual;
    private double sueldoQuincena;

    /**
     * Constructor de la clase EmpAdmvo
     * @param rfc
     * @param nombre
     * @param departamento
     * @param puesto
     * @param sueldoMensual
     */
    public EmpAdmvo(String rfc, String nombre, String departamento, String puesto, double sueldoMensual) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.sueldoMensual = sueldoMensual;
    }

    /**
     * Método para calcular el sueldo quincenal
     */
    public void calcularSueldoQuincenal() {
        sueldoQuincena = sueldoMensual / 2;
    }


    public double getSueldoQuincena() {
        return sueldoQuincena;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
}
