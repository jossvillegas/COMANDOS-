/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ciclo;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ciclo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        int c=1;
        int p;
        System.out.println("Ingrese un numero ");
        n = entrada.nextInt();
        for(c=1; c< n ;c++){
            p=2* c -2;
            System.out.println("numero ="+p);
            
        }
        
        
        
    }
}
