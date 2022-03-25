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

//el objeto proxy que es simultaneamente:
// proxy virtual que retrasa la creacion del objeto hasta la invocacion de alguno
//de los metodos.
//Referencia inteligente, raliza un conteo de las veces que de incova el metodo
import Abstracto.Persona;
public class Proxy extends Persona{
    
    private PersonaReal persoreal;
    private int accesosujeto , accesosujeto1;
    
    public Proxy(String nom){
        
        super(nom);//inicia la superclase
        persoreal=null;// establece a null la referencia
        accesosujeto=0;
        accesosujeto1=0;
    }
    //Evita la comprobacion de la existancia del sujeto real
    private PersonaReal obtenersujeto(){
        
        if(persoreal==null)
            persoreal= new PersonaReal(this + "SUJETO REAL");
           
        return persoreal;
    }
    
    @Override
    public void sujeto(){
        accesosujeto++;
        obtenersujeto().sujeto();
    }
    @Override
    public void sujeto_1(){
        accesosujeto1++;
        obtenersujeto().sujeto_1();
        
    }
    //presenta la informacion del conteo del uso del objeto
    @Override
    public String toString(){ 
        if(persoreal!=null){
           
            System.out.println("\n");
            System.out.println("ACCESO A"  + "....." + persoreal);
            System.out.println("METODO I"  + "..." + accesosujeto);
            System.out.println("METODO II"  + "..." + accesosujeto1);
            System.out.println("\n");        }
        return "";
    }
    
}//fin clase Proxy
