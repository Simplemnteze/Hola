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
public class EjercicioExtra3 {

    /**
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        if (letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")) {
            System.out.println("Es una vocal");
        } else{
            System.out.println("No es vocal");
        }       
    }
    
}
