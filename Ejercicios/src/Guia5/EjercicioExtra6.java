/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class EjercicioExtra6 {

    /**
     * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
     */
    
    public static void main(String[] args) {
        String vector[]= new String [5];
        String matriz[][]= new String [20][20];
        SolicitarDatos(vector);
        SopaDeLetras(matriz,vector);
        ImprimirMatriz(matriz);    
    }
       
    public static void SolicitarDatos(String vector[]){
        Scanner leer = new Scanner(System.in);
        String aux;
        
        for (int i = 0; i < vector.length; i++) {

            do {
                System.out.println("Ingrese una palabra entre 3 y 5 caracteres");
                aux= leer.next();
                if ((aux.length()>=3) && (aux.length()<=5)) {
                    System.out.println("Palabra ingresada");;    
                } else {
                    System.out.println("Palabra ingresada invalida. Vuelva a ingresar una palabra");
                }
            } while (!((aux.length()>=3) && (aux.length()<=5)));
            
            vector[i]= aux;
        } 
    }
    
    public static void SopaDeLetras(String matriz[][], String vector[]){
        int pos[]= new int [5];
        int aux, indiceRandom, cont;
        String caracter;
        Random random = new Random();
        
        for (int i = 0; i < pos.length; i++) {
            pos[i]=(int) (Math.random()*20); 
        }
        
        Arrays.sort(pos);
        for (int i = 1; i < pos.length; i++) {
            if (pos[i]==pos[i-1]) {
                pos[i]= pos[i]+1; 
            }   
        }
        
        for (int d : pos) {
            System.out.println(d);           
        }
         
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                aux= random.nextInt(10);
                matriz[i][j]= Integer.toString(aux);
            }
        }
        
        cont=0;
        
        do {
            aux=pos[cont];
            caracter=vector[cont];
            for (int i = 0; i < 20; i++) {
                if (aux==i) {
                    indiceRandom=random.nextInt(10);
                    for (int j = 0; j < caracter.length(); j++) { 
                        matriz[i][indiceRandom]=caracter.substring(j,j+1);
                        indiceRandom++;
                    }
                }
            }
            cont++;
        } while (cont<5);
  
    }
    
    public static void ImprimirMatriz(String matriz[][]){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
