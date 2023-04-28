/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4.entidades;

import java.util.Scanner;

/**
 *Crear una clase Rectángulo que modele rectángulos por medio de un atributo
    privado base y un atributo privado altura. La clase incluirá un método para 
    crear el rectángulo con los datos del Rectángulo dados por el usuario. 
    También incluirá un método para calcular la superficie del rectángulo y un 
    método para calcular el perímetro del rectángulo. Por último, tendremos un 
    método que dibujará el rectángulo mediante asteriscos usando la base y la 
    altura. Se deberán además definir los métodos getters, setters y 
    constructores correspondientes.

    Superficie = base * altura / Perímetro = (base + altura) * 2.
    
 * @author Ezequiel
 */
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese base");
        this.base= leer.nextDouble();
        System.out.println("Ingrese altura");
        this.altura= leer.nextDouble();    
    }
    
    public double perimetro(){  
        return ((base+altura)*2);
    }
    
    public double superficie(){
        return (base*altura);
    }
    
    public void dibujarRectangulo(){
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (j==0 || i==0 || i==altura-1 || j==base-1) {
                    System.out.print("*");
                                        
                }   else
                    System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println("");
        }
        
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    
}
