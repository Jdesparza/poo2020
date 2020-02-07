package taller1;

public class EjecutarVehiculo {
    public static void main(String[] args) {
        // Creación de objeto universidad
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.actualizar_marca("Ford");
        vehiculo.actualizar_asientos(5);
        vehiculo.actualizar_color("Negro");
        vehiculo.actualizar_modelo("Maverick Grabber");
        vehiculo.actualizar_potencia("116 kW");
        vehiculo.actualizar_placa("LAD-237");
        String mostrar_vehiculo = vehiculo.obtener_vehiculo();
        System.out.println(mostrar_vehiculo);

        System.out.println("\nInformación:");
        System.out.println(vehiculo.transportar_personas());
        System.out.println(vehiculo.escuchar_musica());

    }
}
