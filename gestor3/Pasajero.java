/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestor3;

/**
 *
 * @author pcextends
 */
public class Pasajero extends Persona
{
    int Nid;

    public Pasajero(int Nid, String Nombre, int Edad) {
        super(Nombre, Edad);
        this.Nid = Nid;
    }

    public void Pedirtaxi() {
        System.out.println("El pasajero " + Nombre + " ha pedido un taxi.");
    }

    public void Cancelartaxi() {
        System.out.println("El pasajero " + Nombre + " ha cancelado la solicitud de taxi.");
    }
}
