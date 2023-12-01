/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestor;

/**
 *
 * @author pc
 */
public  abstract class Zoo 
{
    String Nombre;
    int Edad;
    private String Nregistro;

    public Zoo(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getNregistro() {
        return Nregistro;
    }

    public void setNregistro(String Nregistro) {
        this.Nregistro = Nregistro;
    }
    public abstract void Comer();

    public abstract void Dormir();
}
    
