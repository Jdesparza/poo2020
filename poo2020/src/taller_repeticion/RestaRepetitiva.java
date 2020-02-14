package taller_repeticion;

public class RestaRepetitiva {
    //  Declaración de atributos
    private int dividendo;
    private int divisor;
    private int division;

    /**
     * Método para calcular la divison de dos números
     * @return divison
     */
    public int calcularSumaRepetitiva(){
        division = 0;
        for (int contador = dividendo; contador > 0; contador-=divisor) {
            dividendo -= divisor;
            division += 1;
        }
        return division;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public int getDivision() {
        return division;
    }
}
