/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import p_composite.Seguros;

/**
 *
 * @author PC
 */
public class RegistrarComponent implements ActionListener {

    private RegistrarTemplate vistaRegistrar;
    private ResultadosTemplate resultados;
    private PrincipalComponent vistaPrincipal;
    private Seguros seguros;
    private String Nombre, cedula, eps, eVida, eCarro, eCasa;

    public RegistrarComponent(PrincipalComponent vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaRegistrar = new RegistrarTemplate(this, vistaPrincipal.getLogo());
        seguros = new Seguros(vistaPrincipal.getEps());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaRegistrar.getbSalir()) {
            System.exit(0);
        }
        if (e.getSource() == vistaRegistrar.getbVolver()) {
            volver();
        }
        if (e.getSource() == vistaRegistrar.getbRegistrar()) {
            if (obtenerDatos()) {
                Seguros();
                this.eps = seguros.getEps();
                registrar();
            }
        }
        if (e.getSource() == resultados.getbAceptar()) {
            aceptar();
        }
        if (e.getSource() == resultados.getbSalir()) {
            System.exit(0);
        }
    }

    public void volver() {
        this.vistaPrincipal = new PrincipalComponent();
        vistaRegistrar.dispose();
    }

    public void registrar() {
        resultados = new ResultadosTemplate(this);
        vistaRegistrar.dispose();
    }
    
    public void aceptar() {
        vistaPrincipal = new PrincipalComponent();
        resultados.dispose();
    }

    public void Seguros() {
        if (!vistaRegistrar.gettEdad().getText().equals("")) {
            if (isNumeric(vistaRegistrar.gettEdad().getText())) {
                if (vistaRegistrar.getRbVida().isSelected()) {
                    if (Integer.parseInt(vistaRegistrar.gettEdad().getText()) >= 50) {
                        seguros.RechazarSeguro(seguros, "Vida");
                        eVida = seguros.getSeguro();
                    } else {
                        seguros.AceptarSeguro(seguros, "Vida");
                        eVida = seguros.getSeguro();
                    }
                }else{
                    eVida = "Seguro de Vida: No Aplica";
                }
            } else {
                JOptionPane.showMessageDialog(null, "La edad debe ser un número", "Advertencia", 2);
            }
        }
        if (!vistaRegistrar.gettIngresos().getText().equals("")) {
            if (vistaRegistrar.getRbCarro().isSelected()) {
                if (Integer.parseInt(vistaRegistrar.gettIngresos().getText()) <= 600000) {
                    seguros.RechazarSeguro(seguros, "Carro");
                    eCarro = seguros.getSeguro();
                } else {
                    seguros.AceptarSeguro(seguros, "Carro");
                    eCarro = seguros.getSeguro();
                }
            }else{
                eCarro = "Seguro de Carro: No Aplica";
            }
        }
        if (!vistaRegistrar.gettIngresos().getText().equals("")) {
            if (vistaRegistrar.getRbCasa().isSelected()) {
                if (Integer.parseInt(vistaRegistrar.gettIngresos().getText()) <= 600000) {
                    seguros.RechazarSeguro(seguros, "Casa");
                    eCasa = seguros.getSeguro();
                } else {
                    seguros.AceptarSeguro(seguros, "Casa");
                    eCasa = seguros.getSeguro();
                }
            }else{
                eCasa = "Seguro de Casa: No Aplica";
            }
        }

    }

    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public boolean obtenerDatos() {
        if (!vistaRegistrar.gettNombreUsuario().getText().equals("") && !vistaRegistrar.gettEdad().getText().equals("") && !vistaRegistrar.gettIngresos().getText().equals("") && !vistaRegistrar.gettCedula().getText().equals("")) {
            if (vistaRegistrar.getRbCarro().isSelected() || vistaRegistrar.getRbCasa().isSelected() || vistaRegistrar.getRbVida().isSelected()) {
                this.Nombre = vistaRegistrar.gettNombreUsuario().getText();
                this.cedula = vistaRegistrar.gettCedula().getText();
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione al menos un tipo de Seguro", "Advertencia", 2);
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Deben llenarse todos los espacios", "Advertencia", 2);
            return false;
        }
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCedula() {
        return cedula;
    }
    
    public String getEps() {
        return eps;
    }

    public String geteVida() {
        return eVida;
    }

    public String geteCarro() {
        return eCarro;
    }

    public String geteCasa() {
        return eCasa;
    }

}
