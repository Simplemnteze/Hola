/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2.entidades;

/**
 *
 * @author Ezequiel
 */
public class Cafetera {
    private double capacidadMáxima=100;
    private double cantidadActual;

    public Cafetera() {
    }

    public Cafetera(double capacidadMáxima, double cantidadActual) {
        this.capacidadMáxima = capacidadMáxima;
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMáxima() {
        return capacidadMáxima;
    }

    public void setCapacidadMáxima(double capacidadMáxima) {
        this.capacidadMáxima = capacidadMáxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadM\u00e1xima=" + capacidadMáxima + ", cantidadActual=" + cantidadActual + '}';
    }
    
    
}
