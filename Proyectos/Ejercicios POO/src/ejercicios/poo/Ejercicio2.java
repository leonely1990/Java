/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.poo;

import Clases.Casa;
/**
 *
 * @author leonel
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Casa casa1 = new Casa();
        System.out.println("Caracteristicas de la casa");
        System.out.println("Ciudad:" + casa1.getCiudad());
        System.out.println("Barrio:" + casa1.getBarrio());
        System.out.println("Color:" + casa1.getColor());
        System.out.println("Pisos:" + casa1.getPisos());
        System.out.println("Habitaciones:" + casa1.getHabitaciones());
        System.out.println("Banios:" + casa1.getBanios());
        System.out.println("Cocinas:" + casa1.getCocinas());
    }
}
