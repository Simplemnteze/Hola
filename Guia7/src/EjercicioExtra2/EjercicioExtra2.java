/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra2;

import EjercicioExtra2.entidades.Punto;

/**
 *
 * @author Ezequiel
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto punto1 = new Punto();
        
        punto1.crearPuntos();
        
        System.out.println(punto1);
        System.out.printf("Distancia con sqrt: %.2f %n",punto1.calcularDistanciaSqrt());
        
        System.out.printf("Distancia sin sqrt: %.2f %n",punto1.calcularDistanciaSinSqrt());
    }
    
}
