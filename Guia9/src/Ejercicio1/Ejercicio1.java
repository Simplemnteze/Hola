/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import Ejercicio1.entidades.Cadena;
import Ejercicio1.servicio.CadenaServicio;
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
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio cs = new CadenaServicio();
        Cadena ca = cs.cargarFrase();
        int resp;
        String letra;
       
        do {
            System.out.println("MENU");
            System.out.println("1. Mostrar vocales");
            System.out.println("2. Invertir frase");
            System.out.println("3. Buscar letra repetida");
            System.out.println("4. Comparar con otra frase");
            System.out.println("5. Unir frase");
            System.out.println("6. Reemplazar las A por ¿?");
            System.out.println("7. Buscar letra");
            System.out.println("8. salir");   
            resp= leer.nextInt();
            
            switch (resp) {
                case 1:
                    cs.mostrarVocales(ca);
                    break;
                case 2:
                    cs.invetirFrase(ca);
                    break;
                case 3:
                    System.out.println("Ingrese letra a buscar");
                    letra = leer.next();
                    cs.vecesRepetido(ca, letra);
                    break;
                case 4:
                    System.out.println("Ingrese una frase a comparar");
                    letra = leer.next();
                    cs.compararLongitud(ca, letra);
                    break;
                case 5:
                    System.out.println("Ingrese frase a unir");
                    letra = leer.next();
                    cs.unirFrases(ca, letra);
                    break;
                case 6:
                    System.out.println("Ingrese caracter para reemplazar las 'a'.");
                    letra = leer.next();
                    cs.reemplazar(ca, letra);
                    break;
                case 7:
                    System.out.println("Ingrese letra a buscar.");
                    letra = leer.next();
        
                    if (cs.contiene(ca, letra)) {
                    System.out.println("La letra esta dentro de la frase");
                    }else
                    {
                    System.out.println("La letra no esta dentro de la frase");
                    }
                    break;
                case 8:
                    System.out.println("Gracias x usar nuestro software.");
                    break;
                default:
                    System.out.println("Opcion invalida");;
            }
  
        } while (resp!=8);
    }
    
}
