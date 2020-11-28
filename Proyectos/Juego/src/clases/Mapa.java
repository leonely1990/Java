/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 * Write a description of class Mapa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mapa
{
    // instance variables - replace the example below with your own
    private final int x;
    private final int y;
    private char mapa[][];

    /**
     * Constructor for objects of class Mapa
     */
    public Mapa(int x, int y)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public char[][] getMapa()
    {
        return mapa;
    }
    
    /**
     * Metodo que devuelve una matriz llamada mapa
     */
    public void CrearMapa()
    {
        mapa = new char[x][y];
        
        for(int i=0; i<mapa.length; i++)
        {
            for(int j=0; j<mapa.length; j++)
            {
                mapa[i][j] = ' ';
            }
        }
    }
    
    public void verMapa(Personaje personaje, ArrayList<Enemigo> enemigo)
    {
        for(int i=0; i<mapa.length; i++)
        {
            for(int j=0; j<mapa.length; j++)
            {
                mapa[i][j] = ' ';
            }
        }
        
        mapa[personaje.getPosY()][personaje.getPosX()] = personaje.getPinta();
        for(int j=0; j<enemigo.size(); j++)
        {
            mapa[enemigo.get(j).getPosY()][enemigo.get(j).getPosX()] = 
                    enemigo.get(j).getPinta();
        }
        
        for(int i=0; i<mapa.length; i++)
        {
            for(int j=0; j<mapa.length; j++)
            {
                System.out.print(mapa[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("X:" + personaje.getPosX() + " Y:" + 
                personaje.getPosY());
    }
}