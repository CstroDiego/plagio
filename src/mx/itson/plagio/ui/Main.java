package mx.itson.plagio.ui;

import mx.itson.plagio.entidades.Conductor;
import mx.itson.plagio.entidades.Multa;
import mx.itson.plagio.entidades.Oficial;
import mx.itson.plagio.entidades.Vehiculo;
import mx.itson.plagio.enumeradores.Color;
import mx.itson.plagio.enumeradores.Marca;
import mx.itson.plagio.enumeradores.Tipo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal del programa.
 *
 * @author Diego Castro Arce
 */
public class Main {

    /**
     * El método principal del programa.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Multa multa = new Multa();

        // Agregamos un conductor
        Conductor conductor = new Conductor();
        conductor.setNombre("Juan Carlos");
        conductor.setApellido("Perez Perez");
        conductor.setDomicilio("Av. 4ta. #845, Col. Punta Arena");
        conductor.setNumLicencia("L5700NA1034680");

        // Agregamos un oficial
        Oficial oficial = new Oficial();
        oficial.setNombre("Pedro Antonio");
        oficial.setApellido("Gomez Hernandez");
        oficial.setNumPlaca("B1337");

        // Agregamos otro oficial
        Oficial oficial2 = new Oficial();
        oficial2.setNombre("Ernesto Antonio");
        oficial2.setApellido("Wong Quiroz");
        oficial2.setNumPlaca("F7358");

        // Agregamos un vehiculo
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca(Marca.CHEVROLET);
        vehiculo.setColor(Color.NEGRO);
        vehiculo.setTipo(Tipo.PICKUP);
        vehiculo.setModelo("SILVERADO");
        vehiculo.setPropietario("Juan Carlos Perez Perez");

        // Agregamos otro vehiculo
        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.setMarca(Marca.AUDI);
        vehiculo2.setColor(Color.BLANCO);
        vehiculo2.setTipo(Tipo.SEDAN);
        vehiculo2.setModelo("A4");
        vehiculo2.setPropietario("Petronilo Perez Lopez");


        // Agregamos multas
        List<Multa> multas = new ArrayList<>();

        Multa multa1 = new Multa();
        multa1.setConductor(conductor);
        multa1.setOficial(oficial2);
        multa1.setVehiculo(vehiculo2);
        multa1.setFolio("290219");
        multa1.setMotivo("Exceso de velocidad");
        multa1.setFecha("01/01/2019");
        multa1.setHora("15:27");
        multa1.setLugar("Calle 13, Col. Centro");
        multa1.setInfraccion("1112");
        multa1.setPlaca("WDE-36-93");
        multas.add(multa1);

        // Agregamos otra multa
        Multa multa2 = new Multa();
        multa2.setConductor(conductor);
        multa2.setOficial(oficial);
        multa2.setVehiculo(vehiculo);
        multa2.setFolio("154789");
        multa2.setMotivo("No uso de cinturon de seguridad");
        multa2.setFecha("01/02/2015");
        multa2.setHora("12:00");
        multa2.setLugar("Calle 20, Col. Centro");
        multa2.setInfraccion("2345");
        multa2.setPlaca("VA-15-416");
        multas.add(multa2);

        conductor.setMultas(multas);

        // Imprimimos las multas
        System.out.println("*** COMISARIA GENERAL DE LA POLICIA PREVENTIVA Y TRANSITO MUNICIPAL DE GUAYMAS SONORA ***");

        for (Multa m : conductor.getMultas()) {
            System.out.println("\n** BOLETA DE INFRACCION **");
            System.out.println("Folio: " + m.getFolio());
            System.out.println("Fecha: " + m.getFecha() + " | " + "Hora: " + m.getHora());
            System.out.println("Lugar: " + m.getLugar());
            System.out.println("Motivo: " + m.getMotivo());
            System.out.println("Infraccion: " + m.getInfraccion());
            System.out.println("Oficial: " + m.getOficial().getNombre() + " " + m.getOficial().getApellido() + " | " + "Placa: " + m.getOficial().getNumPlaca());
            System.out.println("Conductor: " + m.getConductor().getNombre() + " " + m.getConductor().getApellido() + " | " + "Licencia: " + m.getConductor().getNumLicencia());
            System.out.println("Vehiculo: " + m.getVehiculo().getMarca() + " " + m.getVehiculo().getModelo());
            System.out.println("Tipo: " + m.getVehiculo().getTipo());
            System.out.println("Color: " + m.getVehiculo().getColor());
            System.out.println("Placas: " + m.getPlaca());
            System.out.println("Propietario: " + m.getVehiculo().getPropietario());
            System.out.println("------------------------------------------------------------------------------------------");

        }
    }
}
