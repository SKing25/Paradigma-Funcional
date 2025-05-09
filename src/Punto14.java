import java.util.List;
import java.util.stream.Collectors;

    /*
        Escriba una función que reciba como argumento una lista y devuelva la lista que resulta
        de dividir por 2 los elementos pares de la lista de entrada.
        Ejemplo: dividePares([0,2,1,7,8,56,17,18]) = [0,1,4,28,9]
    */

public class Punto14 {
    public static void main(String[] args) {
        List<Integer> lista = List.of(0, 2, 1, 7, 8, 56, 17, 18);

        List<Integer> resultado = lista.stream() // Convertimos la lista a un Stream
                .filter(n -> n % 2 == 0) // Filtramos los números pares
                .map(n -> {
                    if (n % 2 == 0) return n / 2; // Dividimos los números pares por 2
                    return n; // Devolvemos los números impares sin cambios
                })
                .toList(); // Convertimos el Stream de nuevo a una lista

        System.out.println("Lista original: " + lista);
        System.out.println("Resultado: " + resultado);
    }
}
