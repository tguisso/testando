package com.testando.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProdutoUnitTest {
	
	@Test
	void obterDesconto() {
		Produto produto = new Produto("Picanha", 79.9);
		double desconto = produto.aplicarDesconto(12.0);
		
		assertEquals(70.31, desconto);
	}

}
