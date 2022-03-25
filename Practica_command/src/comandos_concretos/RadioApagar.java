/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comandos_concretos;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;
import Elementos_casa.*;
public class RadioApagar implements Comandos {
    
    Sonido radio;
    
    public RadioApagar(Sonido radio){
        
        this.radio=radio;
    }
    
    @Override
    public void ejecutar(){
       
        radio.inactivo();
    }
}
