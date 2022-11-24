/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases01;

/**
 *
 * @author nfernandez
 */
public abstract class Animal 
{
    public String especie;
    public String color;
    public int edad;
    public String habitaEn;
    
    
    public void sonido()
    {
        System.out.println("Sonido del Animal");
    }
    
    public abstract  void imprimir();
 
    
}
