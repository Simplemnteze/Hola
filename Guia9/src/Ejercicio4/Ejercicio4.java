/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import Ejercicio4.servicio.FechaService;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         Date fe = new Date();

        FechaService fecha = new FechaService();
        
        fe = fecha.fechaNacimiento();
        
        System.out.println( fe);
        System.out.println("");
        
        System.out.println(fecha.fechaActual());
        System.out.println("La edad es de:");
        
        
        
        System.out.println(fecha.diferencia(fecha.fechaActual(), fe));
        
    
    }
    
}
