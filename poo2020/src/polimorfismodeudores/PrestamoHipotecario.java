package polimorfismodeudores;

public class PrestamoHipotecario extends ClientesDeudor {

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularInteresPagar() {
        tasaAnual = 0.25; // valor establecido por mi
        interesPagar = capPrestado * tasaAnual * plazoInversion; // Formula establecida por mi
    }
}
