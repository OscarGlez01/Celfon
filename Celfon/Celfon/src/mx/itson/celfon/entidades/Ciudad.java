
package mx.itson.celfon.entidades;

/**
 *
 * @author Oscar Gonzalez Leyva
 */
public class Ciudad {
    private int id;
    private String nombre;
    private Estado estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
}
