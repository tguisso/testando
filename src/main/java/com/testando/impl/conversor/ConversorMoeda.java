package com.testando.impl.conversor;

public class ConversorMoeda implements ConversaoFinanceira{
	
	private static final double TAXA_DOLAR = 5.16;

	@Override
	public double converterDolarParaReal(double dolar) {
		return dolar * TAXA_DOLAR;
	}

}
