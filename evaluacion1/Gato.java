/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluacion1;

/**
 *
 * @author pc
 */
public class Gato extends Animal {
    String pelaje;

    public Gato(String pelaje, String nombre, String apellido) {
        super(nombre, apellido);
        this.pelaje = pelaje;
    }

    @Override
    public void hacersonido() {
        super.hacersonido(); 
        System.out.println("El gato dijo:Miau");
    }

    
    
    
}
