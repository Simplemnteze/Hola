/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Random;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio4 {

    /**
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
    y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
    A se denota por B y se obtiene cambiando sus filas por columnas (o
    viceversa).
     */
    public static void main(String[] args) {
        int matrizA[][], matrizB[][];
        Random rand = new Random();
        matrizA = new int [4][4];
        matrizB = new int [4][4];
       
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = (rand.nextInt(99)+1 );
            }         
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[j][i]= matrizA[i][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("--------------");
        
        for (int[] fila : matrizB) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");   
            }
            System.out.println("");
        }
    }   
}
