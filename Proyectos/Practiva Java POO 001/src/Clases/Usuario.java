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
public class Usuario {
    private String nombre;
    private int edad;
    
    public Usuario(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Usuario()
    {
        nombre = "anonimo";
        edad = 0;
    }
    
    public String getNombre()
    {
        return nombre;
    }
}
