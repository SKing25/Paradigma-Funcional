import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

    /*
        Realice un algoritmo que cree un vector de longitud n donde n lo define el usuario calcula número mayor y menor
    */

public class Punto6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese longitud del vector: ");
        int n = scanner.nextInt();

        int[] vector = IntStream.range(0, n) // Generamos un stream de enteros desde 0 hasta n-1
                .map(i -> (int)(Math.random() * 100)) // Generamos números aleatorios entre 0 y 99
                .toArray(); // Convertimos el stream a un array

        int mayor = Arrays.stream(vector) // Convertimos el array a un stream
                .max() // Obtenemos el máximo
                .orElse(0); // En caso de que el array esté vacío, devolvemos 0

        int menor = Arrays.stream(vector) // Convertimos el array a un stream
                .min() // Obtenemos el mínimo
                .orElse(0); // En caso de que el array esté vacío, devolvemos 0

        System.out.println("Vector: " + Arrays.toString(vector));
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}
