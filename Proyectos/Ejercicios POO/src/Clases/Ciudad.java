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
public class Ciudad {
    private String nombre;
    private int poblacion;
    private String pais;
    private String presidente;
    
    public Ciudad()
    {
        
    }
    
    public Ciudad(String nombre, int poblacion, String pais, String presidente)
    {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.pais = pais;
        this.presidente = presidente;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setPoblacion(int poblacion)
    {
        this.poblacion = poblacion;
    }
    
    public void setPais(String pais)
    {
        this.pais = pais;
    }
    
    public void setPresidente(String presidente)
    {
        this.presidente = presidente;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public int getPoblacion()
    {
        return poblacion;
    }
    
    public String getPais()
    {
        return pais;
    }
    
    public String getPresidente()
    {
        return presidente;
    }
}
