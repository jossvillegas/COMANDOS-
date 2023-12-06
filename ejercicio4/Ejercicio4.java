

package com.mycompany.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        //ingresar por teclado numero entero positivo 
        Scanner scanner = new Scanner(System.in);
        //Ingresar un numero entero positivo por consola

        System.out.print("Ingrese un numero: ");
        double n = scanner.nextDouble();

        if (n % 1 == 0) {
            
            if (n > 0) {
                System.out.println("Excelente");
            } else {
                System.out.println("El numero ingresado no es correcto. Intentelo de nuevo.");
            }
        } else {
            
            System.out.println("El numero ingresado no es valido. Por favor, ingrese un numero entero.");
        }
    }
}