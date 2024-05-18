package com.testando.heranca.animal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AnimalUnitTest {
	
	@Test
	void deveEmitirSomDeCachorro() {
		Animal animal = Cachorro.builder().build();
		String som = animal.emitirSom();

		assertEquals("Latido", som);
	}

	@Test
	void deveEmitirSomDeGato() {
		Animal animal = Gato.builder().build();
		String som = animal.emitirSom();
		
		assertEquals("Miado", som);
	}

	@Test
	void deveArranharMoveis() {
		Animal animal = Gato.builder().build();
		String resultado = ((Gato) animal).arranharMoveis();
		
		assertEquals("Arranha os móveis", resultado);
	}

	@Test
	void deveAbanarRabo() {
		Animal animal = Cachorro.builder().build();
		String resultado = ((Cachorro) animal).abanarRabo();
		
		assertEquals("Abana o rabo", resultado);
	}

}
