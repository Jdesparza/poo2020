package polimorfismo_poo;

public class EmpleadoAsalariado2 extends Empleado12 {
    // Atributos propios de la clase EmpleadoAsalariado2
    private double sueldoMensual;


    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularSueldoQna() {
        sueldoQna = sueldoMensual / 2;
    }
}
