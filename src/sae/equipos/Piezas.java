/**
* Programa:    SAE
* Nombre:      Adolfo Ángel de la Cruz Díaz,
*              Primitivo Cruz Hernández.
* Fecha:       06/03/2018
* Versión:     0.1
* Descripción: --
*/

package sae.equipos;

public class Piezas 
{
    
    private int id;
    private String modelo;
    private String marca;
    private Double costo;
    
    public Piezas(int id, String modelo, String marca, Double costo)
    {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.costo = costo;
    }
    
    /*
    *   Sección de setters.
    */
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    public void setCosto(Double costo)
    {
        this.costo = costo;
    }
    
    /*
    *   seccion de getters
    */
    public int getId()
    {
        return id;
    }
    
    public String getModelo()
    {
        return modelo;
    }
    
    public String getMarca()
    {
        return marca;
    }
    
    public Double getCosto()
    {
        return costo;
    }
}
