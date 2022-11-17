/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nfernandez
 */
public class Inicio 
{
    public static void main(String[] args)
    {
        for(int aux=0;aux<100;aux++)
        {
            System.out.println("EL valor de aux es: "+aux);             
        }
        
        String[] frutas={"frutillas","Peras","Manzanas","Uvas"};
        boolean[] datos={true,false,false,true};
        double[] numeros={1550.01,345.2,567.1,3000.1};
        char[] letras={'A','B'};
        //miObjeto[] prueba={"","",""};
        
        System.out.println("Cantidad de Elementos:"+letras.length);
        numeros[2]=1623.99;        
        //numeros[12]=1623.99;
        
        
        int[] numerosEntero={1000,250,3,12,87,12,56,9999,7,1,6,4};
        
        
        //listas
        List<String> lista=new ArrayList<String>();
        
        lista.add("Frutillas");
        lista.add("Manzanas");
        lista.add("Peras");
        lista.add("Limon");
        lista.add("Cereza");
        
        for(String MostrarFruta:lista)
        {
            System.out.println("Elementos"+MostrarFruta);
        }
        
        lista.remove(3);
        
        for(String MostrarFruta:lista)
        {
            System.out.println("Elementos"+MostrarFruta);
        }
        
        
        
            
        
        
        
        
        
        
        
        
        
        
        
        
    }    
}
