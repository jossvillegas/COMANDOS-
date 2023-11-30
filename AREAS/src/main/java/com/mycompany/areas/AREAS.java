/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areas;

/**
 *
 * @author pc
 */
public class AREAS {
   
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(5, 6, 3, 4, 0);
        double areaTriangulo = triangulo.calcularArea();    
     
        Rectangulo rectangulo = new Rectangulo(4, 5, 0); 
        double areaRectangulo = rectangulo.calcularArea();
 
        Circulo circulo = new Circulo(3, 0);
        double areaCirculo = circulo.CalcularArea();
          
        System.out.println("Area Triangulo: " + areaTriangulo);
        System.out.println("Area Rectangulo: " + areaRectangulo); 
        System.out.println("Area Circulo: " + areaCirculo);
    }
}
        
    
    

 

