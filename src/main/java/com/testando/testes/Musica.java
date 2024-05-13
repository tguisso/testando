package com.testando.testes;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Musica {

	private String titulo;
	private String artista;
	private int anoLancamento;
	private double avaliacao;
	private int numAvaliacoes;
	private double mediaAvaliacoes;

	public void avaliar(double nota) {
		avaliacao += nota;
		numAvaliacoes++;
	}

	public double calculaMedia() {
		mediaAvaliacoes = avaliacao / numAvaliacoes;
		return mediaAvaliacoes; 
	}

	public String exibirFichaTecnica() {
		return "Ficha Técnica da Musica: " + titulo + "\n " 
				+ "artista: " + artista + "\n "
				+ "mediaAvaliacoes: " + calculaMedia();
	}

}
