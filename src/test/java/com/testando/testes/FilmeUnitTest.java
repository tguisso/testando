package com.testando.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FilmeUnitTest {
	
//	@Test
//	void devePopularAtributosDeFilme() {
//		String nome = "Everest";
//		String categoria = "Drama";
//		String anoLancamento = "2000";
//		
//		Filme filme = new Filme();
//		
//		filme.nome = nome;
//		filme.categoria = categoria;
//		filme.anoLancamento = anoLancamento;
//		
//		assertEquals(nome, filme.nome);
//		assertEquals(categoria, filme.categoria);
//		assertEquals(anoLancamento, filme.anoLancamento);
//	}
	
	@Test
	void devePopularAtributosDeFilme() {
		String nome = "Everest";
		String categoria = "Drama";
		String anoLancamento = "2000";
		
		Filme filme = new Filme(nome, categoria, anoLancamento);
	
		assertEquals(nome, filme.getNome());
		assertEquals(categoria, filme.getCategoria());
		assertEquals(anoLancamento, filme.getAnoLancamento());
	}

}
