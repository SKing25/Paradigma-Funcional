    /*
        Escriba una función que devuelva una lista con todos los números de la lista
        de entrada que estén en el rango indicado por los dos primeros argumentos.
        Ejemplo: enRango(5,10,[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]) = [5,6,7,8,9,10]
    */

import java.util.List;

public class Punto15 {
    public static void main(String[] args) {
        int min = 5;
        int max = 10;
        List<Integer> lista = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        List<Integer> resultado = lista.stream() // Convertimos la lista a un Stream
                .filter(n -> n >= min && n <= max) // Filtramos los números que están en el rango
                .toList(); // Convertimos el Stream de nuevo a una lista

        System.out.println("Lista original: " + lista);
        System.out.println("Rango: " + min + " a " + max);
        System.out.println("Números en rango: " + resultado);
    }
}
