/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosDia2;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio5 {

    /**
     * Escribir un programa que lea un número entero por teclado y muestre 
     * por pantalla el doble, el triple y la raíz cuadrada de ese número. 
     * Nota: investigar la función Math.sqrt().
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num1 = leer.nextInt();
        System.out.println("El doble es: " + (num1*num1));
        System.out.println("El triple es: " + (num1*num1*num1));
        System.out.println("La raiz cuadrada es: " + Math.sqrt(num1));
    }
    
}
