/**
* Programa:    SAE
* Clase:       PrincipalAdministradorGUI
* Nombre:      Adolfo Ángel de la Cruz Díaz
* Fecha:       06/03/2018
* Versión:     0.1
* Descripción: --.
*/
package sae.ui;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class PrincipalAdministradorGUI extends JFrame implements ActionListener
{
    private final JButton REGISTRAR_EQUIPO = new JButton("Registrar equipo");
    
    public PrincipalAdministradorGUI()
    {
        setVisible(true);
        setSize(800,500);
        setLayout(null);
        setTitle("Administrador");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        inicializarComponentes();
        iniciarPantalla();
    }
    
    public void inicializarComponentes()
    {
        REGISTRAR_EQUIPO.setBounds(600, 50, 150, 30);
        
        REGISTRAR_EQUIPO.addActionListener(this);
    }
    
    public void iniciarPantalla()
    {
        add(REGISTRAR_EQUIPO);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        new RegistroClienteGUI();
    }
}
