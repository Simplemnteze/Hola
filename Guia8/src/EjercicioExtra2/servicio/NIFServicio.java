/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra2.servicio;

import EjercicioExtra2.entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class NIFServicio {
    
    public NIF crearNif(){
        Scanner leer = new Scanner(System.in);
        NIF nif = new NIF();
        char Letra[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        System.out.println("Ingrese su DNI");
        nif.setDNI(leer.nextLong());
        int aux = (int) nif.getDNI() % 23;
        nif.setLetra(Letra[aux]);
        
        return nif;
    }
    
    public void mostrar(NIF n2) {
        System.out.printf("%08d-%s",n2.getDNI(), n2.getLetra());
    }
}
