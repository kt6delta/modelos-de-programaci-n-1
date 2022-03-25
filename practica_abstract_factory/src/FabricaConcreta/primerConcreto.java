/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaConcreta;

import Fabrica_abstracta.ServicioFactory;
import Fabrica_abstracta.ServicioNotas;
import ProductosConcretos.PrimerPerido;
public class primerConcreto implements ServicioFactory{
    
    @Override
    public ServicioNotas crearNota(){
      return new PrimerPerido();  
    }
}
