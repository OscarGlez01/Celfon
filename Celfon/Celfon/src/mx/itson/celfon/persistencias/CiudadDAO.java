package mx.itson.celfon.persistencias;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.itson.celfon.entidades.Ciudad;
import mx.itson.celfon.entidades.Estado;

/**
 *
 * @author osc04
 */
public class CiudadDAO {
    public static List<Ciudad> obtenerTodos(){
        List<Ciudad> ciudades = new ArrayList<>();
        try{
            Connection conexion= Conexion.obtener();
            if(conexion != null){
                Statement statement = conexion.createStatement();
                ResultSet resultset= statement.executeQuery("SELECT c.id, c.nombre, e.id, e.nombre FROM ciudad c INNER JOIN estado e ON c.idestado = e.id");
                while(resultset.next()){
                    Ciudad ciudad= new Ciudad();
                    ciudad.setId(resultset.getInt(1));
                    ciudad.setNombre(resultset.getString(2));
                    
                    Estado estado= new Estado();
                    estado.setId(resultset.getInt(3));
                    
                    ciudad.setEstado(estado);
                    ciudades.add(ciudad);
                }
            }
        }catch(Exception ex){
            System.out.println("Error"+ ex.getMessage());
        }
        return ciudades;
    }
}
