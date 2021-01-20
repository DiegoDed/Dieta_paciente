package ar.edu.unlam.pb2.ea1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DietaDiariaTest {
	
	@Test
	public void testQueNosePuedanAgregarPlatoRepetidos() {
		Ingrediente ingrediente1 = new Ingrediente("Tomate", 1 , 3);
		Ingrediente ingrediente2= new Ingrediente("Comino", 0, 0);
		
		Plato plato1= new Plato("Salsa");
		Plato plato2= new Plato("Salsa");
		
		plato1.agregarIngrediente(ingrediente1);
		plato1.agregarIngrediente(ingrediente2);
		plato1.agregarIngrediente(ingrediente1);
		
		plato2.agregarIngrediente(ingrediente1);
		plato2.agregarIngrediente(ingrediente2);
		plato2.agregarIngrediente(ingrediente1);
		
		DietaDiaria dieta1= new DietaDiaria();
	
		
		dieta1.agregarPlato(plato1);
		dieta1.agregarPlato(plato2);
		
		Integer valorObtenido= dieta1.getPlatos().size();
		Integer valorEsperado= 1;
		
		assertTrue(valorObtenido.equals(valorEsperado));
		
	}
	
	@Test
	public void testQueDietaDiariaSeaAptaHipertenso(){
		Ingrediente ingrediente1 = new Ingrediente("Tomate", 1 , 3);
		Ingrediente ingrediente2 = new Ingrediente("Tomate", 2 , 4);
		Ingrediente ingrediente3= new Ingrediente("Comino", 0, 0);
		
		Plato plato1= new Plato("Salsa");
	
		plato1.agregarIngrediente(ingrediente1);
		plato1.agregarIngrediente(ingrediente2);
		plato1.agregarIngrediente(ingrediente3);
		
		DietaDiaria dieta1= new DietaDiaria();
		dieta1.agregarPlato(plato1);
		
		assertTrue(dieta1.aptaHipertenso());
	}
	
	@Test
	public void testQueDietaDiariaNoSeaAptaHipertenso(){
		Ingrediente ingrediente1 = new Ingrediente("Tomate", 2 , 3);
		Ingrediente ingrediente2 = new Ingrediente("Tomate", 3 , 4);
		Ingrediente ingrediente3= new Ingrediente("Comino", 0, 0);
		
		Plato plato1= new Plato("Salsa");
	
		plato1.agregarIngrediente(ingrediente1);
		plato1.agregarIngrediente(ingrediente2);
		plato1.agregarIngrediente(ingrediente3);
		
		DietaDiaria dieta1= new DietaDiaria();
		dieta1.agregarPlato(plato1);
		
		assertFalse(dieta1.aptaHipertenso());
	}
	
	@Test
	public void testQueDietaDiariaSeaAptaDiabetico(){
		Ingrediente ingrediente1 = new Ingrediente("Tomate", 1 , 3);
		Ingrediente ingrediente2 = new Ingrediente("Tomate", 2 , 4);
		Ingrediente ingrediente3= new Ingrediente("Comino", 0, 0);
		
		Plato plato1= new Plato("Salsa");
	
		plato1.agregarIngrediente(ingrediente1);
		plato1.agregarIngrediente(ingrediente2);
		plato1.agregarIngrediente(ingrediente3);
		
		DietaDiaria dieta1= new DietaDiaria();
		dieta1.agregarPlato(plato1);
		
		assertTrue(dieta1.aptaDiabetico());
	}
	
	@Test
	public void testQueDietaDiariaNoSeaAptaDiabetico(){
		Ingrediente ingrediente1 = new Ingrediente("Tomate", 1 , 13);
		Ingrediente ingrediente2 = new Ingrediente("Tomate", 2 , 15);
		Ingrediente ingrediente3= new Ingrediente("Comino", 0, 0);
		
		Plato plato1= new Plato("Salsa");
	
		plato1.agregarIngrediente(ingrediente1);
		plato1.agregarIngrediente(ingrediente2);
		plato1.agregarIngrediente(ingrediente3);
		
		DietaDiaria dieta1= new DietaDiaria();
		dieta1.agregarPlato(plato1);
		
		assertFalse(dieta1.aptaDiabetico());
	}
	
}
