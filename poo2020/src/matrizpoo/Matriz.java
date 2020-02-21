package matrizpoo;

public class Matriz {
    // Declaración de atributos globales
    private int [][] matrizA = new int[3][3];
    private int [][] matrizB = new int[3][3];
    private int [][] matrizC = new int[3][3];

    /**
     * Método para sumar la matrizA y la matrizB
     */
    public void sumaMatriz() {
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
    }

    /**
     * Método para presentar los resultados
     * @param matriz
     */
    public void presentarMatriz(int [][] matriz) {
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public int[][] getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    public int[][] getMatrizB() {
        return matrizB;
    }

    public void setMatrizB(int[][] matrizB) {
        this.matrizB = matrizB;
    }

    public int[][] getSuma(){
        return matrizC;
    }
}
