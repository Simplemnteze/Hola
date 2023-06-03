/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import Ejercicio3.entidades.Persona;
import Ejercicio3.servicio.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio ps = new PersonaServicio();
        
        System.out.println("Ingrese la cantidad de personas");
        int cant = leer.nextInt();
        Persona[] personas = new Persona[cant];
        int[] IMC = new int[cant];
        boolean[] mayor = new boolean[cant];
        double sobrepeso=0;
        double pesoIdeal=0;
        double pesoBajo=0;
        int esMayor=0;
        int esMenor=0;
        for (int i = 0; i < cant; i++) {
            personas[i] = ps.crearPersona();
            IMC[i] = ps.calcularIMC(personas[i]);
            switch (IMC[i]) {
                case 1:
                    System.out.println("La persona tiene sobrepeso");
                    sobrepeso++;
                    break;
                case 0:
                    System.out.println("La persona tiene peso ideal");
                    pesoIdeal++;
                    break;
                default:
                    System.out.println("La persona es bajo peso");
                    pesoBajo++;
                    break;
            }
            mayor[i] = ps.esMayor(personas[i]);
            if (mayor[i]) {
                esMayor++;
            }else{
                esMenor++;
            }
        }
        for (int i = 0; i < cant; i++) {
            System.out.println(personas[i]);
        }
        System.out.println("El promedio de personas con sobrepeso es "+(sobrepeso/cant)*100+"%");
        System.out.println("El promedio de personas con peso ideal es "+(pesoIdeal/cant)*100+"%");
        System.out.println("El promedio de personas con bajo peso es "+(pesoBajo/cant)*100+"%");
        
        System.out.println("Personas mayores: "+esMayor);
        System.out.println("Personas menores: "+esMenor);
    }
    
}
