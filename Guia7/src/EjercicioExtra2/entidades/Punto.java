/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra2.entidades;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Punto {

    private double x1, y1, x2, y2;

    public Punto() {
    }

    public Punto(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la coordenada del x1:");
        this.x1 = leer.nextDouble();
        
        System.out.println("Ingresa la coordenada del y1:");
        this.y1 = leer.nextDouble();
        
        System.out.println("Ingresa la coordenada del x2:");
        this.x2 = leer.nextDouble();
        
        System.out.println("Ingresa la coordenada del y2:");
        this.y2 = leer.nextDouble();
    }
    
    public double calcularDistanciaSqrt(){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//        return Math.pow(((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))), 0.5);
    }
    public double calcularDistanciaSinSqrt(){
//        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return Math.pow(((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))), 0.5);
    }

    @Override
    public String toString() {
        return "Punto{" + "x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + '}';
    }
}
