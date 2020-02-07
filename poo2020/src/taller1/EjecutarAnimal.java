package taller1;

public class EjecutarAnimal {
    public static void main(String[] args) {
        // Creación de objeto animal
        Animal animal = new Animal();
        animal.actualizar_nombre("León");
        animal.actualizar_tamanio("Grande");
        animal.actualizar_clasificacion("mamífero");
        animal.actualizar_alimentacion("Carne");
        animal.actualizar_habitat("Las Sabanas");
        String mostrar_animal = animal.obtener_animal();
        System.out.println(mostrar_animal);

        System.out.println("\nInformación:");
        System.out.println(animal.procrear());
        System.out.println(animal.nutrir());
        System.out.println(animal.cazar());
    }
}
