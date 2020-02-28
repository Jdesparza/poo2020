package herenciafigura;

public class Circulo extends Figura {
    // Atributos propios de la clase Circulo
    private double radio;
    private double area;

    /**
     * Constructor de la clase Circulo
     * @param nombre
     * @param radio
     */
    public Circulo(String nombre, double radio) {
        this.nombre = nombre;
        this.radio = radio;
    }

    /**
     * Método para calcular el area de un circulo
     */
    public void calcularArea(){
        area = Math.PI * Math.pow(radio, 2);
    }

    public void setLado(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }
}
