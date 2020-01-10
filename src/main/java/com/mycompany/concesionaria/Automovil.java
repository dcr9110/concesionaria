/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionaria;

/**
 *
 * @author Dcr9110
 */
public class Automovil extends Vehiculo{
    private int puertas;
    
    public Automovil(String marca, String modelo, double precio, int puertas){
        super(marca, modelo, precio);
        this.puertas = puertas;
    }
    
    public void setPuertas(int puertas){
        this.puertas = puertas;
    }
    
    public int getPuertas(){
        return puertas;
    }
    
    @Override
    public void descripcion(){
        System.out.println("Marca: "+ this.getMarca() 
                    + " // Modelo: " + this.getModelo() 
                    + " // Puertas: " + this.getPuertas()
                    + " // Precio: " + this.getFormPrecio());
    }
           
}
