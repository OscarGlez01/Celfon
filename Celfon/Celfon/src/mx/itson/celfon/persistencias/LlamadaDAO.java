
package mx.itson.celfon.persistencias;

import java.sql.Connection;
import java.sql.Date;
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
                st.setString(1, filtro);
                ResultSet resultset= st.executeQuery();
                
                while(resultset.next()){
                   Llamada llamada = new Llamada();
                   llamada.setId(resultset.getInt(1));
                   llamada.setTelefono(resultset.getString(2));
                   llamada.setDuracion(resultset.getInt(3));
                   llamada.setFecha(resultset.getDate(4));
                   
                   Periodo periodo = new Periodo();
                   periodo.setId(resultset.getInt(5));
                   
                   llamada.setPeriodo(periodo);
                   llamadas.add(llamada);
                }
                conexion.close();
            }
        }catch(Exception ex){
            System.out.println("Error"+ ex.getMessage());
        }
        return llamadas;
    }
    
    /**
     * guarda una entrada de tipo llamada en la tabla de llamada
     * @param telefono número telefonico de la otra parte de la llamada
     * @param duracion en segundos de la llamada
     * @param fecha fecha estimada de la realización de la llamada
     * @param idPeriodo indice referente al periodo en el que se realizo la llamada
     * @return estado de verificación sobre la consulta, en forma de booleano
     */
    public static boolean guardar(String telefono, int duracion, Date fecha, int idPeriodo){
        boolean estaGuardado= false;
        try{
            Connection conexion= Conexion.obtener();
            String consulta= "INSERT INTO llamada (telefono, duracion, fecha, idPeriodo) VALUES (?, ?, ?, ?)";
            PreparedStatement st= conexion.prepareStatement(consulta);
            st.setString(1, telefono);
            st.setInt(2, duracion);
            st.setDate(3, fecha);
            st.setInt(4, idPeriodo);
            
            estaGuardado = st.executeUpdate() == 1;
            
            conexion.close();
            
        }catch(Exception ex){
            System.out.println("Error"+ ex.getMessage());
        }
        return estaGuardado;
    }
    
    /**
     * elimina una entrada de la tabla llamada a partir de su id
     * @param id identificador que hace referencia a una entidad llamada
     * @return estado de verificación sobre la consulta, en forma de booleano
     */
    public static boolean eliminar(int id) {
        
        boolean eliminar = false;
        try {
            Connection conexion = Conexion.obtener();
            String consulta = "DELETE FROM llamada WHERE id = ? ";
            PreparedStatement st = conexion.prepareStatement(consulta);
            st.setInt(1, id);

            eliminar = st.executeUpdate() == 1;
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
        return eliminar;
    }
}
