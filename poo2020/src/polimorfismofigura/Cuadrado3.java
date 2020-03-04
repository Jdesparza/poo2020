package polimorfismofigura;

public class Cuadrado3 extends Figura3 {
    // Atributos propios de la clase Cuadrado3
    private double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularArea() {
        area = Math.pow(lado, 2);
    }
}
