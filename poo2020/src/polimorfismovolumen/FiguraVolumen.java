package polimorfismovolumen;

public abstract class FiguraVolumen {
    // Definición de atributos protegidos para que puedan ser heredados
    protected String nombre;
    protected double volumen;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVolumen() {
        return volumen;
    }

    /**
     * Método abstracto que sera implementado dentro de las clases hijas
     */
    public abstract void calcularVolumen();
}
