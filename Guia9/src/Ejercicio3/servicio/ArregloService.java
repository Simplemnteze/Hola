/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3.servicio;

import java.util.Arrays;

/**
 *
 * @author Ezequiel
 */
public class ArregloService {

    public void inicializarA(double[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.random() * 10;
        }
    }

    public void mostrar(double[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf(" | %.2f | ", arreglo[i]);
        }

    }

    public void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);
        double aux[] = Arrays.copyOf(arreglo, arreglo.length);
        for (int i = arreglo.length - 1; i >= 0; i--) {
            arreglo[i] = aux[(arreglo.length - 1) - i];
        }
    }

    public void inicializarB(double[] arregloA, double[] arregloB) {
        System.arraycopy(arregloA, 0, arregloB, 0, 10);

        Arrays.fill(arregloB, 10, 20, 0.5);
    }

}
