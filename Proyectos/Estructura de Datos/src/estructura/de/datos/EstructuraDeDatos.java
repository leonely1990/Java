/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.datos;

import java.util.*;
import Clases.*;
/**
 *
 * @author leonel
 */
public class EstructuraDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> lista;
        lista = new LinkedList<>();
        
        lista.add(0,"leonel");
        lista.add(1,"Karibay");
        lista.add(2,"Anaia");
        String dato = lista.pop();
        
        System.out.println(lista.size());
        System.out.println(dato);
        System.out.println(lista.get(0));
        System.out.println(lista.peekLast());
        System.out.println(lista.size());
        
        //for(int i=0; i < lista.size(); i++)
        //{
        //    System.out.println(lista.peek());
        //}
    }
    
}
