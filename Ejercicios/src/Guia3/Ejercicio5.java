/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio5 {

    /**
     * Escriba un programa en el cual se ingrese un valor limite positivo,
     * y a continuacion solicite numeros al usuario hasta que la suma de los
     * numeros introducidos supere el limite inicial.
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite positivo");
        int num = leer.nextInt();
        int suma = 0;
        
        do {
            System.out.println("Ingrese un numero a sumar");
            int num1 = leer.nextInt();
            suma += num1;
            
        } while (suma<num);
        System.out.println(suma + " es mayor a " + num);
    }
    
}
