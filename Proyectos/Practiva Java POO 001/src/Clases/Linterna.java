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
public class Linterna {
    private boolean io;
    private int nivelBateria;
    private final String estado1 = "Encendido";
    private final String estado2 = "Apagado";
    
    public Linterna()
    {
        io = false;
        nivelBateria = 0;
    }
    
    public void setIO()
    {
        if(nivelBateria == 0)
        {
            System.out.println("Sin bateria");
        }
        else
        {
            io = true;
        }
    }
    
    public void setNivelBateria()
    {
        if(nivelBateria == 0)
        {
            Bateria nuevaBateria = new Bateria();
            nivelBateria = nuevaBateria.getEnergia();
        }
        else
        {
            System.out.print("Aun tiene Energia!");
        }
    }
    
    public String getEstado()
    {
        if(io)
        {
            return estado1;
        }
        else
        {
            return estado2;
        }
    }
    
    public int getNivelBateria()
    {
        return nivelBateria;
    }
}
