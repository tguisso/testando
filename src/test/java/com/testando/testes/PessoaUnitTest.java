package com.testando.testes;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class PessoaUnitTest {
	
	@Test
	void verificarMenorDeIdade() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Maria");
		pessoa.setIdade(16);
		
		boolean maiorDeIdade = pessoa.isMaiorDeIdade();
		
		assertFalse(maiorDeIdade);
		
	}

}
