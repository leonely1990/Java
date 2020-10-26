/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author leonel
 */
public class Menu {
    private String opcion1 = "1. Crear contacto";
    private String opcion2 = "2. Ver contactos";
    
    
    public Menu()
    {
        
    }
    
    public void mostrarMenu()
    {
        System.out.println(opcion1);
        System.out.println(opcion2);
    }
    
    public void crearContacto(String nombre, String numero)
    {
        Contacto con = new Contacto();
    }
}
