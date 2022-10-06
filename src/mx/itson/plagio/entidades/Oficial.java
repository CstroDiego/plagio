package mx.itson.plagio.entidades;

/**
 * Contiene los atributos y métodos que corresponden a Oficial
 *
 * @author Diego Castro Arce
 */
public class Oficial {
    private String nombre;
    private String apellido;
    private String numPlaca;

    /**
     * Obtiene el valor del atributo nombre.
     *
     * @return El atributo nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el valor del atributo nombre.
     *
     * @param nombre El valor a asignar a nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el valor del atributo apellido.
     *
     * @return El atributo apellido.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Asigna el valor del atributo apellido.
     *
     * @param apellido El valor a asignar a apellido.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el valor del atributo numPlaca.
     *
     * @return El atributo numPlaca.
     */
    public String getNumPlaca() {
        return numPlaca;
    }

    /**
     * Asigna el valor del atributo numPlaca.
     *
     * @param numPlaca El valor a asignar a numPlaca.
     */
    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }
}
