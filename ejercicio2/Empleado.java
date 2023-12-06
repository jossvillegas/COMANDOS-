/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

public class Empleado extends Persona {
    double sueldo;
    String telefono;
    String direccion;

    public Empleado(double sueldo, String telefono, String direccion, String nombre, int edad) {
        super(nombre, edad);
        this.sueldo = sueldo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    @Override
    public void verDatos() {
        System.out.println("Nombre: " + Nombre + "\nEdad: " + edad + "\nSueldo: " + sueldo + "\nTelefono: " + telefono
                + "\nDireccion: " + direccion);
    }
}
