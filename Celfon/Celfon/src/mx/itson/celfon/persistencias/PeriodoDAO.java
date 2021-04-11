
package mx.itson.celfon.persistencias;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
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
    public static List<Periodo> obtenerTodos(){
        List<Periodo> periodos = new ArrayList<>();
        try{
            Connection conexion= Conexion.obtener();
            if(conexion != null){
                Statement statement = conexion.createStatement();
                ResultSet resultset= statement.executeQuery("SELECT p.id, p.total, p.mes, p.anio, p.estado, cl.id, cl.nombre FROM periodo p" 
                    +"INNER JOIN cliente cl ON p.idCliente = cl.id ");
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
}
