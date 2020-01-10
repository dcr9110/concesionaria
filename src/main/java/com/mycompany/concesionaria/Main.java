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
public class Main {
    public static void main(String[] args){
        Concesionaria concesionaria = new Concesionaria("Nueva");
        
        concesionaria.cargarLista();
        
        concesionaria.mostrarListado();
        
        concesionaria.mostrarReferencias();
        
        concesionaria.vehiculosOrdenadosMayorMenor();
        
        
    }
}
