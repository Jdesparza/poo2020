package arreglos_poo;

import java.util.Scanner;

public class EjecutaSumaArreglos {
    public static void main(String[] args) {
        // Declaracion de scanner
        Scanner scan = new Scanner(System.in);
        int [] vector1 = new int [10];
        int [] vector2 = new int [10];
        int [] vector3 = new int [10];

        // Creacion de objeto
        SumaArreglos sumaArreglos = new SumaArreglos();

        // Datos por teclado y lectura
        for (int i = 0; i<vector1.length;i++){
            System.out.println("Ingrese valores Vector1 en posicion "+(i+1)+": ");
            vector1[i] = scan.nextInt();
            System.out.println("Ingrese valores Vector2 en posicion "+(i+1)+": ");
            vector2[i] = scan.nextInt();
        }

        // Establecer
        sumaArreglos.setVector1(vector1);
        sumaArreglos.setVector2(vector2);

        // imprimir
        System.out.println("Vector1\t+\tVector2\t=\tVector3");
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("\t"+vector1[i]+"\t+\t\t"+vector2[i]+"\t=\t"+ sumaArreglos.calcularSumaVectores());
        }

    }
}
