/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real_proxy;

/**
 *
 * @author jorge malaver
 */
import Abstracto.Persona;
public class PersonaReal extends Persona {
    
    public PersonaReal(String nom){
     
        super(nom);
    }
    
    @Override
    public void sujeto(){
       System.out.println("EJECUTANDO EL SUJETO REAL UNO");
    }
    
    @Override
    public void sujeto_1(){
     System.out.println("EJECUTANDO EL SUJETO REAL DOS");
    }
}
