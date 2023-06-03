/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1.servicio;

import Ejercicio1.entidades.Cadena;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author Ezequiel
 */
public class CadenaServicio {
    

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public Cadena cargarFrase(){
        
        System.out.println("Ingrese una frase");
        Cadena ca = new Cadena(leer.next());
        return ca;
    }
    
    //    Método mostrarVocales(), deberá contabilizar la cantidad de vocales que 
//    tiene la frase ingresada.
    
    public void mostrarVocales(Cadena c){
        int cont = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().substring(i,i+1).equalsIgnoreCase("a")||c.getFrase().substring(i,i+1).equalsIgnoreCase("e")||c.getFrase().substring(i,i+1).equalsIgnoreCase("i")||c.getFrase().substring(i,i+1).equalsIgnoreCase("o")||c.getFrase().substring(i,i+1).equalsIgnoreCase("u")) {
                cont++;
            }
        }
        System.out.println("Se encontraron " + cont + " vocales.");
    }
    
    public void mostrarVocales2(Cadena c){
        int cont = 0;
        for(int x=0;x<c.getLongitud();x++) {
        if ((c.getFrase().charAt(x)=='a') || (c.getFrase().charAt(x)=='e') || (c.getFrase().charAt(x)=='i') || (c.getFrase().charAt(x)=='o') || (c.getFrase().charAt(x)=='u')){ 
            cont++;
          }  
    }
        System.out.println("Se encontraron " + cont + " vocales.");
    }
    
//    Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por 
//            pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    
    public void invetirFrase(Cadena c){
//        String[] invertida=new String[c.getLongitud()];
        String inv = "";
        int cont=0;
        for (int i = c.getLongitud()-1; i >= 0; i--) {
//            invertida[cont]= c.getFrase().substring(i,i+1);
            inv= inv + c.getFrase().substring(i,i+1);
//            System.out.print(invertida[cont]);
            cont++; 
            
        }
        System.out.println("");
        System.out.println(inv);
//        System.out.println(Arrays.toString(invertida));
    }
    
//    Método vecesRepetido(String letra), recibirá un carácter ingresado
//por el usuario y contabilizar cuántas veces se repite el carácter en la
//frase, por ejemplo:
//    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
//veces.
    
    public void vecesRepetido(Cadena c, String letra){
        int cont=0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().substring(i,i+1).equalsIgnoreCase(letra)) {
                cont++;
            }
        }
        System.out.println("El caracter '" + letra + "' se repite "+cont+" veces.");
    }
    
//    Método compararLongitud(String frase), deberá comparar la longitud
//de la frase que compone la clase con otra nueva frase ingresada por
//el usuario.
    
    public void compararLongitud(Cadena ca, String frase){
        if (ca.getLongitud()==frase.length()) {
            System.out.println("La longitud de ambas frases es igual");
        }else
            System.out.println("La longitud de ambas frases son distintas");
    }
    
//    Método unirFrases(String frase), deberá unir la frase contenida en la
//clase Cadena con una nueva frase ingresada por el usuario y mostrar
//la frase resultante.
    
    public void unirFrases(Cadena ca, String frase){
        String unir="";
        unir= ca.getFrase() + frase;
        ca.setFrase(unir);
        ca.setLongitud(unir.length());
    }
    
//    Método reemplazar(String letra), deberá reemplazar todas las letras
//“a” que se encuentren en la frase, por algún otro carácter
//seleccionado por el usuario y mostrar la frase resultante.
    
    public void reemplazar(Cadena ca, String letra){
        
        String inv = "";
        
        for (int i = 0; i < ca.getLongitud(); i++) {
            if (ca.getFrase().substring(i, i+1).equalsIgnoreCase("a")) {
                inv= inv + letra;
            }else{
                inv= inv + ca.getFrase().substring(i,i+1);
            }
        }
        ca.setFrase(inv);
        System.out.println("");
        System.out.println(inv);
        
    }
    
//    Método contiene(String letra), deberá comprobar si la frase contiene
//una letra que ingresa el usuario y devuelve verdadero si la contiene y
//falso si no.
    
    public boolean contiene(Cadena ca, String letra){
        
        for (int i = 0; i < ca.getLongitud(); i++) {
            if (ca.getFrase().substring(i, i+1).equalsIgnoreCase(letra)) {
                return true;
            }   
        }
        return false;
    }
    
    
}
