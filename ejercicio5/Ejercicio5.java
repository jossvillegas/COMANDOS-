/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

/**
 *
 * @author pc
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Persona per1[] = new Persona[4];

        per1[0] = new Persona("Andres", "Velasco", 22, 2345);
        per1[1] = new Persona("Maria", "Vargas", 14, 98);
        per1[2] = new Persona("Nicol", "Alvarez", 23, 567);
        per1[3] = new Persona("Leslie", "Toapanta", 34, 345);

        for (Persona persona : per1) {
            persona.mostrarDatos();
            System.out.println("");
        }
    }
}
