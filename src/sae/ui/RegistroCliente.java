/**
* Programa:    SAE
* Clase:       RegistroCliente
* Nombre:      Adolfo Ángel de la Cruz Díaz
* Fecha:       06/03/2018
* Versión:     0.1
* Descripción: --.
*/
package sae.ui;

import sae.conector.Conector;

public class RegistroCliente
{
    private Conector conector;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    
    public RegistroCliente(String nombre, String correo, String telefono, String direccion)
    {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        
        registrarCliente();
    }
    
    public void registrarCliente()
    {
        conector = new Conector();
        conector.iniciarConexion();
        conector.setComando("INSERT INTO cliente(nombre, correo, telefono, direccion) VALUES( ? , ? , ? , ? );", nombre, correo, telefono, direccion);
        conector.ejecutarComando();
        conector.cerrarConexion();
    }
}
