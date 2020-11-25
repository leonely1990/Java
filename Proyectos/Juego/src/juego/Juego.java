/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

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
        
        System.out.println(p1.toString());
        Mapa(p1);
    }
    
    static void Mapa(Personaje personaje){
        Scanner teclado = new Scanner(System.in);
        int op;
        while(true){
            char mapa[][] = new char[50][50];
            int y = personaje.getPosX();
            int x = personaje.getPosY();
            // Meter personaje en el mapa
            for(int i=0; i<mapa.length; i++){
                for(int j=0; j<mapa.length; j++){
                    mapa[i][j] = ' ';                    
                }
            }
            mapa[x][y] = personaje.getPinta();
            for(int i=0; i<mapa.length; i++){
                for(int j=0; j<mapa.length; j++){
                    System.out.print(mapa[i][j]);                    
                }
                System.out.println();
            }
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
