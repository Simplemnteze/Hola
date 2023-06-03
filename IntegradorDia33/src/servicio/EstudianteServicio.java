/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class EstudianteServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Estudiante crearEstudiante(){
        Estudiante e = new Estudiante();
        
        System.out.println("Ingrese nombre estudiante");
        e.setNombre(leer.next());
        System.out.println("Ingrese nota del estudiante");           
        e.setNota(leer.nextInt());
            
        return e;
    }
}
