/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestor3;
import java.util.Scanner;

public class GESTOR3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Ingrese el nombre del pasajero: ");
        String NombrePasajero = scanner.nextLine();
            
        System.out.print("Ingrese la edad del pasajero: ");
        int edadPasajero = scanner.nextInt();
        scanner.nextLine();
            
        System.out.println("Ingrese cedula del pasajero:");
        int Nid = scanner.nextInt();
        scanner.nextLine();
        Pasajero pasajero = new Pasajero(123, NombrePasajero, 25);
            pasajero.Pedirtaxi();   
            pasajero.Cancelartaxi();
            
            System.out.println("Ingrese nombre del chofer:");
            String nombreChofer = scanner.nextLine();
            scanner.nextLine();
            
            System.out.println("Ingrese edad del chofer:");
            int edadChofer = scanner.nextInt();
           
            System.out.println("Ingrese cedula del chofer:");
            String CedulaChofer = scanner.nextLine();
            
            System.out.println("Ingrese numero de placa del chofer:");
            String placaChofer = scanner.nextLine();
            
            System.out.println("Ingrese codigo del taxi del chofer:");
            int codigoTaxiChofer = scanner.nextInt();
            
            // Suponiendo que placaChofer, codigoTaxiChofer, nombreChofer y edadChofer son variables definidas anteriormente
            Chofer chofer = new Chofer(nombreChofer, edadChofer, placaChofer, codigoTaxiChofer);chofer.Aceptarcarrera();
            chofer.Cancelarcarrera();
        }
    }
