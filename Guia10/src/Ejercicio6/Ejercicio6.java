/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import Ejercicio6.entidad.Producto;
import Ejercicio6.servicio.ProductoServicio;
import Utilidad.Utilidad;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        ProductoServicio ps = new ProductoServicio();
        HashMap<String, Producto> map = new HashMap();
        Utilidad cls = new Utilidad();
        int resp;
        do {
            cls.clearScreen();
            System.out.println("-----MENU----");
            System.out.println("1. Cargar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Mostar productos y precios");
            System.out.println("4. Modificar precio a producto");
            System.out.println("5. Salir");
            resp = input.nextInt();
            switch (resp) {
                case 1:
                    ps.cargarProducto(map);
                    break;
                case 2:
                    ps.eliminarProducto(map);
                    break;
                case 3:
                    ps.mostarProducto(map);
                    break;
                case 4:
                    ps.modificarPrecio(map);
                    break;
                case 5:
                    System.out.println("Gracias :D");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    ;
            }
        }while (resp != 5);

    }
    
    public void limpiar(){
        Utilidad cls = new Utilidad();
        
     
        
    }
        
}
