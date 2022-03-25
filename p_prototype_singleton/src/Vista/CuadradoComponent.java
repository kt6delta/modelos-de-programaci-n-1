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
public class CuadradoComponent implements ActionListener {

    private PrincipalComponent v;
    private CuadradoTemplate vistaC;
    private Rectangulo rect;
    private int i;

    public CuadradoComponent() {
        vistaC = new CuadradoTemplate(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaC.getbSalir()) {
            System.exit(0);
        }
        if (e.getSource() == vistaC.getbGenerar()) {
            if (vistaC.getP() == null) {
                this.GenerarRectangulo();
            } else {
                i = 0;
                vistaC.Generar();
                this.GenerarRectangulo();
            }
        }
        if(e.getSource() == vistaC.getbAtras()){
            v = new PrincipalComponent();
            vistaC.setVisible(false);
        }
        if (e.getSource() == vistaC.getbClonar()) {
            i++;
            if (i == 1) {
                this.CrearRectangulo();
                this.Clonar();
                this.GenerarRectangulo();
            }
        }
    }

    private void CrearRectangulo() {
        rect = new Rectangulo();
        rect.setNombre("Rectangulo");
        rect.tamaño(Integer.parseInt(vistaC.getJTPosx().getText()), Integer.parseInt(vistaC.getJTPosy().getText()));
    }

    private void GenerarRectangulo() {
        vistaC.setR(true);
        if (!vistaC.getJTPosx().getText().equals(null) && !vistaC.getJTPosy().getText().equals(null)) {
            int x = Integer.parseInt(vistaC.getJTPosx().getText());
            int y = Integer.parseInt(vistaC.getJTPosy().getText());
            if (x >= 0 && x <= 350) {
                if (y >= 0 && y <= 350) {
                    if (!vistaC.getCbColor().getSelectedItem().equals(null)) {
                        vistaC.setPosX(vistaC.getJTPosx().getText());
                        vistaC.setPosY(vistaC.getJTPosy().getText());
                        switch (vistaC.getCbColor().getSelectedIndex()) {
                            case 0:
                                vistaC.setColor(Color.BLUE);
                                break;
                            case 1:
                                vistaC.setColor(Color.RED);
                                break;
                            case 2:
                                vistaC.setColor(Color.YELLOW);
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
            vistaC.DibujarPanel();
        }
    }

    private void Clonar() {
        Figuras_geometricas geometrica = null;
        geometrica = rect.clonar();
    }
}
