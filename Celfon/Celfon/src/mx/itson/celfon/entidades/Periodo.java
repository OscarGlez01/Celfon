
package mx.itson.celfon.entidades;

import java.util.List;
import mx.itson.celfon.enumeradores.EstadoPeriodo;

/**
 * Gestiona las variables id, total, mes y anio de Periodo
 * utiliza una llave foranea  de Cliente y Estado
 * Ademas utiliza una variable Tipo lista para las llamadas
 * @author González 
 */
public class Periodo {
    private int id;
    private Cliente cliente;
    private double total;
    private int mes;
    private int anio;
    private EstadoPeriodo estado;
    private List<Llamada> llamadas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(List<Llamada> llamadas) {
        this.llamadas = llamadas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public EstadoPeriodo getEstado() {
        return estado;
    }

    public void setEstado(EstadoPeriodo estado) {
        this.estado = estado;
    }
}
