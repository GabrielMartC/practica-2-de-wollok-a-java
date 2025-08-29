package me.gonzager.ex.drones;

public class DronSeguridad extends Dron{

    public DronSeguridad(Integer autonomia, Integer lvProcesamiento) {
        super(autonomia, lvProcesamiento);
    }

    @Override
    public Boolean esAvanzadoSegunDron() {
        return super.getLvProcesamiento() > 50;
    }

}
