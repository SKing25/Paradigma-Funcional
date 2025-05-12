    /*
        Un maestro desea saber qué porcentaje de hombres y que porcentaje de mujeres hay en un grupo de estudiantes.
    */

import java.util.List;

public class Punto4 {
    public static void main(String[] args) {
        List<String> estudiantes = List.of("H", "M", "H", "M", "M", "H", "H", "M");

        long hombres = estudiantes.stream()
                .filter(genero -> genero.equals("H")) // Filtramos los hombres
                .count(); // Contamos cuántos hombres hay

        long mujeres = estudiantes.stream()
                .filter(genero -> genero.equals("M")) // Filtramos las mujeres
                .count(); // Contamos cuántas mujeres hay

        double total = estudiantes.size();
        double porcentajeH = (hombres / (double) total) * 100;
        double porcentajeM = (mujeres / (double) total) * 100;

        System.out.println("Hombres: " + hombres + " (" + porcentajeH + "%)");
        System.out.println("Mujeres: " + mujeres + " (" + porcentajeM + "%)");
    }
}


