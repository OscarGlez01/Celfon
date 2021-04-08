
package mx.itson.celfon.persistencias;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Oscar González Leyva
 */
public class Conexion {
    
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
