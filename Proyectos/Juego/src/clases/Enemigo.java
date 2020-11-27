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
    private final int nivel;
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
    public Enemigo(String nombre, int nivel, double ataqueMin, 
            double ataqueMax, int dificultad)
    {
        this.nombre = nombre;
        this.vidaTotal = (nivel * 100) / dificultad;
        this.nivel = nivel;
        this.exp = nivel * dificultad;
        this.ataqueMin = ataqueMin;
        this.ataqueMax = ataqueMax;
        vida = vidaTotal;
        posX = 30;
        posY = 30;
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
    
    public void setPosX(int posX)
    {
        this.posX = posX;
    }
    
    public void setPosY(int posY)
    {
        this.posY = posY;
    }
    
    @Override
    public String toString()
    {
        return "Enemigo [Nombre: " + nombre + ", Vida: " + vida +
                "/" + vidaTotal + ", Nivel:" + nivel + ", Exp:" + exp + "]";
    }
}