package com.testando.testes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {
	
	private String nome;
	private int idade;
	
	public boolean isMaiorDeIdade() {
		return idade >= 18;
	}
}
