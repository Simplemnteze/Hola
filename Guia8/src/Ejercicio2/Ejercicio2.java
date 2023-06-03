/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import Ejercicio2.entidades.Cafetera;
import Ejercicio2.servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraServicio cafe = new CafeteraServicio();
        Cafetera c1= cafe.llenarCafetera();
        Scanner leer = new Scanner(System.in);
        int opc;
        do{
            System.out.println("MENU");
            System.out.println("1. Servir taza");
            System.out.println("2. Agregar cafe a cafetera");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Llenar cafetera");
            System.out.println("5. Consultar cafetera");
            System.out.println("6. Salir");
            opc=leer.nextInt();
            switch (opc) {
                case 1:
                    cafe.servirTaza(c1);
                    break;
                case 2:
                    cafe.agregarCafe(c1);
                    break;
                case 3:
                    cafe.vaciarCafetera(c1);
                    break;
                case 4:
                    cafe.reLlenarCafetera(c1);
                    break;
                case 5:
                    System.out.println(c1.getCantidadActual());
                    break;
                case 6:
                    System.out.println("Gracias x usar el servicio");
                    break;
                default:
                    System.out.println("Opcion invalida");;
            }
        }while (opc!=6);
        
    }
    
}
