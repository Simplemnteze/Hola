/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra2;

import EjercicioExtra2.entidades.NIF;
import EjercicioExtra2.servicio.NIFServicio;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    NIFServicio S1 = new NIFServicio();
    NIF N1 = S1.crearNif();
    
    S1.mostrar(N1);
    }
    
}
