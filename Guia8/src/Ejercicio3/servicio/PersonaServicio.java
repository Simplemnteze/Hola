/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3.servicio;

import Ejercicio3.entidades.Persona;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Ezequiel
 */
public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre");
        persona.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        persona.setEdad(leer.nextInt());
        
        char resp;
        do {
            System.out.println("Ingrese el sexo");
            resp=leer.next().charAt(0);
        } while (resp != 'H' && resp!='M' && resp!='O');

        persona.setSexo(resp);
        System.out.println("Ingrese el peso");
        persona.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura");
        persona.setAltura(leer.nextDouble());
        return persona;
    }
    
    public boolean esMayor(Persona persona){
        return persona.getEdad()>=18;
    }
    
    public int calcularIMC(Persona persona){
        double pesoIdeal = persona.getPeso()/Math.pow(persona.getAltura(), 2);
        
        if (pesoIdeal<20) {
            return -1;
        } else if (pesoIdeal<=20 && pesoIdeal<=25) {
            return 0;
        } else
        return 1;
    }
}
