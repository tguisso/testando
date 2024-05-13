package com.testando.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CarroUnitTest {

	@Test
	void exibirFichaTecnica() {

		Carro carro = Carro.builder()
				.modelo("Onix")
				.ano(1998)
				.cor("Azul")
				.build();
		
		String fichaTecnica = carro.exibirFichaTecnica();
		
		System.out.println(fichaTecnica);
		
		Integer idade = carro.exibeIdade();
		
		assertEquals(26, idade);

	}

}
