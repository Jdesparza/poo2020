package herenciadeudores;

public class PrestamoHipotecario extends ClienteDeudor {
    // Atributos propios de la clase PrestamoHipotecario
    private double interesPagar;

    /**
     * Constructor de la clase PrestamoHipotecario
     * @param noCliente
     * @param nombre
     * @param noCuenta
     * @param capPrestado
     * @param plazoInversion
     */
    public PrestamoHipotecario(int noCliente, String nombre, int noCuenta, double capPrestado, int plazoInversion) {
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
        tasaAnual = 0.25; // valor establecido por mi
        interesPagar = capPrestado * tasaAnual * plazoInversion; // Formula establecida por mi
    }

    public double getInteresPagar() {
        return interesPagar;
    }
}
