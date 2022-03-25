/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

import Interface.Figuras_geometricas;

/**
 *
 * @author PC
 */
public class Circulo implements Figuras_geometricas{

    private String Nombre;
    private int pos_x, pos_y;
    
    public Circulo(){        
    }
    
    @Override
    public void setNombre(String n){
     this.Nombre=n;   
    }
    public String getNombre(){
        return Nombre;
    }
     
    
    public void tamaño(int x, int y){
           pos_x = x;
           pos_y = y;
        
    }
    
    @Override
    public int getposicionX(){
       return this.pos_x;  
    }
    
    @Override
    public int getposicionY(){
       return this.pos_y;  
    }
    
    @Override
    public Figuras_geometricas clonar(){
       
        Figuras_geometricas geometrica= new Rectangulo();
        geometrica.setNombre(this.Nombre);
        geometrica.tamaño(this.pos_x, this.pos_y);
        return geometrica;
    }
    
}
