package matrizpoo;

public class PromedioMatriz {
    // Definir atributos globales
    private int filas;
    private int columnas;
    private int [][] matrizA;
    private int sumaMatriz;
    private double promedioMatriz;
    private int contador;

    /**
     * Para sumar toda la matriz
     */
    public void sumaMatriz(){
        contador = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaMatriz += matrizA[i][j];
                contador += 1;
            }
        }
    }

    /**
     * Para calcular el promedio
     * @return promedioMatriz
     */
    public double promedioSumaMatriz(){
        promedioMatriz = (sumaMatriz / (double) contador);
        return promedioMatriz;
    }

    /**
     * Para presentar la matriz
     * @param matriz
     */
    public void presentarMatriz(int [][] matriz) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    public int getSumaMatriz(){
        return sumaMatriz;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }
}
