package polimorfismoautomotriz;

public class EmpAdmvo extends EmpleadoAutomotriz {
    // Atributos propios de la clase EmpAdmvo
    private double sueldoMensual;

    /**
     * Implementacion del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularSueldoQuincenal() {
        sueldoQuincena = sueldoMensual / 2;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
}
