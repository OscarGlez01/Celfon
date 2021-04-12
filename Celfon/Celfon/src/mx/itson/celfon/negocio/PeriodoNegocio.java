
package mx.itson.celfon.negocio;

/**
 *
 * @author Oscar González Leyva
 */
public class PeriodoNegocio {
    
    /**
     * 
     * @param criterio
     * @return 
     */
    public static String DefinirCriterio(int criterio){
        switch(criterio){
            case 1:
                return "cl.nombre";
            case 2:
                return "p.mes";
            case 3:
                return "p.anio";
            case 4:
                return "p.estado";
        }return null;
    }
    
    
}
