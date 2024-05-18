package com.testando.heranca.carro;

import java.util.List;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Carro {
	
	private int ano;
	private String nomeModelo;
	private double preco;
	
	public Carro exibeMenorValor(List<Carro> carros) {
		return null;
	}

}
