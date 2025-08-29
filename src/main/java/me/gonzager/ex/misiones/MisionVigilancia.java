package me.gonzager.ex.misiones;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.ex.accesorios.Sensor;
import me.gonzager.ex.drones.Dron;

public class MisionVigilancia extends Mision{
    private List <Sensor> sensores = new ArrayList<Sensor>();  


    public MisionVigilancia() {
    }

    public MisionVigilancia(List<Sensor> sensores) {
        this.sensores = sensores;
    }

    public void addSensor(Sensor s){
        sensores.add(s);
    }



    @Override
    public Integer extra() {
        return sensores.stream().mapToInt(Sensor::eficienciaSensor).sum();

        //se crea un stream, mapea el arraylist a un stream de enteros, y luego con ese stream hace la suma de todos
        //los elementos para devolver un Integer

        // return sensores.stream().map(s -> s.eficienciaSensor()).reduce(0, Integer::sum);
    }



    @Override
    public Boolean esAvanzadoSegunMision(Dron d) {
        return sensores.stream().allMatch(sensor -> sensor.esDuradero());
    }

    public Boolean tieneSensorConMejorasTecnologicas() {
        return sensores.stream().anyMatch(sensor -> sensor.getTieneMejorasTec());
    }

    

}
