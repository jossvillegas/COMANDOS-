/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestor;

/**
 *
 * @author pc
 */
public class Cuidador extends Persona
{
    String Nid;

    public Cuidador(String Nid, String Nombre, int Edad) {
        super(Nombre, Edad);
        this.Nid = Nid;
    }
    public Cuidador() {
    super("", 0); 
    }
    @Override
    public void Comer() {
        throw new UnsupportedOperationException("Not supported yet."); 
    } 
    
    @Override
    public void Dormir() 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void alimentarAnimales()
    {
        
    }
}
    
