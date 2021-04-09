
package mx.itson.celfon.enumeradores;

/**
 *
 * @author Oscar González Leyva 
 */
public enum EstadoPeriodo {
    
        PENDIENTE(1), PAGADO(2), CANCELADO(3);
        
        private int valor;
        
        EstadoPeriodo(int valor){
            this.valor = valor;
        }
        
        public static EstadoPeriodo obtenerPorNumero(int valor){
            switch(valor){
                case 1:
                    return PENDIENTE;
                case 2:
                    return PAGADO;
                case 3:
                    return CANCELADO;
            }
            return null;
        }
}
