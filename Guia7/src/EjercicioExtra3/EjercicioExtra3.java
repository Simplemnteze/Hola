/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra3;

import EjercicioExtra3.entidades.Juego;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Juego jugar = new Juego();
        String tecla;
        
        do {
            jugar.iniciar_juego();

            System.out.println("El jugador 1 ha ganado: "+ jugar.getGanarJugador1());
            System.out.println("El jugador 2 ha ganado: "+ jugar.getGanarJugador2());
            
            System.out.println("Desea seguir Jugando");
            tecla=input.next();
        }while(tecla.equalsIgnoreCase("S"));
        
    }
    
}
