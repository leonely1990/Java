/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.poo;

import Clases.*;
import java.util.*;
/**
 *
 * @author leonel
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Menu menu1 = new Menu();
        while(true)
        {
           menu1.mostrarMenu();
           System.out.print(">");
           int opcion = sc.nextInt();
           switch(opcion)
           {
               case 1:
                   System.out.print("Nombre:");
                   sc.nextLine();
                   String nombre = sc.nextLine();
                   System.out.print("Numero:");
                   String numero = sc.nextLine();
                   menu1.crearContacto(nombre, numero);
               case 2:
                   
           }
        }
        
    }
}
