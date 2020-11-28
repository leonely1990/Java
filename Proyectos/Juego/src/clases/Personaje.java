/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

 /**
 * Clase que crea personajes
 * 
 * @author Leonel 
 * @version 0.01
 */
public class Personaje
{
    // Atributos
    private final String nombre;
    private int vidaTotal;
    public int vida;
    private int manaTotal;
    private int mana;
    private int nivel;
    private int exp;
    private int ataqueMin;
    private int ataqueMax;
    private int alcance;
    private int posX;
    private int posY;
    private final char pinta;
    
    /**
     * Bloque de Codigo Inicializador.
     * 
     * El siguiente bloque de codigo inicializa todas las variables por
     * defecto.
     */
    {
        //Inicializar manaTotal
        vidaTotal = 100;
        vida = vidaTotal;
        manaTotal = 100;
        mana = manaTotal;
        nivel = 1;
        exp = 0;
        ataqueMin = 10;
        ataqueMax = 15;
        alcance = 1;
        posX = (int)Math.round(Math.random()*30);
        posY = (int)Math.round(Math.random()*30);
        pinta = 'x';
    }

    /**
     * Constructor de objetos de la clase Personaje.
     */
    public Personaje(String nombre)
    {
        // initialise instance variables
        this.nombre = nombre;
    }
    
    /**
     * Devuelve el nombre del personaje
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * Devuelve la experiencia del personaje
     */
    public double getExp()
    {
        return exp;
    }
    
    /**
     * Devuelve el nivel del personaje
     */
    public int getNivel()
    {
        return nivel;
    }
    
    /**
     * Devuelve el total del ataque minimo del personaje
     */
    public double getAtaqueMin()
    {
        return ataqueMin;
    }
    
    /**
     * Devuelve el total del ataque maximo del personaje
     */
    public double getAtaqueMax()
    {
        return ataqueMax;
    }
    
    /**
     * Devuelve la vida total del personaje
     */
    private double getVidaTotal()
    {
        return vidaTotal;
    }
    
    /**
     * Devuelve el mana total del personaje
     */
    private double getManaTotal()
    {
        return manaTotal;
    }
    
    /**
     * Devuelve la vida actual del personaje
     */
    public double getVida()
    {
        return vida;
    }
    
    /**
     * Devuelve el mana actual del personaje
     */
    public double getMana()
    {
        return mana;
    }
    
    /**
     * Devuelve la posicion del personaje con respecto a X
     */
    public int getPosX()
    {
        return posX;
    }
    
    /**
     * Devuelve la posicion del personaje con respecto a Y
     */
    public int getPosY()
    {
        return posY;
    }
    
    public int getRango()
    {
        return alcance;
    }
    
    public void setExp(Enemigo e)
    {
        exp += e.getExp();
        if(exp >= 100)
        {
            exp -= 100;
            setNivel();
        }
    }
    
    private void setNivel()
    {
        ++nivel;
        vidaTotal += 20;
        manaTotal += 20;
    }
    
    /**
     * Este metodo resta 1 la posicion en Y del personaje, si la posicion llega a 0
     * no continuara restando por ende el personaje no caminara hacia arriba el valor
     * de posY sera 0
     */
    public int CaminarArriba()
    {
        --posY;
        if(posY < 0){
            posY = 0;
        }
        return posY;
    }
    
    /**
     * Este metodo acepta una parametro de tipo entero el cual sera restado a la posicion del personaje,
     * si la cantidad a restar hace que posY sea menos a 0 automaticamente posY sera 0
     */
    public int CaminarArriba(int arriba)
    {
        posY -= arriba;
        if(posY < 0){
           posY = 0;
        }
        return posY;
    }
    
    public int CaminarAbajo()
    {
        ++posY;
        if(posY > 49){
            posY = 49;
        }
        return posY;
    }
    
    public int CaminarAbajo(int abajo)
    {
        posY += abajo;
        if(posY > 49){
            posY = 49;
        }
        return posY;
    }
    
    public int CaminarDerecha()
    {
        ++posX;
        if(posX > 49){
            posX = 49;
        }
        return posX;
    }
    
    public int CaminarDerecha(int derecha)
    {
        posX += derecha;
        if(posX > 49){
            posX = 49;
        }
        return posX;
    }
    
    public int CaminarIzquierda()
    {
        --posX;
        if(posX < 0){
            posX = 0;
        }
        return posX;
    }
    
    public int CaminarIzquierda(int izquierda)
    {
        posX -= izquierda;
        if(posX < 0){
            posX = 0;
        }
        return posX;
    }
    
    public char getPinta()
    {
        return pinta;
    }
    
    public double atacar()
    {
        double dano = Math.random() * (ataqueMax - ataqueMin) + ataqueMin;
        return dano;
    }
    
    /*public boolean RangodeAtaque(char mapa[][])
    {        
        boolean bandera = false;
        
        int X = posX;
        int Y = posY;
        
        if(Y == 0){
            ++Y;
        }
        
        if(Y == mapa.length-1){
            --Y;
        }
        
        if(X == 0){
            ++X;
        }
        
        if(X == mapa.length-1){
            --X;
        }
        
        for(int i=Y-1; i<=Y+1; i++){
           for(int j=X-1; j<=X+1; j++){
               if(mapa[i][j] == 'o' ){
                   bandera = true;
                }
            }
        }
        
        return bandera;
    }*/
    
    public boolean Rango(char mapa[][], ArrayList<Enemigo> enemigo)
    {
        boolean bandera = false;
        
        int i = 0;
        
        int pxMin = posX - alcance;
        int pxMax = posX + alcance;
        int pyMin = posY - alcance;
        int pyMax = posY + alcance;
        
        if(pxMin < 0){
            pxMin = 0;
        }
        
        if(pxMax > mapa.length-1){
            pxMax = mapa.length-1;
        }
        
        if(pyMin < 0){
            pyMin = 0;
        }
        
        if(pyMax > mapa.length-1){
            pyMax = mapa.length-1;
        }
        
        for(int j=0; j<enemigo.size(); j++)
        {
            if((enemigo.get(j).getPosX() >= pxMin) && 
               (enemigo.get(j).getPosX() <= pxMax) && 
               (enemigo.get(j).getPosY() >= pyMin) && 
               (enemigo.get(j).getPosY() <= pyMax))
            {
            bandera = true;
            //enemigos[i] = enemigo[j];
            i++;
            }
        }
                
        for(int j=0; j<i; j++)
        {
            System.out.println(enemigo.get(j));
        }
        
        return bandera;
    }
    
    public void recibirDano(int dano)
    {
        vida -= dano;
    }
    
    @Override
    public String toString()
    {
        return "Personaje [Nombre:" + nombre + ", Nivel:" + nivel + ", Exp:" + 
                exp + ", Vida:" + vida + "/" + vidaTotal + 
        ", Mana:" + mana + "/" + manaTotal + "]";
    }
}