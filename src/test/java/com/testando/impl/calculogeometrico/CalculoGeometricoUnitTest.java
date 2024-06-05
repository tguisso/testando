package com.testando.impl.calculogeometrico;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculoGeometricoUnitTest {
	
	@Test
	void deveCalcularArea() {
		CalculoGeometrico calculo = new CalculadoraSalaRetangular();
		
		double area = calculo.calcularArea(18.0, 24.0);
		
		assertEquals(432.0, area);
		
	}

	@Test
	void deveCalcularPerimetro() {
		CalculoGeometrico calculo = new CalculadoraSalaRetangular();
		
		double perimetro = calculo.calcularPerimetro(4, 10);
		
		assertEquals(28.0, perimetro);
		
	}

}
