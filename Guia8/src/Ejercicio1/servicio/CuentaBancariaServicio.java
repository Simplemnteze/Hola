/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1.servicio;

import Ejercicio1.entidades.CuentaBancaria;
import java.util.Scanner;

/*
 *
 * Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
public class CuentaBancariaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    
    public CuentaBancaria crearCuenta(){
        
        CuentaBancaria cuenta = new CuentaBancaria();
        
        System.out.println("Ingrese DNI");
        cuenta.setDniCliente(leer.nextLong());
        
        System.out.println("Ingrese numero de cuenta");
        cuenta.setNumeroCuenta(leer.nextInt());
        return cuenta;
    }
    
    public void ingresar(double cantidad, CuentaBancaria cuenta){
        if (cuenta.getDniCliente()==0 && cuenta.getNumeroCuenta()==0) {
            System.out.println("Primero cree una cuenta");
            
        }else{
            cuenta.setSaldoActual(cuenta.getSaldoActual()+cantidad);
        }
    }
    
    public void retirar(double cantidad, CuentaBancaria cuenta){
        if (cuenta.getDniCliente()==0 && cuenta.getNumeroCuenta()==0 && cuenta.getSaldoActual()==0) {
            System.out.println("Primero cree una cuenta e ingrese dinero");
            
        }else{
            if (cantidad <=cuenta.getSaldoActual()) {
                System.out.println("Se retirará de su cuenta $" + cantidad);
                cuenta.setSaldoActual(cuenta.getSaldoActual()-cantidad);
            }else{
                System.out.println("El numero ingresado es mayor al saldo disponible.");
                System.out.println("Se retirará $"+ cuenta.getSaldoActual());
                cuenta.setSaldoActual(0);
            }
        }
    }
    
    public void extraccionRapida(CuentaBancaria cuenta){
        
        if (cuenta.getDniCliente()==0 && cuenta.getNumeroCuenta()==0 && cuenta.getSaldoActual()==0) {
            System.out.println("Primero cree una cuenta e ingrese dinero");
            
        }else{
            cuenta.setSaldoActual(cuenta.getSaldoActual()*0.80);
            System.out.println("Se retiro el 20% quedan $" + cuenta.getSaldoActual()+ " en tu cuenta.");
        }
    }
    
    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("Saldo disponible: $"+ cuenta.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println(cuenta);
    }
    
}
