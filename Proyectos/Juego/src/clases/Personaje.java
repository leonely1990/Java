/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author leonel
 */
public class Personaje {
    private String nombre;
    private int nivel;
    private int exp;
    private String prof;
    
    public Personaje(String nombre, String prof)
    {
        this.nombre = nombre;
        this.nivel = 1;
        this.exp = 0;
        this.prof = prof;
    }
    
    public void expPersonaje(int exp)
    {
        this.exp += exp;
        if(this.exp >= 1000)
        {
            nivel += 1;
            this.exp -= 1000;
        }
    }
}
