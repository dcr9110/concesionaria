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
public class Motocicleta extends Vehiculo{
    private int cilindrada;
    
    public Motocicleta(String marca, String modelo, double precio, int cilindrada){
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
                    + "c // Precio: " + this.getFormPrecio());
    }
    
}
