/**
* Programa:    SAE
* Clase:       Login
* Nombre:      Adolfo Ángel de la Cruz Díaz
* Fecha:       06/03/2018
* Versión:     0.1
* Descripción: --.
*/
package sae.ui;

import sae.conector.Conector;

public class Login
{
    private Conector conector;
    private String nombre_usuario;
    private String contrasena;
    private String tipo_sesion;
    
    public Login(String nombre_usuario, String contrasena, String tipo_sesion)
    {
        this.nombre_usuario = nombre_usuario;
        this.contrasena = contrasena;
        this.tipo_sesion = tipo_sesion;
        iniciarSesion();
    }
    
    public void iniciarSesion()
    {
        conector = new Conector();
        conector.iniciarConexion();
        int fila = conector.obtenerFilaEnTabla(tipo_sesion.toLowerCase(), "usuario", nombre_usuario);
        if(conector.buscarDatoEnFila(tipo_sesion, fila, "contrasena", contrasena))
        {
            new PrincipalAdministradorGUI();
        }else
        {
            new LoginGUI();
        }
        conector.cerrarConexion();
    }
}
