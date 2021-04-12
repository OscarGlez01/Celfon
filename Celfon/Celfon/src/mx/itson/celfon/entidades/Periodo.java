
package mx.itson.celfon.entidades;

import java.util.List;
import mx.itson.celfon.enumeradores.EstadoPeriodo;
import mx.itson.celfon.enumeradores.MesPeriodo;

/**
 * Gestiona las variables id, total, mes y anio de Periodo
 * Utiliza una llave foranea  de Cliente y Estado
 * Utiliza una variable Tipo lista para las llamadas
 * @author González 
 */
public class Periodo {
    private int id;
    private Cliente cliente;
    private double total;
    private MesPeriodo mes;
    private int anio;
    private EstadoPeriodo estado;
    private List<Llamada> llamadas;

    /**
     * Obtiene el valor de Id
     * @return Devuelve Id
     */
    public int getId() {
        return id;
    }
    /**
     * Pone el valor de Id
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Obtiene valores para Llamadas
     * @return Devuelve la lista de Llamadas
     */
    public List<Llamada> getLlamadas() {
        return llamadas;
    }
    /**
     * Pone la lista de Llamadas
     * @param llamadas 
     */
    public void setLlamadas(List<Llamada> llamadas) {
        this.llamadas = llamadas;
    }
    /**
     * Obtiene el valor de Cliente
     * @return Devuelve Cliente
     */
    public Cliente getCliente() {
        return cliente;
    }
    /**
     * Pone el valor de Cliente
     * @param cliente 
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /**
     * Obtiene el valor de Total
     * @return Devuelve Total
     */
    public double getTotal() {
        return total;
    }
    /**
     * Pone el valor de Total
     * @param total 
     */
    public void setTotal(double total) {
        this.total = total;
    }
    
    /**
     * Obtiene el valor de Anio
     * @return Devuelve Anio
     */
    public int getAnio() {
        return anio;
    }
    /**
     * Pone el valor de Anio
     * @param anio 
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * Obtiene el valor de Estado
     * @return Devuelve Estado
     */
    public EstadoPeriodo getEstado() {
        return estado;
    }
    /**
     * Pone el valor de Estado
     * @param estado 
     */
    public void setEstado(EstadoPeriodo estado) {
        this.estado = estado;
    }

    public MesPeriodo getMes() {
        return mes;
    }

    public void setMes(MesPeriodo mes) {
        this.mes = mes;
    }
}
