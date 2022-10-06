package mx.itson.plagio.entidades;

/**
 * Contiene los atributos y métodos correspondientes a Multa.
 *
 * @author Diego Castro Arce
 */
public class Multa {
    private String folio;
    private String motivo;
    private Oficial oficial;
    private Conductor conductor;
    private Vehiculo vehiculo;
    private String placa;
    private String fecha;
    private String hora;
    private String lugar;
    private String infraccion;

    /**
     * Obtiene el valor del atributo folio.
     *
     * @return El atributo folio.
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Asigna el valor del atributo folio.
     *
     * @param folio El valor a asignar a folio.
     */
    public void setFolio(String folio) {
        this.folio = folio;
    }

    /**
     * Obtiene el valor del atributo motivo.
     *
     * @return El atributo motivo.
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Asigna el valor del atributo motivo.
     *
     * @param motivo El valor a asignar a motivo.
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * Obtiene el valor del atributo oficial.
     *
     * @return El atributo oficial.
     */
    public Oficial getOficial() {
        return oficial;
    }

    /**
     * Asigna el valor del atributo oficial.
     *
     * @param oficial El valor a asignar a oficial.
     */
    public void setOficial(Oficial oficial) {
        this.oficial = oficial;
    }

    /**
     * Obtiene el valor del atributo conductor.
     *
     * @return El atributo conductor.
     */
    public Conductor getConductor() {
        return conductor;
    }

    /**
     * Asigna el valor del atributo conductor.
     *
     * @param conductor El valor a asignar a conductor.
     */
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    /**
     * Obtiene el valor del atributo vehiculo.
     *
     * @return El atributo vehiculo.
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Asigna el valor del atributo vehiculo.
     *
     * @param placa El valor a asignar a vehiculo.
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Obtiene el valor del atributo fecha.
     *
     * @return El atributo fecha.
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Asigna el valor del atributo fecha.
     *
     * @param vehiculo El valor a asignar a fecha.
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Obtiene el valor del atributo fecha.
     *
     * @return El atributo fecha.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Asigna el valor del atributo fecha.
     *
     * @param fecha El valor a asignar a fecha.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el valor del atributo hora.
     *
     * @return El atributo hora.
     */
    public String getHora() {
        return hora;
    }

    /**
     * Asigna el valor del atributo hora.
     *
     * @param hora El valor a asignar a hora.
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * Obtiene el valor del atributo lugar.
     *
     * @return El atributo lugar.
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Asigna el valor del atributo lugar.
     *
     * @param lugar El valor a asignar a lugar.
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * Obtiene el valor del atributo infraccion.
     *
     * @return El atributo infraccion.
     */
    public String getInfraccion() {
        return infraccion;
    }

    /**
     * Asigna el valor del atributo infraccion.
     *
     * @param infraccion El valor a asignar a infraccion.
     */
    public void setInfraccion(String infraccion) {
        this.infraccion = infraccion;
    }
}
