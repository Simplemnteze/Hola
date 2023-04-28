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
public class EjercicioExtra2 {

    /**
     * Escriba un programa que averigüe si dos vectores de N enteros son 
     * iguales (la comparación deberá detenerse en cuanto se detecte alguna 
     * diferencia entre los elementos).
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner leer = new Scanner(System.in);
        int vectorA[], vectorB[], n;
        boolean bandera;
        
        System.out.println("Ingrese el tamaño de los vectores");
        n = leer.nextInt();
        
        vectorA = new int [n];
        vectorB = new int [n];
        
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = random.nextInt(10)+1;
            vectorB[i] = random.nextInt(10)+1;
            
        }
        
        bandera=true;
        
        for (int i = 0; i < vectorA.length; i++) {
            if (vectorA[i] != vectorB[i]) {
                bandera=false;
                break;
            }
        }
        for (int i = 0; i < vectorA.length; i++) {
            System.out.println(vectorA[i] + " " + vectorB[i]); 
        }
        
        if (bandera) {
            System.out.println("Los vectores son iguales");    
        } else {
            System.out.println("Los vectores no son iguales");
        }
       
        
    }
    
}
