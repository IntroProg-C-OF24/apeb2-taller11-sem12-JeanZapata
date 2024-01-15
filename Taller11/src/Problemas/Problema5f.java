package problema1f;

public class Problema5f {

    public static void main(String[] args) {
        int[][] matrizA = {
            {1, 2},
            {3, 4}
        };
        int[][] matrizB = {
            {5, 6},
            {7, 8}
        };

        int[][] suma = sumarMatrices(matrizA, matrizB);
        System.out.println("Suma de matrices:");
        imprimirMatriz(suma);

        int[][] resta = restarMatrices(matrizA, matrizB);
        System.out.println("Resta de matrices:");
        imprimirMatriz(resta);

        int[][] multiplicacion = multiplicarMatrices(matrizA, matrizB);
        System.out.println("Multiplicación de matrices:");
        imprimirMatriz(multiplicacion);
    }

    public static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        return resultado;
    }

    public static int[][] restarMatrices(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }

        return resultado;
    }

    public static int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int columnasB = matrizB[0].length;
        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
