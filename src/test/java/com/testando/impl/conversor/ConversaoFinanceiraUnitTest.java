package com.testando.impl.conversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ConversaoFinanceiraUnitTest {
	
	@Test
	void deveConverterParaReal() {
		ConversaoFinanceira conversor = new ConversorMoeda();
		
		double real = conversor.converterDolarParaReal(100.00);
		
		assertEquals(516.00, real);
	}

}
