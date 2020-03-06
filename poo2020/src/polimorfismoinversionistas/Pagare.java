package polimorfismoinversionistas;

public class Pagare extends ClientesInversionistas {

    /**
     * Implementacion del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularInteresGanado() {
        tasaAnual = 0.25; // valor establecido por mi
        interesGanado = capInvertido * tasaAnual * plazoInversion; // Formula establecida por mi
    }
}
