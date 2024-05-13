package com.testando.testes;

public class Principal {

	public static void main(String[] args) {

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
		
		
	}

}
