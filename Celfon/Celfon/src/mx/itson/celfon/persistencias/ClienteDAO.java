
package mx.itson.celfon.persistencias;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mx.itson.celfon.entidades.Ciudad;
import mx.itson.celfon.entidades.Cliente;
import mx.itson.celfon.entidades.Estado;

/**
 * Maneja el acceso de datos sobre la entidad Cliente
 * @author Oscar González Leyva 
 */
public class ClienteDAO {
    
    /**
     * Obtiene registros de entidad Cliente a partir de los parametros proporcionados
     * @param filtro representa el nombre del cliente por el cual se desea buscar 
     * @return lista de entidades Cliente 
     */
    public static List<Cliente> buscar(String filtro){
        List<Cliente> clientes = new ArrayList<>();
        try{
            Connection conexion= Conexion.obtener();
            if(conexion != null){
            String consulta= "SELECT cl.id, cl.nombre, cl.direccion, cl.telefono, ci.id, ci.nombre, es.id, es.nombre FROM cliente cl"
                    + " INNER JOIN ciudad ci ON cl.idCiudad = ci.id"
                    + " INNER JOIN estado es ON ci.idEstado = es.id"
                    + " WHERE cl.nombre  LIKE ?";
            
            PreparedStatement st = conexion.prepareStatement(consulta);
            st.setString(1, "%" + filtro + "%");
            ResultSet resultset= st.executeQuery();
            while(resultset.next()){
                Cliente cliente = new Cliente();
                cliente.setId(resultset.getInt(1));
                cliente.setNombre(resultset.getString(2));
                cliente.setDireccion(resultset.getString(3));
                cliente.setTelefono(resultset.getString(4));
                
                Ciudad ciudad = new Ciudad();
                ciudad.setId(resultset.getInt(5));
                ciudad.setNombre(resultset.getString(6));
                
                
                Estado estado = new Estado();
                estado.setId(resultset.getInt(7));
                estado.setNombre(resultset.getString(8));
                
                ciudad.setEstado(estado);
                cliente.setCiudad(ciudad);
                clientes.add(cliente);
                
            }
            conexion.close();
        }
            
            
        }catch(Exception ex){
            System.out.println("Error"+ ex.getMessage());
        }
        return clientes;
    }
    
    public static boolean guardar(String nombre, String direccion, String telefono,int idCiudad){
        boolean estaGuardado= false;
        try{
            Connection conexion= Conexion.obtener();
            String consulta= "INSERT INTO cliente (nombre, direccion telefono, idCiudad) VALUES (?, ?, ?, ?)";
            PreparedStatement st= conexion.prepareStatement(consulta);
            st.setString(1, nombre);
            st.setString(2, direccion);
            st.setString(3, telefono);
            st.setInt(4, idCiudad);
            
            //int afectados =  st.executeUpdate();
            
            /*
            if(afectados==1){
                estaGuardado=true;
            }
            */
            estaGuardado = st.executeUpdate() == 1;
            
            conexion.close();
            
        }catch(Exception ex){
            System.out.println("Error"+ ex.getMessage());
        }
        return estaGuardado;
    }
    
    public static boolean eliminar(int id) {
        
        boolean eliminar = false;
        try {
            Connection conexion = Conexion.obtener();
            String consulta = "DELETE FROM cliente WHERE id = ? ";
            PreparedStatement st = conexion.prepareStatement(consulta);
            st.setInt(1, id);

            eliminar = st.executeUpdate() == 1;
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
        return eliminar;
    }

    public static boolean editar(String nombre, String direccion, String telefono, int id) {
        boolean editar = false;
        try {
            Connection conexion = Conexion.obtener();
            String consulta = "UPDATE cliente SET nombre = ?, direccion = ?, telefono = ? WHERE ( id = ?)";
            PreparedStatement st = conexion.prepareStatement(consulta);
            st.setString(1, nombre);
            st.setString(2, direccion);
            st.setString(3, telefono);
            st.setInt(4, id);

            editar = st.executeUpdate() == 1;
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
        return editar;
    }
}
