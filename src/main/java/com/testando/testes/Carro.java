package com.testando.testes;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Carro {
	
	private String modelo;
	private Integer ano;
	private String cor;
	
	public String exibirFichaTecnica() {
		return "Ficha Técnica do Carro: " + modelo + "\n " 
				+ "Ano: " + ano + "\n "
				+ "Cor: " + cor + "\n "
				+ "Idade: " + exibeIdade();
	}
	
	public Integer exibeIdade() {
		int year = LocalDate.now().getYear();
		return 	year - ano;
	}

}
