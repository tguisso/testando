package com.testando.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculadoraUnitTest {
	
	@Test
	void deveMultiplicar() {
		Integer numero = 2;
		Calculadora calculadora = new Calculadora();
		
		Integer resultado = calculadora.multiplica(numero);
		
		assertEquals(4, resultado);
	}

}
