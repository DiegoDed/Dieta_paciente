package ar.edu.unlam.pb2.ea1;

import java.util.HashSet;

public class DietaDiaria {

	/**
	 * No se permite repetir platos duarante todo el día.
	 */
	private HashSet<Plato> platos;
	
	public DietaDiaria() {
		
		platos= new HashSet<Plato>();
	
	}
	
	public HashSet<Plato> getPlatos() {
		return platos;
	}

	
	public void agregarPlato(Plato plato) {
		
				platos.add(plato);
		
		
	}
	

	private Integer totalDeSalEnDieta(){
		Integer contadorSal=0;
		for(Plato p : platos) {
			contadorSal= contadorSal + p.obtenerCantidadDeSal();
		}
		return contadorSal;		
	}
	
	private Integer totalDeAzucarEnDieta(){
		Integer contadorAzucar=0;
		for(Plato p : platos) {
			contadorAzucar= contadorAzucar + p.obtenerCantidadDeAzucar();
		}
		return contadorAzucar;		
	}
	
	public Boolean aptaHipertenso(){
		if(totalDeSalEnDieta()> 3) {
			return false;
		}
		return true;
		
	}
	public Boolean aptaDiabetico(){
		if(totalDeAzucarEnDieta()> 25) {
			return false;
		}
		return true;
		
	}
	
	
}
