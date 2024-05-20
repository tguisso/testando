package com.testando.heranca.banco;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class ContaBancaria {
	
	protected double saldo;
	
	public void depositar(double valor) {
		saldo += valor;		
	}
	
	public void sacar(double valor) {
		if(valor <= saldo) {
			saldo -= valor;
		} else {
			throw new IllegalArgumentException("Valor do saque não deve ultrapassar o saldo disponível: R$" + saldo);
		}
	}
	
	public double consultarSaldo() {
		return saldo;
	}

}
