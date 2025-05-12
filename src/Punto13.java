    /*
        Cree una función que cuente el número de veces que aparece x en una lista.
        Desarrolle dos versiones de la función: una usando filter y otra usando reduce y map.
    */

import java.util.List;

public class Punto13 {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 3, 4, 2, 5, 2, 6);
        int x = 2;

        long countFilter = lista.stream() // Convertimos la lista a un Stream
                .filter(n -> n == x) // Filtramos los elementos que son iguales a x
                .count(); // Contamos los elementos que quedan después del filtro

        long countReduce = lista.stream() // Convertimos la lista a un Stream
                .map(n -> Boolean.compare(n.equals(x), false)) // Mapeamos los elementos a 1 si son iguales a x, o 0 si no lo son
                .reduce(0, (a, b) -> a + b); // Reducimos la lista sumando los elementos mapeados

        System.out.println("Lista: " + lista);
        System.out.println("Número a contar: " + x);
        System.out.println("Con filter: " + countFilter);
        System.out.println("Con reduce: " + countReduce);
    }
}
