package com.testando.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class AlunoUnitTest {
	
	@Test
	void deveObterMedia() {
		Aluno aluno = new Aluno("Junior", Arrays.asList(5.0,8.5,9.0));
		
		double media = aluno.calcularMedia();
		
		assertEquals(7.5, media);
	}

	@Test
	void deveObterMedia0() {
		Aluno aluno = new Aluno("Junior", Arrays.asList());
		
		double media = aluno.calcularMedia();
		
		assertEquals(0.0, media);
	}

}
