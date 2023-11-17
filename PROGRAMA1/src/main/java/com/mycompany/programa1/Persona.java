/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa1;

/**
 *
 * @author pc
 */
public class Persona {
    String Nombre;//atributo
    int edad;// atributo
    String genero;
    String estadocivil;
    String tipodesangre;

    public Persona(String Nombre, int edad, String genero, String estadocivil, String tipodesangre) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.genero = genero;
        this.estadocivil = estadocivil;
        this.tipodesangre = tipodesangre;
    }

public void Comer(){
    System.out.println(this.Nombre+" Empezo a comer ");
}//metodo
public void Bailar(){
            System.out.println("Empezo a bailar");
}
public void Dormir(){
    System.out.println("Se fue a dormir");
}
}
