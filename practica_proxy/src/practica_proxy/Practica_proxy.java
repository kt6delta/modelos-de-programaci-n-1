/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_proxy;

/**
 *
 * @author jorge malaver
 */
// El cliente (clase real) del sujeto solo conoce que maneja un objeto de la clase
// Persona. Por  lo tanto funciona indistintamente con la con la personareal
import Abstracto.Persona;
import Real_proxy.*;
public class Practica_proxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona obj = new Proxy("obj");
        Real res =new Real(obj);
        obj.estado(obj);
        res.llamar();
        obj.estado(obj);
        
        Persona obj1 = new PersonaReal("obj1");
        Real res1 = new Real(obj1);
        
        res1.llamar();
        
        
    }
    
}
