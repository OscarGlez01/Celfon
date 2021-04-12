
package mx.itson.celfon.entidades;

import java.util.Date;

/**
 * Gestiona las variables id, telefono, duracion y fecha de Llamada
 * @author Oscar Gonzalez Leyva
 */
public class Llamada {
    private int id;
    private String telefono;
    private int duracion;
    private Date fecha;
    private Periodo periodo;

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
     * Obtiene el valor de telefono
     * @return Devuelve Telefono
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * Pone el valor de telefono 
     * @param telefono 
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
     * Obtiene el valor de Duracion
     * @return Devuelve Duracion
     */
    public int getDuracion() {
        return duracion;
    }
    /**
     * Pone el valor de Duracion
     * @param duracion 
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    /**
     * Obtiene el valor para fecha
     * @return Devuelve Fecha
     */
    public Date getFecha() {
        return fecha;
    }
    /**
     * Pone el valor para Fecha
     * @param fecha 
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * 
     * @return 
     */
    public Periodo getPeriodo() {
        return periodo;
    }

    /**
     * 
     * @param periodo 
     */
    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
    
}
