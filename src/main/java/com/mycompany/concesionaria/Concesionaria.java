/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionaria;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Dcr9110
 */
public class Concesionaria implements Mostrar{
    private String nombre;
    private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    
    public Concesionaria(String nombre){
        this.nombre = nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setVehiculo(Vehiculo nuevo){
        vehiculos.add(nuevo);
    }
    
    @Override
    public void mostrarListado() {
        this.vehiculos.forEach((vehiculo) -> {
            vehiculo.descripcion();
        });
        System.out.println("=============================");
    }
    

    @Override
    public void mostrarReferencias() {
        ordenarLista();
        System.out.println(vehiculoMasCaro());
        System.out.println(vehiculoMasBarato());
        System.out.println(marcaModeloPrecio(vehiculoCon("Y"), "Y"));
        System.out.println("=============================");
    }
    
    
    public void cargarLista(){
        /*
        Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00
        Marca: Honda // Modelo: Titan // Cilindrada: 125c // Precio: $60.000,00
        Marca: Peugeot // Modelo: 208 // Puertas: 5 // Precio: $250.000,00
        Marca: Yamaha // Modelo: YBR // Cilindrada: 160c // Precio: $80.500,50
        */
        Vehiculo nuevoAuto = new Automovil("Peugeot", "206", 200000, 4);
        vehiculos.add(nuevoAuto);
        
        Vehiculo nuevaMoto = new Motocicleta("Honda", "Titan", 60000, 125);
        vehiculos.add(nuevaMoto);
        
        nuevoAuto = new Automovil("Peugeot", "208", 250000, 5);
        vehiculos.add(nuevoAuto);
        
        nuevaMoto = new Motocicleta("Yamaha", "YBR", 80500.5, 160);
        vehiculos.add(nuevaMoto);
        
    }
    
    public void ordenarLista(){
        Collections.sort(vehiculos);
    }
    
    public String vehiculoMasCaro(){
        Vehiculo nuevo = vehiculos.get(vehiculos.size()-1);
        return "Vehículo más caro: " + nuevo.getMarca() + " " + nuevo.getModelo(); 
    }
    
    public String vehiculoMasBarato(){
        Vehiculo nuevo = vehiculos.get(0);
        return "Vehículo más barato: " + nuevo.getMarca() + " " + nuevo.getModelo(); 
    }
    
    public int vehiculoCon(String contenido){
        int aux = 0;
        
        for(Vehiculo nuevo : vehiculos){
            if(nuevo.getModelo().contains(contenido)){
                aux = vehiculos.indexOf(nuevo);
            }
        }
        return aux;
    }
    
    public String marcaModeloPrecio(int i, String contenido){
        
        String nuevo = "Vehículo que contiene en el modelo la letra ‘" +
                        contenido +"’: " +
                        vehiculos.get(i).getMarca() + " " +
                        vehiculos.get(i).getModelo()+ " " +
                        vehiculos.get(i).getFormPrecio();
        return nuevo;
    }
    
    public String marcaModelo(int i){
        
        String nuevo =  vehiculos.get(i).getMarca() + " " +
                        vehiculos.get(i).getModelo();
        return nuevo;
    }
    
    public void vehiculosOrdenadosMayorMenor(){
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        for(int i = vehiculos.size() -1 ;i >= 0; i--){
            System.out.println(marcaModelo(i));
        }
    }
}
