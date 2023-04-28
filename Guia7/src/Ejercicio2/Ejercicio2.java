/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import Ejercicio2.entidades.Circunferencia;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia circulo = new Circunferencia(0);
        
        circulo.crearCircunferencia();
        
        System.out.println("Area: "+circulo.area(circulo.getRadio()));
        System.out.println("Perimetro: "+circulo.perimetro(circulo.getRadio()));
    }
    
}
