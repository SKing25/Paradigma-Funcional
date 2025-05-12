    /*
        Escriba una función que cuente el número de números positivos de una lista.
        Ejemplo: cuentaPositivos([0,1,-3,-2,8,-1,6]) = 3
    */

import java.util.List;

public class Punto16 {
    public static void main(String[] args) {
        List<Integer> lista = List.of(0, 1, -3, -2, 8, -1, 6);

        long positivos = lista.stream() // Convertimos la lista a un Stream
                .filter(n -> n > 0) // Filtramos los números positivos
                .count(); // Contamos los números que quedan después del filtro

        System.out.println("Lista original: " + lista);
        System.out.println("Números positivos: " + positivos);
    }
}
