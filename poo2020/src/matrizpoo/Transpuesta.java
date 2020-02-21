package matrizpoo;

public class Transpuesta {
    private int [][] original = new int [1000][1000];//Matriz original
    private int [][] transpusta = new int [original[0].length][original.length];//Matriz Transpuesta
    //contadores
    int i;
    int j;

    public int[][] getOriginal() {//Metodo obtener la matriz original
        return original;
    }

    public void setOriginal(int[][] original) {//Metodo para actualizar a la matriz original
        this.original = original;
    }
    public void calcularTranspuesta(){//Metodo para transponer a la matriz
        for(i = 0; i<original.length;i++){
            for(j =0; j<original[i].length;j++){
                transpusta[j][i]=original[i][j];
            }
        }
    }
    public int [][] obtenerTranspuesta(){//Meotodo para retornar la matriz trasnpuesta
        return transpusta;
    }
    public void obtenermatrizoriginal(int [][] matriz){
        //Metodo para mostrar la matriz original
        for (i=0; i<original.length;i++){
            for (j=0; j<original[i].length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public void obtenermatriztranspuesta(int [][] matriz){//Metodo para mostrar la matriz Tranaspuesta
        for (i=0; i<original[i].length;i++){
            for (j=0; j<original.length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
