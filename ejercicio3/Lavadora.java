/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author pc
 */
public class Lavadora extends Electrodomestico {

    private int carga;
    private final static int cargaDEF = 5;

    public Lavadora(int carga, double precioBase, String color, char consumoEnergetico, int peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public static int getCargaDEF() {
        return cargaDEF;
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();

        if (carga > 30) {
            precio += 50;
        }
        return precio;
    }
}


    

    
   
  