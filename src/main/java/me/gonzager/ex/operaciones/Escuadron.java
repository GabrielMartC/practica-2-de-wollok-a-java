package me.gonzager.ex.operaciones;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.ex.drones.Dron;

public class Escuadron {
	private List<Dron> drones = new ArrayList<Dron>();
	// private Double capacidadOperativa;

	private Double capacidadOperativa(){
		return drones.stream().mapToDouble(Dron::eficienciaOperativa).sum();
	}


	public void addDron(Dron d){
		if(drones.size() > CiudadFuturista.getInstance().getCantMaxDrones()){
			throw new IllegalArgumentException("Supera la cantidad máxima de drones");
		}
		drones.add(d);
	}

	public void operarSobreZona(Zona z){
		if(this.puedeOperarSobreZona(z)){
			z.recibirOperacion();
			// drones.forEach(dron -> dron.disminuirAutonomia());
			drones.stream().forEach(dron -> dron.disminuirAutonomia(2));
		}
	}

	public Boolean puedeOperarSobreZona(Zona z) {
		return this.hayAlMenosUnDronAvanzado() && this.capOperativaMayorQueTamanioZona(z);
	}

	private Boolean capOperativaMayorQueTamanioZona(Zona z) {
		return this.capacidadOperativa() > z.getTamanio() * 2;
	}

	private Boolean hayAlMenosUnDronAvanzado() {
		return drones.stream().anyMatch(dron -> dron.esAvanzado());
	}
}
