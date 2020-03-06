package polimorfismovolumen;

public class EsferaVolumen extends FiguraVolumen {
    // Atributos propios de la clase Cono
    private double radio;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Implementacion del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularVolumen() {
        volumen = (Math.PI * Math.pow(radio, 3)) *  4/3;
    }
}
