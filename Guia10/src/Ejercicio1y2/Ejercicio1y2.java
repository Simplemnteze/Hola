/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1y2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio1y2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razaDePerros = new ArrayList();
        String respuesta;

        do {
            System.out.println("Ingrese la raza del perro");
            razaDePerros.add(leer.next().toUpperCase());
            System.out.println("Desea Ingresar otra raza S/N");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("S"));
        System.out.println(razaDePerros);
        
        
        Iterator<String> iterator = razaDePerros.iterator();
        boolean bandera=false;
        System.out.println("Ingrese un perro ");
        String raza = leer.next();

        while (iterator.hasNext()) {
           // String rza= iterator.next();
            if (iterator.next().equalsIgnoreCase(raza)) {
                iterator.remove();
                bandera = true;
            }
        }
        System.out.println("bandera: "+bandera);
        if(bandera){
            System.out.println("El perro se borro Maxxxx jajaja");
        }else{
            System.out.println("El perro no se encuentra");
        }
        Collections.sort(razaDePerros);

        System.out.println(razaDePerros);
    }

}
