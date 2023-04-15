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
public class Ejercicio1 {

    /**
     *Crea una aplicación que le pida dos números al usuario y este pueda 
     * elegir entre sumar, restar, multiplicar y dividir. La aplicación debe 
     * tener una función para cada operación matemática y deben devolver sus 
     * resultados para imprimirlos en el main.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, menu;
        System.out.println("Ingrese 2 numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
        menu = leer.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("El resultado de la suma es "+ suma(num1,num2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es " + resta(num1,num2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicacion es "+ multiplicacion(num1, num2));
                    break;
                case 4:
                    division(num1, num2);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion invalida");                   
            }
        
        }while (menu !=5);   
    }
    public static int suma(int a, int b) {
        
        int c = a + b;
        
        return c;
    }
    public static int resta(int a, int b) {
        
        int c = a - b;
        
        return c;
    }
    public static int multiplicacion(int a, int b) {
        
        int c = a * b;
        
        return c;
    }
    public static void division(double a, double b) {
        if (b==0){
            System.out.println("No se puede dividir por 0");
            
        } 
            else {
                double c = a / b;
                System.out.println("El resultado de la division es " + c);
                }
        }
       
    }
    

