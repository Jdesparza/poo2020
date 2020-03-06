package polimorfismoinversionistas;

public abstract class ClientesInversionistas {
    // Definicion de atributos protegidos para que puedan ser heredados
    protected int noCliente;
    protected int noCuenta;
    protected String nombre;
    protected int plazoInversion;
    protected double capInvertido;
    protected double tasaAnual;
    protected double interesGanado;

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

    public double getInteresGanado() {
        return interesGanado;
    }

    /**
     * Método abstracto que sera implementado dentro de las clases hijas
     */
    public abstract void calcularInteresGanado();
}
