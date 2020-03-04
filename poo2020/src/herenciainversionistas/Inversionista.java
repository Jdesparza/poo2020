package herenciainversionistas;

public class Inversionista {
    // Atributos comunes para todas las clases
    protected int noCliente;
    protected int noCuenta;
    protected String nombre;
    protected int plazoInversion;
    protected double capInvertido;
    protected double tasaAnual;

    public int getNoCliente() {
        return noCliente;
    }

    public void setNoCliente(int noCliente) {
        this.noCliente = noCliente;
    }

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPlazoInversion() {
        return plazoInversion;
    }

    public void setPlazoInversion(int plazoInversion) {
        this.plazoInversion = plazoInversion;
    }

    public double getCapInvertido() {
        return capInvertido;
    }

    public void setCapInvertido(double capInvertido) {
        this.capInvertido = capInvertido;
    }

    public double getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(double tasaAnual) {
        this.tasaAnual = tasaAnual;
    }
}
