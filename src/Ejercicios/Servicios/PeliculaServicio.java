/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.Servicios;

import Ejercicios.Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class PeliculaServicio {

    private List<Pelicula> listaPeliculas;
    private Scanner leer;

    public PeliculaServicio() {
        listaPeliculas = new ArrayList<>();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void agregarPelicula() {
        int agregar;
        System.out.println("-------BIENVENIDO-------");
        do {
            Pelicula p = new Pelicula();
            System.out.println("Ingrese el nombre de la película");
            p.setTitulo(leer.next());
            System.out.println("Nombre del director");
            p.setDirector(leer.next());
            System.out.println("Duración");
            p.setDuracion(leer.nextInt());

            listaPeliculas.add(p);
            System.out.println("¿Desea ingresar otra película");
            System.out.println("1. Sí");
            System.out.println("2. No");
            agregar = leer.nextInt();
        } while (agregar != 2);
    }

    public void mostrarLista() {
        System.out.println("Las películas son:");
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
    }

    public void mayoresAunaHora() {
        //boolean encontrado= false;
        System.out.println("Las películas con duración mayor a 1 hora son: ");
        for (Pelicula aux : listaPeliculas) {
            if (aux.getDuracion() > 1) {
                System.out.println(aux);
            }
        }
    }

    public void duracionDesc() {
        List<Integer> listaDuracion = new ArrayList<>();
        for (Pelicula lista : listaPeliculas) {
            Integer duracion = lista.getDuracion();
            listaDuracion.add(duracion);
        }
        Collections.sort(listaDuracion);
        System.out.println("Las películas según su duración de mayor a menor son:");

        for (Integer duracion : listaDuracion) {
            System.out.println(duracion);
        }
    }

    public void duracionAsc() {
        List<Integer> listaDuracion = new ArrayList<>();
        for (Pelicula lista : listaPeliculas) {
            Integer duracion = lista.getDuracion();
            listaDuracion.add(duracion);
        }

        System.out.println("Las películas según su duración de menor a mayor son:");
        Collections.sort(listaDuracion, Collections.reverseOrder());

        for (Integer duracion : listaDuracion) {
            System.out.println(duracion);
        }
    }

    public void nombreAlfab() {
        List<String> listaTitulos = new ArrayList<>();
        for (Pelicula aux : listaPeliculas) {
            String titulo = aux.getTitulo();
            listaTitulos.add(titulo);
        }
        Collections.sort(listaTitulos);
        System.out.println("Las películas ordenadas por títulos son: ");
        for (String listaOrdenada : listaTitulos) {
            System.out.println(listaOrdenada);
        }
    }

    public void directorAlfab() {
        List<String> listaDirectores = new ArrayList<>();
        for (Pelicula aux : listaPeliculas) {
            String director = aux.getDirector();
            listaDirectores.add(director);
        }
        Collections.sort(listaDirectores);
        System.out.println("Las películas ordenadas por directores son: ");
        for (String listaOrdenada : listaDirectores) {
            System.out.println(listaOrdenada);
        }
    }
}
