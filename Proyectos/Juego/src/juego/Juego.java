/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import clases.Enemigo;
import clases.Mapa;
import clases.Personaje;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author leonel
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Mapa m1 = new Mapa(50, 60);
        m1.CrearMapa();
        Personaje p1 = new Personaje("Leonel");

        ArrayList<Enemigo> e = FabricaEnemigos("Rata", 3);
        
        while(true)
        {
            m1.verMapa(p1, e);
            if(p1.Rango(m1.getMapa(), e))
            {
                System.out.println(p1);
                System.out.println("1.Subir - 2.Bajar - 3.Derecha - 4.Izquiera"
                        + " - 5.Atacar");
                System.out.print(">");
                int opcion = teclado.nextInt();
                Menu1(opcion, p1, e);
            }
            else
            {
                System.out.println(p1);
                System.out.println("1.Subir - 2.Bajar - 3.Derecha - "
                        + "4.Izquiera");
                System.out.print(">");
                int opcion = teclado.nextInt();
                Menu2(opcion, p1, e);
            }
        }
    }
    
    public static void Menu1(int opcion, Personaje per, ArrayList<Enemigo> e){
        
        switch(opcion){
            case 1:
                per.CaminarArriba();
                break;
            case 2:
                per.CaminarAbajo();
                break;
            case 3:
                per.CaminarDerecha();
                break;
            case 4:
                per.CaminarIzquierda();
                break;
            case 5:
                Ataque(per, e);
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }
    
    public static void Menu2(int opcion, Personaje per, ArrayList<Enemigo> e){
        
        switch(opcion){
            case 1:
                per.CaminarArriba();
                break;
            case 2:
                per.CaminarAbajo();
                break;
            case 3:
                per.CaminarDerecha();
                break;
            case 4:
                per.CaminarIzquierda();
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }
    
    public static ArrayList FabricaEnemigos(String nombre, int cantidad)
    {
        ArrayList<Enemigo> enemigos = new ArrayList<>();
        
        for(int i=0; i<cantidad; i++)
        {
            double posx = Math.round(Math.random() * 30);
            double posy = Math.round(Math.random() * 30);
            enemigos.add(new Enemigo(nombre, 1, 5));
            enemigos.get(i).setPosX((int)posx);
            enemigos.get(i).setPosY((int)posy);
        }
        
        return enemigos;
    }
    
    public static void Ataque(Personaje personaje, ArrayList<Enemigo> enemigo)
    {
        Scanner teclado = new Scanner(System.in);
        
        int i=0;
        
        boolean bandera = true;
                
        while(bandera)
        { 
            System.out.println("1.Atacar - 2.Correr");
            System.out.print(">");
            int opcion = teclado.nextInt();
            if(opcion == 1)
            {
                System.out.println(personaje);
                System.out.println(enemigo.get(i));
                int dano = (int)Math.round(personaje.atacar());
                enemigo.get(i).recibirDano(dano);
                if(enemigo.get(i).getVida() <= 0)
                {
                    bandera = false;
                    personaje.setExp(enemigo.get(i));
                    enemigo.remove(i);
                    break;
                }
                dano = (int)Math.round(enemigo.get(i).atacar());
                personaje.recibirDano(dano);
                if(personaje.getVida() <= 0)
                {
                    bandera = false;
                    break;
                }
            }
            if(opcion == 2)
            {
                break;
            }
        }
    }
}