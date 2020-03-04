package herenciainversionistas;

public class CuentaAhorro extends Inversionista {
    // Atributos propios de la clase CuentaAhorro
    private double interesGanado;

    /**
     * Constructor de la clase CuentaAhorro
     * @param noCliente
     * @param nombre
     * @param noCuenta
     * @param capInvertido
     * @param plazoInversion
     */
    public CuentaAhorro(int noCliente, String nombre, int noCuenta, double capInvertido,
                        int plazoInversion) {
        this.noCliente = noCliente;
        this.nombre = nombre;
        this.noCuenta = noCuenta;
        this.capInvertido = capInvertido;
        this.plazoInversion = plazoInversion;
    }

    /**
     * Método para calcular el interes ganado
     */
    public void calcularInteresGanado() {
        tasaAnual = 0.35; // valor establecido por mi
        interesGanado = capInvertido * tasaAnual * plazoInversion; // Formula establecida por mi
    }

    public double getInteresGanado() {
        return interesGanado;
    }
}
