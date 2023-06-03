/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradordia33;

import entidad.Estudiante;
import java.util.Arrays;
import java.util.Scanner;
import servicio.EstudianteServicio;

/**
 *
 * @author Ezequiel
 */
public class IntegradorDia33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        EstudianteServicio es = new EstudianteServicio();
        Estudiante[] e = new Estudiante[8];
        double sumador=0;
        double aux;
        for (int i = 2; i <= 128; i*=2) {
            System.out.println("i " + i);
        }
        for (int i = 0; i < 8; i++) {
            e[i]= es.crearEstudiante();
            aux=e[i].getNota();
            sumador+=aux;
        }
        double promedio=sumador/8;
        System.out.println("El promedio de todo el curso es: "+promedio);
        System.out.println("antes");
        int cont=0;
        for (int i = 0; i < 8; i++) {
            if (e[i].getNota()>=promedio){
                cont++;
            }
        }
        System.out.println("aqui");
        String[] estudiantes= new String[cont];
        cont=0;
        for (int i = 0; i < 8; i++) {
            if (e[i].getNota()>=promedio){
                estudiantes[cont]=e[i].getNombre();
                cont++;
            }
        }
        System.out.println(Arrays.toString(estudiantes));
    }
    
}
