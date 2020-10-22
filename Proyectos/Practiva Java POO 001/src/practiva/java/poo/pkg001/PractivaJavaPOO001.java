/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiva.java.poo.pkg001;

/**
 *
 * @author leonel
 */
public class PractivaJavaPOO001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario leonel = new Usuario("Leonel", "Yamin", 36);
        System.out.println(leonel.getNombre());
        System.out.println(leonel.getMensaje1());
        
        Calculadora cal = new Calculadora(10, 5);
        System.out.println(cal.getSuma());
        System.out.println(cal.getResta());
        System.out.println(cal.getMulti());
    }
    
}
