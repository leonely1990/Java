/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.poo;

import Clases.Ciudad;
/**
 *
 * @author leonel
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear Objeto de la clase Ciudad usando contructor con parametros
        Ciudad c1 = new Ciudad("Venezuela", 4500000, "Valencia", "El guevo mio");
        Ciudad c2 = new Ciudad();
        
        //llenar atributos del objeto c2
        String nombre = "Venezuela";
        String pais = "Caracas";
        int poblacion = 1500000;
        String presidente = "Care loco";
        //se llaman los metodos set del objeto c2
        c2.setNombre(nombre);
        c2.setPais(pais);
        c2.setPoblacion(poblacion);
        c2.setPresidente(presidente);
        //Se imprimen los objetos por medio de los metodos get
        System.out.println("Ciudad:" + c1.getPais());
        System.out.println("Poblacion:" + c1.getPoblacion());
        System.out.println("Presidente:" + c1.getPresidente());
        System.out.println("Ciudad:" + c2.getPais());
        System.out.println("Poblacion:" + c2.getPoblacion());
        System.out.println("Presidente:" + c2.getPresidente());
    }
    
}
