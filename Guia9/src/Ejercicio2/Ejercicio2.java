/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import Ejercicio2.entidades.ParDeNumeros;
import Ejercicio2.servicio.ParDeNumerosServicio;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumerosServicio num = new ParDeNumerosServicio();
        ParDeNumeros numeros = num.inicializar();
        
        num.mostrarValores(numeros);
        System.out.println("");
        System.out.printf( "El mayor es; %.2f %n",num.devolverMayor(numeros));
        System.out.println("");
        num.calcularPotencia(numeros);
        System.out.println("");
        num.calcularRaiz(numeros);
       
    }
    
}
