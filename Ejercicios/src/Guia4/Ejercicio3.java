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
public class Ejercicio3 {

    /**
     * Crea una aplicación que a través de una función nos convierta una 
     * cantidad de euros introducida por teclado a otra moneda, estas pueden 
     * ser a dólares, yenes o libras. La función tendrá como parámetros, la 
     * cantidad de euros y la moneda a convertir que será una cadena, este no 
     * devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
    El cambio de divisas es:
*       0.86 libras es un 1 €
*       1.28611 $ es un 1 €
*       129.852 yenes es un 1 €

* 
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a convertir");
        double euros = leer.nextDouble();
        String respuesta = "euros";
         do {
                System.out.println("Quiere convertir a libra, dolar o yen?");
                respuesta = leer.next();
            } while ((!respuesta.equals("libra"))&&(!respuesta.equals("dolar"))&&(!respuesta.equals("yen")));
        ConversionMoneda(euros, respuesta);
    }
    public static void ConversionMoneda(double cantidadEuros, String tipoMoneda ){
        if (tipoMoneda.equals("libra")) {
            System.out.println("La cantidad de libras es de: "+(0.86 * cantidadEuros));
            
        }else if (tipoMoneda.equals("dolar")){
            System.out.println("La cantidad de dolares es de: "+(1.28611 * cantidadEuros));
            
        }else{
            System.out.println("La cantidad de yenes es de: "+(129.852 * cantidadEuros));
        }
            
    }
}