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
public abstract class Vehiculo 
{
    private String color;
    private String motor;
    private int anio;
    
    public void acelerar()
    {
        System.out.println("Acelerar");
    }
    public void frenar()
    {
        System.out.println("frenar");
    }
    
    public abstract void mostrar();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
    
    
    
}
