package ar.edu.unlam.pb2.ea1;



public class Diabetico extends Paciente {
	
	//La cantidad máxima diaria de 25gramos por día
	
	private Integer azucarEnSangre;
	
	public Diabetico(String nombre, String apellido, Integer dni,Integer azucarEnSangre) {
		super(apellido, apellido, azucarEnSangre);
		this.azucarEnSangre= azucarEnSangre;
		
	}
	
	
	
	@Override
	public void agregarDietaDiaria(DietaDiaria dieta) {
		// Control de dieta para un Diabético
		Boolean esApta=true;
		if(dieta.aptaDiabetico().equals(esApta)) {
			ingesta.add(dieta);
		}
	}

}	
