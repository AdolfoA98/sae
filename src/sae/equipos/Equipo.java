/**
* Programa:    SAE
* Nombre:      Adolfo Ángel de laCruz Díaz.
*              Primitivo Cruz Hernández.
* Fecha:       06/03/2018
* Versión:     0.1
* Descripción: --.
*/

package sae.equipos;

public class Equipo 
{
    
    private int id;
    private String marca;
    private String modelo;
    private String tipo; //Portátil, escritorio, etc.
    
    public Equipo(int id, String marca, String modelo, String tipo)
    {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }
    
    /*
    *   Sección de los setters
    */
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    /*
    *   Sección de getters
    */
    public int getId()
    {
        return id;
    }
    
    public String getMarca()
    {
        return marca;
    }
    
    public String getModelo()
    {
        return modelo;
    }
    
    public String getTipo()
    {
        return tipo;
    }
}
