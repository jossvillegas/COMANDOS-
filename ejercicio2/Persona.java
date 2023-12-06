/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author pc
 */
public abstract  class Persona {
    String Nombre;
    int edad;

    public Persona(String Nombre, int edad) {
        this.Nombre = Nombre;
        this.edad = edad;
    }
    
    abstract public void verDatos();
    
}