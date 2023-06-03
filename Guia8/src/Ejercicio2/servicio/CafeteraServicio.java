/*
 * a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
capacidad máxima.

b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.

c) Método vaciarCafetera(): pone la cantidad de café actual en cero.

d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café
indicada.
 */
package Ejercicio2.servicio;

import Ejercicio2.entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class CafeteraServicio {
    static Scanner leer = new Scanner(System.in);
    
    public Cafetera llenarCafetera(){
        Cafetera cofee = new Cafetera();
        cofee.setCantidadActual(cofee.getCapacidadMáxima());
    return cofee;
    }
     public Cafetera reLlenarCafetera(Cafetera cafe){
        
        cafe.setCantidadActual(cafe.getCapacidadMáxima());
         System.out.println("Se lleno la cafetera");
    return cafe;
    }
    /*
     Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.
    */
    public void servirTaza(Cafetera cafe){
        System.out.println("Ingrese el tamaño de la taza");
        double tamanio=leer.nextDouble();
        
        if (tamanio>cafe.getCantidadActual()) {
            System.out.println("Se sirvió " + cafe.getCantidadActual() + " ya que no alcanza para llenar la taza");
            cafe.setCantidadActual(0);
        } else{
            System.out.println("Se sirvió " + tamanio + " y se lleno la taza");
            cafe.setCantidadActual(cafe.getCantidadActual()-tamanio);
        }
    }
    
    public void vaciarCafetera(Cafetera cafe){
        cafe.setCantidadActual(0);
        System.out.println("Se vacio la cafetera");
    }
    
    public void agregarCafe(Cafetera cafe){
        System.out.println("Ingrese la cantidad de cafe a ingresar en Cafetera");
        int cantidad = leer.nextInt();
        if (cantidad+cafe.getCantidadActual()<= cafe.getCapacidadMáxima()) {
            System.out.println("Se agrego "+cantidad+" a la cafetera");
            cafe.setCantidadActual(cafe.getCantidadActual()+cantidad);  
        }else{
            System.out.println("La cantidad a agregar supera a la capacidad maxima. Se lleno la cafetera");
            cafe.setCantidadActual(cafe.getCapacidadMáxima());
            
        }
    }
}
