    /*
        Algoritmo que almacena 15 valores y los ordena en orden inverso usando Streams
    */

import java.util.Arrays;
import java.util.List;

public class Punto7 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        int[] numerosInversos = numeros.stream()
                .sorted((a, b) -> b.compareTo(a)) // Ordenar en orden inverso
                .mapToInt(n -> n) // Convertimos a int
                .toArray(); // Convertimos el Stream a un array

        System.out.println("Números originales: " + numeros);
        System.out.println("Números en orden inverso: " + Arrays.toString(numerosInversos));
    }
}
