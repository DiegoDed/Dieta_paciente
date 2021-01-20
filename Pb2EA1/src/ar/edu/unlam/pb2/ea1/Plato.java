package ar.edu.unlam.pb2.ea1;


import java.util.ArrayList;

public class Plato {

	
	/** Por ejemplo, si para un Plato se necesitan DOS (2) tomates,
	se deberá agregar DOS(2) unidades de tomate. 
	*/
	
	private String nombre;
	
	private ArrayList<Ingrediente> ingredientes;
	
	public Plato(String nombre) {
		this.nombre=nombre;
		ingredientes=new ArrayList<Ingrediente>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarIngrediente(Ingrediente ingrediente) {
		ingredientes.add(ingrediente);
	}
	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}


	public Integer obtenerCantidadDeSal(){
		Integer cantSalEnPlato = 0;
		for(Ingrediente i: ingredientes) {
			cantSalEnPlato= cantSalEnPlato + i.getCantidadSal();
		}
		return cantSalEnPlato;		
	}
	
	public Integer obtenerCantidadDeAzucar(){
		Integer cantAzucarEnPlato = 0;
		for(Ingrediente i: ingredientes) {
			cantAzucarEnPlato= cantAzucarEnPlato + i.getCantidadAzucar();
		}
		return cantAzucarEnPlato;			
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plato other = (Plato) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
}
