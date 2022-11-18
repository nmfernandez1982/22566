/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

/**
 *
 * @author nfernandez
 */
public class Persona 
{
    public String nombre;
    public String apellido;
    public String mail;
    public int edad;
    public int dni;
    
    
    public void imprimir()
    {
        System.out.println("Nombre: "+nombre+" Apellido:"+apellido+" Mail:"+mail+" Edad:"+edad+" DNI:"+dni);
    }
    
    public String imprimirv2()
    {
        return("Nombre: "+nombre+" Apellido:"+apellido+" Mail:"+mail+" Edad:"+edad+" DNI:"+dni);
    }
    
    public void varificarEdad()
    {
        if(edad>18)
        {
            System.out.println("Habilitado");
        }
        else
        {
            System.out.println("No Habilitado"); 
        }
    }
    
    
    
}
