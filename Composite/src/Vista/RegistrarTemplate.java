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
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author PC
 */
public class RegistrarTemplate extends JFrame {

    private JPanel panel;
    private JLabel lUsuario, lCedula, lTitulo, lEdad, lIngresos, lLogo, lSeguros;
    private JButton bVolver, bRegistrar, bSalir;
    private ImageIcon iDimAux, iSalir, iTitulo, ilogo;
    private JTextField tNombreUsuario, tCedula, tEdad, tIngresos;
    private JRadioButton rbCarro, rbCasa, rbVida;
    private RegistrarComponent vistacomponent;
    private String Logo;

    public RegistrarTemplate(RegistrarComponent vistacomponent, String logo) {
        this.vistacomponent = vistacomponent;
        this.Logo = logo;

        this.crearObjetosDecoradores();
        this.crearJPanel();
        this.crearJTextField();
        this.crearJRadioButton();
        this.crearJButton();
        this.crearJLabel();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 700);
        setUndecorated(true);
        setLayout(null);
        setLocationRelativeTo(this);
        setVisible(true);
    }

    private void crearObjetosDecoradores() {
        iSalir = new ImageIcon("resources/img/salir.png");
        ilogo = new ImageIcon("resources/img/logo.png");
        iTitulo = new ImageIcon(Logo);
    }

    private void crearJPanel() {
        panel = new JPanel();
        panel.setSize(400, 700);
        panel.setLocation(0, 0);
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        this.add(panel);
    }

    private void crearJLabel() {
        iDimAux = new ImageIcon(iTitulo.getImage().getScaledInstance(200, 100, Image.SCALE_AREA_AVERAGING));
        lTitulo = new JLabel();
        lTitulo.setSize(200, 100);
        lTitulo.setIcon(iDimAux);
        lTitulo.setLocation(100, 10);
        panel.add(lTitulo);
        
        iDimAux = new ImageIcon(ilogo.getImage().getScaledInstance(200, 100, Image.SCALE_AREA_AVERAGING));
        lLogo = new JLabel();
        lLogo.setSize(200, 100);
        lLogo.setIcon(iDimAux);
        lLogo.setLocation(100, 600);
        panel.add(lLogo);

        lUsuario = new JLabel("Usuario:");
        lUsuario.setSize(100, 30);
        lUsuario.setLocation(30, 120);
        lUsuario.setForeground(Color.BLACK);
        lUsuario.setHorizontalAlignment(SwingConstants.LEFT);
        lUsuario.setFont(new Font("book antiqua", Font.PLAIN, 14));
        panel.add(lUsuario);

        lCedula = new JLabel("Cedula:");
        lCedula.setSize(100, 30);
        lCedula.setLocation(30, 190);
        lCedula.setForeground(Color.BLACK);
        lCedula.setHorizontalAlignment(SwingConstants.LEFT);
        lCedula.setFont(new Font("book antiqua", Font.PLAIN, 14));
        panel.add(lCedula);

        lEdad = new JLabel("Edad:");
        lEdad.setSize(100, 30);
        lEdad.setLocation(30, 260);
        lEdad.setForeground(Color.BLACK);
        lEdad.setHorizontalAlignment(SwingConstants.LEFT);
        lEdad.setFont(new Font("book antiqua", Font.PLAIN, 14));
        panel.add(lEdad);

        lIngresos = new JLabel("Ingresos Mensuales:");
        lIngresos.setSize(210, 30);
        lIngresos.setLocation(30, 340);
        lIngresos.setForeground(Color.BLACK);
        lIngresos.setHorizontalAlignment(SwingConstants.LEFT);
        lIngresos.setFont(new Font("book antiqua", Font.PLAIN, 14));
        panel.add(lIngresos);

        lSeguros = new JLabel("Solicitar Seguros");
        lSeguros.setSize(210, 30);
        lSeguros.setLocation(30, 420);
        lSeguros.setForeground(Color.BLACK);
        lSeguros.setHorizontalAlignment(SwingConstants.LEFT);
        lSeguros.setFont(new Font("book antiqua", Font.PLAIN, 14));
        panel.add(lSeguros);
    }
    
    private void crearJTextField() {
        tNombreUsuario = new JTextField();
        tNombreUsuario.setSize(340, 30);
        tNombreUsuario.setLocation(30, 150);
        tNombreUsuario.setForeground(Color.BLACK);
        tNombreUsuario.setBackground(Color.WHITE);
        tNombreUsuario.setCaretColor(Color.BLACK);
        tNombreUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        tNombreUsuario.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
        tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(tNombreUsuario);
        
        tCedula = new JTextField();
        tCedula.setSize(340, 30);
        tCedula.setLocation(30, 220);
        tCedula.setForeground(Color.BLACK);
        tCedula.setBackground(Color.WHITE);
        tCedula.setCaretColor(Color.BLACK);
        tCedula.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        tCedula.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
        tCedula.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(tCedula);
        
        tEdad = new JTextField();
        tEdad.setSize(340, 30);
        tEdad.setLocation(30, 290);
        tEdad.setForeground(Color.BLACK);
        tEdad.setBackground(Color.WHITE);
        tEdad.setCaretColor(Color.BLACK);
        tEdad.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        tEdad.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
        tEdad.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(tEdad);
        
        tIngresos = new JTextField();
        tIngresos.setSize(340, 30);
        tIngresos.setLocation(30, 370);
        tIngresos.setForeground(Color.BLACK);
        tIngresos.setBackground(Color.WHITE);
        tIngresos.setCaretColor(Color.BLACK);
        tIngresos.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        tIngresos.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
        tIngresos.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(tIngresos);
    }
    
    private void crearJRadioButton(){
        rbVida = new JRadioButton("Seguro de Vida");
        rbVida.setBounds(70, 450, 200, 30);
        rbVida.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        rbVida.setForeground(Color.BLACK);
        rbVida.setBackground(Color.WHITE);
        panel.add(rbVida);
        
        rbCasa = new JRadioButton("Seguro para Casa");
        rbCasa.setBounds(70, 480, 200, 30);
        rbCasa.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        rbCasa.setForeground(Color.BLACK);
        rbCasa.setBackground(Color.WHITE);
        panel.add(rbCasa);
        
        rbCarro = new JRadioButton("Seguro para Carro");
        rbCarro.setBounds(70, 510, 200, 30);
        rbCarro.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        rbCarro.setForeground(Color.BLACK);
        rbCarro.setBackground(Color.WHITE);
        panel.add(rbCarro);
        
    }
    
    private void crearJButton() {
        bSalir = new JButton();
        bSalir.setSize(25, 25);
        bSalir.setLocation(350, 10);
        iDimAux = new ImageIcon(iSalir.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
        bSalir.setIcon(iDimAux);
        bSalir.setFocusable(false);
        bSalir.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bSalir.setBorder(null);
        bSalir.setContentAreaFilled(false);
        bSalir.setHorizontalAlignment(SwingConstants.CENTER);
        bSalir.addActionListener(this.vistacomponent);
        panel.add(bSalir);

        bVolver = new JButton("VOLVER");
        bVolver.setSize(150, 30);
        bVolver.setLocation(40, 560);
        bVolver.setFocusable(false);
        bVolver.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bVolver.setFont(new Font("arial black", Font.PLAIN, 15));
        bVolver.setBackground(new Color(0, 0, 128));
        bVolver.setForeground(Color.BLACK);
        bVolver.setBorder(null);
        bVolver.setContentAreaFilled(true);
        bVolver.setHorizontalAlignment(SwingConstants.CENTER);
        bVolver.addActionListener(this.vistacomponent);
        panel.add(bVolver);

        bRegistrar = new JButton("COMPRAR");
        bRegistrar.setSize(150, 30);
        bRegistrar.setLocation(210, 560);
        bRegistrar.setFocusable(false);
        bRegistrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bRegistrar.setFont(new Font("arial black", Font.PLAIN, 15));
        bRegistrar.setBackground(new Color(0, 0, 128));
        bRegistrar.setForeground(Color.BLACK);
        bRegistrar.setBorder(null);
        bRegistrar.setContentAreaFilled(true);
        bRegistrar.setHorizontalAlignment(SwingConstants.CENTER);
        bRegistrar.addActionListener(this.vistacomponent);
        panel.add(bRegistrar);
    }

    public JButton getbVolver() {
        return bVolver;
    }

    public JButton getbRegistrar() {
        return bRegistrar;
    }

    public JButton getbSalir() {
        return bSalir;
    }

    public JTextField gettNombreUsuario() {
        return tNombreUsuario;
    }

    public JTextField gettCedula() {
        return tCedula;
    }

    public JTextField gettEdad() {
        return tEdad;
    }
    
    public JTextField gettIngresos() {
        return tIngresos;
    }

    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    public JRadioButton getRbCarro() {
        return rbCarro;
    }

    public JRadioButton getRbCasa() {
        return rbCasa;
    }

    public JRadioButton getRbVida() {
        return rbVida;
    }
    
    
}
