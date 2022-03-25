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
public class MedicoAdapter  extends Target_Profesionales{
     Medico medico;// referencia a laclase adaptada medico
    
     public MedicoAdapter(){
         super();
         this.medico = new Medico();
     }
     
    @Override
    public void Leer_planos(){
        
        System.out.println("Especialidades de medicas");
        this.medico.especialidad();
        this.medico.Entidades();
    }
    
    @Override
    public void contratos(){
        System.out.println("Nacionalidades");
        this.medico.nacionalidad();
    }
    
    @Override
    public void supervision(){
        System.out.println("Campos de investigacion");
        this.medico.Investigacion();
    }
}
