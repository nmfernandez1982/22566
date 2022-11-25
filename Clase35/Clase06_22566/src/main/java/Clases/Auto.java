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
public class Auto extends Vehiculo
{
    private int cantPuertas;
    private String TipoAuto;
    
    
    @Override
    public void mostrar()
    {
        System.out.println("Cantidad de Puertas: "+cantPuertas);  
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public String getTipoAuto() {
        return TipoAuto;
    }

    public void setTipoAuto(String TipoAuto) {
        this.TipoAuto = TipoAuto;
    }
    
    
    
    
    
    
}
