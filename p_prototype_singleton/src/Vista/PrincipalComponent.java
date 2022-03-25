/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author PC
 */
public class PrincipalComponent implements ActionListener{
    //patron singleton
    private static PrincipalTemplate vista;
    private static CuadradoComponent c;
    private static CirculoComponent c1;
    
    public PrincipalComponent(){
        vista = new PrincipalTemplate(this);   
    }
    public static void CuadradoComponente() {
    	if(c==null) {
            c = new CuadradoComponent();
            vista.setVisible(false);
    	}else
    		 System.out.println("El objeto ha sido creado");
    }
    public static void CirculoComponente() {
    	if(c1==null) {
            c1 = new CirculoComponent();
            vista.setVisible(false);
    	}else
    		 System.out.println("El objeto ha sido creado");
    }
    
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getbSalir()) {
            System.exit(0);
        }
        if (e.getSource() == vista.getbRectangulo()) {     
        	this.CuadradoComponente();
        }
        if (e.getSource() == vista.getbCirculo()) {     
        	this.CirculoComponente();
        }
    }
    
}
