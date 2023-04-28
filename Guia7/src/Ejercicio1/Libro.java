/*
 * * Crear una clase llamada Libro que contenga los siguientes atributos: 
     * ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
     * atributos pasados por parámetro y un constructor vacío. Crear un método 
     * para cargar un libro pidiendo los datos al usuario y luego informar 
     * mediante otro método el número de ISBN, el título, el autor del libro y 
     * el número de páginas.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Libro {

    private int ISBN;
    private String Titulo;
    private String Autor;
    private int NumeroDePaginas;

    public Libro() {
    }

    public Libro(int ISBN, String Titulo, String Autor, int NumeroDePaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroDePaginas = NumeroDePaginas;
    }

    public void cargarLibro() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese Titulo");
        this.Titulo = leer.nextLine();

        System.out.println("Ingrese Autor");
        this.Autor = leer.nextLine();

        System.out.println("Ingrese Numero de paginas");
        this.NumeroDePaginas = leer.nextInt();

        System.out.println("Ingrese ISBN");
        this.ISBN = leer.nextInt();

    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getNumeroDePaginas() {
        return NumeroDePaginas;
    }

    public void setNumeroDePaginas(int NumeroDePaginas) {
        this.NumeroDePaginas = NumeroDePaginas;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumeroDePaginas=" + NumeroDePaginas + '}';
    }

}
