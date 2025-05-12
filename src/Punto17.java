    /*
        Escriba una función que elimine todos los números menores o iguales que el argumento indicado.
        Ejemplo: mayor([1,5,7,9,1,2,12,23,45,5,8],4) = [5,7,9,12,23,45,5,8]
    */

import java.util.List;

public class Punto17 {
    public static void main(String[] args) {
        int limite = 4;
        List<Integer> lista = List.of(1, 5, 7, 9, 1, 2, 12, 23, 45, 5, 8);

        List<Integer> resultado = lista.stream() // Convertimos la lista a un Stream
                .filter(n -> n > limite) // Filtramos los números mayores que el límite
                .toList(); // Convertimos el Stream de nuevo a una lista

        System.out.println("Lista original: " + lista);
        System.out.println("Resultado: " + resultado);
    }
}