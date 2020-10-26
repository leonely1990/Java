/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.poo;

import Clases.Libro;
/**
 *
 * @author leonel
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Libro l1 = new Libro("leonel", "Viva la vida", 250);
        Libro l2 = new Libro("Karibay", "El amor", 500);
        
        l1.mostrarLibro();
        l2.mostrarLibro();
        
        l1.compararLibros(l1, l2);
    }
}
