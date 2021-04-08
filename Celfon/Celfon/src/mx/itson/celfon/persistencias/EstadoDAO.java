
package mx.itson.celfon.persistencias;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.itson.celfon.entidades.Estado;

/**
 *
 * @author osc04
 */
public class EstadoDAO {
    
    public static List<Estado> obtenerTodos(){
        List<Estado> estados = new ArrayList<>();
        try{
            Connection conexion= Conexion.obtener();
            if(conexion != null){
                Statement statement = conexion.createStatement();
                ResultSet resultset= statement.executeQuery("SELECT id, nombre FROM estado");
                while(resultset.next()){
                    Estado estado= new Estado();
                    estado.setId(resultset.getInt(1));
                    estado.setNombre(resultset.getString(2));
                    estados.add(estado);
                }
            }
        }catch(Exception ex){
            System.out.println("Error");
        }
        return estados;
    }
    
}
