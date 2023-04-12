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
public class Ejercicio6 {

    /**
     * Realizar un programa que pida dos números enteros positivos por teclado
     * y muestre por pantalla el siguiente menú:El usuario deberá elegir una 
     * opción y el programa deberá mostrar el resultado por pantalla y luego 
     * volver al menú. El programa deberá ejecutarse hasta que se elija la 
     * opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en 
     * vez de salir del programa directamente, se debe mostrar el siguiente 
     * mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
     * Si el usuario selecciona el carácter ‘S’ se sale del programa, caso 
     * contrario se vuelve a mostrar el menú.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opcion;
        String respuesta = "n";
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma es " + (num1+num2));
                    break;
                case 2:
                    System.out.println("La resta es " + (num1-num2));
                    break;
                case 3:
                    System.out.println("La Multiplicacion es " + (num1*num2));
                    break;
                case 4:
                    if ( num2==0 ){
                        System.out.println("El segundo numero no puede ser 0");
                    } else {
                        System.out.println("El resultado es " + (num1/num2));
                    }
                    break;
                case 5:
                    System.out.println("Esta seguro que quiere salir? s/n");
                    respuesta = leer.next();
                    break;
                default: 
                    System.out.println("Numero invalido");
            }
            
        } while (opcion != 5 || !(respuesta.equals("s")));
    }
    
}