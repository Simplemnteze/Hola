/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosDia3;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio1 {

    /**
     * Crear un programa que dado un número determine si es par o impar.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        if (num%2!=0) { 
            System.out.println("El numero ingresado es impar");
    } else
            System.out.println("El numero ingresado es par");
        }
    
}
