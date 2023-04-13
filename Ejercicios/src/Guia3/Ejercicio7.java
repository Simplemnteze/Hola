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
public class Ejercicio7 {

    /**
     * Realizar un programa que simule el funcionamiento de un dispositivo
    RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
    cadenas deben llegar con un formato fijo: tienen que ser de un máximo
    de 5 caracteres de largo, el primer carácter tiene que ser X y el último
    tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas,
    la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
    FDE), y toda secuencia distinta de FDE, que no respete el formato se
    considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de
    lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
    deberá investigar cómo se utilizan las siguientes funciones de Java
    Substring(), Length(), equals().
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String FDE = " ";
        int correcto = 0;
        int incorrecto = 0;

        do {
            System.out.println("Ingrese codigo de 5 caracteres");
            FDE = leer.nextLine();
            if (FDE.substring(0,1).equals("X") && (FDE.length()== 5) && FDE.substring(4).equals("O") ) {
                correcto +=1;
            }else{
                incorrecto +=1;
            }
            
            
        }while (!(FDE.equals("&&&&&")));
        System.out.println("Cantidad de formatos correctos ingresados:" + correcto);
        System.out.println("Cantidad de formatos incorrectos ingresados: " + incorrecto);
    }
    
}
