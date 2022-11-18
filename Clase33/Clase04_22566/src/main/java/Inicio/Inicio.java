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
public class Inicio 
{
    public static void main(String[] args)
    {
        int x=0;
        double salario=0;
        
        Persona p1=new Persona();
        Persona p2=new Persona();
        Persona martin=new Persona();
        Persona sandra=new Persona();
        Persona javier=new Persona();
        
        p1.nombre="Nicolas";
        p1.apellido="Fernadez";
        p1.dni=29031345;
        p1.edad=70;
        p1.mail="nm@gmail.com";
        p1.imprimir();
        
        
        
        
        
        martin.apellido="HErnandz";
        martin.imprimir();
                
        sandra.edad=71;
        sandra.imprimir();
        
        System.out.println(sandra.imprimirv2());
        sandra.varificarEdad();
        
        Empleado emp1=new Empleado();
        
        
        emp1.legajo=170;
        emp1.puesto="Analista de Datos";
        emp1.sueldo=200000;
        emp1.apellido="Fernandez";
        emp1.nombre="Nicolas";
        
        
        emp1.imprimir();
        
    
        
    }
    
}
