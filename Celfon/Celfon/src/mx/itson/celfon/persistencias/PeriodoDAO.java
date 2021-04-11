
package mx.itson.celfon.persistencias;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mx.itson.celfon.entidades.Cliente;
import mx.itson.celfon.entidades.Periodo;
import mx.itson.celfon.enumeradores.EstadoPeriodo;

/**
 * Manjea el acceso de datos de la entidad de Periodo
 * @author Oscar González Leyva
 */
public class PeriodoDAO {
    /**
     * Obtiene las variables de Periodo dentro de la base de datos
     * y genera una Lista de la misma
     * @return Devuelve los datos correctos encontrados en la base de datos 
     * e imprime un mensaje si hubo algun error
     */
    public static List<Periodo> buscar(String filtro, String criterio){
        List<Periodo> periodos = new ArrayList<>();
        try{
            Connection conexion= Conexion.obtener();
            if(conexion != null){
                String consulta=("SELECT p.id, p.total, p.mes, p.anio, p.estado, cl.id, cl.nombre FROM periodo p" 
                    +"INNER JOIN cliente cl ON p.idCliente = cl.id "
                    +" WHERE "+criterio+" LIKE ?");
                
                PreparedStatement st = conexion.prepareStatement(consulta);
                st.setString(1, "%" + filtro + "%");
                ResultSet resultset= st.executeQuery();
                
                while(resultset.next()){
                   Periodo periodo = new Periodo();
                   periodo.setId(resultset.getInt(1));
                   periodo.setTotal(resultset.getDouble(2));
                   periodo.setMes(resultset.getInt(3));
                   periodo.setAnio(resultset.getInt(4));
                   periodo.setEstado(EstadoPeriodo.obtenerPorNumero(resultset.getInt(5)));
                   
                   Cliente cliente= new Cliente();
                   cliente.setId(resultset.getInt(6));
                   cliente.setNombre(resultset.getString(7));
                   
                   periodos.add(periodo);
                }
                conexion.close();
            }
        }catch(Exception ex){
            System.out.println("Error"+ ex.getMessage());
        }
        return periodos;
    }
    
    /**
     * Guarda las variables obtenidas en la base de datos 
     * @param idCliente identificador del cliente al que pertenece el periodo
     * @param total monto a pagar
     * @param mes en este se capturo el periodo en cuestión
     * @param anio al que pertenece el periodo
     * @param estado estado en el que reside o factura el cliente
     * @return 
     */
    public static boolean guardar(int idCliente, double total, int mes, int anio, int estado){
        boolean estaGuardado= false;
        try{
            Connection conexion= Conexion.obtener();
            String consulta= "INSERT INTO periodo (idCliente, total, mes, anio, estado) VALUES (?, ?, ?, ?)";
            PreparedStatement st= conexion.prepareStatement(consulta);
            st.setDouble(1, idCliente);
            st.setDouble(2, total);
            st.setInt(3, mes);
            st.setInt(4, anio);
            st.setInt(5, estado);
            
            estaGuardado = st.executeUpdate() == 1;
            
            conexion.close();
            
        }catch(Exception ex){
            System.out.println("Error"+ ex.getMessage());
        }
        return estaGuardado;
    }
    
    /**
     * Elimina por la variable de nombre los datos guardados en la base de datos de Cliente
     * @param idCliente identificador del cliente al que pertenece el periodo
     * @return Duevuelve un estado eliminar u envia un mensaje con el error
     */
    public static boolean eliminar(int idCliente) {
        
        boolean eliminar = false;
        try {
            Connection conexion = Conexion.obtener();
            String consulta = "DELETE FROM periodo WHERE cl.nombre = ?" 
                    + " INNER JOIN cliente cl ON p.idCliente = cl.id";
            PreparedStatement st = conexion.prepareStatement(consulta);
            st.setInt(1, idCliente);

            eliminar = st.executeUpdate() == 1;
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
        return eliminar;
    }
    
    public static boolean editar(int estado) {
        boolean editar = false;
        try {
            Connection conexion = Conexion.obtener();
            String consulta = "UPDATE periodo SET estado = ? WHERE ( estado = ?)";
            PreparedStatement st = conexion.prepareStatement(consulta);
            st.setInt(1, estado);
            

            editar = st.executeUpdate() == 1;
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
        return editar;
    }
}
