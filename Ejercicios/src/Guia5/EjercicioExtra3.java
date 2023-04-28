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
public class EjercicioExtra3 {

    /**
     * Crear una función rellene un vector con números aleatorios, pasándole un 
     * arreglo por parámetro. Después haremos otra función o procedimiento que 
     * imprima el vector.
     */
    public static void main(String[] args) {
        int vector[]= new int [4];
        
        LlenarVector(vector);
        ImprimirVector(vector);
       
    }
    
    public static void LlenarVector (int vector[]){
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(10)+1;
        }
    }
    public static void ImprimirVector (int vector[]) {
        
        for (int elemento : vector) {
            System.out.println("[" + elemento + "]");
            
        }
    }
    
}
