/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2.servicio;

import Ejercicio2.entidades.ParDeNumeros;

/**
 *
 * @author Ezequiel
 */
public class ParDeNumerosServicio {

    public ParDeNumeros inicializar() {
        ParDeNumeros numeros = new ParDeNumeros();
        return numeros;
    }

    public void mostrarValores(ParDeNumeros numeros) {
        System.out.printf("El primero numero es: %.2f %n", numeros.getNum1());
        System.out.printf("El segundo numero es: %.2f %n", numeros.getNum2());
    }

    public double devolverMayor(ParDeNumeros numeros) {
        return Math.max(numeros.getNum1(), numeros.getNum2());
    }

//    Método calcularPotencia para calcular la potencia del mayor valor de
//la clase elevado al menor número. Previamente se deben redondear
//ambos valores.
    public void calcularPotencia(ParDeNumeros numeros) {
        int redo1 = (int) Math.round(numeros.getNum1());
        int redo2 = (int) Math.round(numeros.getNum2());

        System.out.printf("El numero maximo elevado al numero minimos es: %.2f %n", Math.pow(Math.max(redo2, redo1), Math.min(redo2, redo1)));

    }

//    Método calculaRaiz, para calcular la raíz cuadrada del menor de los
//dos valores. Antes de calcular la raíz cuadrada se debe obtener el
//valor absoluto del número.
    public void calcularRaiz(ParDeNumeros numeros) {

        System.out.printf("La raiz del menor de los 2 valores es: %.2f %n", Math.sqrt(Math.abs(Math.min(numeros.getNum1(), numeros.getNum2()))));

    }
}
