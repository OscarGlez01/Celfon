
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
    * Obtiene el valor de nombre
    * @return 
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
    /**
     * Obtiene el valor de Estado
     * @return Devuelve estado
     */
    public Estado getEstado() {
        return estado;
    }
    /**
     * Pone el valor de Estado
     * @param estado 
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
}
