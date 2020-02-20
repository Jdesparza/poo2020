package arreglos_poo;

public class Vectores {
    // Declaracion de atributos globales
    private int [] vectorA = new int[10];
    private int [] vectorB = new int[10];
    private int sumatoriaProducto;

    /**
     * Método para presentar los vectores
     */
    public void presentar(){
        for (int i = 0; i < vectorA.length; i++) {
            System.out.println("\t"+vectorA[i]+"\t"+vectorB[i]);
        }
    }

    public int[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(int[] vectorA) {
        this.vectorA = vectorA;
    }

    public int[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(int[] vectorB) {
        this.vectorB = vectorB;
    }

    /**
     * Método para calcular el producto de los vectores
     * @return sumatoriaProducto
     */
    public int calcularSumatoriaProducto(){
        sumatoriaProducto = 0;
        for (int i = 0; i < vectorA.length; i++){
            sumatoriaProducto += (vectorA[i] * vectorB[i]);
        }
        return sumatoriaProducto;
    }

    /**
     * Método para obtener el valor de la variable sumatoriaProducto
     * @return sumatoriaProducto
     */
    public int getSumatoriaProducto(){
        return sumatoriaProducto;
    }
}
