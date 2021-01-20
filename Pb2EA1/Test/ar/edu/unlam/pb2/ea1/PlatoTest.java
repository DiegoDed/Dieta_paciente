package ar.edu.unlam.pb2.ea1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlatoTest {

	@Test
	public void testQueSePuedanAgregarIngredientesIguales(){
		
		Ingrediente ingrediente1 = new Ingrediente("Tomate", 1 , 12);
		
		Plato plato1= new Plato("Salsa");
		
		plato1.agregarIngrediente(ingrediente1);
		plato1.agregarIngrediente(ingrediente1);
		
		Integer valorObtenido= plato1.getIngredientes().size();		
		Integer valorEsperado= 2;
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void testQueSeObtengaLaCantidadDeSalCorrecta(){
		Ingrediente ingrediente1 = new Ingrediente("Tomate", 1 , 3);
		Ingrediente ingrediente2 = new Ingrediente("Tomate", 2 , 8);
		Plato plato1= new Plato("Salsa");
		
		plato1.agregarIngrediente(ingrediente1);
		plato1.agregarIngrediente(ingrediente2);
		
		Integer vo= plato1.obtenerCantidadDeSal();
		Integer ve= 3;
		
		assertEquals(vo, ve);
	}
	
	@Test
	public void testQueSeObtenegaLaCanidadDeAzucarCorrecta() {
		Ingrediente ingrediente1 = new Ingrediente("Tomate", 1 , 3);
		Ingrediente ingrediente2 = new Ingrediente("Tomate", 2 , 8);
		Plato plato1= new Plato("Salsa");
		
		plato1.agregarIngrediente(ingrediente1);
		plato1.agregarIngrediente(ingrediente2);
		
		Integer vo= plato1.obtenerCantidadDeAzucar();
		Integer ve= 11;
		
		assertEquals(vo, ve);
	}
	
}
