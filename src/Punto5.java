import java.time.LocalDate;
import java.time.Period;
import java.util.stream.Stream;

    /*
        Realizar un algoritmo que calcule la edad de una persona.
    */

public class Punto5 {
    public static void main(String[] args) {
        LocalDate nacimiento = LocalDate.of(2006, 9, 25); // Fecha de nacimiento
        LocalDate ahora = LocalDate.now(); // Fecha actual

        int edad = Stream.of(nacimiento)
                .map(fecha -> Period.between(fecha, ahora).getYears()) // Calculamos la edad
                .findFirst() // Obtenemos el primer elemento del stream
                .orElse(0); // En caso de que no haya fecha, devolvemos 0

        System.out.println("Edad: " + edad + " años");
    }
}
