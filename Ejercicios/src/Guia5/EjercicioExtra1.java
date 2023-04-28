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
public class EjercicioExtra1 {

    /**
     * Realizar un algoritmo que calcule la suma de todos los elementos de 
     * un vector de tamaño N, con los valores ingresados por el usuario.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N, suma;
        int vector[];
        System.out.println("Ingrese el tamaño del vector");
        N = leer.nextInt();
        vector= new int [N];
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor para la posicion [" + i + "]");
            vector[i]= leer.nextInt();   
        }
        
        suma=0;
        for (int i = 0; i < vector.length; i++) {
            suma+=vector[i];
        }
        
        System.out.println("La suma de los numeros es " + suma);
    }
    
}
