/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiva.java.poo.pkg001;

/**
 *
 * @author leonel
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private int edad;
    private final String mensaje1 = "Te amo mi reina hermosa";
    
    public Usuario(String nombre, String apellido, int edad)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String getMensaje1()
    {
        return mensaje1;
    }
}
