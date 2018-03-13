/**
* Programa:    SAE
* Clase:       Tecnico
* Nombre:      Adolfo Ángel de la Cruz Díaz
* Fecha:       06/03/2018
* Versión:     0.1
* Descripción: --.
*/
package sae.personas;

public class Tecnico 
{
    
    private String nombre;
    private String telefono;
    private String direccion;
    private Double sueldo;
    
    public Tecnico(String nombre, String telefono, String direccion, Double sueldo)
    {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sueldo = sueldo;
    }
    
    /*
    *   Sección de setters
    */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
    
    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }
    
    public void setSueldo(Double sueldo)
    {
        this.sueldo = sueldo;
    }
    
    /*
    *   Sección de getters
    */
    public String getNombre()
    {
        return nombre;
    }
    
    public String getTelefono()
    {
        return telefono;
    }
    
    public String getDireccion()
    {
        return direccion;
    }
    
    public Double getSueldo()
    {
        return sueldo;
    }
}
