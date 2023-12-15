/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestor3;

/**
 *
 * @author pc
 * 
 */

public class Chofer extends Persona
{
    String Nplaca;
    int Codtaxi;

    public Chofer(String Nombre, int Edad, String Nplaca, int Codtaxi) {
        super(Nombre, Edad);
        this.Nplaca = Nplaca;
        this.Codtaxi = Codtaxi;
    }

    public void Aceptarcarrera() {
        System.out.println("El chofer " + Nombre + " ha aceptado una carrera.");
    }

    public void Cancelarcarrera() {
        System.out.println("El chofer " + Nombre + " ha cancelado la carrera.");
    }
}
