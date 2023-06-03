/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import Ejercicio3.entidad.Alumno;
import Ejercicio3.servicio.AlumnoServicio;
import java.util.ArrayList;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       AlumnoServicio as = new AlumnoServicio();
       ArrayList <Alumno> alumnos  = as.crearAlumno();
       
       alumnos.forEach((a) -> {
           System.out.println(a.toString());
        });
        System.out.println("El promedio es: " + as.buscarAlumno(alumnos));
    }
    
}
