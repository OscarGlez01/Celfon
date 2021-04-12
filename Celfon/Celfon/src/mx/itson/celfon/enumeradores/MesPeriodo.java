
package mx.itson.celfon.enumeradores;

/**
 * Este enumerador indica el mes al que un periodo pertenece
 * @author Oscar González Leyva
 */
public enum MesPeriodo {
    ENERO(1), FEBRERO(2), MARZO(3), ABRIL(4), MAYO(5), JUNIO(6), JULIO(7), AGOSTO(8), SEPTIEMBRE(9), OCTUBRE(10), NOVIEMBRE(11), DICIEMBRE(12);
    
    private int valor;
        
    /**
     * Constructor que asigna un valor a los 12 estados del enumerador  
     * @param valor índice entero que se le asigna a un estado
     */
        MesPeriodo(int valor){
            this.valor = valor;
        }
    
    /**
     * Este método determina el estado del enumerador por medio de un valor numérico o índice.
     * @param valor índice introducido por el usuario 
     * @return Devuelve el estado del enumerador indicado por el índice proporcionado
     */
    public static MesPeriodo obtenerPorNumero(int valor){
            switch(valor){
                case 1:
                    return ENERO;
                case 2:
                    return FEBRERO;
                case 3:
                    return MARZO;
                case 4:
                    return ABRIL;
                case 5:
                    return MAYO;
                case 6:
                    return JUNIO;
                case 7:
                    return JULIO;
                case 8:
                    return AGOSTO;
                case 9:
                    return SEPTIEMBRE;
                case 10:
                    return OCTUBRE;
                case 11:
                    return NOVIEMBRE;
                case 12:
                    return DICIEMBRE;
            }
            return null;
        }
    public static String obtenerPorNombre(String valor){
            switch(valor){
                case "enero":
                    return "1";
                case "febrero":
                    return "2";
                case "marzo":
                    return "3";
                case "abril":
                    return "4";
                case "mayo":
                    return "5";
                case "junio":
                    return "6";
                case "julio":
                    return "7";
                case "agosto":
                    return "8";
                case "septiembre":
                    return "9";
                case "octubre":
                    return "10";
                case "noviembre":
                    return "11";
                case "diciembre":
                    return "12";
            }
            return null;
        }
}
