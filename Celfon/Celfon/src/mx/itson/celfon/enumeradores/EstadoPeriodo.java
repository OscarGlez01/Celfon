
package mx.itson.celfon.enumeradores;

/**
 * Esta clase es un enumerador que devuelve el estado del Periodo
 * ya sea PENDIENTE, PAGADO o CANCELADO
 * @author Oscar González Leyva 
 */
public enum EstadoPeriodo {
    
        PENDIENTE(1), PAGADO(2), CANCELADO(3);
        
        private int valor;
        
        EstadoPeriodo(int valor){
            this.valor = valor;
        }
        
        /**
         * Este metodo asignado por un valor numerico devuelve el estado de Periodo
         * @param valor
         * @return //Devuelve el estado de Periodo a travez de un Valor
         */
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
