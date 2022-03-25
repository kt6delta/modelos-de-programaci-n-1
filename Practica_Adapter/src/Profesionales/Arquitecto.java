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
public class Arquitecto extends Target_Profesionales {
    
    
    @Override
    public void Leer_planos(){
        System.out.println("Planos de todo tipo");
    }
    
    @Override
    public void contratos(){
        System.out.println("Contratos dibujantes");
    }
    
    @Override
    public void supervision(){
        System.out.println("Auditoria diseño ");
    }
}
