package me.gonzager.ex.drones;

public class DronComercial extends Dron{

    public DronComercial(Integer autonomia, Integer lvProcesamiento) {
        super(autonomia, lvProcesamiento);
    }

    @Override
    public Double eficienciaOperativa(){
        
        return super.eficienciaOperativa() + super.eficienciaOperativa()*0.10;

    }

    @Override
    public Boolean esAvanzadoSegunDron(){
        return Boolean.FALSE;
    }

}
