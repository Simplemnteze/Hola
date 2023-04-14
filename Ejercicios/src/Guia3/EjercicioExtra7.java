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
public class EjercicioExtra7 {

    /**
     *Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de valores a ingresar");
        int cant = leer.nextInt();
        int valor, max, min, cantOriginal, cant2;
        double promedio, suma;
        max=0;
        min=10000000;
        suma=0;
        cantOriginal = cant;
        cant2=cant;
        while (cant>0) {
            System.out.println("Ingrese un valor");
            valor = leer.nextInt();
            suma= suma+valor;
            if (valor>=max) {
                max=valor;
            }
            if (valor<=min) {
                min=valor;
            } 
            cant=cant-1;
        }
        //promedio = (suma/cantOriginal);
        System.out.println("El valor maximo es " + max);
        System.out.println("El valor minimo es " + min);
        System.out.println("El promedio es " + (suma/cantOriginal));
        //System.out.println(promedio);
        
        max=0;
        min=10000000;
        suma=0;
        
        do {
            System.out.println("Ingrese un valor");
            valor = leer.nextInt();
            suma= suma+valor;
            if (valor>=max) {
                max=valor;
            }
            if (valor<=min) {
                min=valor;
            } 
            cant2=cant2-1;
        } while (cant2>0);
        System.out.println("El valor maximo es " + max);
        System.out.println("El valor minimo es " + min);
        System.out.println("El promedio es " + (suma/cantOriginal));
        
    }
    
}
