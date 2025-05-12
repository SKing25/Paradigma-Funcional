    /*
        Realice un algoritmo que lea una secuencia de 20 números almacenarlos en un vector y mostrar la posición donde se encuentra el mayor valor leído.
    */

import java.util.List;
import java.util.stream.IntStream;

public class Punto8 {
    public static void main(String[] args) {
        List<Integer> vector = List.of
                (12, 45, 23, 67, 34, 89, 56, 32, 90, 54, 21, 78, 43, 65, 76, 87, 98, 10, 24, 36);

        int max = vector.stream()
                .mapToInt(v -> v)
                .max() // Obtenemos el máximo
                .orElse(0); // En caso de que el array esté vacío, devolvemos 0

        int posicion = IntStream.range(0, vector.size()) // Generamos un stream de índices
                .filter(i -> vector.get(i) == max) // Filtramos los índices donde el valor es igual al máximo
                .findFirst() // Obtenemos el primer índice que cumple la condición
                .orElse(-1); // En caso de que no haya índice, devolvemos -1

        System.out.println("Vector: " + vector);
        System.out.println("Mayor valor: " + max + " en indice: " + posicion);
    }
}
