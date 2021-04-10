
package mx.itson.celfon.entidades;

/**
 * Gestiona las variables id, nombre, direccion y telefono de Cliente
 * ademas que tiene una llave foranea de la entidad de Ciudad
 * @author Oscar González Leyva
 */
public class Cliente {
    private int id;
    private String nombre;
    private String direccion;
    private Ciudad ciudad;
    private String telefono;

    /**
     * Obtener el valor de Id
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
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Pone el valor de nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene el valor de Direccion
     * @return Devuelve Direccion
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * Pone el valor de Direccion
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Obtiene el valor de Ciudad
     * @return Devuelve Ciudad
     */
    public Ciudad getCiudad() {
        return ciudad;
    }
    /**
     * Pone el valor de Ciudad
     * @param ciudad 
     */
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    /**
     * Obtiene el valor de Telefono
     * @return Devuelve Telefono
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * Pone el valor de Telefono
     * @param telefono 
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
