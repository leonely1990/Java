/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import clases.Enemigo;
import clases.Mapa;
import clases.Personaje;
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
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Mapa m1 = new Mapa(50, 50);
        m1.CrearMapa();
        Personaje p1 = new Personaje("Leonel");

        Enemigo[] e = FabricaEnemigos("Rata", 6);
        
        while(true)
        {
            m1.verMapa(p1, e);
            if(p1.Rango(m1.getMapa(), e))
            {
                System.out.println("1.Subir - 2.Bajar - 3.Derecha - 4.Izquiera"
                        + " - 5.Atacar");
                int opcion = teclado.nextInt();
                Menu1(opcion, p1);
            }
            else
            {
                System.out.println("1.Subir - 2.Bajar - 3.Derecha - "
                        + "4.Izquiera");
                int opcion = teclado.nextInt();
                Menu2(opcion, p1);
            }
        }
    }
    
    public static void Menu1(int opcion, Personaje per){
        
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
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }
    
    public static void Menu2(int opcion, Personaje per){
        
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
    
    public static Enemigo[] FabricaEnemigos(String nombre, int cantidad)
    {
        Enemigo[] enemigos = new Enemigo[cantidad];
        
        for(int i=0; i<cantidad; i++)
        {
            double posx = Math.round(Math.random() * 30);
            double posy = Math.round(Math.random() * 30);
            enemigos[i] = new Enemigo(nombre, 1, 2, 5, 1);
            enemigos[i].setPosX((int)posx);
            enemigos[i].setPosY((int)posy);
        }
        
        return enemigos;
    }
}