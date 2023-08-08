/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.Servicios;

import Ejercicios.Entidades.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class PerroServicio {
    private ArrayList<Perro> perrosLista= new ArrayList();
    private ArrayList<String> razasLista= new ArrayList();
    
    private Scanner leer= new Scanner(System.in);
    
    public void crearPerro(){
        Perro perro= new Perro();
        
        System.out.println("Ingresar nombre del perro");
        perro.setNombre(leer.next());
        System.out.println("Ingresar raza del perro");
        String raza= leer.next();
        perro.setRaza(raza);
        System.out.println("Ingresar edad del perro");
        perro.setEdad(leer.nextInt());
        
        perrosLista.add(perro);
        razasLista.add(raza);
    }
    
    public void mostrarPerros(){
        System.out.println("Los perros ingresados son: ");
        for (Perro p : perrosLista) {
            System.out.println(p);
        }
    }
    
    public void mostrarRazas(){
        System.out.println("Las razas ingresadas son: ");
        for (String aux : razasLista) {
            System.out.println(aux);
        }
    }
    
    public void eliminarPerro(){
        System.out.println("Ingrese el nombre a eliminar");
        String eliminar= leer.next();
        
        Iterator<Perro> it= perrosLista.iterator();
        while(it.hasNext()){
            Perro aux= it.next();
            if(aux.equals(eliminar)){
                it.remove();
            } else{
                System.out.println("No encontrado");
            }
        }
    }
    
}
