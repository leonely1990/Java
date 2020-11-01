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
        List<Usuarios> lista;
        lista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        while(true)
        {
            System.out.println("\t\tMenu");
            System.out.println("1. Crear Usuario");
            System.out.println("2. Editar Usuario");
            System.out.println("3. Ver Usuarios");
            System.out.println("4. Eliminar Usuario");
            System.out.println("5. Salir");
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
                    if(lista.isEmpty())
                    {
                        System.out.print("Sin Usuarios!");
                    }
                    else
                    {
                        int rueda = 0;
                        boolean ciclo = true;
                        while(ciclo)
                        {
                            Usuarios user = lista.get(rueda);
                        
                            System.out.println("Nombre:"+user.getNombre());
                            System.out.println("Edad:"+user.getEdad());
                        
                            System.out.println("1.Siguiente -- 2.Anterior -- 3.Salir");
                            System.out.print(">>");
                            int opcion2 = teclado.nextInt();
                            switch(opcion2)
                            {
                                case 1:
                                    rueda += 1;
                                    if(rueda >= lista.size())
                                    {
                                        rueda = 0;
                                    }
                                    break;
                                case 2:
                                    rueda -= 1;
                                    if(rueda < 0)
                                    {
                                        rueda = lista.size() - 1;
                                    }
                                    break;
                                case 3:
                                    ciclo = false;
                                    break;
                            }
                        }
                    }
            }
        }
    }
    
}
