
package problema1f;
public class Problema1f {
    public static void main(String[] args) {
        int[][] matrizBidi  = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        }; 
        pares(matrizBidi);
        impares(matrizBidi);
        promedioMatriz(matrizBidi);
    }
    public static void pares (int matrizBidi[][]) {
        System.out.println("Valores pares");
        for (int i = 0; i < matrizBidi.length; i++) {
            for (int j = 0; j < matrizBidi[i].length; j++) {
                if(matrizBidi[i][j] % 2 == 0){
                    System.out.println(matrizBidi[i][j] + "  ");  
                }
              
            }
        }
        System.out.println();

        
    }
    public static void impares(int matrizBidi[][]) {
        System.out.println("Valores impares");
        for (int i = 0; i < matrizBidi.length; i++) {
            for (int j = 0; j < matrizBidi[i].length; j++) {
                if(matrizBidi[i][j] % 2 != 0){
                    System.out.println(matrizBidi[i][j] + "  ");  
                }
              
            }
        }
    }
     public static void promedioMatriz(int matrizBidi[][]) {
      int suma = 0;
      int contador = 0;
        for (int i = 0; i < matrizBidi.length; i++) {
            for (int j = 0; j < matrizBidi[i].length; j++) {
                suma += matrizBidi[i][j];
                contador++;
            }
        }
        double promedio = (double) suma / contador;
        System.out.println("Promedio de todos los elementos: " + promedio);
    }
}
