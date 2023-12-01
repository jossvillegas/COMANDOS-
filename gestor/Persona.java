/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestor;

/**
 *
 * @author pc
 */
public abstract class Persona 
{
    String Nombre;
    int Edad;
    private String Cedula;

    public Persona(String Nombre, int Edad) 
    {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getCedula() 
    {
        return Cedula;
    }

    public void setCedula(String Cedula)
    {
        this.Cedula = Cedula;
    }
    public abstract void Comer();
    
    public abstract void Dormir();
    
}
 
