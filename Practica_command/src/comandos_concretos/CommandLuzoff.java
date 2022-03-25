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
public class CommandLuzoff implements Comandos {
 
    Luz_electrica luz;
     public CommandLuzoff(Luz_electrica luz){
         
         this.luz=luz;         
     }
     
    @Override
      public void ejecutar(){
          
          luz.apagar();
      }
}
