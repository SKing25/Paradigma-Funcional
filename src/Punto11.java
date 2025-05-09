import java.util.Arrays;
import java.util.stream.IntStream;

    /*
        Realice un algoritmo que cree tres vectores de 10 posiciones, los lea y asigne sus valores a una matriz x(3,10). imprimir la matriz.
    */

public class Punto11 {
        public static void main(String[] args) {
            // Creamos los tres vectores usando streams
            int[] vector1 = IntStream.rangeClosed(1, 10).toArray();
            int[] vector2 = IntStream.rangeClosed(11, 20).toArray();
            int[] vector3 = IntStream.rangeClosed(21, 30).toArray();

            // Creamos la matriz y asignamos los vectores
            int[][] matriz = {vector1, vector2, vector3};

            System.out.println("Matriz resultante:");
            Arrays.stream(matriz).forEach(fila -> System.out.println(Arrays.toString(fila)));
        }
}
