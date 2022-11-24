/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases02;

/**
 *
 * @author nfernandez
 */
public class Persona 
{
    int id;
    String nombre;
    public String apellido;
    int edad;
    String mail;
    
    /*
  
    public Persona()
    {
        super();
    }
    
    
    public Persona(int id)
    {
        this.id=id;
    }
    
    public Persona(int id,String nombre)
    {
        this.id=id;
        this.nombre=nombre;
    }
    */
    
    public Persona(int id,String nombre,String apellido,int edad,String mail)
    {
        this.id=id;
        //this.id=codigo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.mail=mail;
        
        
    }
    
}
