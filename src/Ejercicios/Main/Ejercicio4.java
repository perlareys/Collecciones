/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.Main;

import Ejercicios.Servicios.PeliculaServicio;

/**
 *
 * @author Perla
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaServicio peli= new PeliculaServicio();
        
        peli.agregarPelicula();
        peli.mostrarLista();
        peli.mayoresAunaHora();
        peli.duracionDesc();
        peli.duracionAsc();
        peli.nombreAlfab();
        peli.directorAlfab();
    }
    
}
