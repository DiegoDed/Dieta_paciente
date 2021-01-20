package ar.edu.unlam.pb2.ea1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PacienteTest {
	@Test
	public void testQueUnDiabeticoIngesteDietaAptaParaDiabetico() {
		Ingrediente ingrediente1 = new Ingrediente("Tomate", 1 , 2);
		Ingrediente ingrediente2 = new Ingrediente("Tomate", 1 , 3);
		Ingrediente ingrediente3= new Ingrediente("Comino", 1, 1);
		
		Plato plato1= new Plato("Salsa");
		
		plato1.agregarIngrediente(ingrediente1);
		plato1.agregarIngrediente(ingrediente2);
		plato1.agregarIngrediente(ingrediente3);
		
		
		DietaDiaria dieta1= new DietaDiaria();
		dieta1.agregarPlato(plato1);
		
		Diabetico paciente= new Diabetico("Hernan", "Marquez", 1234, 10);
		
		paciente.agregarDietaDiaria(dieta1);
		
		Integer valorObtenido = paciente.getIngesta().size();
		Integer valorEsperado= 1;
		
		assertTrue(valorObtenido.equals(valorEsperado));
	}
	
	@Test
	public void testQueUnDiabeticoNoIngesteDietaAptaParaDiabetico() {
		Ingrediente ingrediente1 = new Ingrediente("Tomate", 1 , 13);
		Ingrediente ingrediente2 = new Ingrediente("Tomate", 1 , 15);
		Ingrediente ingrediente3= new Ingrediente("Comino", 0, 0);
		
		Plato plato1= new Plato("Salsa");
	
		plato1.agregarIngrediente(ingrediente1);
		plato1.agregarIngrediente(ingrediente2);
		plato1.agregarIngrediente(ingrediente3);
		
		DietaDiaria dieta1= new DietaDiaria();
		dieta1.agregarPlato(plato1);
		
		Diabetico paciente= new Diabetico("Hernan", "Marquez", 1234, 10);
		
		paciente.agregarDietaDiaria(dieta1);
		
		Integer valorObtenido = paciente.getIngesta().size();
		Integer valorEsperado= 1;
		
		assertFalse(valorObtenido.equals(valorEsperado));
	}
	@Test
	public void testQueUnHipertendoIngesteDietaAptaParaHipertenso() {
		Ingrediente ingrediente1 = new Ingrediente("Tomate", 1 , 2);
		Ingrediente ingrediente2 = new Ingrediente("Tomate", 1 , 3);
		Ingrediente ingrediente3= new Ingrediente("Pimenton", 0, 1);
		
		Plato plato1= new Plato("Salsa");
		
		plato1.agregarIngrediente(ingrediente1);
		plato1.agregarIngrediente(ingrediente2);
		plato1.agregarIngrediente(ingrediente3);
		
		
		DietaDiaria dieta1= new DietaDiaria();
		dieta1.agregarPlato(plato1);
		
		Hipertenso paciente= new Hipertenso("Hernan", "Marquez", 1234, 10, 24);
		
		paciente.agregarDietaDiaria(dieta1);
		
		Integer valorObtenido = paciente.getIngesta().size();
		Integer valorEsperado= 1;
		
		assertTrue(valorObtenido.equals(valorEsperado));
		
	}
	@Test
	public void testQueUnHipertendoNoIngesteDietaAptaParaHipertenso() {
		Ingrediente ingrediente1 = new Ingrediente("Tomate", 6 , 2);
		Ingrediente ingrediente2 = new Ingrediente("Tomate", 4 , 3);
		Ingrediente ingrediente3= new Ingrediente("Pimenton", 1, 1);
		
		Plato plato1= new Plato("Salsa");
		
		plato1.agregarIngrediente(ingrediente1);
		plato1.agregarIngrediente(ingrediente2);
		plato1.agregarIngrediente(ingrediente3);
		
		
		DietaDiaria dieta1= new DietaDiaria();
		dieta1.agregarPlato(plato1);
		
		Hipertenso paciente= new Hipertenso("Hernan", "Marquez", 1234, 10, 24);
		
		paciente.agregarDietaDiaria(dieta1);
		
		Integer valorObtenido = paciente.getIngesta().size();
		Integer valorEsperado= 1;
		
		assertFalse(valorObtenido.equals(valorEsperado));
		
	}
}
