package me.gonzager.ex.operaciones;

public class Zona {
    private final Integer tamanio;
    private Integer cantOperaciones = 0;

    public Zona(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public void recibirOperacion() {
        this.cantOperaciones++;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public Integer getCantOperaciones() {
        return cantOperaciones;
    }

    

    

    

}
