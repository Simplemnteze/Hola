/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra4.entidades;

/**
 *Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 * @author Ezequiel
 */
public class Cuenta {
    private double saldo=1000;
    private String titular;

    public Cuenta() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void retirar_dinero(double dinero){
        if (saldo>=dinero) {
            System.out.println("Se retirara de la cuenta: "+ dinero);
            saldo-=dinero;
            System.out.println("Le queda en cuenta: "+ saldo);
        }else{
            System.out.println("El dinero que quiere retirar es superior al saldo disponible. atte" + titular + "raton");
            
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + ", titular=" + titular + '}';
    }
    
}
