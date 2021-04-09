
package mx.itson.celfon.entidades;

import java.util.Date;

/**
 * Esta clase gestiona las variables id, telefono, duracion y fecha de Llamada
 * @author Oscar Gonzalez Leyva
 */
public class Llamada {
    private int id;
    private String telefono;
    private int duracion;
    private Date fecha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
