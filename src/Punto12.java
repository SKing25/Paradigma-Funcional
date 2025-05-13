    /*
        Realice un algoritmo que calcule las notas de un grupo de 25 alumnos, guardando nombre, apellido
        y 4 notas por cada uno, calcular promedio, e imprimir todos los datos en pantalla. utilizando matrices
    */

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Punto12 {
    public static void main(String[] args) {
        // Generamos los nombres y apellidos
        List<String> nombres = IntStream.range(1, 26) // Generamos un stream de enteros desde 1 hasta 25
                .mapToObj(i -> "Nombre " + i ) // Para cada índice i, crea un nuevo String
                .toList(); // Convierte el Stream de nombres en una lista

        List<String> apellidos = IntStream.range(1, 26) // Generamos un stream de enteros desde 1 hasta 25
                .mapToObj(i -> "Apellido " + i) // Para cada índice i, crea un nuevo String
                .toList(); // Convierte el Stream de apellidos en una lista

        // Generamos las notas en el rango de 0 a 5
        List<List<Double>> notas = IntStream.range(0, 25) // Generamos un stream de enteros desde 0 hasta 25
                .mapToObj(i -> Stream.generate(() -> Math.random() * 5) // Generamos un stream infinito de notas aleatorias
                        .limit(4) // Limitamos a 4 notas
                        .collect(Collectors.toList())) // Convertimos el stream de notas en una lista
                .toList(); // Convertimos el Stream de listas de notas en una lista de listas

        // Calculamos y mostramos los resultados
        IntStream.range(0, 25) // Generamos un stream de enteros desde 0 hasta 25
                .mapToObj(i -> { // Para cada índice i, creamos un nuevo objeto
                    String nombreCompleto = nombres.get(i) + " " + apellidos.get(i); // Obtenemos el nombre completo
                    List<Double> notasEstudiante = notas.get(i); // Obtenemos las notas del estudiante

                    String notasTexto = notasEstudiante.stream() // Convertimos las notas a texto
                            .map(nota -> Double.toString(nota)) // Convertimos cada nota a String
                            .collect(Collectors.joining(", ")); // Unimos las notas en un solo String separado por comas

                    // Se calcula el promedio
                    double promedio = notasEstudiante.stream() // Convertimos las notas a un stream
                            .mapToDouble(nota -> nota) // Convertimos las notas a double
                            .average() // Calculamos el promedio
                            .orElse(0.0); // En caso de que no haya notas, devolvemos 0

                    String promedioTexto = String.valueOf(promedio); // Convertimos el promedio a String

                    return nombreCompleto + " - Notas: [" + notasTexto + "] - Promedio: " + promedioTexto; // Creamos el String final
                })
                .forEach(System.out::println); // Imprimimos cada resultado
    }
}
