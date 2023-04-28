/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra4;

import EjercicioExtra4.entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class EjercicioExtra4 {

    /**Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        
        System.out.println("Ingrese su nombre");
        cuenta.setTitular(leer.nextLine());
        
        do {
            System.out.println("Cuanto desea retirar de la cuenta?");
            cuenta.retirar_dinero(leer.nextDouble());
        } while (cuenta.getSaldo()>0);
  
    }
    
}
