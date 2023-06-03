/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3.servicio;

import Ejercicio3.entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class AlumnoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Alumno> crearAlumno() {

        ArrayList<Alumno> alumnos = new ArrayList<>();
        String opc;

        do {
            Alumno a = new Alumno();

            System.out.println("Ingrese el nombre del alumno");
            a.setNombre(leer.next());
            ArrayList<Integer> nota = new ArrayList();
            for (int i = 1; i <= 3; i++) {
                System.out.println("Ingrese la nota" + i);
                nota.add(leer.nextInt());
            }
            a.setNotas(nota);
            alumnos.add(a);

            System.out.println("Desea ingresar otro Alumno: S/N");
            opc = leer.next();

        } while (opc.equalsIgnoreCase("S"));

        return alumnos;

    }

    public double buscarAlumno(ArrayList<Alumno> alumnos) {

        System.out.println("Coloque el nombre del Alumno que desea saber la nota Final");
        String nombreBuscar = leer.next();

        Iterator<Alumno> it = alumnos.iterator();

        while (it.hasNext()) {
            Alumno alumnoAux = it.next();
            if (alumnoAux.getNombre().equalsIgnoreCase(nombreBuscar)) {
                return promedioNota(alumnoAux);
            }
        }
        System.out.println("no se encuentra");
        return 0;
    }
    
    public double promedioNota(Alumno alumno){
        double suma=0;
        for (Integer nota:alumno.getNotas()) {
            suma+=nota;
        }
        double promedio=0;
        
        return promedio= suma/alumno.getNotas().size();
    }


}
