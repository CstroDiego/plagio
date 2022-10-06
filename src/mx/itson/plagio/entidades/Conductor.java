package mx.itson.plagio.entidades;

import java.util.List;

/**
 * Contiene los atributos y métodos que corresponden a Conductor
 *
 * @author Diego Castro Arce
 */
public class Conductor {
    private String nombre;
    private String apellido;
    private String numLicencia;
    private String domicilio;
    private List<Multa> multas;

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
     * Obtiene el valor del atributo numLicencia.
     *
     * @return El atributo numLicencia.
     */
    public String getNumLicencia() {
        return numLicencia;
    }

    /**
     * Asigna el valor del atributo numLicencia.
     *
     * @param numLicencia El valor a asignar a numLicencia.
     */
    public void setNumLicencia(String numLicencia) {
        this.numLicencia = numLicencia;
    }

    /**
     * Obtiene el valor del atributo domicilio.
     *
     * @return El atributo domicilio.
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Asigna el valor del atributo domicilio.
     *
     * @param domicilio El valor a asignar a domicilio.
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * Obtiene el valor del atributo multas.
     *
     * @return El atributo multas.
     */
    public List<Multa> getMultas() {
        return multas;
    }

    /**
     * Asigna el valor del atributo multas.
     *
     * @param multas El valor a asignar a multas.
     */
    public void setMultas(List<Multa> multas) {
        this.multas = multas;
    }
}
