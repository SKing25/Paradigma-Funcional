import java.util.List;

    /*
        Un aprendiz desea saber cuál será su calificación final en la materia de Algoritmos.
        Dicha calificación se compone de los siguientes porcentajes:

        55% del promedio de sus tres calificaciones parciales.

        30% de la calificación del examen final.

        15% de la calificación de un trabajo final.
    */

public class Punto3 {
    public static void main(String[] args) {
        List<Double> parciales = List.of(2.5, 5.0, 3.0);
        double examenFinal = 4.0;
        double trabajoFinal = 3.5;

        double promedioParciales = parciales.stream()
                .mapToDouble(p -> p) // Convertimos cada parcial a double
                .average() // Calculamos el promedio
                .orElse(0); // En caso de que no haya parciales, devolvemos 0

        double calificacionFinal = (promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);

        System.out.println("Calificación final: " + calificacionFinal);
    }
}