/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.excepciones1;

/**
 *
 * @author pc
 */
public class Excepciones1 {

    public static void main(String[] args) {
       
    int edad []= {17, 22, 33 ,40};
    try{
        System.out.println("La edad de la posicion 4 es: "+ edad[4]);
    }
    catch(Exception x ){
        System.out.println("Intentas acceder a un indice que no existe");
    }
    }
    
}