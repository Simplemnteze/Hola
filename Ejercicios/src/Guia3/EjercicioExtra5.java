/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class EjercicioExtra5 {

    /**
     * Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char tipoSocio;
       
        System.out.println("Ingrese Tipo de socio A/B/C");
        tipoSocio = leer.next().charAt(0);
        System.out.println("Ingrese costo del tratamiento");
        double costo = leer.nextDouble();
        
        switch (tipoSocio) {
            case 'A': System.out.println("Pasa socio A el importe a pagar es " + (costo*0.50));
            break;
            case 'B': System.out.println("Para socio B el importe a pagar es " + (costo - (costo*0.35)));
            break;
            case 'C': System.out.println("Para socio C el importe a pagar es " + (costo));
            break;
            default: System.out.println("Tipo de socio invalido.");
        }
    }
    
}
