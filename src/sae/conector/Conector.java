/**
* Programa:    SAE
* Clase:       Conector
* Nombre:      Adolfo Ángel de la Cruz Díaz
* Fecha:       06/03/2018
* Versión:     0.1
* Descripción: --.
*/
package sae.conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conector
{
    private Connection conector = null;
    private String servidor = "localhost";
    private String base_de_datos = "sae";
    private String usuario = "root";
    private String contrasena = "HAL&TOGE";
    private String direccion;
    private PreparedStatement comando;
    
    public Conector()
    {
        direccion = "jdbc:mysql://" + servidor + ":3306" + "/" + base_de_datos;
    }
    
    public void iniciarConexion()
    {
        try
        {
            DriverManager.deregisterDriver(new org.gjt.mm.mysql.Driver());
            conector = DriverManager.getConnection(direccion, usuario, contrasena);
        }catch(SQLException e)
        {
            //Algo va aquí.
        }
        
    }
    
    public void cerrarConexion()
    {
        try
        {
            conector.close();
        }catch(SQLException e)
        {
            //Algo va aquí
        }
    }
    
    /*
    *   Sección de consultas
    */
    //Metodo a revisar.
    public void ejecutarComando()
    {
        try
        {
            comando.execute();
        }catch(SQLException e)
        {
            //Algo va aquí
            System.out.println("Fallo ejecución");
        }
    }
    
    public Integer obtenerFilaEnTabla(String tabla, String columna, String dato)
    {
        try
        {
            Statement query = conector.createStatement();
            ResultSet tabla_SQL = query.executeQuery("select * from " + tabla);
            while(tabla_SQL.next())
            {
                if(tabla_SQL.getString(columna).equals(dato))
                {
                    return tabla_SQL.getRow();
                }
            }
        }catch(SQLException e)
        {
            //Algo va aquí
        }
        
        return 0;
    }
    
    public Boolean buscarDatoEnFila(String tabla, int fila, String columna, String dato){
        try
        {
            Statement query = conector.createStatement();
            ResultSet tabla_SQL = query.executeQuery("select * from " + tabla);
            while(tabla_SQL.next())
            {
                if(tabla_SQL.getRow() == fila && tabla_SQL.getString(columna).equals(dato))
                {
                    return true;
                }
            }
        }catch(SQLException e)
        {
            //Algo va aquí
        }
        
        return false;
    }
    
    /*
    *   Sección de setters
    */
    public void setConector(Connection conector)
    {
        this.conector = conector;
    }
    
    //Empiezan setters sobrecargados de setComando()
    public void setComando(String sql)
    {
        try
        {
            comando = conector.prepareStatement(sql);
        }catch(SQLException e)
        {
            //Algo va aquí
        }
    }
    
    public void setComando(String sql, String parametro)
    {
        try
        {
            comando = conector.prepareStatement(sql);
            comando.setString(1, parametro);
        }catch(SQLException e)
        {
            //Algo va aquí
        }
    }
    
    public void setComando(String sql, int parametro)
    {
        try
        {
            comando = conector.prepareStatement(sql);
            comando.setInt(1 , parametro);
        }catch(SQLException e)
        {
            //Algo va aquí
        }
    }
    
    public void setComando(String sql, boolean parametro)
    {
        try
        {
            comando = conector.prepareStatement(sql);
            comando.setBoolean(1, parametro);
        }catch(SQLException e)
        {
            //Algo va aquí
        }
    }
    
    public void setComando(String sql, String parametro, String parametro2)
    {
        try
        {
            comando = conector.prepareStatement(sql);
            comando.setString(1, parametro);
            comando.setString(2, parametro2);
        }catch(SQLException e)
        {
            //Algo va aquí
        }
    }
    
    public void setComando(String sql, Boolean parametro, String parametro2)
    {
        try
        {
            comando = conector.prepareStatement(sql);
            comando.setBoolean(1, parametro);
            comando.setString(2, parametro2);
        }catch(SQLException e)
        {
            //Algo va aquí
        }
    }
    
    public void setComando(String sql, String parametro, String parametro2, String parametro3)
    {
        try
        {
            comando = conector.prepareStatement(sql);
            comando.setString(1, parametro);
            comando.setString(2, parametro2);
            comando.setString(3, parametro3);
        }catch(SQLException e)
        {
            //Algo va aquí
        }
    }
    
    public void setComando(String sql, String parametro, String parametro2, String parametro3, String parametro4)
    {
        try
        {
            comando = conector.prepareStatement(sql);
            comando.setString(1, parametro);
            comando.setString(2, parametro2);
            comando.setString(3, parametro3);
            comando.setString(4, parametro4);
        }catch(SQLException e)
        {
            //Algo va aquí
            System.out.println("Fallo");
        }
    }
    
    
    /*
    *   Sección de getters
    */
    public Connection getConnection()
    {
        return conector;
    }
}
