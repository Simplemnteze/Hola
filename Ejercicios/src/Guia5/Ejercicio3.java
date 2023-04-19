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
public class Ejercicio3 {

    /**
     * Recorrer un vector de N enteros contabilizando cuántos números son de
     * 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        int[] vector;
        int[] sumaDigitos = new int [5];
        vector = new int[N];
        String aux;
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (rand.nextInt(99999)+1 );
        }
        
        for (int elemento : vector) {
            aux = String.valueOf(elemento);
            
            switch (aux.length()) {
                case 1:
                    sumaDigitos[0]++;
                    break;
                case 2:
                    sumaDigitos[1]++;
                    break;
                case 3:
                    sumaDigitos[2]++;
                    break;
                case 4:
                    sumaDigitos[3]++;
                    break;
                case 5:
                    sumaDigitos[4]++;
                    break;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("La cantidad de numeros de digitos " + (i+1) + " es: " + sumaDigitos[i]);
        }
    }
    
}
