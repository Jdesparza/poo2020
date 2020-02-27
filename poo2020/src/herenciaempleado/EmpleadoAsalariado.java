package herenciaempleado;

public class EmpleadoAsalariado extends Empleado{
    // Atributos propios de la clase EmpleadoAsalariado
    private double valor_mensual;

    public EmpleadoAsalariado(String nombre, String cargo, String dependencia, double valor_mensual) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.valor_mensual = valor_mensual;
    }

    public double getValor_mensual() {
        return valor_mensual;
    }

    public void setValor_mensual(double valor_mensual) {
        this.valor_mensual = valor_mensual;
    }
}
