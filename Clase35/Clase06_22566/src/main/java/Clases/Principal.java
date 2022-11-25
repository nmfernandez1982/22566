/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author nfernandez
 */
public class Principal 
{
    public static void main(String[] args)
    {
     Auto Renault12=new Auto();
     Renault12.setColor("Rojo");
     Renault12.setCantPuertas(5);
     System.out.println("El color es:"+Renault12.getColor()+" Cant. Puertas:"+Renault12.getCantPuertas());
     
     
     
     
     
     
     
     Camion f4000=new Camion();
     f4000.carga=4000;
     f4000.acoplado=true;
     
     
     AutoPequenio smart= new AutoPequenio();
     
     
     
    }   
    
}
