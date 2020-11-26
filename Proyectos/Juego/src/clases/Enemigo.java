/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
/**
 * Clase enemigo
 * 
 * @author Leonel 
 * @version 0.01
 */
public class Enemigo
{
    // Atributos
    private final String nombre;
    private final int vidaTotal;
    public int vida;
    private final double exp;
    private final double ataqueMin;
    private final double ataqueMax;
    private int posX;
    private int posY;
    private final char pinta;

    /**
     * Constructor para objetos de la clase Enemigo
     */
    public Enemigo(String nombre, int vidaTotal, double exp, double ataqueMin, double ataqueMax)
    {
        this.nombre = nombre;
        this.vidaTotal = vidaTotal;
        this.exp = exp;
        this.ataqueMin = ataqueMin;
        this.ataqueMax = ataqueMax;
        vida = vidaTotal;
        posX = 30;
        posY = 31;
        pinta = 'o';
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public double getVida()
    {
        return vida;
    }
    
    public double getExp()
    {
        return exp;
    }
    
    public double getAtaqueMin()
    {
        return ataqueMin;
    }
    
    public double getAtaqueMax()
    {
        return ataqueMax;
    }
    
    public char getPinta()
    {
        return pinta;
    }
    
    public int getPosX()
    {
        return posX;
    }
    
    public int getPosY()
    {
        return posY;
    }
    
    @Override
    public String toString()
    {
        return "Enemigo [Nombre: " + nombre + ", Vida: " + vida + "/" + vidaTotal + "]";
    }
}