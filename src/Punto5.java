
    /*
        Realizar un algoritmo que calcule la edad de una persona.
    */

public class Punto5 {
    interface Edad {
        public int edad(int nacimiento, int hoy);
    }

    public static void main(String[] args) {
        int nacimiento = 2006;
        int hoy = 2025;
        Edad ed = (n, h) -> h - n;
        System.out.println("La edad es: " + ed.edad(nacimiento, hoy) + " años");
    }
}