/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import Ejercicio3.servicio.ArregloService;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        inicializar A, mostrar A, ordenar A, inicializar B,
//mostrar A y B.

    double[] arrA = new double[50]; 
    double[] arrB = new double[20];
    ArregloService vectores = new ArregloService();
    
        System.out.println("Inicializar A");
        vectores.inicializarA(arrA);
        System.out.println("Mostrar -------");
        vectores.mostrar(arrA);
        System.out.println("");
        System.out.println("Ordenado A");
        vectores.ordenar(arrA);
        System.out.println("Inicializar B");
        vectores.inicializarB(arrA, arrB);
        System.out.println("Vertor A");
        vectores.mostrar(arrA);
        System.out.println("");
        System.out.println("Vector B");
        vectores.mostrar(arrB);
    }
    
}
