/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra5.entidades;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Empleado {
    Scanner leer = new Scanner(System.in);
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcular_aumento(){
        System.out.println("Ingrese su nombre: ");
        setNombre(leer.nextLine());
        
        System.out.println("Ingrese su edad: ");
        setEdad(leer.nextInt());
        
        System.out.println("Ingrese su salario: ");
        setSalario(leer.nextDouble());
        
        if (getEdad() > 30) {
            System.out.println("Su salario con aumento del 9,8% es: " + (getSalario() * 1.098));
        }else{
            System.out.println("Su salario con aumento del 5% es: " + (getSalario() * 1.05));
        }
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + '}';
    }
}
