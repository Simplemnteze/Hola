/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra6;

import EjercicioExtra6.entidades.Rectangulo2;

/**
 *
 * @author Ezequiel
 */
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo2 rectangulo1 = new Rectangulo2(4, 6);
        
        System.out.println("El área del rectángulo es: "+rectangulo1.calcular_area());
    }
    
}
