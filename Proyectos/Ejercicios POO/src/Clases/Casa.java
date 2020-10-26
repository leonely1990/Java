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
public class Casa {
    private final String ciudad = "Valencia";
    private final String barrio = "Pereferico";
    private final String color = "Blanco";
    private final int pisos = 1;
    private final int habitaciones = 6;
    private final int banios = 3;
    private final int cocinas = 1;
    
    public String getCiudad()
    {
        return ciudad;
    }
    
    public String getBarrio()
    {
        return barrio;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public int getPisos()
    {
        return pisos;
    }
    
    public int getHabitaciones()
    {
        return habitaciones;
    }
    
    public int getBanios()
    {
        return banios;
    }
    
    public int getCocinas()
    {
        return cocinas;
    }
}
