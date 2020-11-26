/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

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
    private double vidaTotal;
    public double vida;
    private double manaTotal;
    private double mana;
    private int nivel;
    private double exp;
    private double ataqueMin;
    private double ataqueMax;
    private int posX;
    private int posY;
    private final char pinta;

    /**
     * Constructor de objetos de la clase Personaje.
     * 
     * El personaje comenzara con un nivel de 1 y exp 0, tambien tendra ataque min y max en 1
     * su posicion en el mapa de juego sera (X=25, Y=25) la vida y el mana estaran en 100
     */
    public Personaje(String nombre)
    {
        // initialise instance variables
        this.nombre = nombre;
        vidaTotal = 100;
        vida = vidaTotal;
        manaTotal = 100;
        mana = manaTotal;
        ataqueMin = 1;
        ataqueMax = 1;
        posX = 25;
        posY = 25;
        exp = 0;
        nivel = 1;
        pinta = '*';
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
    
        public boolean RangodeAtaque3x3(char mapa[][])
    {        
        boolean bandera = false;
        
        int X = posX;
        int Y = posY;
        
        if(Y == 0){
            ++Y;
        }
        
        if(Y == 49){
            --Y;
        }
        
        if(X == 0){
            ++X;
        }
        
        if(X == 49){
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
    }
    
    @Override
    public String toString()
    {
        return "Personaje [Nombre: " + nombre + ", Nivel: " + nivel + ", Exp: " + exp + ", Vida: " + vida + "/" + vidaTotal + 
        ", Mana: " + mana + "/" + manaTotal + "]";
    }
}

/*for(int i=posY-1; i<=posY+1; i++){
           for(int j=posX-1; j<=posX+1; j++){
               if(mapa[i][j] == 'o' ){
                   bandera = true;
                }
            }
        }
*/