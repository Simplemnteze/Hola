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
public class Ejercicio2 {

    /**
     * Realizar un algoritmo que llene un vector de tamaño N con valores 
     * aleatorios y le pida al usuario un número a buscar en el vector. 
     * El programa mostrará dónde se encuentra el numero y si se encuentra 
     * repetido
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para el tamaño del vector");
        int N = leer.nextInt();
        int [] vector = new int [N];
        for (int i = 0; i < vector.length; i++) {
            vector[i] =  (int) (Math.random()*10 );
        }
        System.out.println("Ingrese el numero que quieres buscar en el vector");
        int num = leer.nextInt();
        int cont=0;
        for (int i = 0; i < vector.length; i++) {
            if ((num == vector[i])&& (cont==0)) {
                cont=1;
                System.out.println("El numero se encontro en la posicion " + i);
            }
            if (cont>=1) {
                cont+=1;   
            }
        }
        
        if (cont==0) {
            System.out.println("No se encontro numero " + num + " dentro del vector");
            
        } else if (cont>1) {
            System.out.println("Y se repitió " + cont + " veces.");
            
        }
        if (cont==1) {
            System.out.println("Y solo se encontro 1 vez");
            
        }
    }
    
}
