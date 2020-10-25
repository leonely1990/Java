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
public class CarrosPrueba implements Carros
{
    private int x;
    private int y;
    
    public CarrosPrueba()
    {
        
    }
    
    public int getX()
    {
        return x;
    }
    
    @Override
    public void Acelerar()
    {
        System.out.println("El carro Acelera");
    }
    
    @Override
    public void Frenar()
    {
        System.out.println("El carro Frena");
    }
}
