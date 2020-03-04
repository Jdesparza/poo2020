package herenciadeudores;

public class PrestamoPersonal extends ClienteDeudor {
    // Atributos propios de la clase PrestamoPersonal
    private double interesPagar;

    /**
     * Constructor de la clase PrestamoPersonal
     * @param noCliente
     * @param nombre
     * @param noCuenta
     * @param capPrestado
     * @param plazoInversion
     */
    public PrestamoPersonal(int noCliente, String nombre, int noCuenta, double capPrestado, int plazoInversion) {
        this.noCliente = noCliente;
        this.nombre = nombre;
        this.noCuenta = noCuenta;
        this.capPrestado = capPrestado;
        this.plazoInversion = plazoInversion;
    }

    /**
     * Método para calcular el interes a pagar
     */
    public void calcularInteresPagar() {
        tasaAnual = 0.15; // valor establecido por mi
        interesPagar = capPrestado * tasaAnual * plazoInversion; // Formula establecida por mi
    }

    public double getInteresPagar() {
        return interesPagar;
    }
}
