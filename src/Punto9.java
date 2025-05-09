import java.util.Arrays;

    /*
        Realice un algoritmo que cree un vector de 16 posiciones llenarlo y partirlo en dos de 8 posiciones.
    */

public class Punto9 {
    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        int[] primeraMitad = Arrays.stream(vector, 0, 8) // Tomamos los primeros 8 elementos de la lista
                .toArray();

        int[] segundaMitad = Arrays.stream(vector, 8, 16) // Tomamos los últimos 8 elementos de la lista
                .toArray();

        System.out.println("Vector completo: " + Arrays.toString(vector));
        System.out.println("Primera mitad: " + Arrays.toString(primeraMitad));
        System.out.println("Segunda mitad: " + Arrays.toString(segundaMitad));
    }
}
