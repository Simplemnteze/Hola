/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6.servicio;

import Ejercicio6.entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class CursoServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //        Método cargarAlumnos(): este método le permitirá al usuario ingresar los 
//        alumnos que asisten a las clases. Nosotros nos encargaremos de 
//        almacenar esta información en un arreglo e iterar con un bucle, 
//        solicitando en cada repetición que se ingrese el nombre de cada alumno.

    private String[] cargarAlumnos(){
        String[] cadena= new String[5];
        for (int i = 0; i < cadena.length; i++) {
            System.out.println("Ingrese el nombre del alumno nro: " + (i+1));
            cadena[i]=leer.next();
        }
        return cadena;
    }
    
//    Método crearCurso(): el método crear curso, le pide los valores de los 
//    atributos al usuario y después se le asignan a sus respectivos 
//    atributos para llenar el objeto Curso. En este método invocamos 
//    al método cargarAlumnos() para asignarle valor al atributo alumnos
    
    public Curso crearCurso(){
        Curso c = new Curso();
        System.out.println("Ingrese nombre del curso");
        c.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas por dia");
        c.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana");
        c.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese turno (maniana/tarde)");
        c.setTurno(leer.next());
        System.out.println("Ingrese precio por hora");
        c.setPrecioPorHora(leer.nextInt());
        c.setAlumnos(cargarAlumnos());
        return c;
    }  
    
//    Método calcularGananciaSemanal(): este método se encarga de calcular 
//    la ganancia en una semana por curso. Para ello, se deben multiplicar
//    la cantidad de horas por día, el precio por hora, la cantidad de 
//    alumnos y la cantidad de días a la semana que se repite el encuentro.

    public double calcularGananciaSemanal(Curso curso){ 
        return curso.getCantidadHorasPorDia()*curso.getCantidadDiasPorSemana()*curso.getAlumnos().length*curso.getPrecioPorHora();
    }
    
}
