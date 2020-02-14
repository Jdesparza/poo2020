package taller_repeticion;

public class SumaRepetitiva {
    //  Declaración de atributos
    private int numA;
    private int numB;
    private int multiplicacion;

    /**
     * Método para calcular la multiplicacion de dos números
     * @return multiplicacion
     */
    public int calcularSumaRepetitiva(){
        for (int contador = 0; contador < numB; contador++) {
            multiplicacion += numA;
        }
        return multiplicacion;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public int getMultiplicacion() {
        return multiplicacion;
    }
}
