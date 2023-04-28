/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

/**
 *
 * @author Ezequiel
 */
public class EjercicioExtra7 {

    /**
     * Realizar un programa que complete un vector con los N primeros
       números de la sucesión de Fibonacci. Recordar que la sucesión de
       Fibonacci es la sucesión de los siguientes números:
    * 
       1, 1, 2, 3, 5, 8, 13, 21, 34, ...
     */
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
    
    public static int fibonacci(int n){
        
        if (n>1) {
            //System.out.print(n+".");
            return fibonacci(n-1) + fibonacci(n-2); 
            
        }
        else if (n==1){
            //System.out.println("suma 1");
            
            return 1;
        }
        else if (n==0){
            //System.out.println("suma 0");
            return 0;
        }
        else{
            //error
            System.out.println("Debes ingresar un tamaño positivo");
            return -1;
        }
    }
    
}
