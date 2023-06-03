/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import Ejercicio5.entidades.Persona;
import Ejercicio5.servicio.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicio p1 = new PersonaServicio();
        Persona persona1 = p1.crearPersona();
        System.out.println(persona1);
        System.out.println("La edad es: " + p1.calcularEdad(persona1));
        System.out.println("Ingrese la edad a comparar");
        int edad = leer.nextInt();
        System.out.println("¿Es menor?" + p1.menorQue(persona1, edad));
//        System.out.println("prueba" + p1.prueba(edad));
        p1.mostrarPersona(persona1);
    }
    
}
