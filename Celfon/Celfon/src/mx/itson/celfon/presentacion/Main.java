
package mx.itson.celfon.presentacion;

import java.util.List;
import mx.itson.celfon.entidades.Estado;
import mx.itson.celfon.entidades.Cliente;
import mx.itson.celfon.entidades.Periodo;
import mx.itson.celfon.persistencias.ClienteDAO;
import mx.itson.celfon.persistencias.EstadoDAO;
import mx.itson.celfon.persistencias.PeriodoDAO;

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
        
        /*
        List<Cliente> clientes = ClienteDAO.buscar("juan","cl.nombre");
        
        for(Cliente c : clientes){
            System.out.println("Nombre "+ c.getNombre());
        }
*/
        List<Periodo> periodos = PeriodoDAO.buscar("juan", "cl.nombre");
        
        for (Periodo p : periodos){
            System.out.println("Nombre "+p.getCliente().getNombre());
        }
    }
    
}
