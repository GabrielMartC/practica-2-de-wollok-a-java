package me.gonzager.ex.drones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import me.gonzager.ex.accesorios.Sensor;
import me.gonzager.ex.misiones.MisionExploracion;
import me.gonzager.ex.misiones.MisionTransporte;
import me.gonzager.ex.misiones.MisionVigilancia;

public class DronTest {

    // private Dron dronSeguridad = new DronSeguridad(Double.valueOf(3.0), Integer.valueOf(52));
    // private Dron dronComercial = new DronComercial(Double.valueOf(3.0), Integer.valueOf(10));

    private Dron dronSeguridad = new DronSeguridad(3, 52);
    private Dron dronComercial = new DronComercial(3, 10);

    private MisionVigilancia misionVigilancia = new MisionVigilancia();
    private MisionTransporte misionTransporte = new MisionTransporte();
    private MisionExploracion misionExporacion = new MisionExploracion();

    @BeforeEach
    private void init() {
        misionVigilancia.addSensor(new Sensor(10, 21, Boolean.FALSE));
        misionVigilancia.addSensor(new Sensor(9, 20, Boolean.TRUE));
    }

    @Test
    void testEfecienciaOperativaDronSeguridadEnMisionVigilancia() {
        dronSeguridad.setMisionAct(misionVigilancia);
        assertEquals(3 * 10 + 10 + 18, dronSeguridad.eficienciaOperativa());
    }

    @Test
    void testEfecienciaOperativaDronSeguridadEnMisionTransporte() {
        dronSeguridad.setMisionAct(misionTransporte);
        assertEquals(3 * 10 + 10, dronSeguridad.eficienciaOperativa());
    }

    @Test
    void testEfecienciaOperativaDronSeguridadEnMisionExploracion() {
        dronSeguridad.setMisionAct(misionExporacion);
        assertEquals(3 * 10, dronSeguridad.eficienciaOperativa());
    }

    @Test
    void testEfecienciaOperativaDronComercialEnMisionVigilancia() {
        dronComercial.setMisionAct(misionVigilancia);
        // assertEquals(3 * 10 + 10 + 18 + 15, dronComercial.eficienciaOperativa());
        assertEquals(3 * 10 + 10 + 18 + (58 * 0.10), dronComercial.eficienciaOperativa());

    }

    @Test
    void testEfecienciaOperativaDronComercialEnMisionTransporte() {
        dronComercial.setMisionAct(misionTransporte);
        // assertEquals(3 * 10 + 10 + 15, dronComercial.eficienciaOperativa());
        assertEquals(3 * 10 + 10 + (40 * 0.10), dronComercial.eficienciaOperativa());

    }

    @Test
    void testEfecienciaOperativaDronComercialEnMisionExploracion() {
        dronComercial.setMisionAct(misionExporacion);
        // assertEquals(3 * 10 + 15, dronComercial.eficienciaOperativa());
        assertEquals(3 * 10 + (30 * 0.10), dronComercial.eficienciaOperativa());

    }

    @Test
    void testEsAvanzadoDronSeguridadEnMisionVigilancia() {
        dronSeguridad.setMisionAct(misionVigilancia);
    }

    @Test
    void testEsAvanzadoDronSeguridadEnMisionTransporte() {
        dronSeguridad.setMisionAct(misionTransporte);
        assertTrue(dronSeguridad.esAvanzado());
    }

    @Test
    void testEsAvanzadoDronSeguridadEnMisionExploracion() {
        dronSeguridad.setMisionAct(misionExporacion);
        assertTrue(dronSeguridad.esAvanzado());
    }

    @Test
    void testEsAvanzadoDronComercialEnMisionVigilancia() {
        dronComercial.setMisionAct(misionVigilancia);
        assertTrue(dronComercial.esAvanzado());
    }

    @Test
    void testNoEsAvanzadoDronComercialEnMisionTransporte() {
        dronComercial.setMisionAct(misionTransporte);
        assertFalse(dronComercial.esAvanzado());
    }

    @Test
    void testEsAvanzadoDronComercialEnMisionExploracion() {
        dronComercial.setMisionAct(misionExporacion);
        assertFalse(dronComercial.esAvanzado());
        assertEquals(3 * 10 + (30 * 0.10), dronComercial.eficienciaOperativa());
    }
}
