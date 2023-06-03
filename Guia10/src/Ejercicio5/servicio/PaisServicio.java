/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5.servicio;

import Ejercicio5.entidad.Pais;
import Ejercicio5.utilidad.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class PaisServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public HashSet<Pais> cargarPaiz() {
        HashSet<Pais> nuevo = new HashSet();
        String respuesta;
        do {
            Pais p = new Pais();
            System.out.println("Ingrese el paiz");
            p.setPais(leer.next());

            nuevo.add(p);
            System.out.println("Desea ingresar otro paiz? s/n");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("S"));

        return nuevo;

    }

    public void mostrar(HashSet<Pais> set) {
        for (Pais pais : set) {
            System.out.println(pais);
        }
    }

    public void ordenar(HashSet<Pais> set) {
        List<Pais> list = new ArrayList<>(set);

        Collections.sort(list, Comparadores.ordenar);

        for (Pais pais : list) {
            System.out.println(pais);
        }

    }

    public void eliminarPais(HashSet<Pais> set) {

        String aux;
        System.out.println("Ingrese pais a eliminar");
        aux = leer.next();
        int b = 0;

        Iterator<Pais> it = set.iterator();

        while (it.hasNext()) {
            if (it.next().getPais().equals(aux)) {
                it.remove();
                b = 1;
            }
        }
        
        if (b == 0) {
            System.out.println("No se encontro el pais");
        } else {
            System.out.println("Pais eliminado del conjunto");
        }

        ordenar(set);

    }

}
