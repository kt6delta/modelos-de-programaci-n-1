/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

/**
 *
 * @author jorge malaver
 */
import Almacenes.*;
//import Almacenes.Jumbo;
import Abstracto.Comun;
public class fabrica {
    protected String seleccion;
    
    public fabrica(String sel){
        seleccion=sel;
    }
   
    public Comun crear_selecion(){
        if(seleccion.equalsIgnoreCase("Exito")){
            return new Exito();
        }else if(seleccion.equalsIgnoreCase("Metro")){
            return new Metro();
        }
        else {
            return new Jumbo();
        }
    }
    
  
}

