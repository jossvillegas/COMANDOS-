/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestor;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Gestor
{

    public static void main(String[] args) 
    {
        Scanner entrada=new Scanner(System.in);//declarando para ingresar datos
        System.out.println("1: Datos de Persona");
        System.out.println("2: Datos de Animal");
        int op=entrada.nextInt();
        entrada.nextLine();
        
        switch (op)
        { //declaracion de variables locales solo en su clase
            case 1:
            Scanner entrada1=new Scanner(System.in);
            int Edad=0;
            boolean a=false;
            
            System.out.println("Ingrese el Nombre:");
            String  Nombre=entrada1.nextLine();
            System.out.println("Ingrese numero de cedula:");
            String Cedula=entrada1.nextLine();
            
            while (!a)
            {
                try 
                {
                    System.out.println("Ingrese Edad: ");
                    Edad=entrada1.nextInt();
                    entrada1.nextLine();
                    a=true;
                }
                catch (InputMismatchException ex)
                {
                    System.out.println("Ingrese un numero entero en la edad ");
                    entrada1.nextLine();
                }
            }
            System.out.println("1: Visitante");
            System.out.println("2: Cuidador");
            int op1=entrada1.nextInt();
            entrada1.nextLine();
            
            switch (op1)
            {
                case 1:
                    System.out.println("Ingrese el Numero de carnet");
                    String NCarnet=entrada1.nextLine();
                    System.out.println("Ingrese el nombre");
                    String nombre = entrada1.nextLine();
                    System.out.println("Ingrese la edad");
                    int edad = Integer.parseInt(entrada1.nextLine());
                    
                    Visitante visitante1 = new Visitante(NCarnet, nombre, edad);
                    visitante1.setCedula(Cedula);
                    System.out.println(visitante1.Nombre+" "+visitante1.NCarnet+" "+visitante1.getCedula()+" "+visitante1.Edad);
                    break;
                case 2:

                    System.out.println("Ingrese el Numero de Id");
                    String Nid=entrada1.nextLine();
               
                    Cuidador cuidador1 = new Cuidador(Nid,Nombre,Edad);

                    cuidador1.setCedula(Cedula);

                    System.out.println(cuidador1.Nombre+ " " + cuidador1.Nid+ " " + cuidador1.getCedula() + " " + cuidador1.Edad);

                    break;
                default:
                }
               break;
            case 2:
                Scanner entrada3=new Scanner(System.in);
                int Edad2=0;
                boolean b=false;
                
                System.out.println("Ingrese el Nombre:");
                String Nombre2=entrada3.nextLine();
                System.out.println("Ingrese numero de registro:");
                String Nregistro=entrada3.nextLine();
                
                while (!b)
                {
                    try
                    {
                        System.out.println("Ingrese Edad:");
                        Edad2=entrada3.nextInt();
                        entrada3.nextLine();
                        b=true;
                    }
                    catch (InputMismatchException ex)
                    {
                        System.out.println("Ingrese un numero entero en la edad");
                        entrada3.nextLine();
                    }   
                }
                System.out.println("1: Leon");
                System.out.println("2: Pinguino");
                int op3=entrada3.nextInt();
                entrada3.nextLine();
                switch (op3)
                {
                    case 1:
                        System.out.println("Ingrese el nombre de la vacuna");
                        String vacuna=entrada3.nextLine(); 
                        Leon leon1=new Leon(Nombre2,Edad2);
                        leon1.setNregistro(Nregistro);
                        System.out.println(leon1.Nombre+""+leon1.getNregistro()+" "+leon1.Edad);
                        break;
                    case 2: 
                    Pinguino pinguino1=new Pinguino(Nombre2,Edad2);
                    pinguino1.setNregistro(Nregistro);
                    System.out.println(pinguino1.Nombre+" "+pinguino1.getNregistro()+" "+pinguino1.Edad);
                    break;
                default:
            }
            break;
          default:
        }
    }
}
