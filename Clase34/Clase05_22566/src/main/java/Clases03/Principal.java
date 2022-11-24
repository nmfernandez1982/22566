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
public class Principal 
{
    public static void main(String[] args)
    {
        Persona p1=new Persona();
        /*
        p1.id=1;
        p1.apellido="Fernandez";
        p1.nombre="Nicolas";
        */
          
       
        p1.setId(1);
        System.out.println("El valor es:"+p1.getId());
    }
    
}
