/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areas;

/**
 *
 * @author pc
 */
public class Circulo {
    public double radio;
    public double area;
    public static double PI = 3.1416;

    public Circulo(double radio, double area) {
        this.radio = radio;
        this.area = area;
    }
     public double CalcularArea() {
        return PI * radio * radio;
    }
}
