package herenciafigura;

public class Cuadrado extends Figura {
    // Atributos propios de la clase Cuadrado
    private double lado;
    private double area;

    /**
     * Constructor de la clase Cuadrado
     * @param nombre
     * @param lado
     */
    public Cuadrado(String nombre, double lado) {
        this.nombre = nombre;
        this.setLado(lado);
    }

    /**
     * Método para calcular el area de un cuadrado
     */
    public void calcularArea(){
        area = Math.pow(lado, 2);
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return area;
    }
}
