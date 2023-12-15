/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluacion1;

/**
 *
 * @author pc
 */
public  class Animal {
    String nombre;
    String apellido;
    private int edad;

    public Animal(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void hacersonido(){
          
    }  

    public void mostrarinformacion(){
        System.out.println("El nombre es: "+ this.nombre);
        System.out.println("El apellido  es:"+ this.apellido);
        System.out.println("La edad es: "+ this.edad );
          
    }  
   
    
}
