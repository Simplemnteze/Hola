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
public class Ejercicio4 {

    /**
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente
     * en grados Fahrenheit. La fórmula correspondiente es:
     * F = 32 + (9 * C / 5).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int centigrado, fahrenheit;
        System.out.println("Ingrese grados centigrados");
        centigrado = leer.nextByte();
        fahrenheit = 32 + (9 * centigrado / 5);
        System.out.println("Los grados Fahrenheit es: " + fahrenheit);
        
    }
    
}
