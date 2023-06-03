/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra1;

import EjercicioExtra1.entidades.Meses;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in).useDelimiter("\n");
        Meses juego = new Meses();
        boolean respuesta=false;
        String opcion;
        do {
            
            System.out.print("Ingrese un mes en minusculas: ");
            opcion=leer.next();
            if (opcion.equals(juego.getMesSecreto())) {
                System.out.println("Acertaste");
                respuesta=true;
            } else{
                System.out.print("Intente nuevamente. ");
            }
            
            
        } while (!respuesta);
        
        
        
        
    }
    
}
