/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5;

/**
 *
 * @author pc
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int DNI;

    public Persona(String nombre, String apellido, int edad, int DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void mostrarDatos (){
        System.out.println("Nombre:  "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+ edad );
        System.out.println("DNI: "+ DNI);}
}
