/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dispositivos;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;
import Elementos_casa.*;
public class ControlInteligente {
    
    private  Comandos boton1;
    private  Comandos boton2;
    private  Comandos boton3;
    private  Comandos boton4;
    
    public void clickBoton1(){
        boton1.ejecutar();
    }
   
    public void clickBoton2(){
        boton2.ejecutar();
    }
    
    public void clickBoton3(){
        boton3.ejecutar();
    }
    
    public void clickBoton4(){
        boton4.ejecutar();
    }
    
   public Comandos getboton1(){
       
       return boton1;
   } 
   
   public void setboton1(Comandos boto){
       
       this.boton1 = boto;
   }
   
   
   public Comandos getboton2(){
       
       return boton2;
   } 
   
   public void setboton2(Comandos boto){
       
       this.boton2 = boto;
   }
   
   
   public Comandos getboton3(){
       
       return boton3;
   } 
   
   public void setboton3(Comandos boto){
       
       this.boton3 = boto;
   }
   
   
   public Comandos getboton4(){
       
       return boton4;
   } 
   
   public void setboton4(Comandos boto){
       
       this.boton4 = boto;
   }
}
