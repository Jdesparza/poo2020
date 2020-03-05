package polimorfismoautomotriz;

public class EmpMecanico extends EmpleadoAutomotriz {
    // Atributos propios de la clase EmpMecanico
    private int trabajos;
    private double [] precio;
    private double totalPrecio;

    /**
     * Método para sumar los precios de todos los trabajos
     */
    public void sumaPrecio() {
        totalPrecio = 0;
        for (int i = 0; i < trabajos; i++) {
            totalPrecio += precio[i];
        }
    }

    public void setTrabajos(int trabajos) {
        this.trabajos = trabajos;
    }


    public void setPrecio(double[] precio) {
        this.precio = precio;
    }

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularSueldoQuincenal() {
        sueldoQuincena = (totalPrecio * 4) / 100;
    }

    public int getTrabajos() {
        return trabajos;
    }
}
