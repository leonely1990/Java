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
        //Se crea el objeto sc para poder introducir datos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nombre:");
        String nombre = sc.nextLine();

        System.out.print("Edad:");
        int edad = sc.nextInt();
        //Se crea un objeto Usuario llamado leonel
        Usuario leonel = new Usuario(nombre, edad);
        //Se crea una lista de datos de tipo Usuario
        List<Usuario> lista = new ArrayList<Usuario>();
        lista.add(leonel);
        System.out.println(lista.size());
        
        List<String> nombreCiudades = new ArrayList<String>();
        nombreCiudades.add("Caracas");
        nombreCiudades.add("Valencia");
        nombreCiudades.add("Maracay");
        nombreCiudades.add("Barquisimeto");
        
        Iterator<String> listaIterable = nombreCiudades.iterator();
        
        while(listaIterable.hasNext())
        {
            System.out.println(listaIterable.next());
        }
        
    }
}
