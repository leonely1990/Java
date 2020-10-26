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
public class Contacto {
    private String nombre;
    private String numero;
    
    public Contacto(String nombre, String numero)
    {
        this.nombre = nombre;
        this.numero = numero;
    }
    
    public Contacto()
    {
        nombre = "anonimo";
        numero = "0";
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNumero(String numero)
    {
        this.numero = numero;
    }
    
    public String getNumero()
    {
        return numero;
    }
}
