/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Calculadora {

    public static void main(String[] args) {
        int a=0;
        int b=0;
        int res=0;
        String sel=null;
        
        Scanner tec=new Scanner(System.in);
        System.out.println("Selecciona una opcion \n");
        System.out.println("Suma:+ ");
        System.out.println("Resta:- ");
        System.out.println("Multiplicacion:* ");
        System.out.println("Division:/ ");
        sel=tec.next();
        switch (sel){
        case "+":
        System.out.println("Selecciono suma ");
        System.out.println("Ingrese los valores  ");
        System.out.println("Ingrese el primer numero ");
        a=tec.nextInt();
        System.out.println("Ingrese el segundo numero  ");
        b=tec.nextInt();
        res=a+b;
        System.out.println( a+"+"+b+"="+res);    
        //break;
        case "-":
        System.out.println("Selecciono resta  ");
        System.out.println("Ingrese los valores  ");
        System.out.println("Ingrese el primer numero ");
        a=tec.nextInt();
        System.out.println("Ingrese el segundo numero  ");
        b=tec.nextInt();
        res=a-b;
        System.out.println( a+"-"+b+"="+res);    
        break;
        case "*":
        System.out.println("Selecciono multiplicacion ");
        System.out.println("Ingrese los valores  ");
        System.out.println("Ingrese el primer numero ");
        a=tec.nextInt();
        System.out.println("Ingrese el segundo numero  ");
        b=tec.nextInt();
        res=a*b;
        System.out.println( a+"*"+b+"="+res);    
        break;
        case "/":
        System.out.println("Selecciono multiplicacion ");
        System.out.println("Ingrese los valores  ");
        System.out.println("Ingrese el primer numero ");
        a=tec.nextInt();
        System.out.println("Ingrese el segundo numero  ");
        b=tec.nextInt();
        res=a/b;
        System.out.println( a+"/"+b+"="+res);    
        break;
        default:
            System.out.println("Esa opcion no existe "); 
    }
   }   
}
