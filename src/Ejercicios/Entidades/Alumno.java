/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.Entidades;

import java.util.ArrayList;

/**
 *
 * @author Perla
 */
public class Alumno {

    private String nombre;
    private ArrayList<Integer> listaNotas;

    public Alumno() {
        this.listaNotas = new ArrayList();
    }

    public Alumno(String nombre, ArrayList<Integer> listaNotas) {
        this.nombre = nombre;
        this.listaNotas = listaNotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public void agregarNota(int nota) {
        listaNotas.add(nota);
    }

    public double calcularNotaFinal(Alumno alumno) {
        ArrayList<Integer> listaNotas = getListaNotas();
        int sumaTotal = 0;

        for (int aux : listaNotas) {
            sumaTotal += aux;
        }
        return (double) sumaTotal / listaNotas.size();
    }
}
