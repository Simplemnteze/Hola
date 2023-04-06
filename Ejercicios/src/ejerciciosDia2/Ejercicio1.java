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
public class Ejercicio1 {

    /**
     * Escribir un programa que pida dos números enteros por teclado
     * y calcule la suma de los dos. El programa deberá después mostrar
     * el resultado de la suma
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese primer numero");
        num1 = leer.nextByte();
        System.out.println("Ingrese segundo numero");
        num2 = leer.nextByte();
        int resultado = num1 + num2;
        System.out.println("La suma de " + num1 + " + " + num2 + " es: " + resultado );
    }
    
}
