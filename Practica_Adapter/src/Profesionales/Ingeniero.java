/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesionales;

/**
 *
 * @author jorge malaver
 */
public class Ingeniero extends Target_Profesionales {
    
    public Ingeniero(){
        super();
        System.out.println("Contruccion de obras civiles");
    }
    
    @Override
    public void Leer_planos(){
        System.out.println("Planos de todo tipo");
    }
    
    @Override
    public void contratos(){
     System.out.println("Elaborar contratos construccion");   
    }
    
    @Override
    public void supervision(){
        System.out.println("Auditoria y control");
    }
}
