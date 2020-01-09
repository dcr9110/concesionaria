/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionaria;

/**
 *
 * @author Usuario
 */
public class Moto extends Vehiculo{
    private int cilindrada;
    
    public Moto(String marca, String modelo, double precio, int cilindrada){
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }
    
    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }
    
    public int getCilindrada(){
        return cilindrada;
    }
    
    @Override
    public void descripcion(){
        System.out.println("Marca: "+ this.getMarca() 
                    + " // Modelo: " + this.getModelo() 
                    + " // Cilindrada: " + this.getCilindrada()
                    + " // Precio: " + this.getPrecio());
    }
    
}
