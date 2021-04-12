
package mx.itson.celfon.negocio;

/**
 *Esta clase sirve para metodos relevantes para entidades de tipo Llamada
 * @author Oscar González Leyva
 */
public class LlamadaNegocio {
    
    /**
     * Este metodo convierte la duración de una llamada de segundos a un formato de horas, minutos y segundos
     * @param duracion valor entero que hace referencia a los segundos de una llamada
     * @return parametro String que organiza la duración
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
