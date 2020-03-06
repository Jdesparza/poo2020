package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;

public class EjemploLista {
    public static void main(String[] args) {
        // Creación de una lista en java
        // para almacenar valores de tipo string
        List<String> universidades = new ArrayList<String>();

        // .add() para guardar un dato en la lista
        universidades.add("UTPL");

        // .size() para mostrar tamaño de la lista
        System.out.println("Tamaño de la lista: "+universidades.size());
        universidades.add("espol");
        System.out.println("Tamaño de la lista: "+universidades.size());
        universidades.add("unl");
        System.out.println("Tamaño de la lista: "+universidades.size());

        // eliminacion del elemento en la posicion 1
        // .remove() elimina una posición de la lista
        universidades.remove(1);
        System.out.println("Tamaño de la lista luego de eliminar elemento: "+universidades.size());

        // .set() remplazar el valor de una posicion
        universidades.set(1, "UIDE");

        // agregamos nuevo valor en una posicion intermedia
        universidades.add(1, "UNL");

        // recorremos lista para presentar
        /*
        // .size() tamaño de la lista
        for (int i = 0; i < universidades.size(); i++) {
            // .get() obtiene la posicion de la lista
            System.out.println(universidades.get(i));
        }
        */

        // foreach para recorrer lista universidades
        for (String univ : universidades) {
            System.out.println(univ);
        }
    }
}
