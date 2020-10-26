/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author leonel
 */
public class Libro {
    private String autor;
    private String titulo;
    private int paginas;
    
    public Libro(String autor, String titulo, int paginas)
    {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }
    
    public Libro()
    {
        autor = "anonimo";
        titulo = "sin titulo";
        paginas = 0;
    }
    
    public void setAutor(String autor)
    {
        this.autor = autor;
    }
    
    public String getAutor()
    {
        return autor;
    }
    
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    
    public String getTitulo()
    {
        return titulo;
    }
    
    public void setPaginas(int paginas)
    {
        this.paginas = paginas;
    }
    
    public int getPaginas()
    {
        return paginas;
    }
    
    public void mostrarLibro()
    {
        System.out.print("El libro " + titulo + ", del autor " + autor);
        System.out.println(", tiene " + paginas + " paginas.");
    }
    
    public void compararLibros(Libro libro1, Libro libro2)
    {
        int pag1 = libro1.getPaginas();
        int pag2 = libro2.getPaginas();
        if(pag1 > pag2)
        {
            System.out.print("El libro con mayor paginas es: " + libro1.titulo);
        }
        else
        {
            System.out.println("El libro con mayor paginas es: " + libro2.titulo);
        }
    }
}
