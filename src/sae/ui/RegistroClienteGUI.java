/**
* Programa:    SAE
* Clase:       RegistroClienteGUI
* Nombre:      Adolfo Ángel de la Cruz Díaz
* Fecha:       06/03/2018
* Versión:     0.1
* Descripción: --.
*/
package sae.ui;

import sae.ui.RegistroCliente;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class RegistroClienteGUI extends JFrame implements ActionListener
{
    private final JLabel TITULO = new JLabel("Registar cliente");
    private final Font FUENTE_TITULO = new Font("Calibri", 5, 50);
    private final JLabel NOMBRE_LABEL = new JLabel("Nombre: ");
    private final JTextField CAMPO_NOMBRE = new JTextField("");
    private final JLabel CORREO_LABEL = new JLabel("Correo electrónico: ");
    private final JTextField CAMPO_CORREO = new JTextField("");
    private final JLabel TELEFONO_LABEL = new JLabel("Teléfono: ");
    private final JTextField CAMPO_TELEFONO = new JTextField("");
    private final JLabel DIRECCION_LABEL = new JLabel("Dirección: ");
    private final JTextField CAMPO_DIRECCION = new JTextField("");
    private final JButton REGISTRAR = new JButton("Registrar");
    
    public RegistroClienteGUI()
    {
        setVisible(true);
        setLayout(null);
        setSize(450,600);
        setTitle("Registrar cliente");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        inicializarComponentes();
        iniciarPantalla();
    }
    
    public void inicializarComponentes()
    {
        TITULO.setBounds(30, 30, 380, 60);
        NOMBRE_LABEL.setBounds(30, 100, 200, 30);
        CAMPO_NOMBRE.setBounds(30, 135, 370, 30);
        CORREO_LABEL.setBounds(30, 170, 200, 30);
        CAMPO_CORREO.setBounds(30, 205, 370, 30);
        TELEFONO_LABEL.setBounds(30, 240, 200, 30);
        CAMPO_TELEFONO.setBounds(30, 275, 370, 30);
        DIRECCION_LABEL.setBounds(30, 310, 200, 30);
        CAMPO_DIRECCION.setBounds(30, 345, 370, 30);
        REGISTRAR.setBounds(165, 420, 100, 30);
        
        TITULO.setFont(FUENTE_TITULO);
        
        REGISTRAR.addActionListener(this);
    }
    
    public void iniciarPantalla()
    {
        add(TITULO);
        add(NOMBRE_LABEL);
        add(CAMPO_NOMBRE);
        add(CORREO_LABEL);
        add(CAMPO_CORREO);
        add(TELEFONO_LABEL);
        add(CAMPO_TELEFONO);
        add(DIRECCION_LABEL);
        add(CAMPO_DIRECCION);
        add(REGISTRAR);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String nombre = CAMPO_NOMBRE.getText();
        String correo = CAMPO_CORREO.getText();
        String telefono = CAMPO_TELEFONO.getText();
        String direccion = CAMPO_DIRECCION.getText();
        
        new RegistroCliente(nombre, correo, telefono, direccion);
        dispose();
    }
    
}
