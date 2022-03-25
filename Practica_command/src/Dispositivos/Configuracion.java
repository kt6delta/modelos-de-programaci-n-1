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
import comandos_concretos.*;
  
public class Configuracion {
  
    public static void configurar(ControlInteligente con){
     
        Luz_electrica obj= new Luz_electrica();
        Sonido obj1 = new Sonido();
        
        con.setboton1(new ComandLuz(obj));
        con.setboton2(new CommandLuzoff(obj));
        con.setboton3(new RadioApagar(obj1));
        con.setboton4( new RadioEncender(obj1));
        
              
    }
}
