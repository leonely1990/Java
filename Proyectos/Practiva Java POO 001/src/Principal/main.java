/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Clases.Usuario;
import java.util.*;
/**
 *
 * @author leonel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nombre:");
        String nombre = sc.nextLine();
        
        System.out.print("Edad:");
        int edad = sc.nextInt();

        Usuario leonel = new Usuario(nombre, edad);
        List<Usuario> lista = new ArrayList<Usuario>();
        lista.add(leonel);
        System.out.print(lista.size());
        
    }
}
