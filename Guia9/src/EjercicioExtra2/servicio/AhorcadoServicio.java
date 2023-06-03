/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra2.servicio;

import EjercicioExtra2.entidades.Ahorcado;
import Utilidad.Utilidad;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class AhorcadoServicio {

//jugadas máxima. Con la palabra del usuario, pone la longitud de la
//palabra, como la longitud del vector. Después ingresa la palabra en el
//vector, letra por letra, quedando cada letra de la palabra en un índice
//del vector. Y también, guarda la cantidad de jugadas máximas y el
//valor que ingresó el usuario.
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearJuego(Ahorcado h1) {

        System.out.println("Ingrese una palabra");
        String palabra = leer.next();
        System.out.println("Ingrese la cantidad de intentos  ");
        h1.setJugada_maxima(leer.nextInt());

        String[] vector = new String[palabra.length()];
        String[] vectorB = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {

            vector[i] = palabra.substring(i, i + 1);
        }

        h1.setPalabra(vector);
        Arrays.fill(vectorB, "_");
        h1.setPalabraSecreta(vectorB);

    }

    public void longitud(Ahorcado h1) {

        System.out.println("La longitud de la palabra es: " + h1.getPalabra().length);

    }
// Método buscar(letra): este método recibe una letra dada por el
//usuario y busca si la letra ingresada es parte de la palabra o no.
//También informará si la letra estaba o no.

    public void Buscar(Ahorcado h2, String letra) {
        boolean bandera = false;
        for (int i = 0; i < h2.getPalabra().length; i++) {

            if (h2.getPalabra()[i].equalsIgnoreCase(letra)) {
                bandera = true;
                break;
            }
        }
        if (bandera) {
            System.out.println("Mensaje: la letra pertenece a la palabra");
        } else {
            System.out.println("Mensaje: la letra NO pertenece a la palabra");
        }
    }

//    Método encontradas(letra): que reciba una letra ingresada por el
//usuario y muestre cuantas letras han sido encontradas y cuántas le
//faltan. Este método además deberá devolver true si la letra estaba y
//false si la letra no estaba, ya que, cada vez que se busque una letra
//que no esté, se le restará uno a sus oportunidades.
    public boolean encontradas(Ahorcado h2, String letra) {

        int c = 0;
        String[] palabraSecreta = h2.getPalabraSecreta();
        for (int i = 0; i < h2.getPalabra().length; i++) {

            if (h2.getPalabra()[i].equalsIgnoreCase(letra)) {
                palabraSecreta[i] = letra.toUpperCase();
                c++;
            }
        }
        int aux = h2.getLetras_encontradas();
        h2.setLetras_encontradas(aux + c);// sumador de letras encontradas 
        int l_faltantes = h2.getPalabra().length - h2.getLetras_encontradas();

        System.out.println("Número de letras (encontradas, faltantes):" + h2.getLetras_encontradas() + "," + l_faltantes);

        return c > 0;
    }

//        Método intentos(): para mostrar cuántas oportunidades le queda al
//        jugador.
    public void intentos(Ahorcado h2) {

        System.out.println("Número de oportunidades restantes: " + h2.getJugada_maxima());
    }

//            Método juego(): el método juego se encargará de llamar todos los
//            métodos previamente mencionados e informará cuando el usuario
//            descubra toda la palabra o se quede sin intentos. Este método se
//            llamará en el main.
    private void mostrarLetrasCorrectas(Ahorcado h1) {

        for (Object i : h1.getPalabraSecreta()) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public void juego() throws InterruptedException {
        Ahorcado h1 = new Ahorcado();
        Utilidad cls = new Utilidad();
        crearJuego(h1);
        do {
//            cls.clearScreen();
            longitud(h1);
            mostrarLetrasCorrectas(h1);
            System.out.println("Ingrese una letra: \n");
            String letra = leer.next();
            
            Buscar(h1, letra);
            cls.clearScreen();
            if (!encontradas(h1, letra)) {
                h1.setJugada_maxima(h1.getJugada_maxima() - 1);

            }
            intentos(h1);
            
//            Thread.sleep(5000);
            
        } while (h1.getJugada_maxima() > 0 && h1.getLetras_encontradas() != h1.getPalabra().length);

        if (h1.getJugada_maxima() == 0) {

            System.out.println("Se acabaron los intentos.. Perdiste");

        } else {
            System.out.println("Usted gano!!! La palabra es: " + Arrays.toString(h1.getPalabra()));

        }
    }
}
