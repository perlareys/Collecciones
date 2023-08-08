/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.Servicios;

import Ejercicios.Entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class AlumnoServicio {

    private Scanner leer;
    private List<Alumno> listaAlumnos;

    public AlumnoServicio() {
        listaAlumnos = new ArrayList();
        leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void crearAlumnos(){
        int respuesta;
        do{
            Alumno alumno= new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            alumno.setNombre(leer.next());
            
            for (int i = 1; i <= 3; i++) {
                System.out.println("Ingresar la nota "+i);
                int nota= leer.nextInt();
                alumno.agregarNota(nota);
            }
            listaAlumnos.add(alumno);
            System.out.println("¿Desea añadir otro alumno?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            respuesta=leer.nextInt();
        } while(respuesta==1);
    }
    
    public void buscarAlumno(){
        System.out.println("Ingrese el nombre del alumno del cual desea su "
                + "nota final");
        String nombreBuscar= leer.next();
        boolean encontrado=false;
        
        for (Alumno alumno : listaAlumnos) {
            if(alumno.getNombre().equalsIgnoreCase(nombreBuscar)){
                encontrado= true;
                double notaFinal= alumno.calcularNotaFinal(alumno);
                System.out.println("La nota final del alumno "+ nombreBuscar+" es "+notaFinal);
//                break;
            }
        } if(!encontrado){
            System.out.println("El nombre ingresado no se encuentra en la lista");
        }
    }
}
