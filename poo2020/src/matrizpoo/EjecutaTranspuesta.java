package matrizpoo;

import java.util.Scanner;

public class EjecutaTranspuesta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese tamano de filas");
        int f = scan.nextInt();
        System.out.println("Ingrese tamano de columnas");
        int c = scan.nextInt();
        int [][] original = new int [f][c];//Solo se necesita la matriz original
        //contadores
        int i;//filas
        int j;//columnas
        Transpuesta transpuesta = new Transpuesta();//Constructor por defecto
        //ciclo for anidado para pedir por teclado los datos de la matriz
        for( i = 0; i<original.length;i++){
            for( j =0; j<original[i].length;j++){
                System.out.println("Ingrese valor de la matriz original");
                original[i][j]= scan.nextInt();
            }
        }
        transpuesta.setOriginal(original);//Actulizar la matriz original
        transpuesta.calcularTranspuesta();//Calculo de la matriz trasnpuesta
        System.out.println("Matriz Original");
        transpuesta.obtenermatrizoriginal(original);//Mostrar la matriz original
        System.out.println("Matriz Transpuesta");
        transpuesta.obtenermatriztranspuesta(transpuesta.obtenerTranspuesta());//Mostrar la matriz trasnpuesta


    }
}
