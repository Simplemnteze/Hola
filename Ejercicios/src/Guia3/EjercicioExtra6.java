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
public class EjercicioExtra6 {

    /**
     * Leer la altura de N personas y determinar el promedio de estaturas que
    se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
    general.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de personas");
        int N = leer.nextInt();
        double estatura = 0;
        int cont = 0;
        double suma = 0;
        for (int i=1; i<=N; i++) {
            System.out.println("Ingrese la estatura de la persona " + i);
            estatura = leer.nextDouble();
            if (estatura<=1.60) {
                cont++;
                suma = suma + estatura;
            }
        }
        System.out.println("El promedio de las personas con menos de 1.60 mts es " + (suma/cont));
    }
    
}
