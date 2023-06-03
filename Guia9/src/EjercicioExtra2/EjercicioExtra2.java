/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra2;

import EjercicioExtra2.servicio.AhorcadoServicio;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        Scanner leer = new Scanner(System.in);

        AhorcadoServicio ahorcado = new AhorcadoServicio();

        ahorcado.juego();

    }

}
