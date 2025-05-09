import java.util.List;

    /*
        Una tienda ofrece un descuento del 15% sobre el total de la compra
        y un cliente desea saber cuánto deberá pagar finalmente por su compra.
    */

public class Punto2 {
    public static void main(String[] args) {
        List<Integer> compras = List.of(150, 200, 80, 350);

        double totalConDescuento = compras.stream()
                .mapToDouble(c -> c) // Convertimos cada compra a double
                .sum() * 0.85; // Sumamos y aplicamos el descuento del 15%

        System.out.println("Total con descuento: $" + totalConDescuento);
    }
}

