
package mx.itson.celfon.persistencias;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Genera la conexion a la base de datos pertinente
 * @author Oscar González Leyva
 */
public class Conexion {
    
    /**
     * Obtiene la conexion a la base de datos de MySQL
     * @return Devuelve la conexion de la base de datos
     */
    public static Connection obtener() {
        Connection connection = null;
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost/celfondb?user=root&password=753896412Ab!");
        }catch(Exception ex){
            System.out.println("Ocurrio un error: " + ex.getMessage());
        }
        return connection;
    }
}
