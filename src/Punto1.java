import java.util.List;

 /*
     Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas,
     el vendedor desea saber cuánto dinero obtendrá por concepto de comisiones por
     las tres ventas que realiza en el mes y el total que recibirá en el mes tomando
     en cuenta su sueldo base y comisiones.
 */

public class Punto1 {
    public static void main(String[] args) {
        double sueldoBase = 1500;
        List<Integer> ventas = List.of(5000, 7500, 6200);

        double comisiones = ventas.stream() // Convierto la lista ventas a un stream
                .mapToDouble(v -> v * 0.10) // Multiplico cada venta por 0.10
                .sum(); // Sumo todas las comisiones

        double totalMes = sueldoBase + comisiones;

        System.out.println("Comisiones: $" + comisiones);
        System.out.println("Total del mes: $" + totalMes);
    }
}