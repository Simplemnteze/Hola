/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6.servicio;

import Ejercicio6.entidad.Producto;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class ProductoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void cargarProducto(HashMap<String, Producto> pro){
        
            Producto p = new Producto();
            System.out.println("Ingrese el nombre del producto");
            p.setProducto(leer.next());
            System.out.println("Ingrese el precio de " +p.getProducto());
            p.setPrecio(leer.nextDouble());
            
            pro.put(p.getProducto(), p);

        
    }
    
    public void mostarProducto(HashMap<String, Producto> pro){
        
        for (Map.Entry<String, Producto> entry : pro.entrySet()) {
            String key = entry.getKey();
            Producto value = entry.getValue();
            System.out.println(value.toString());
            
        } 
//        System.out.println(pro.size());
    }
    
    public void modificarPrecio (HashMap<String, Producto> pro){
    
        System.out.println("Ingrese nombre del producto a modificar el precio");
        String prod=leer.next();
        System.out.println("Ingrese nuevo precio");
        Double precioNuevo = leer.nextDouble();
        
        pro.replace(prod, new Producto(prod,precioNuevo));
        
    }
    
    public void eliminarProducto (HashMap<String, Producto> pro){
        
        String resp=" ";
        
        do {
            System.out.println("Ingrese el producto a eliminar");
            String prod = leer.next();
            
            if (pro.containsKey(prod)) {
                pro.remove(prod);
                System.out.println("Se elimino el producto");
                break;
            }else{
                System.out.println("No se encontro el articulo. Desea eliminar otro? s/n");
                resp =leer.next();
            }
            
        } while (resp.equalsIgnoreCase("S"));
        
        
    }
}
