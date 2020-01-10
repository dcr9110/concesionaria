/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.concesionaria;

import java.text.DecimalFormat;

/**
 *
 * @author Dcr9110
 */
public abstract class Vehiculo implements Comparable<Vehiculo> {
    private String marca;
    private String modelo;
    private double precio;
    
    public Vehiculo(String marca, String modelo, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public String getFormPrecio(){
        DecimalFormat formatoDeci = new DecimalFormat("#.00"); 
        return formatoDeci.format(precio);
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
   
    public abstract void descripcion();
    
    @Override
    public int compareTo(Vehiculo e){
        if(e.getPrecio()>precio){
            return -1;
        }else if (e.getPrecio()<precio){
        return 1;
        }else{
            return 0;
        }
    }
}
