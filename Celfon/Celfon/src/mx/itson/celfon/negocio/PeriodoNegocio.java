
package mx.itson.celfon.negocio;

/**
 * Esta clase sirve para metodos relevantes para entidades de tipo Periodo
 * @author Oscar González Leyva
 */
public class PeriodoNegocio {
    
    /**
     * Este metodo define el criterio de busqueda para las consultas de busqueda de periodo
     * @param criterio indice obtenido tras ser introducido por el usuario
     * @return valor String referente al criterio en forma de valor
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
