package com.testando.testes;

import java.util.List;
import java.util.OptionalDouble;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Aluno {

	private String nome;
	private List<Double> notas;
	
	public double calcularMedia() {
		int quantidadeNotas = 0;
		double somatorioNotas = 0.0;
		
		for (Double nota : notas) {
			somatorioNotas += nota;
			quantidadeNotas++;
		}
		
		if(quantidadeNotas == 0) {
			return 0.0;
		}

		double media = somatorioNotas / quantidadeNotas;
		
		return Double.valueOf(String.format("%.2f", media).replace(",", "."));
	}
	
	//resultado usando lambda...
//	public double calcularMedia() {
//		OptionalDouble mediaOptional = notas.stream()
//				.mapToDouble(Double::doubleValue)
//				.average();
//
//		double media = mediaOptional.orElse(0.0);
//
//		return Double.parseDouble(String.format("%.2f", media).replace(",", "."));
//
//	}
}
