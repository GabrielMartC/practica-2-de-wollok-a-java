package me.gonzager.ex.misiones;

import me.gonzager.ex.drones.Dron;

public class MisionExploracion extends Mision{
    

    @Override
    public Integer extra(){
        return 0;
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron d) {
        Boolean esPar = d.eficienciaOperativa() % 2 == 0;
        return esPar;
    }

}
