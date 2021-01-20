package ar.edu.unlam.pb2.ea1;


public class Hipertenso extends Paciente{
	//La  cantidad  máxima  diaria  de 3 gramos por día
	private Integer presionMinima;
	private Integer presionMaxima;
	
	public Hipertenso(String nombre, String apellido, Integer dni,Integer presionMinima, Integer presionMaxima) {
		super(apellido, apellido, presionMaxima);
		this.presionMinima= presionMinima;
		this.presionMaxima= presionMaxima;
	}
	
	
	
	@Override
	public void agregarDietaDiaria(DietaDiaria dieta) {
		// Control de dieta para un Hipertenso
		Boolean esApta=true;
		if(dieta.aptaHipertenso().equals(esApta)) {
			ingesta.add(dieta);
		}
			
	}
	
}
