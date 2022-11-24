/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases03;

/**
 *
 * @author nfernandez
 */
public class Persona 
{
    private  int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String mail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setTodo(int id,String apellido,String nombre,int edad,String mail)
    {
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;        
        this.edad=edad;
        this.mail=mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
   
    
    
    
    
    
    
    
}
