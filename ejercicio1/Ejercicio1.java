/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * author pc
 */
public class Ejercicio1 {
    //2 libros con sus atributos private 

    public static void main(String[] args) {
        //instancia1
        Libro libro1 = new Libro();
        libro1.setISBM(222);
        libro1.setTitulo(" Rosa");
        libro1.setAutor("Lucas");
        libro1.setNumPaginas(22);
        //instancia2
        Libro libro2 = new Libro();
        libro2.setISBM(333);
        libro2.setTitulo("Adios");
        libro2.setAutor("Joss");
        libro2.setNumPaginas(40);

       
        System.out.println("ISBM1: " + libro1.getISBM());
        System.out.println("Titulo1: " + libro1.getTitulo());
        System.out.println("Autor1: " + libro1.getAutor());
        System.out.println("Num paginas1: " + libro1.getNumPaginas()); 
        System.out.println("ISBM2: " + libro2.getISBM());
        System.out.println("Titulo2: " + libro2.getTitulo());
        System.out.println("Autor2: " + libro2.getAutor());
        System.out.println("Num paginas2: " + libro2.getNumPaginas()); // texto
    }
}
