/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra3.entidades;

import java.util.Scanner;

/** ENUNCIADO
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos 
 * jugadores jugar un juego de adivinanza de números. 
 * El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
 * El segundo jugador tiene un número limitado de intentos y recibe una pista 
 * de "más alto" o "más bajo" después de cada intento. El juego termina cuando 
 * el segundo jugador adivina el número o se queda sin intentos. 
 * Registra el número de intentos necesarios para adivinar el número y el número de veces 
 * que cada jugador ha ganado.

 *
 * @author beniccio
 */
public class Juego {
    
    private int adivinar;
    private int adivinador;
    private int ganarJugador1=0;
    private int ganarJugador2=0;
    
    private int intentos = 5;
    private String pistaAlto = "Mas Alto";
    private String pistaBajo = "Mas Bajo";
    

    public Juego() {
    }

    public int getAdivinar() {
        return adivinar;
    }

    public void setAdivinar(int adivinar) {
        this.adivinar = adivinar;
    }

    public int getAdivinandor() {
        return adivinador;
    }

    public void setAdivinandor(int adivinandor) {
        this.adivinador = adivinandor;
    }

    public int getGanarJugador1() {
        return ganarJugador1;
    }

    public void setGanarJugador1(int ganarJugador1) {
        this.ganarJugador1 = ganarJugador1;
    }

    public int getGanarJugador2() {
        return ganarJugador2;
    }

    public void setGanarJugador2(int ganarJugador2) {
        this.ganarJugador2 = ganarJugador2;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getPistaAlto() {
        return pistaAlto;
    }

    public void setPistaAlto(String pistaAlto) {
        this.pistaAlto = pistaAlto;
    }

    public String getPistaBajo() {
        return pistaBajo;
    }

    public void setPistaBajo(String pistaBajo) {
        this.pistaBajo = pistaBajo;
    }

    
    public void iniciar_juego(){
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Jugador N° 01 ingrese un numero a adivinar: ");
        adivinar = input.nextInt();
        
        
                
        do{
            System.out.print("Jugador N° 02 adivine el número: ");
            adivinador = input.nextInt();
            if(adivinador==adivinar){
                ganarJugador2 += 1;
                System.out.println("Usted ha ganado");
                break;
            }else{
                this.intentos -= 1;
                if(adivinador > adivinar){
                    System.out.println(this.pistaBajo);
                }else{
                    System.out.println(this.pistaAlto);
                }
                System.out.println("Usted tiene "+intentos+" intentos");
            }
 
            if (intentos == 0 ){
                System.out.println("Usted ha perdido, se ha quedado sin intentos");
                this.ganarJugador1 += 1;
            }
        }while (intentos >0 ) ;
    
    }
    
    
    
    
    
    
}