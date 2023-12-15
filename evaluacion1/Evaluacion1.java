/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evaluacion1;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author pc
 */
public class Evaluacion1 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

      
        System.out.println("Registro del Perro");
        Perro perro = registrarPerro(scanner);
        System.out.println("Registro del Gato");
        Gato gato = registrarGato(scanner);
        System.out.println("\nInformacion del Perro:");
        perro.mostrarinformacion();
        System.out.println("\nInformacion del Gato:");
        gato.mostrarinformacion();
    }

    public static Perro registrarPerro(Scanner scanner) {
        Perro perro = null;

        try {
            System.out.print("Ingrese el nombre del perro: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el apellido del perro: ");
            String apellido = scanner.nextLine();
            System.out.print("Ingrese la edad del perro: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

           
            if (edad < 0) {
                throw new NumberFormatException("La edad debe ser un numero positivo.");
            }

            System.out.print("Ingrese la raza del perro: ");
            String raza = scanner.nextLine();

            perro = new Perro(raza, nombre, apellido);
            perro.setEdad(edad);

        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Error: Ingrese un valor valido para la edad.");
            scanner.nextLine(); 
        }

        return perro;
    }

    public static Gato registrarGato(Scanner scanner) {
        Gato gato = null;

        try {
            System.out.print("Ingrese el nombre del gato: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el apellido del gato: ");
            String apellido = scanner.nextLine();
            System.out.print("Ingrese la edad del gato: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); 

         
            if (edad < 0) {
                throw new NumberFormatException("La edad debe ser un numero positivo.");
            }

            System.out.print("Ingrese el pelaje del gato: ");
            String pelaje = scanner.nextLine();

            gato = new Gato(pelaje, nombre, apellido);
            gato.setEdad(edad);

        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Error: Ingrese un valor valido para la edad.");
            scanner.nextLine(); 
        }

        return gato;
    }
}