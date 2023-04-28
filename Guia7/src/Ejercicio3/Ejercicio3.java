/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import Ejercicio3.entidades.Operacion;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion op = new Operacion();
        
        op.crearOperacion();
        
        System.out.println("La suma es: " + op.sumar());
        System.out.println("La resta es: "+ op.resta());
        System.out.println("La multiplicacion es: " + op.multiplicar());
        System.out.println("La division es: "+ op.dividir());
        
    }
    
}
