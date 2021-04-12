
package mx.itson.celfon.negocio;

/**
 *
 * @author Oscar González Leyva
 */
public class LlamadaNegocio {
    
    /**
     * 
     * @param duracion
     * @return 
     */
    public static String ConvertirDuracion(int duracion){
        int hor,min,seg;
        
        hor=duracion/3600;
        min=(duracion-(3600*hor))/60;
        seg=duracion-((hor*3600)+(min*60));
        String resultado=(hor+"h "+min+"m "+seg+"s");
        return resultado;
} 
    
}
