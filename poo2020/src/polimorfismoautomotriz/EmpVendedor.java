package polimorfismoautomotriz;

public class EmpVendedor extends EmpleadoAutomotriz {
    // Atributos propios de la clase EmpVendedor
    private int autos;
    private double [] precio;
    private double salarioMinimo;
    private double totalPrecio;

    /**
     * Método para sumar los precios de cada auto vendido
     */
    public void sumaPrecio() {
        totalPrecio = 0;
        for (int i = 0; i < autos; i++) {
            totalPrecio += precio[i];
        }
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

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularSueldoQuincenal() {
        sueldoQuincena = salarioMinimo + ((totalPrecio * 2) / 100);
    }

    public int getAutos() {
        return autos;
    }
}
