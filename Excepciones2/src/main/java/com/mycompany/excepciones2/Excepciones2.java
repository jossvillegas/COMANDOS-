/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.excepciones2;

/**
 *
 * @author pc
 */
public class Excepciones2 {

  public static void main(String[] args) {
        float Resultado=0;
        try{
        Resultado = 12/ 0;
        } catch(ArithmeticException mk){
            System.out.println("Error:"  + mk.getMessage());
            
        } finally {
            System.out.println("Resultado" + Resultado);
        } 
    }
}