package me.gonzager.ex.drones;

import me.gonzager.ex.misiones.Mision;

public abstract class Dron {
    private Integer autonomia;
    private Integer lvProcesamiento;
    private Mision misionAct;


    public Dron(Integer autonomia, Integer lvProcesamiento) {
        this.autonomia = autonomia;
        this.lvProcesamiento = lvProcesamiento;
    }


    public Integer getAutonomia() {
        return autonomia;
    }


    public Integer getLvProcesamiento() {
        return lvProcesamiento;
    }


    public Mision getMisionAct() {
        return misionAct;
    }

    public void setMisionAct(Mision nuevaMision) {
        this.misionAct = nuevaMision;
    }

    public Double eficienciaOperativa(){
        // return (this.autonomia * 10) + misionAct.extra();
        return Double.sum(this.autonomia * 10, misionAct.extra());

    }

    public Boolean esAvanzado(){
        return this.esAvanzadoSegunDron() || misionAct.esAvanzadoSegunMision(this);
    }

    public abstract Boolean esAvanzadoSegunDron();

    public void disminuirAutonomia(Integer cant){
        this.autonomia = Integer.max(0, autonomia - cant);
    }


    
    

}
