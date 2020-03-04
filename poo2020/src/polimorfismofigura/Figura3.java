package polimorfismofigura;

public  abstract class Figura3 {
    // Definición de atributos protegidos para que puedan ser heredados
    protected String nomFigura;
    protected double area;

    public void setNomFigura(String nomFigura) {
        this.nomFigura = nomFigura;
    }

    public double getArea() {
        return area;
    }

    public String getNomFigura() {
        return nomFigura;
    }

    public abstract void calcularArea();
}
