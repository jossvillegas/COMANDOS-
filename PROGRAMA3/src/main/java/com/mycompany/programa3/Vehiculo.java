/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa3;

/**
 *
 * @author pc
 */
public class Vehiculo {
    String Marca;
    int Velocidad;
    String Color;
    String Matricula;

    public Vehiculo(String Marca, int Velocidad, String Color, String Matricula) {
        this.Marca = Marca;
        this.Velocidad = Velocidad;
        this.Color = Color;
        this.Matricula = Matricula;
    } 
    public void Traslado(){
       System.out.println("El auto inicia su trayecto ");
    }
    public void Distancia(){
       if (Velocidad >50){
             System.out.println("Su carro recibio una multa");
       }
    }
}