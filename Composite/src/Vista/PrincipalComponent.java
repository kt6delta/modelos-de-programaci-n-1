/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import p_composite.SaludTotal;
import p_composite.Sura;

/**
 *
 * @author PC
 */
public class PrincipalComponent implements ActionListener {
    
    private PrincipalTemplate vista;
    private RegistrarComponent registrarComponent;
    private SaludTotal st;
    private Sura sura;
    private String logo, eps;
    
    public PrincipalComponent() {
        st = new SaludTotal();
        sura = new Sura();
        this.vista = new PrincipalTemplate(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getbSalir()) {
            System.exit(0);
        }
        if (e.getSource() == vista.getbSura()) {
            this.logo = "resources/img/logosura.png";
            sura.Afiliar();
            this.eps = "Sura";
            JOptionPane.showMessageDialog(null,sura.getAfiliado(), "Felicitaciones", 1);
            entrar();
        }
        if (e.getSource() == vista.getbSalud()) {
            this.logo="resources/img/logosalud.jpg";
            st.Afiliar();
            this.eps = "Salud Total";
            JOptionPane.showMessageDialog(null,st.getAfiliado(), "Felicitaciones", 1);
            entrar();
        }
    }
    
    public void enviarDatosUsuario() {
        
    }
    
    public void entrar() {
        this.registrarComponent = new RegistrarComponent(this);
        vista.dispose();
    }

    public String getLogo() {
        return logo;
    }

    public String getEps() {
        return eps;
    }
    
}
