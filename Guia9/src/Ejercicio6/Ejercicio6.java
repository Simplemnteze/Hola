/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import Ejercicio6.entidades.Curso;
import Ejercicio6.servicio.CursoServicio;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoServicio cs = new CursoServicio();
        Curso curso = cs.crearCurso();
        System.out.println(cs.calcularGananciaSemanal(curso));
        System.out.println(curso);
    }
    
}
