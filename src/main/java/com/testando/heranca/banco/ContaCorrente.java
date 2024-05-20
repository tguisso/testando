package com.testando.heranca.banco;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class ContaCorrente extends ContaBancaria{
	
	private static final double TARIFA_MENSAL = 12.00; 
	
	public void cobrarTarifaMensal() {
		double descontoTarifa = (TARIFA_MENSAL / 100) * saldo;
		saldo -= descontoTarifa;
	}

}
