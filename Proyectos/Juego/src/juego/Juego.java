/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import clases.Enemigo;
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
        Enemigo e1 = new Enemigo("Rata", 100, 15, 2, 4);
        
        System.out.println(p1.toString());
        Mapa(p1, e1);
    }
    
    static void Mapa(Personaje personaje, Enemigo enemigo){
        Scanner teclado = new Scanner(System.in);
        int op;
        while(true){
            // Se crea un mapa de 50x50
            char mapa[][] = new char[50][50];
            // Se crea el mapa llenandose con espacios en blanco
            for(int i=0; i<50; i++){
                for(int j=0; j<50; j++){
                    mapa[i][j] = ' ';                    
                }
            }
            // Se coloca al personaje y al enemigo en el mapa segun posX y posY
            mapa[personaje.getPosY()][personaje.getPosX()] = personaje.getPinta();
            mapa[enemigo.getPosY()][enemigo.getPosX()] = enemigo.getPinta();
            
            for(int i=0; i<mapa.length; i++){
                for(int j=0; j<mapa.length; j++){
                    System.out.print(mapa[i][j]);                    
                }
                System.out.println();
            }
            System.out.println("X:" + personaje.getPosX() + " Y:" + personaje.getPosY());
            
            if(personaje.RangodeAtaque3x3(mapa)){
                System.out.println("1.Subir - 2.Bajar - 3.Derecha - 4.Izquierda"
                        + " - 5.Atacar");
                System.out.print("Sel:");
                op = teclado.nextInt();
                switch(op){
                    case 1:
                        personaje.CaminarArriba();
                        break;
                    case 2:
                        personaje.CaminarAbajo();
                        break;
                    case 3:
                        personaje.CaminarDerecha();
                        break;
                    case 4:
                        personaje.CaminarIzquierda();
                        break;
                    default:
                        System.out.println("Seleccione Opcion correcta");
                        break; 
                }
            }
            else{
                System.out.println("1.Subir - 2.Bajar - 3.Derecha - 4.Izquierda");
                System.out.print("Sel:");
                op = teclado.nextInt();
                switch(op){
                    case 1:
                        personaje.CaminarArriba();
                        break;
                    case 2:
                        personaje.CaminarAbajo();
                        break;
                    case 3:
                        personaje.CaminarDerecha();
                        break;
                    case 4:
                        personaje.CaminarIzquierda();
                        break;
                    default:
                        System.out.println("Seleccione Opcion correcta");
                        break;
                }
            }
        }
    }
}