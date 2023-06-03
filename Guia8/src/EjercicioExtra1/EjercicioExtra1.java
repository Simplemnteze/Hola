/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra1;

import EjercicioExtra1.entidades.Raices;
import EjercicioExtra1.servicio.RaicesServicio;

/**
 *
 * @author Ezequiel
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        RaicesServicio a1 = new RaicesServicio();
        
        Raices aux = a1.init();
        
        System.out.println(aux);
        
        //System.out.println("El valor del metodo discriminante es:  " +  a1.getDiscriminante(aux));
        
        //System.out.println("Tiene dos soluciones = " + a1.tieneRaices(aux));
        
        //Calculamos el valor de las raices
        //a1.obtenerRaices(aux);
        
        //Calculamos el valor de una sola raiz
        //a1.obtenerRaiz(aux);
        
        //Hace todo
        a1.calcular(aux);
    }
    
}
    
