/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4.servicio;

import Ejercicio4.entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class PeliculaServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula CrearPelicula() {
        Pelicula pelis = new Pelicula();

        System.out.println("Ingrese el titulo de la pelicula");
        pelis.setTitulo(leer.next());
        System.out.println("Ingrese el autor");
        pelis.setAutor(leer.next());
        System.out.println("Ingrese la duracion en horas de la pelicula");
        pelis.setDuracion(leer.nextInt());

        return pelis;
    }

    public void CargarPelicula(ArrayList<Pelicula> ArrayPelicula) {
        System.out.println("Hola .. vamos a cargar peliculas \n");
        String op;
        do {
            ArrayPelicula.add(CrearPelicula());
            System.out.println("desea ingresar otra pelicula S/N  ");
            op = leer.next();

        } while (!op.equalsIgnoreCase("n"));
    }

    public void MostrarPeliculas(ArrayList<Pelicula> ArrayPelicula) {
        for (Pelicula pelicula : ArrayPelicula) {

            System.out.println(pelicula.toString());
        }
        System.out.println("");
    }

    public void DuracionMayor(ArrayList<Pelicula> ArrayPelicula) {
        System.out.println("Las peliulas con duracion mayor a 1 hora son:\n");
        for (Pelicula aux : ArrayPelicula) {

            if (aux.getDuracion() > 1) {
                System.out.println(aux.getTitulo() + " con una duracion de " + aux.getDuracion() + " Horas");

            }
        }
    }
}
