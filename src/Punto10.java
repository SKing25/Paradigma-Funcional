    /*
        Realice un algoritmo que cree una matriz m(4,5), la llene y calcule la posición de un valor en una matriz ingresado por el usuario
    */

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Punto10 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 14}};

        System.out.println("Matriz:");
        Arrays.stream(matriz).forEach(fila -> System.out.println(Arrays.toString(fila)));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número a buscar: ");
        int buscar = scanner.nextInt();

        IntStream.range(0, matriz.length) // Generamos un stream de enteros desde 0 hasta el # de filas de la matriz (4)
                .forEach(i -> IntStream.range(0, matriz[i].length)
                // Para cada índice i (fila), crea otro stream de números desde 0 hasta el número de columnas de esa fila
                        .filter(j -> matriz[i][j] == buscar) // Filtramos los índices donde el valor es igual al número buscado
                        .forEach(j -> System.out.println("El número " + buscar + " está en la fila " + (i + 1) + " columna " + (j + 1))));
                        // Para cada posición encontrada, imprime el número buscado y su posición
    }
}