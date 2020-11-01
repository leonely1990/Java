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
        List<Object> lista = new ArrayList<Object>();
        Scanner teclado = new Scanner(System.in);
        while(true)
        {
            System.out.println("\t\tMenu");
            System.out.println("1. Crear Usuario");
            System.out.println("2. Editar Usuario");
            System.out.println("3. Ver Usuarios");
            System.out.println("4. Eliminar Usuario");
            System.out.print("> ");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            switch(opcion)
            {
                case 1:
                    System.out.print("Nombre:");
                    String nombre = teclado.nextLine();
                    
                    System.out.print("Edad:");
                    int edad = teclado.nextInt();
                    
                    Usuarios ob = new Usuarios(nombre, edad);
                    lista.add(ob);
                case 2:
                    break;
                case 3:
                    int rueda = 0;
                    while(true)
                    {
                        
                        int opcion = teclado.nextInt();
                        switch(opcion)
                        {
                            case 1:
                                rueda += 1;
                        }
                    }
            }
        }
    }
    
}
