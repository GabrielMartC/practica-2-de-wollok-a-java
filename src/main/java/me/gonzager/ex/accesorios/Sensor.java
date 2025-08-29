package me.gonzager.ex.accesorios;



public class Sensor {
    private Integer capacidad;
    private Integer durabilidad;
    private Boolean tieneMejorasTec;
    
    public Sensor(Integer capacidad, Integer durabilidad, Boolean tieneMejorasTec) {
        this.capacidad = capacidad;
        this.durabilidad = durabilidad;
        this.tieneMejorasTec = tieneMejorasTec;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public Integer getDurabilidad() {
        return durabilidad;
    }

    public Boolean getTieneMejorasTec() {
        return tieneMejorasTec;
    }

    public Integer eficienciaSensor(){
        Integer eficiencia = this.capacidad;

        if(this.tieneMejorasTec){
            eficiencia = this.capacidad * 2;
        }
        
        return eficiencia;
    }

    public Boolean esDuradero(){
        return this.durabilidad > this.capacidad * 2;
    }

    

}
