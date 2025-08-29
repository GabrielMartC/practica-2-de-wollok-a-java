package me.gonzager.ex.misiones;

import me.gonzager.ex.drones.Dron;

public class MisionTransporte extends Mision{

    @Override
    public Integer extra() {
        Integer valor = 10;
        return valor;
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron d) {
        return d.getAutonomia() > 50;
    }

}
