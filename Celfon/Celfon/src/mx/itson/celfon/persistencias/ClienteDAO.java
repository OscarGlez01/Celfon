
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
    public static List<Cliente> buscar(String filtro, String criterio){
        List<Cliente> clientes = new ArrayList<>();
        try{
            Connection conexion= Conexion.obtener();
            if(conexion != null){
            String consulta= "SELECT cl.id, cl.nombre, cl.direccion, cl.telefono, ci.id, ci.nombre, es.id, es.nombre FROM cliente cl"
                    + " INNER JOIN ciudad ci ON cl.idCiudad = ci.id"
                    + " INNER JOIN estado es ON ci.idEstado = es.id"
                    + " WHERE "+ criterio + " LIKE ?";
            
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
    
    /**
     * Guarda las variables obtenidas en la base de datos 
     * @param nombre es completo del cliente
     * @param direccion es la residencia en la que se encuentra el cliente 
     * @param telefono es el número de telefono proporcionado por el cliente
     * @param idCiudad es el indice o identificador de la ciudad de residencia del cliente
     * @return Duevuelve un estado de guardado u envia un mensaje con el error 
     */
    public static boolean guardar(String nombre, String direccion, String telefono,int idCiudad){
        boolean estaGuardado= false;
        try{
            Connection conexion= Conexion.obtener();
            String consulta= "INSERT INTO cliente (nombre, direccion, telefono, idCiudad) VALUES (?, ?, ?, ?)";
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
    
    /**
     * Edita las variables de cliente dentro de la base de datos
     * @param nombre es el nombre completo del cliente
     * @param direccion es el lugar de residencia del cliente
     * @param telefono es el número de telefono proporcionado por el cliente
     * @return Devuelve un estado de editar u envia un mensaje con el error
     */
    public static boolean editar(String nombre, String direccion, String telefono) {
        boolean editar = false;
        try {
            Connection conexion = Conexion.obtener();
            String consulta = "UPDATE cliente SET nombre = ?, direccion = ?, telefono = ? WHERE ( nombre = ?)";
            PreparedStatement st = conexion.prepareStatement(consulta);
            st.setString(1, nombre);
            st.setString(2, direccion);
            st.setString(3, telefono);

            editar = st.executeUpdate() == 1;
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
        return editar;
    }
    
    /**
     * Elimina por la variable id los datos guardados en la base de datos de Cliente
     * @param nombre nombre del cliente
     * @return Duevuelve un estado eliminar u envia un mensaje con el error
     */
    public static boolean eliminar(String nombre) {
        
        boolean eliminar = false;
        try {
            Connection conexion = Conexion.obtener();
            String consulta = "DELETE FROM cliente WHERE nombre = ? ";
            PreparedStatement st = conexion.prepareStatement(consulta);
            st.setString(1, nombre);

            eliminar = st.executeUpdate() == 1;
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
        return eliminar;
    }

    
}
