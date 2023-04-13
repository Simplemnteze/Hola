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
public class Ejercicio8 {

    /**
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
    Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
    lo siguiente:
*   * * * *
*   *     *
*   *     *
*   * * * *
* 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero y se dibujara un cuadrado");
        int n = leer.nextInt();
        for (int i=1; i<=n;i++) {
            for (int j=1; j<=n; j++) {
                if (i==1 || j==1 || i==n || j==n) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }            
            }
            System.out.println("");
        }
    }
    
}
