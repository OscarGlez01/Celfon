
package mx.itson.celfon.enumeradores;

/**
 *
 * @author Oscar González Leyva
 */
public enum MesPeriodo {
    ENERO(1), FEBRERO(2), MARZO(3), ABRIL(4), MAYO(5), JUNIO(6), JULIO(7), AGOSTO(8), SEPTIEMBRE(9), OCTUBRE(10), NOVIEMBRE(11), DICIEMBRE(12);
    
    private int valor;
        
        MesPeriodo(int valor){
            this.valor = valor;
        }
    
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
}
