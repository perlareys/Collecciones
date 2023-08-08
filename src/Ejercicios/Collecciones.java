/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Perla
 */
public class Collecciones {

    public static void main(String[] args) {
        // Arrays
        String[] nombresArray = new String[5];

        for (int i = 0; i < nombresArray.length; i++) {
            nombresArray[i] = "Chiquito " + (i + 1);
        }

        for (String var : nombresArray) {
            System.out.println(var);
        }

        //Collections
        ArrayList<String> nombresArrayList = new ArrayList();
        nombresArrayList.add("Chiquito 1");
        nombresArrayList.add("Chiquito 2");
        nombresArrayList.add("Chiquito 3");

        System.out.println(nombresArrayList.size());

        //Ejemplo de un ArrayList de números
        ArrayList<Integer> numerosA = new ArrayList();

        //Ejemplo de una LinkedList de números
        LinkedList<Integer> numerosB = new LinkedList();

        //CONJUNTOS
        //Ejemplo de un HashSet de cadenas
        HashSet<String> nombres = new HashSet();

        //Ejemplo de un TreeSet de números
        TreeSet<Integer> numeros = new TreeSet();

        //Ejemplo de un LinkedHashSet de cadenas
        LinkedHashSet<String> frases = new LinkedHashSet();

        //MAPAS
        //Ejemplo de un HashMap de personas
        //HashMap<Llave, Valor> identificador = new HashMap();
        HashMap<Integer, String> personasA = new HashMap();

        //Ejemplo de TreeMap de personas
        TreeMap<Integer, String> personasB = new TreeMap();

        //Ejemplo de un LinkedHashMap de personas
        LinkedHashMap<Integer, String> personasC = new LinkedHashMap();

    }

}
