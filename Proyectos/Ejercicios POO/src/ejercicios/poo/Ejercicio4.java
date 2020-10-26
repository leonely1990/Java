/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.poo;

import Clases.Agenda;
import Clases.Contacto;
/**
 *
 * @author leonel
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        //Creando agenda
        Agenda agenda1 = new Agenda();
        //Creando contactos
        Contacto c1 = new Contacto("Leonel", "04163356110");
        Contacto c2 = new Contacto("Karibay", "0412445056");
        Contacto c3 = new Contacto("Anaia", "04163345771");
        Contacto c4 = new Contacto("Alaia", "04123356110");
        Contacto c5 = new Contacto("Kelly", "04243356110");
        
        agenda1.registrarContacto(c1);
        agenda1.registrarContacto(c2);
        agenda1.registrarContacto(c3);
        agenda1.registrarContacto(c4);
        agenda1.registrarContacto(c5);
        
        agenda1.listarContactos();
        agenda1.buscarContacto("Anaia");
    }
}
