package polimorfismovolumen;

public class CilindroVolumen extends FiguraVolumen {
    // Atributos Propios de la clase CilindroVolumen
    private double altura;
    private double radio;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularVolumen() {
        volumen = Math.PI * Math.pow(radio, 2) * Math.pow(altura, 2);
    }
}
