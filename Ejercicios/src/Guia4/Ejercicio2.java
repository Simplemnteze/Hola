/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio2 {

    /**
     * Diseñe una función que pida el nombre y la edad de N personas e 
     * imprima los datos de las personas ingresadas por teclado e indique si 
     * son mayores o menores de edad. Después de cada persona, el programa debe 
     * preguntarle al usuario si quiere seguir mostrando personas y frenar 
     * cuando el usuario ingrese la palabra “No”.

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String respuesta = "Si";

        do {
            nombreYEdad();
            do {
                System.out.println("Quiere ingresar otra persona? Si / No");
                respuesta = leer.next();
            } while ((!respuesta.equals("Si"))&&(!respuesta.equals("No")));
            
        } while (!(respuesta.equals("No")));
        
    }
    public static void nombreYEdad(){
        System.out.println("Ingrese nombre");
        Scanner leer = new Scanner(System.in);
            String nombre = leer.next();
            System.out.println("Ingrese edad");
            int edad = leer.nextInt();
            if (edad>=0 && edad<=18) {
                System.out.println(nombre + " usted es menor de edad");
                
            } else {
                System.out.println(nombre + " usted es mayor de edad");
            }
    }
    
}
