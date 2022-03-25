/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_command;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;
import Elementos_casa.*;
import comandos_concretos.*;
import Dispositivos.*;
public class Practica_command {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ControlInteligente control = new    ControlInteligente();
       Configuracion.configurar(control);
       control.clickBoton1();
       control.clickBoton2();
       control.clickBoton3();
       control.clickBoton4();
       
        
    }
    
}
