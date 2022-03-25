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
public class Real { // clase cliente
    
    private Persona perso;
    
    
    public Real(Persona per){
        perso=per;
        
    }
    
    public void llamar(){
        perso.sujeto();
        perso.sujeto();
        perso.sujeto_1();
        perso.sujeto();
    }
    
}//fin de la clase real
