/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase03;

/**
 *
 * @author nfernandez
 */
public class Ejer01 
{
    public static void main (String[] args)
    {
        //parse       
        int dni=Integer.parseInt("32123456");        
        System.out.println("EL dni es :"+dni);
        
        double sueldo=Double.parseDouble("250000.14");
        System.out.println("EL Sueldo es :"+sueldo);
        
        
        //funciones
        imprimir();
      
        String titulo="Hola Mundo.....";
        imprimirTitulo(titulo);
        
        System.out.println("El resultado es: "+calculo());
        
        
        
        
    }
    
    public static void imprimir()
    {
        System.out.println("Imprimir datos......");
    }
    
    public static void imprimirTitulo(String aux)
    {
        System.out.println(aux);
    }
    
    public static int calculo()
    {
        int dni=28123456;        
        return dni;
    }
    
    public static int resta(int x, int y)
    {
        return (x-y);
    }
    
    
    
    
}
