/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa2;

/**
 *
 * @author pc
 */
public class GATO {
    String Nombre;
    int Edad;
    String Color;
    String Genero;
    String  Peso;

    public GATO(String Nombre, int Edad, String Color, String Genero, String Peso) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Color = Color;
        this.Genero = Genero;
        this.Peso = Peso;
    }

   
public void Maullar(){
    System.out.println("El gatito esta maullando");
}
public void Jugar(){
    System.out.println("El gatito esta jugando");
}
public void Acostarse(){
    System.out.println("El gatito esta acostado");
}


    
    
}
