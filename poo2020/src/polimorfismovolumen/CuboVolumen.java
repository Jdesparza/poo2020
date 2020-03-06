package polimorfismovolumen;

public class CuboVolumen extends FiguraVolumen {
    // Atributos propios de la clase CuboVolumen
    private double arista;

    public void setArista(double arista) {
        this.arista = arista;
    }

    /**
     * Implementacion del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularVolumen() {
        volumen = Math.pow(arista, 3);
    }
}
