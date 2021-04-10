
package mx.itson.celfon.presentacion;

import java.util.List;
import mx.itson.celfon.entidades.Estado;
import mx.itson.celfon.entidades.Cliente;
import mx.itson.celfon.persistencias.ClienteDAO;
import mx.itson.celfon.persistencias.EstadoDAO;

/**
 *
 * @author Oscar Gonzalez
 */
public class Main {

    
    public static void main(String[] args) {
        
        /*
        List<Estado> estados = EstadoDAO.obtenerTodos();
        
        for (Estado e : estados){
            System.out.println("Nombre "+ e.getNombre());
        }
        */
        
        List<Cliente> clientes = ClienteDAO.buscar("juan","cl.nombre");
        
        for(Cliente c : clientes){
            System.out.println("Nombre "+ c.getNombre());
        }
    }
    
}
