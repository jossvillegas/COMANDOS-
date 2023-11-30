/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areas;

/**
 *
 * @author pc
 */
public class Triangulo {
 
    public double lado1;  
    public double lado2;
    public double base;
    public double altura;
    public double area;

    public Triangulo(double lado1, double lado2, double base, double altura, double area) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
        this.area = area;
    }
    
    public double calcularArea(){
        return (this.base * this.altura) / 2;
    }
}

