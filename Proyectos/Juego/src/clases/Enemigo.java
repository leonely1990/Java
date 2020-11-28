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
    private int nivel;
    private int vida;
    private final int exp;
    private final double ataqueMin;
    private final double ataqueMax;
    private int posX;
    private int posY;
    private final char pinta;
    
    /**
     * Constructor para objetos de la clase Enemigo
     */
    public Enemigo(String nombre, int nivel, int dificultad)
    {
        this.nombre = nombre;
        this.nivel = nivel;
        
        vidaTotal = 100 * nivel;
        vida = vidaTotal;
        exp = nivel * dificultad;
        ataqueMin = 1;
        ataqueMax = 5;
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
    
    public int getExp()
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
    
    public String getXY()
    {
        return "[X:" + posX + " Y:" + posY + "]";
    }
    
    public void setPosX(int posX)
    {
        this.posX = posX;
    }
    
    public void setPosY(int posY)
    {
        this.posY = posY;
    }
    
    public double atacar()
    {
        double dano = Math.random() * (ataqueMax - ataqueMin) + ataqueMin;
        return dano;
    }
    
    public void recibirDano(int dano)
    {
        vida -= dano;
    }
    
    @Override
    public String toString()
    {
        return "Enemigo [Nombre:" + nombre + ", Vida:" + vida +
                "/" + vidaTotal + ", Nivel:" + nivel + ", Exp:" + exp + "]";
    }
}