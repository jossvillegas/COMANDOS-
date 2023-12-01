/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestor;

/**
 *
 * @author pc
 */
public class Visitante extends Persona
{
    String NCarnet;

    public Visitante(String NCarnet, String Nombre, int Edad) 
    {
        super(Nombre, Edad);
        this.NCarnet = NCarnet;
    }
    public Visitante() {
    super("", 0); 
    }
    @Override
    public void Comer() {
        System.out.println(Nombre+" Esta comiendo");
    } 
    
    @Override
    public void Dormir() 
    {
        System.out.println(Nombre+" Esta durmiendo");
    } 
    public void Comprar()
    {
        System.out.println(Nombre+" Esta comprando");
    
   }
}
