
package mx.itson.celfon.presentacion;

import java.util.List;
import mx.itson.celfon.entidades.Estado;
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
        
        ClienteDAO.buscar("juan", "cl.nombre");
    }
    
}
