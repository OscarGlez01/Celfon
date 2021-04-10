
package mx.itson.celfon.entidades;

/**
 * Gestiona las variables id y nombre de Estado
 * @author Oscar González Leyva
 */
public class Estado {
    private int id;
    private String nombre;

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
     * Obtiene el valor de Nombre
     * @return Devuelve Nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Pone el valor de Nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
