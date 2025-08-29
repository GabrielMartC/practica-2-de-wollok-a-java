package me.gonzager.ex.operaciones;

//singleton
public class CiudadFuturista {
    private static CiudadFuturista instance = new CiudadFuturista();
    private Integer cantMaxDrones = 10;

    private CiudadFuturista(){}

    public static CiudadFuturista getInstance() {
        return instance;
    }

    public Integer getCantMaxDrones() {
        return cantMaxDrones;
    }

    public void setCantMaxDrones(Integer cantMaxDrones) {
        this.cantMaxDrones = cantMaxDrones;
    }
    
}
