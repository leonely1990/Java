/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import clases.Enemigo;
import clases.Personaje;
import java.util.Scanner;

/**
 *
 * @author leonel
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Personaje p1 = new Personaje("Leonel");
        
        System.out.println(p1.toString());
    }
}