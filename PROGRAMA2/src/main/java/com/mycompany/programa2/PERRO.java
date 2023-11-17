/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa2;

/**
 *
 * @author pc
 */
public class PERRO {
    String Nombre;
    int edad;
    String raza;
    String Color;
    String Genero;
    String  Peso;

    public PERRO(String Nombre, int edad, String raza, String Color, String Genero, String Peso) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.raza = raza;
        this.Color = Color;
        this.Genero = Genero;
        this.Peso = Peso;
    }
    public void Correr(){
        System.out.println(this.Nombre+"  Empezo a correr");
    }
    public void Tomar(){
        System.out.println(this.Nombre+"  Empezo a tomar agua ");
    }
    public void Descansar(){
        System.out.println(this.Nombre+"  Se fue a descansar");
    }
    
}
