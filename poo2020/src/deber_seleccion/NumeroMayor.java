package deber_seleccion;

public class NumeroMayor {
    // Declaracion de atributos globales
    private int numA;
    private int numB;
    private int numC;
    private int numD;
    private int numMayor;

    /**
     * Método para actualizar la variable numA
     * @param numA
     */
    public void setNumA(int numA) {
        this.numA = numA;
    }

    /**
     * Método para actualizar la variable numB
     * @param numB
     */
    public void setNumB(int numB) {
        this.numB = numB;
    }

    /**
     * Método para actualizar la variable numC
     * @param numC
     */
    public void setNumC(int numC) {
        this.numC = numC;
    }

    /**
     * Método para actualizar la variable numD
     * @param numD
     */
    public void setNumD(int numD) {
        this.numD = numD;
    }

    /**
     * Método para calcular el número mayor
     * @return numMayor
     */
    public int calcularNumMayor(){
        if ((numA > numB) && (numA > numC) && (numA > numD)) {
            numMayor = numA;
        } else {
            if ((numB > numC) && (numB > numD)) {
                numMayor = numB;
            } else {
                if (numC > numD) {
                    numMayor = numC;
                } else {
                    numMayor = numD;
                }
            }
        }
        return numMayor;
    }

    /**
     * Método para obtener el valor de la variable numMayor
     * @return numMayor
     */
    public int getNumMayor() {
        return numMayor;
    }
}
