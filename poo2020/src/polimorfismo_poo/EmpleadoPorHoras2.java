package polimorfismo_poo;

public class EmpleadoPorHoras2 extends Empleado12 {
    // Atributos propios de la clase EmpleadoPorHora2
    private int horasTrab;
    private double cuotaHora;

    // También se extienden los atributos de la clase padre

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

    public void setCuotaHora(double cuotaHora) {
        this.cuotaHora = cuotaHora;
    }

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularSueldoQna() {
        sueldoQna = cuotaHora * horasTrab;
    }
}
