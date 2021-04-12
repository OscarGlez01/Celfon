
package mx.itson.celfon.persistencias;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mx.itson.celfon.entidades.Llamada;
import mx.itson.celfon.entidades.Periodo;

/**
 * Manjea el acceso de datos de la entidad Llamada
 * @author Oscar González Leyva
 */
public class LlamadaDAO {
    
    public static List<Llamada> buscar(String filtro){
        List<Llamada> llamadas = new ArrayList<>();
        try{
            Connection conexion= Conexion.obtener();
            if(conexion != null){
                String consulta=("SELECT l.id, l.telefono, l.duracion, l.fecha, l.idPeriodo FROM llamada l"
                        + " WHERE idPeriodo = ?");
                
                PreparedStatement st = conexion.prepareStatement(consulta);
                st.setString(1, "%" + filtro + "%");
                ResultSet resultset= st.executeQuery();
                
                while(resultset.next()){
                   Llamada llamada = new Llamada();
                   llamada.setId(resultset.getInt(1));
                   llamada.setTelefono(resultset.getString(2));
                   llamada.setDuracion(resultset.getInt(3));
                   llamada.setFecha(resultset.getDate(4));
                   
                   Periodo periodo = new Periodo();
                   periodo.setId(resultset.getInt(5));
                   
                   llamadas.add(llamada);
                }
                conexion.close();
            }
        }catch(Exception ex){
            System.out.println("Error"+ ex.getMessage());
        }
        return llamadas;
    }
    
}
