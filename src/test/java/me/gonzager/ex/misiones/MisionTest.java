package me.gonzager.ex.misiones;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import me.gonzager.ex.accesorios.Sensor;

public class MisionTest {

    @Test
    void misionVigilaciaConMejorasTecnologicas() {
        var mision = new MisionVigilancia();
        mision.addSensor(new Sensor(10, 10, Boolean.FALSE));
        mision.addSensor(new Sensor(9, 4, Boolean.TRUE));
        assertTrue(mision.tieneSensorConMejorasTecnologicas());

    }

    @Test
    void misionVigilaciaSinMejorasTecnologicas() {
        var mision = new MisionVigilancia();
        mision.addSensor(new Sensor(10, 10, Boolean.FALSE));
        mision.addSensor(new Sensor(9, 4, Boolean.FALSE));
        assertFalse(mision.tieneSensorConMejorasTecnologicas());

    }
}
