/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.Servicios;

import Ejercicios.Entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class PaisServicio {

    private HashSet<Pais> listaPaises;
    private Scanner leer;

    public PaisServicio() {
        listaPaises = new HashSet<>();
        leer = new Scanner(System.in);
    }

    public void crearHash() {
        int salir;
        do {
            Pais pais = new Pais();
            System.out.println("Ingrese un país");
            pais.setNombre(leer.next());
            listaPaises.add(pais);
            System.out.println("¿Desea agregar otro país?");
            System.out.println("1.Sí");
            System.out.println("2.No");
            salir = leer.nextInt();
        } while (salir != 2);
    }

    public void mostrarPaises() {
        for (Pais aux : listaPaises) {
            System.out.println(aux);
        }
    }

    public void ordenarPaises() {
        List<String> ordenarPaises = new ArrayList<>();
        System.out.println("Países ordenador por nombre alfabeticamente:");

        for (Pais aux : listaPaises) {
            String ordenar = aux.getNombre();
            ordenarPaises.add(ordenar);
        }
        Collections.sort(ordenarPaises);
        System.out.println(ordenarPaises);
    }

    public void buscarPais() {
        System.out.println("Ingrese el país que desea eliminar");
        String eliminar = leer.next();
        boolean encontrado = false;
        Iterator<Pais> iterator = listaPaises.iterator();
        while(iterator.hasNext()){
            Pais aux =iterator.next();
            if(aux.getNombre().equalsIgnoreCase(eliminar)){
                iterator.remove();
                encontrado=true;
            }
        }
        System.out.println("Países: ");
        System.out.println(listaPaises);
        if(!encontrado){
            System.out.println("El país ingresado no existe");
        }
    }
}
