//Nombre: Erick Hernandez, Fila 1, Silla 7
package lab1p2_erickhernandez;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab1P2_ErickHernandez {

    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);
    static int tamaño = tamañoMatriz();

    public static int[][] matrizRandom(int tamaño) {

        int[][] temporal = new int[tamaño][tamaño];

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                temporal[i][j] = random.nextInt(0, 10);
            }
        }

        return temporal;

    }

    public static int tamañoMatriz() {

        System.out.println("Ingrese el tamaño de la matriz (mayor que 4 e impar)");

        int temporal = sc.nextInt();
        while (temporal <= 4 || temporal % 2 == 0) {
            System.out.println("El numero tiene que ser mayor a 4 e impar)");
            temporal = sc.nextInt();
        }

        return temporal;

    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void imprimirArray(int[] array) {

        for (int j = 0; j < array.length; j++) {
            System.out.print("[" + array[j] + "]");
        }
    }

    public static int[][] bubbleSort(int[][] matrizRandom) {

        int[][] temporal = new int[tamaño][tamaño];
        temporal = matrizRandom;
        int[][] matrizOrdenada = new int[tamaño][tamaño];
        int[] fila = new int[tamaño];

        ArrayList<Integer> medianas = new ArrayList<>();
        int[] medianasArreglo = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {

            for (int j = 0; j < tamaño; j++) {
                fila[j] = temporal[i][j];
            }

            for (int k = 0; k < tamaño; k++) {
                for (int l = k; l < tamaño - 1; l++) {

                    if (fila[k] > fila[l + 1]) {

                        int temp = fila[k];
                        fila[k] = fila[l + 1];
                        fila[l + 1] = temp;

                    }

                }

            }

            for (int j = 0; j < tamaño; j++) {

                matrizOrdenada[i][j] = fila[j];

            }

            int mediana = fila[tamaño / 2];
            medianas.add(mediana);

        }
        
        System.out.println("La matriz ordenada es");
        imprimirMatriz(matrizOrdenada);

        System.out.println("");
        System.out.println("Las medianas de cada fila son:");
        System.out.println(medianas);

        
        
        for (int j = 0; j < tamaño; j++) {
            medianasArreglo[j] = medianas.get(j);
        }

        for (int k = 0; k < tamaño; k++) {
            for (int l = k; l < tamaño - 1; l++) {

                if (medianasArreglo[k] > medianasArreglo[l + 1]) {

                    int temp2 = medianasArreglo[k];
                    medianasArreglo[k] = medianasArreglo[l + 1];
                    medianasArreglo[l + 1] = temp2;

                }

            }

        }
        
        System.out.println("");
        System.out.println("El arrelgo de las medianas ordenado es: ");
        imprimirArray (medianasArreglo);
        
        
        int mediana2 = medianasArreglo[tamaño / 2];
        
        System.out.println("F");
        System.out.println("");
        System.out.println("Mediana de las medianas:");
        System.out.println(mediana2);
        

        return matrizOrdenada;

    }
    
    

    public static void main(String[] args) {

        int[][] matriz = new int[tamaño][tamaño];
        matriz = matrizRandom(tamaño);
        ArrayList<Integer> medianas = new ArrayList<>();

        System.out.println("La matriz generada es:");
        imprimirMatriz(matriz);

        
        
        bubbleSort(matriz);

    }

}
