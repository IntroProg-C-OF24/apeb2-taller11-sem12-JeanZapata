
package problema1f;

import java.util.Scanner;

public class Problema3f {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el promedio");
        double promedio = teclado.nextDouble();
        cualitativo(promedio);
    }

    public static void cualitativo(double promedio) {
        if (promedio >= 0 && promedio <= 5) {
            System.out.println("El promedio es: " + promedio + " es Regular");
        } else if (promedio >= 5.1 && promedio <= 8) {
            System.out.println("El promedio es: " + promedio + " es Bueno");
        } else if (promedio >= 8.1 && promedio <= 9) {
            System.out.println("El promedio es: " + promedio + " es Muy bueno");
        } else if (promedio >= 9.1 && promedio <= 10) {
            System.out.println("El promedio es: " + promedio + " es Sobresaliente");
        } else 
            System.out.println("Ingrese un promedio valido");
    }   
}
