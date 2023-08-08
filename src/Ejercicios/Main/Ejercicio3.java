/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.Main;

import Ejercicios.Servicios.AlumnoServicio;

/**
 *
 * @author Perla
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoServicio alumno= new AlumnoServicio();
        alumno.crearAlumnos();
        alumno.buscarAlumno();
    }
    
}
