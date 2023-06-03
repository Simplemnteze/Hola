/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra1.entidades;

/**
 *
 * @author Ezequiel
 */
public class Meses {
    private String[] mes = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesSecreto=mes[9];

    public String getMesSecreto() {
        return mesSecreto;
    }
    
    
}
