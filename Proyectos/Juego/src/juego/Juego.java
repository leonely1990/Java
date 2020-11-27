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
        Personaje p1 = new Personaje("Leonel");
        Enemigo e1 = new Enemigo("Rata", 1, 8, 15, 1);
        Mapa m1 = new Mapa(50, 50);
        
        System.out.println(p1);
        System.out.println(e1);
        
        int opcion;
        
        m1.CrearMapa();
        while (true) {            
            m1.verMapa(p1, e1);
            if(p1.Rango(m1.getMapa(), e1)){
                System.out.println("1.Subir - 2.Bajar - 3.Derecha - "
                        + "4.Izquierda - 5.Atacar");
                opcion = teclado.nextInt();
                Menu1(opcion, p1);
            }else{
                System.out.println("1.Subir - 2.Bajar - 3.Derecha - "
                        + "4.Izquierda");
                opcion = teclado.nextInt();
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
}