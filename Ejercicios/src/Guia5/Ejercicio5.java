/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio5 {

    /**
     * Realice un programa que compruebe si una matriz dada es antisimétrica.
    Se dice que una matriz A es antisimétrica cuando ésta es igual a su
    propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
    A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
    obtiene cambiando sus filas por columnas (o viceversa).
     */
    
    public static void main(String[] args) {
        
        int matrizA[][] = {{0,-2,4}, {2,0,2}, {-4,-2,0}};
        int matrizAT[][];
        Scanner leer = new Scanner(System.in);
        matrizAT = new int [3][3];
       

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizAT[j][i]= matrizA[i][j];
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("--------------");
        
        for (int[] fila : matrizAT) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");   
            }
            System.out.println("");
        }
        
        boolean es = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizA[i][j] != matrizAT[i][j] * (-1)) {
                    es = false;
                    break;
                }
            }   
        }
        
        if (es) {
            System.out.println("La matriz A es antisimetrica");
            
        }else {
            System.out.println("La matriz A no es antisimetrica");
        }
    }   
    
}
