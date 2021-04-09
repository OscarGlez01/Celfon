
package mx.itson.celfon.entidades;

/**
 * Gestiona las variables de id y nombre de Ciudad al igual que
 * utiliza una llave foranea de la entidad de estado
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
