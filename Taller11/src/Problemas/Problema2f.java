package problema1f;

import java.util.Scanner;

public class Problema2f {

    static double altura = 2;
    static double base = 36;
    static double lado = 4;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion ;
        do {
            System.out.println("Ingrese el numero de la operacion que desea ");
            System.out.println("1 . Area del cuadradro");
            System.out.println("2 . Area del triangulo");
            System.out.println("3 . Area del rectangulo");
            System.out.println("4 . Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    areaCuadrado();
                    break;
                case 2:
                    areaTriangulo();
                    break;
                case 3:
                    areaRectangulo();
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                default:
                    System.out.println("Opcion invalida");

            }

        } while (opcion != 4);

    }

    public static void areaCuadrado() {
        System.out.println("El area del cuadrado es: ");
        double area = lado * 4;
        System.out.println(area);
    }

    public static void areaTriangulo() {
        System.out.println("El are del triangulo es: ");
        double area = (base * altura) / 2;
        System.out.println(area);

    }

    public static void areaRectangulo() {
        System.out.println("El area del rectangulo es: ");
        double area = base * altura;
        System.out.println(area);

    }
}
