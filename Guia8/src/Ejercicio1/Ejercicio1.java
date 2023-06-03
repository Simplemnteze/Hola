/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import Ejercicio1.entidades.CuentaBancaria;
import Ejercicio1.servicio.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancariaServicio cuenta = new CuentaBancariaServicio();
        CuentaBancaria c1 = new CuentaBancaria();
        Scanner leer = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("=====MENU=====");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Extraccion rapida");
            System.out.println("5. Consultar saldo");
            System.out.println("6. Consultar datos de cuenta");
            System.out.println("7. Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1: 
                    c1 = cuenta.crearCuenta();
                    break;
                case 2: 
                    System.out.println("Cuanto dinero quiere ingresar?");
                    cuenta.ingresar(leer.nextDouble(),c1);
                    break;
                case 3:
                    System.out.println("Cuanto dinero quiere retirar?");
                    cuenta.retirar(leer.nextDouble(),c1);
                    break;
                case 4:
                    cuenta.extraccionRapida(c1);
                case 5:
                    cuenta.consultarSaldo(c1);
                    break;
                case 6:
                    cuenta.consultarDatos(c1);
                    break;
                case 7:
                    System.out.println("Gracias por usar el servicio.");
                    break;
                default:
                    System.out.println("Opcion invalida");;
            }
            
        } while (opcion!=7);
        
    }
    
}
