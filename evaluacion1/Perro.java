/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluacion1;

/**
 *
 * @author pc
 */
public class Perro extends Animal {
    String raza;

    public Perro(String raza, String nombre, String apellido) {
        super(nombre, apellido);
        this.raza = raza;
    }

    @Override
    public void hacersonido() {
        super.hacersonido();
        System.out.println("El perro dijo: Wau ");
    }

    
    
    
    
    
    
}
