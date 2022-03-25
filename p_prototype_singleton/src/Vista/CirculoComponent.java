/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Figuras.Circulo;
import Figuras.Rectangulo;
import Interface.Figuras_geometricas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class CirculoComponent implements ActionListener {

    private PrincipalComponent v;
    private CirculoTemplate vista;
    private Circulo cir;
    private int i;

    public CirculoComponent() {
        vista = new CirculoTemplate(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getbGenerar1()) {
            if (vista.getP() == null) {
                this.GenerarCirculo();
            } else {
                i = 0;
                vista.Generar();
                this.GenerarCirculo();
            }
        }
        if (e.getSource() == vista.getbClonar1()) {
            i++;
            if (i == 1) {
                this.CrearCirculo();
                this.Clonar();
                this.GenerarCirculo();
            }
        }
        if(e.getSource() == vista.getbAtras()){
            v = new PrincipalComponent();
            vista.setVisible(false);
        }
        if (e.getSource() == vista.getbSalir1()) {
            System.exit(0);
        }
    }

    private void CrearCirculo() {
        cir = new Circulo();
        cir.setNombre("Circulo");
        cir.tamaño(Integer.parseInt(vista.getJTPosx().getText()), Integer.parseInt(vista.getJTPosy().getText()));
    }

    private void GenerarCirculo() {
        vista.setR(false);
        if (!vista.getJTPosx().getText().equals(null) && !vista.getJTPosy().getText().equals(null)) {
            int x = Integer.parseInt(vista.getJTPosx().getText());
            int y = Integer.parseInt(vista.getJTPosy().getText());
            if (x >= 0 && x <= 350) {
                if (y >= 0 && y <= 350) {
                    if (!vista.getCbColor().getSelectedItem().equals(null)) {
                        vista.setPosX(vista.getJTPosx().getText());
                        vista.setPosY(vista.getJTPosy().getText());
                        switch (vista.getCbColor().getSelectedIndex()) {
                            case 0:
                                vista.setColor(Color.MAGENTA);
                                break;
                            case 1:
                                vista.setColor(Color.ORANGE);
                                break;
                            case 2:
                                vista.setColor(Color.PINK);
                                break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Seleccione un Color", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione la posicion (0 < y < 200) pixeles", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione la posicion (0 < x < 200) pixeles", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            vista.DibujarPanel();
        } else {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar la posicion del Circulo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void Clonar() {
        Figuras_geometricas geometrica = null;
        geometrica = cir.clonar();
    }
}
