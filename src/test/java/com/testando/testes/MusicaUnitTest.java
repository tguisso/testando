package com.testando.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MusicaUnitTest {
	
	@Test
	void avaliarCalcularMediaExibirFicha() {
		
		Musica musica = Musica.builder()
				.titulo("Frozen")
				.artista("Madonna")
				.anoLancamento(2001)
				.build();
		
		musica.avaliar(3.0);
		musica.avaliar(8.0);
		musica.avaliar(7.0);
		
		double media = musica.calculaMedia();
		
		String fichaTecnica = musica.exibirFichaTecnica();
		
		assertEquals(6.0, media);
		System.out.println(fichaTecnica);
	}

}
