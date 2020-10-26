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
public class Agenda {
    private Contacto agenda[] = new Contacto[10];
    private int i = 0;
    
    public void registrarContacto(Contacto contacto)
    {
        if(i < 10)
        {
            this.agenda[i] = contacto;
            i++;
        }
        else
        {
            System.out.print("Agenda llena!");
        }
    }
    
    public void listarContactos()
    {
        if(i == 0)
        {
            System.out.println("No hay contactos!");
        }
        else
        {
           for(int j=0; j<i; j++)
            {
                System.out.println("Nombre: " + agenda[j].getNombre());
            } 
        }
        
    }
    
    public void buscarContacto(String nombre)
    {
        for(int j=0; j<i; j++)
        {
            if(agenda[j].getNombre().equals(nombre))
            {
                System.out.println(agenda[j].getNumero());
            }
        }
    }
}
