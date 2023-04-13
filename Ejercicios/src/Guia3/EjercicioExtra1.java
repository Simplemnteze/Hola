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
public class EjercicioExtra1 {

    /**
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int min, horas, dias;
        horas = 0;
        dias = 0;
        System.out.println("Ingrese cantidad de minutos");
        min = leer.nextInt();
        
        do {                  
            if ((min-1440 >0) && (min>60)) {
                dias +=1;
                min = min-1440;
                //System.out.println(min);
            } else
                horas +=1;
                min= min-60;           
        }while (min > 0);
        
        System.out.println("Dias " + dias + ", Horas " + horas);
    }
    
}
