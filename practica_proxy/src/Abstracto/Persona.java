/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstracto;

/**
 *
 * @author jorge malaver
 */

//la clase persona es la interfaz de la persona real de cara al exterior(cliente)
//la clase abstracta cuyos metodos seran implementados tanto por la clase real
// como por el proxy
import Real_proxy.*;
public abstract class Persona {
    String Nombre;
    
    public Persona(String nom){//guarda el nombre del sujeto
    Nombre=nom;// trabaja lo mismo con el sujeto real como con el proxy
}
    // devuelve el nombre del sujeto
    public String toString(){
        return Nombre;
    }
    // metodos que se implementan en las clases que heredan 
    public abstract void sujeto();
    public abstract void sujeto_1();
    
    public void estado(Persona persona){
     
        Proxy por;
        por=(Proxy ) persona;
        por.toString();
        
    }
}
