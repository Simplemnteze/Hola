/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio6 {

    /**
     * Implementar un programa que le pida dos números enteros al usuario y
     * determine si ambos o alguno de ellos es mayor a 25.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();
        if (num1>25) {
            System.out.println("El numero " + num1 + " es mayor a 25");}
         if (num2>25){
                    System.out.println("El numero " + num2 + " es mayor a 25");
                    }           
        }            
    }
