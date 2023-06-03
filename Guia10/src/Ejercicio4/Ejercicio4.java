/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import Ejercicio4.entidad.Pelicula;
import Ejercicio4.servicio.PeliculaServicio;
import Ejercicio4.utilidad.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Pelicula> ArrayPelicula = new ArrayList<>();

        PeliculaServicio pelis = new PeliculaServicio();

        pelis.CargarPelicula(ArrayPelicula);
        pelis.MostrarPeliculas(ArrayPelicula);
        pelis.DuracionMayor(ArrayPelicula);
        System.out.println("");
        System.out.println("----MENU----");
        System.out.println("1. Ordenar por Autor");
        System.out.println("2. Ordenar por Titulo");
        System.out.println("3. Ordenar por mayor duracion");
        System.out.println("4. Ordenar por menor duracion");
        int var = leer.nextInt();
        switch (var) {
            case 1:
                Collections.sort(ArrayPelicula, Comparadores.ordenarPorAutor);
                pelis.MostrarPeliculas(ArrayPelicula);
                break;
            case 2:
                Collections.sort(ArrayPelicula, Comparadores.ordenarPorTitulo);
                pelis.MostrarPeliculas(ArrayPelicula);
                break;
            case 3:
                Collections.sort(ArrayPelicula, Comparadores.ordenarPorDuracionMayor);
                pelis.MostrarPeliculas(ArrayPelicula);
                break;
            case 4:
                Collections.sort(ArrayPelicula, Comparadores.ordenarPorDuracionMenor);

                pelis.MostrarPeliculas(ArrayPelicula);
                break;

            default:
                System.out.println("Opcion invalida");
                ;
        }

    }

}
