
package problema1f;

import java.util.Scanner;

public class Problema4f {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seleccione una opción:");
        System.out.println("1. Calcular valor de la planilla de luz");
        System.out.println("2. Calcular valor del predio de un bien inmueble");
        int opcion = teclado.nextInt();
        System.out.println("Ingrese el nombre del cliente:");
        String nombreCliente = teclado.next();
        System.out.println("Ingrese la cédula del cliente:");
        String cedulaCliente = teclado.next();
        if (opcion == 1) {
            ValorLuz(nombreCliente, cedulaCliente);
        } else if (opcion == 2) {
            ValorPredio(nombreCliente, cedulaCliente);
        } else {
            System.out.println("Opción no válida");
        }
    }
    public static void ValorLuz(String nombreCliente, String cedulaCliente) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del kilowatio:");
        double valorKilowatio = teclado.nextDouble();
        System.out.println("Ingrese el número de kilowatios del mes:");
        double numKilowatios = teclado.nextDouble();
        double totalPagar = valorKilowatio * numKilowatios;
        System.out.println("Cliente " + nombreCliente + " con cédula " + cedulaCliente + " debe cancelar el valor de $" + totalPagar);
    
    }
    public static void ValorPredio(String nombreCliente, String cedulaCliente) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del inmueble:");
        double valorInmueble = teclado.nextDouble();
        double valorPredio = 0.02 * valorInmueble;
        System.out.println("Cliente " + nombreCliente + " con cédula " + cedulaCliente +
                " tiene un bien inmueble valorado en $" + valorInmueble +
                " y tiene que pagar de predio $" + valorPredio);
    }        
 }





    
        

        
    
