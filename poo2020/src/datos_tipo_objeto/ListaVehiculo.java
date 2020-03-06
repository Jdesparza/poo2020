package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaVehiculo {
    public static void main(String[] args) {
        // Creación de una lista en java
        // para almacenar valores de tipo Vehiculo
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        // Declaración de bariables
        boolean bandera = true;
        int opcion;

        // Declaracion de Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE INGRESO DE VEHICULOS");
        do {
            // Menú de opciones
            System.out.println("|---------------MENÚ-------------|");
            System.out.println("| 1. Almacenar nuevo             |");
            System.out.println("| 2. Para presentar              |");
            System.out.println("| 3. Salir                       |");
            System.out.println("|--------------------------------|");
            System.out.print("Digite la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // Creacion de objeto Vehiculo
                    Vehiculo vehiculo = new Vehiculo();

                    // Datos por teclado
                    System.out.print("Ingrese placa: ");
                    vehiculo.setPlaca(scanner.nextLine());
                    System.out.print("Ingrese marca: ");
                    vehiculo.setMarca(scanner.nextLine());
                    System.out.print("Ingrese modelo: ");
                    vehiculo.setModelo(scanner.nextLine());
                    System.out.print("Ingrese color: ");
                    vehiculo.setColor(scanner.nextLine());
                    System.out.print("Ingrese año: ");
                    vehiculo.setAnio(scanner.nextInt());
                    System.out.print("Ingrese cilindraje: ");
                    vehiculo.setCilindraje(scanner.nextInt());

                    // agregamos objeto vehiculo a la lista
                    vehiculos.add(vehiculo);
                    break;
                case 2:
                    System.out.println("FICHAS DE VEHICULOS REGISTRADOS");
                    //System.out.println("Placa\tMarca\tCilindraje");
                    for (Vehiculo veh : vehiculos) {
                        System.out.println("--------------------------------");
                        System.out.println("Placa: "+ veh.getPlaca());
                        System.out.println("Marca: "+ veh.getMarca());
                        System.out.println("Modelo: "+ veh.getModelo());
                        System.out.println("Año: "+ veh.getAnio());
                        System.out.println("Cilindraje: "+ veh.getCilindraje());
                        System.out.println("Color: "+ veh.getColor());
                        System.out.println("--------------------------------");
                        //System.out.println(veh.getPlaca()+"\t"+veh.getMarca()+"\t"+ veh.getCilindraje());
                    }
                    break;
                case 3:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        } while (bandera);

    }
}
