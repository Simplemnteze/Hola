/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra2.entidades;

/**
 *
 * @author Ezequiel
 */
public class Ahorcado {

    private String[] palabra;
    private String[] palabraSecreta;
    private int letras_encontradas;
    private int jugada_maxima;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, String[] palabraSecreta, int letras_encontradas, int jugada_maxima) {
        this.palabra = palabra;
        this.palabraSecreta = palabraSecreta;
        this.letras_encontradas = letras_encontradas;
        this.jugada_maxima = jugada_maxima;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public String[] getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(String[] palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public int getLetras_encontradas() {
        return letras_encontradas;
    }

    public void setLetras_encontradas(int letras_encontradas) {
        this.letras_encontradas = letras_encontradas;
    }

    public int getJugada_maxima() {
        return jugada_maxima;
    }

    public void setJugada_maxima(int jugada_maxima) {
        this.jugada_maxima = jugada_maxima;
    }

}
