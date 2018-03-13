/**
* Programa:    SAE
* Clase:       LoginGUI
* Nombre:      Adolfo Ángel de la Cruz Díaz
* Fecha:       07/03/2018
* Versión:     0.1
* Descripción: --.
*/
package sae.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class LoginGUI extends JFrame implements ActionListener
{
    //private Image fondo;
    private final JLabel TITULO = new JLabel("Iniciar Sesión");
    private final Font FUENTE_TITULO = new Font("Calibri", 5, 50);
    private final JLabel NOMBRE_LABEL = new JLabel("Nombre de usuario: ");
    private final JTextField CAMPO_NOMBRE = new JTextField("");
    private final JLabel CONTRASENA_LABEL = new JLabel("Contraseña: ");
    private final JPasswordField CAMPO_CONTRASENA = new JPasswordField("");
    private final JLabel TIPO_LABEL = new JLabel("Tipo de usuario: ");
    private final JComboBox TIPO_SESION = new JComboBox();
    private final JButton ACEPTAR = new JButton("Aceptar");
    
    public LoginGUI()
    {
        setVisible(true);
        setSize(400,600);
        setTitle("Login");
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        inicializarComponentes();
        iniciarPantalla();
    }
    
    public LoginGUI(String error)
    {
        setVisible(true);
        setSize(400,600);
        setTitle("Login");
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        inicializarComponentes();
        iniciarPantalla();
        
        JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void inicializarComponentes()
    {
        
        TITULO.setBounds(30, 30, 300, 50);
        NOMBRE_LABEL.setBounds(30, 100, 150, 30);
        CAMPO_NOMBRE.setBounds(30, 135, 300, 30);
        CONTRASENA_LABEL.setBounds(30, 180, 300, 30);
        CAMPO_CONTRASENA.setBounds(30, 215, 300, 30);
        TIPO_LABEL.setBounds(30, 270, 150, 30);
        TIPO_SESION.setBounds(30, 305, 200, 30);
        ACEPTAR.setBounds(150, 380, 100, 30);
        
        TITULO.setFont(FUENTE_TITULO);
        
        TIPO_SESION.addItem("Administrador");
        TIPO_SESION.addItem("Tecnico");
        
        ACEPTAR.addActionListener(this);
    }
    
    public void iniciarPantalla()
    {
        add(TITULO);
        add(NOMBRE_LABEL);
        add(CAMPO_NOMBRE);
        add(CONTRASENA_LABEL);
        add(CAMPO_CONTRASENA);
        add(TIPO_LABEL);
        add(TIPO_SESION);
        add(ACEPTAR);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String nombre_usuario = CAMPO_NOMBRE.getText();
        String contrasena = CAMPO_CONTRASENA.getPassword().toString();
        String tipo_sesion = TIPO_SESION.getSelectedItem().toString();
        
        if(!nombre_usuario.equals("") && !contrasena.equals(""))
        {
            new Login(nombre_usuario, contrasena, tipo_sesion);
            dispose();
        }
    }
}
