/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_bridge;

/**
 *
 * @author jorge malaver
 */

import Implementador.*;
import Abstraccion.*;

public class Practica_Bridge {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Abstract_prenda[] prendas =new Abstract_prenda[3];
        prendas[0]= new Chaqueta(new Rojo());
        prendas[1] = new Buzo(new Azul());
        prendas[2] = new Pantalon(new Amarillo());
        
        for( Abstract_prenda obj : prendas){
            obj.prenda();
        }
        
    }
    
}
