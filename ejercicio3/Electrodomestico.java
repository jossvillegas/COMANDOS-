/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author pc
 */
public class Electrodomestico {
    // Atributos
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    // Constantes un valor que no cambia
    protected final static double precioBaseDEF = 100;
    protected final static String colorDEF = "Blanco";
    protected final static char consumoEnergeticoDEF = 'F';
    protected final static int pesoDEF = 5;

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    private void comprobarColor(String color) {
        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado = false;

        for (int i = 0; i < colores.length && !encontrado; i++) {

            if (colores[i].equalsIgnoreCase(color)) {
                encontrado = true;
            }
        }

        if (encontrado) {
            this.color = color;
        } else {
            this.color = colorDEF;
        }
    }

    public void comprobarConsumoEnergetico(char consumoEnergetico) {
        // ascii
        if (consumoEnergetico >= 65 && consumoEnergetico <= 70) {
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = consumoEnergeticoDEF;
        }
    }

    public double precioFinal() {
        double precio = 0;
        switch (consumoEnergetico) {
            case 'A':
                precio += 100;
                break;
            case 'B':
                precio += 80;
                break;
            case 'C':
                precio += 60;
                break;
            case 'D':
                precio += 50;
                break;
            case 'E':
                precio += 30;
                break;
            case 'F':
                precio += 10;
                break;
        }
        if (peso >= 0 && peso < 19) {
            precio += 10;
        } else if (peso >= 20 && peso < 49) {
            precio += 50;
        } else if (peso >= 50 && peso < 79) {
            precio += 50;
        } else if (peso >= 80) {
            precio += 100;
        }
        return precioBase + precio;
    }
}
