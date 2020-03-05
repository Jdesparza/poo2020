package polimorfismodeudores;

public class PrestamoPersonal extends ClientesDeudor {

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularInteresPagar() {
        tasaAnual = 0.15; // valor establecido por mi
        interesPagar = capPrestado * tasaAnual * plazoInversion; // Formula establecida por mi
    }
}
