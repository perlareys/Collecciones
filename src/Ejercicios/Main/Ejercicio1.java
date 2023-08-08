/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.Main;

/**
 *
 * @author Perla
 */
import Ejercicios.Entidades.Perro;
import Ejercicios.Servicios.PerroServicio;
import java.util.Scanner;

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PerroServicio perros = new PerroServicio();
        Scanner leer = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Ingrese 1 si quiere ingresar un perro");
            System.out.println("Ingrese 2 si quiere ver la lista de perros");
            System.out.println("Ingrese 3 si quiere ver la lista de razas");
            System.out.println("Ingrese 4 si quiere eliminar un perro");
            System.out.println("Ingrese 0 para salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    perros.crearPerro();
                    break;
                case 2:
                    perros.mostrarPerros();
                    break;
                case 3:
                    perros.mostrarRazas();
                    break;
                case 4:
                    perros.eliminarPerro();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opcion != 0);
    }
}
