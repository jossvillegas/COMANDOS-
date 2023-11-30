/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areas;

/**
 *
 * @author pc
 */
public class Rectangulo {
    public double base;
    public double altura;
    public double area;

    public Rectangulo(double base, double altura, double area) {
        this.base = base;
        this.altura = altura;
        this.area = area;
    }
    public double calcularArea(){
        return this.base * this.altura;
    } 
}
