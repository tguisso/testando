package com.testando.heranca.carro;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class CarroUnitTest {
	
	@Test
	void adicionarModelo() {
		
		List<ModeloCarro> modelosDeCarros = Arrays.asList(
				ModeloCarro.builder().nomeModelo("Gol").ano(2012).preco(25590.00).build(),
				ModeloCarro.builder().nomeModelo("Gol").ano(2015).preco(27737.00).build(),
				ModeloCarro.builder().nomeModelo("Gol").ano(2018).preco(30100.00).build()); 
		
		
		
		
	}

}
