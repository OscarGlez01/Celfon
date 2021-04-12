
package mx.itson.celfon.enumeradores;

/**
 * Es un enumerador que devuelve el estado del Periodo
 * ya sea PENDIENTE, PAGADO o CANCELADO
 * @author Oscar González Leyva 
 */
public enum EstadoPeriodo {
    
        PENDIENTE(1), PAGADO(2), CANCELADO(3);
        
        private int valor;
        
        /**
         * Constructor que asigna un valor a los 12 estados del enumerador
         * @param valor índice entero que se le asigna a un estado
         */
        EstadoPeriodo(int valor){
            this.valor = valor;
        }
        
        /**
         * Metodo asignado por un valor numerico devuelve el estado de Periodo
         * @param valor
         * @return Devuelve el estado de Periodo a travez de un Valor
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
        
        /**
         * Obtiene un string simplificado para una consulta
         * @param valor el estado introducido por el cliente
         * @return un valor string dependiendo el caso.
         */
        public static String obtenerPorNombre(String valor){
            switch(valor){
                case "pendiente":
                    return "1";
                case "pagado":
                    return "2";
                case "cancelado":
                    return "3";
            }
            return null;
        }
}
