/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import Ejercicio5.entidad.Pais;
import Ejercicio5.servicio.PaisServicio;
import java.util.HashSet;


/**
 *
 * @author Ezequiel
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisServicio ps = new PaisServicio();
        HashSet<Pais> setPais =ps.cargarPaiz();
        System.out.println("Datos cargados al Conjunto");
        ps.mostrar(setPais);
        System.out.println("Datos Ordenados alfabeticamente");
        ps.ordenar(setPais);
        ps.eliminarPais(setPais);
   
    }
    
}
