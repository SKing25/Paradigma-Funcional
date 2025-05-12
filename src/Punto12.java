    /*
        Realice un algoritmo que calcule las notas de un grupo de 25 alumnos, guardando nombre, apellido
        y 4 notas por cada uno, calcular promedio, e imprimir todos los datos en pantalla. utilizando matrices
    */

import java.util.Arrays;
import java.util.stream.IntStream;

public class Punto12 {
    public static void main(String[] args) {
        String[][] alumnos = IntStream.range(0, 25) // Generamos un stream de enteros desde 0 hasta 25
                .mapToObj(i -> new String[]{ // Para cada índice i, crea un nuevo array de String
                        "Nombre" + (i+1), // Nombre
                        "Apellido" + (i+1), // Apellido
                        String.valueOf((int)(Math.random() * 10 + 1)), // Nota 1
                        String.valueOf((int)(Math.random() * 10 + 1)), // Nota 2
                        String.valueOf((int)(Math.random() * 10 + 1)), // Nota 3
                        String.valueOf((int)(Math.random() * 10 + 1))}) // Nota 4
                .toArray(i -> new String[i][6]); // Convierte el Stream de arrays de String en una matriz bidimensional de tamaño 25x6.

        Arrays.stream(alumnos) // Convertimos la matriz a un stream
                .forEach(alumno -> { // Para cada alumno, calculamos el promedio
                    double promedio = Arrays.stream(alumno, 2, 6) // Tomamos las notas (índices 2 a 5)
                            .mapToDouble(Double::parseDouble) // Convertimos las notas a double
                            .average() // Calculamos el promedio
                            .orElse(0); // En caso de que no haya notas, devolvemos 0
                    System.out.printf("%s %s: Notas=%s, Promedio=%.2f%n", alumno[0], alumno[1],
                            Arrays.toString(Arrays.copyOfRange(alumno, 2, 6)), promedio);
                            // Imprimimos el nombre, apellido, notas y promedio
                });
    }
}
