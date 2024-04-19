package lab1p2_erickhernandez;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab1P2_ErickHernandez {
    
    static Random random = new Random();
    static Scanner sc = new Scanner (System.in);
    
    public static int [][] matrizRandom (int tamaño) {
        
        int [][] matrizRandom = new int [tamaño][tamaño];
        
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matrizRandom [i][j] = random.nextInt(0,10);
            }
        }
        
        return matrizRandom;
        
    }
    
    public static int tamañoMatriz () {
        
        System.out.println("Ingrese el tamaño de la matriz");
        int tamaño = sc.nextInt();
        return tamaño;
        
    }
    
    public static void imprimir(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        
        int tamaño = tamañoMatriz();
        int [][] matriz = new int [tamaño][tamaño];
        
        matriz = matrizRandom(tamaño);
        
        imprimir (matriz);
        
    }
    
}
