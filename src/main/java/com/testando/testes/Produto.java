package com.testando.testes;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Produto {
	
	private String nome;
	private double preco;
	
	public double aplicarDesconto(double percentual) {
		double valorDesconto = (percentual / 100) * preco;  
		double precoComDesconto = preco - valorDesconto;
		return Double.valueOf(String.format("%.2f", precoComDesconto).replace(",", "."));
	}

}
