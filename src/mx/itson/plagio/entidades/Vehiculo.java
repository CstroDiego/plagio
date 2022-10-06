package mx.itson.plagio.entidades;

import mx.itson.plagio.enumeradores.Color;
import mx.itson.plagio.enumeradores.Marca;
import mx.itson.plagio.enumeradores.Tipo;

/**
 * Contiene los atributos y métodos que corresponden a la clase Vehículo.
 *
 * @author Diego Castro Arce
 */
public class Vehiculo {
    private String propietario;
    private Marca marca;
    private Tipo tipo;
    private Color color;
    private String modelo;
    ;

    /**
     * Obtiene el valor del atributo propietario.
     *
     * @return El atributo propietario.
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Asigna el valor del atributo propietario.
     *
     * @param propietario El valor a asignar a propietario.
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    /**
     * Obtiene el valor del atributo marca.
     *
     * @return El atributo marca.
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * Asigna el valor del atributo marca.
     *
     * @param marca El valor a asignar a marca.
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el valor del atributo tipo.
     *
     * @return El atributo tipo.
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Asigna el valor del atributo tipo.
     *
     * @param tipo El valor a asignar a tipo.
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene el valor del atributo color.
     *
     * @return El atributo color.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Asigna el valor del atributo color.
     *
     * @param color El valor a asignar a color.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Obtiene el valor del atributo modelo.
     *
     * @return El atributo modelo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Asigna el valor del atributo modelo.
     *
     * @param modelo El valor a asignar a modelo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
