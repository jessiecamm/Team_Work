/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cammproductions.juego;

/**
 *
 * @author Jessie
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Mortal Kombat 2.0");
        System.out.println("By Camm & Marto");
        System.out.println();
        Heroes h1=new Heroes();
        h1.setPais_origen("Australia");
        h1.setNombre("Puño de Hierro");
        h1.setEnergia(68);
        h1.setHabilidad_ppal("Super Puñetazo");
        h1.setIndice_bondad(10);
        
        System.out.println("El héroe " + h1.getNombre() + " de origen " + h1.getPais_origen() + 
                " tiene una energía de " + h1.getEnergia() + " y su principal habilidad es el " +
                h1.getHabilidad_ppal() + ".");
        System.out.println();
        
        Villanos v1=new Villanos();
        v1.setNombre("Cruela");
        v1.setEnergia(85);
        v1.setPais_origen("Italia");
        v1.setHabilidad_ppal("Vuela muy alto");
        v1.setIndice_maldad(10);
        
          System.out.println("El villano " + v1.getNombre() + " de origen " + v1.getPais_origen() + 
                " tiene una energía de " + v1.getEnergia() + " y su principal habilidad es que " +
                v1.getHabilidad_ppal() + ".");
        System.out.println();
        
        System.out.println("Aguante este equipo!!!\n");
        System.out.println("Como verás, pude instalar y hacer mi branch, todo desde net!!!");
        
    }
    
     
    
}