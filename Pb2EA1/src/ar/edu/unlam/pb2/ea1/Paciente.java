package ar.edu.unlam.pb2.ea1;

import java.util.ArrayList;

public abstract class Paciente {

	private String nombre;
	private String apellido;
	private Integer dni;

	protected ArrayList<DietaDiaria> ingesta;
	
	public Paciente(String nombre, String apellido, Integer dni) {
		this.nombre= nombre;
		this.apellido= apellido;
		this.dni= dni;
		ingesta= new ArrayList<DietaDiaria>();
	}
	
	public ArrayList<DietaDiaria> getIngesta() {
		return ingesta;
	}

	

	public abstract void agregarDietaDiaria(DietaDiaria dieta);
	
}
