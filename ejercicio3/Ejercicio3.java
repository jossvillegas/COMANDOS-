/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
        Electrodomestico lista[] = new Electrodomestico[6];
        lista[0] = new Electrodomestico(425, "verde", 'c', 20);
        lista[1] = new Lavadora(150, 15, "blanco", 'F', 30);
        lista[3] = new Electrodomestico(900, "gris", 'F', 25);
        lista[4] = new Lavadora(720, 40, "blanco", 'X', 40);
        lista[5] = new Lavadora(620, 890, "verde", 'A', 15);
       

        double sumaElectrodomestico = 0;
        double sumaLavadoras = 0;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] instanceof Electrodomestico) {
                sumaElectrodomestico += lista[i].precioFinal();
            }
            if (lista[i] instanceof Lavadora) {
                sumaLavadoras += lista[i].precioFinal();
            }
        }

        System.out.println("Suma de Electrodomesticos: " + sumaElectrodomestico);
        System.out.println("Suma de Lavadoras: " + sumaLavadoras);
    }
}
