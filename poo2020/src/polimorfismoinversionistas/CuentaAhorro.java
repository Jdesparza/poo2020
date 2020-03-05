package polimorfismoinversionistas;

public class CuentaAhorro extends ClientesInversionistas {

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularInteresGanado() {
        tasaAnual = 0.35; // valor establecido por mi
        interesGanado = capInvertido * tasaAnual * plazoInversion; // Formula establecida por mi
    }
}
