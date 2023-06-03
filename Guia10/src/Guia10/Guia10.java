/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Ezequiel
 */
public class Guia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> NumerosA = new ArrayList();
        int a = 10, b = 20, c = 30, d = 40, e = 50;
        NumerosA.add(a);
        NumerosA.add(b);
        NumerosA.add(c);
        NumerosA.add(d);
        NumerosA.add(e);

//        for (Integer numerosA:NumerosA) {
//            System.out.println(numerosA);
//        }
        NumerosA.remove(2);
        for (Integer numerosA : NumerosA) {
            System.out.println(numerosA);
        }
        Iterator<Integer> iterator = NumerosA.iterator();
        System.out.println("Elementos de la Lista");

        while (iterator.hasNext()) {
            if (iterator.next() == 40) {
                iterator.remove();
                break;
            }
        }
        System.out.println(NumerosA);

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(" ");
        TreeSet<String> Lista = new TreeSet();

        HashSet<Integer> NumerosB = new HashSet();
        int f = 10, g = 20, h = 30, i = 40, j = 50;
        NumerosB.add(f);
        NumerosB.add(g);
        NumerosB.add(h);
        NumerosB.add(i);
        NumerosB.add(j);
        NumerosB.remove(30);
        for (Integer numerosB : NumerosB) {
            System.out.println(numerosB);
        }
        HashMap<Integer, String> personas = new HashMap();
        int dni1 = 1, dni2 = 2, dni3 = 3, dni4 = 4, dni5 = 5;
        String n1 = "Ruben", n2 = "Giulia", n3 = "Miguel", n4 = "Gabriel", n5 = "Caro";
//        int n1=23,n2=24,n3=25,n4=26,n5=27;
        personas.put(dni1, n1);
        personas.put(dni2, n2);
        personas.put(dni3, n3);
        personas.put(dni4, n4);
        personas.put(dni5, n5);

        personas.entrySet().forEach((entry) -> {
            System.out.println("Documento: " + entry.getKey() + " Nombre: " + entry.getValue());
        });

        personas.remove(dni1, n1);

        NumerosA.forEach((numerosA) -> {
            System.out.println(numerosA);
        });

        HashMap<String, String> personas2 = new HashMap();
        String na1 = "Albus";
        String na2 = "Severus";
        personas2.put(na1, na2);

    }

}
