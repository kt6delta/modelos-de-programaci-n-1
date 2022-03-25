/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author PC
 */
public class ResultadosTemplate extends JFrame {

    private JPanel panel;
    private JLabel lUsuario, lCedula, lSeguros, lEps, lLogo;
    private JButton bAceptar, bSalir;
    private ImageIcon iDimAux, iSalir, iTitulo;
    private RegistrarComponent vistacomponent;

    public ResultadosTemplate(RegistrarComponent vistacomponent) {
        this.vistacomponent = vistacomponent;

        this.crearObjetosDecoradores();
        this.crearJPanel();
        this.crearJButton();
        this.crearJLabel();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 400);
        setUndecorated(true);
        setLayout(null);
        setLocationRelativeTo(this);
        setVisible(true);
    }

    private void crearObjetosDecoradores() {
        iSalir = new ImageIcon("resources/img/salir.png");
        iTitulo = new ImageIcon("resources/img/logo.png");
    }

    private void crearJPanel() {
        panel = new JPanel();
        panel.setSize(300, 400);
        panel.setLocation(0, 0);
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        this.add(panel);
    }

    private void crearJLabel() {
        iDimAux = new ImageIcon(iTitulo.getImage().getScaledInstance(100, 50, Image.SCALE_AREA_AVERAGING));
        lLogo = new JLabel();
        lLogo.setSize(100, 50);
        lLogo.setIcon(iDimAux);
        lLogo.setLocation(100, 350);
        lLogo.setForeground(Color.WHITE);
        lLogo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lLogo);

        lUsuario = new JLabel();
        lUsuario.setSize(300, 30);
        lUsuario.setLocation(0, 50);
        lUsuario.setText(this.vistacomponent.getNombre());
        lUsuario.setForeground(Color.BLACK);
        lUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        lUsuario.setFont(new Font("book antiqua", Font.PLAIN, 14));
        panel.add(lUsuario);

        lCedula = new JLabel();
        lCedula.setSize(300, 30);
        lCedula.setLocation(0, 90);
        lCedula.setText(this.vistacomponent.getCedula());
        lCedula.setForeground(Color.BLACK);
        lCedula.setHorizontalAlignment(SwingConstants.CENTER);
        lCedula.setFont(new Font("book antiqua", Font.PLAIN, 14));
        panel.add(lCedula);

        lEps = new JLabel();
        lEps.setSize(300, 30);
        lEps.setLocation(0, 130);
        lEps.setText(this.vistacomponent.getEps());
        lEps.setForeground(Color.BLACK);
        lEps.setHorizontalAlignment(SwingConstants.CENTER);
        lEps.setFont(new Font("book antiqua", Font.PLAIN, 14));
        panel.add(lEps);

        lSeguros = new JLabel();
        lSeguros.setSize(300, 90);
        lSeguros.setLocation(0, 170);
        lSeguros.setText("<html><div align='center'>Respuesta a su Solicitud de los Seguros<br>"
                +this.vistacomponent.geteVida()+" <br>"
                +this.vistacomponent.geteCasa()+" <br>"
                +this.vistacomponent.geteCarro()+" <br>"
                +"Gracias Por Usar Nuestros Servicios."
                + "</div></html>");
        lSeguros.setForeground(Color.BLACK);
        lSeguros.setHorizontalAlignment(SwingConstants.CENTER);
        lSeguros.setFont(new Font("book antiqua", Font.PLAIN, 14));
        panel.add(lSeguros);
    }

    private void crearJButton() {
        bSalir = new JButton();
        bSalir.setSize(25, 25);
        bSalir.setLocation(250, 10);
        iDimAux = new ImageIcon(iSalir.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
        bSalir.setIcon(iDimAux);
        bSalir.setFocusable(false);
        bSalir.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bSalir.setBorder(null);
        bSalir.setContentAreaFilled(false);
        bSalir.setHorizontalAlignment(SwingConstants.CENTER);
        bSalir.addActionListener(this.vistacomponent);
        panel.add(bSalir);

        bAceptar = new JButton("ACEPTAR");
        bAceptar.setSize(100, 30);
        bAceptar.setLocation(100, 300);
        bAceptar.setFocusable(false);
        bAceptar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bAceptar.setFont(new Font("arial black", Font.PLAIN, 15));
        bAceptar.setBackground(new Color(0, 0, 128));
        bAceptar.setForeground(Color.BLACK);
        bAceptar.setBorder(null);
        bAceptar.setContentAreaFilled(true);
        bAceptar.setHorizontalAlignment(SwingConstants.CENTER);
        bAceptar.addActionListener(this.vistacomponent);
        panel.add(bAceptar);
    }

    public JButton getbAceptar() {
        return bAceptar;
    }

    public JButton getbSalir() {
        return bSalir;
    }
}
