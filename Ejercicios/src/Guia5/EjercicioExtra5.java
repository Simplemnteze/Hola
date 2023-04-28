/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class EjercicioExtra5 {

    /**
     * Realizar un programa que llene una matriz de tamaño NxM con valores
       aleatorios y muestre la suma de sus elementos.
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner leer = new Scanner(System.in);
        int N, M, matriz[][], suma;
        
        System.out.println("Ingrese el tamaño de la matriz NxM");
        N= leer.nextInt();
        M= leer.nextInt();
        
        matriz= new int [N][M];
        
        suma=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j]=random.nextInt(10)+1;
                suma+=matriz[i][j];
                System.out.print("[" + matriz[i][j] + "]");
            }  
            System.out.println("");
        }

        System.out.println("La suma es " + suma);
         
    }
    
}
