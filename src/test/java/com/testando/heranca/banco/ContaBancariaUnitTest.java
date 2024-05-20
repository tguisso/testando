package com.testando.heranca.banco;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

class ContaBancariaUnitTest {
	
	@Test
	void deveDepositarEConsultarSaldo() {
		
		double saldoConta = 500.00;
		
		ContaBancaria conta = ContaCorrente.builder().build();
		
		conta.depositar(500.00);
		double resultado = conta.consultarSaldo();
		
		assertEquals(saldoConta, resultado);
		
	}

	@Test
	void deveSacarEConsultarSaldo() {
		ContaBancaria conta = ContaCorrente.builder().saldo(500.00).build();
		
		conta.sacar(200.00);
		double resultado = conta.consultarSaldo();
		
		assertEquals(300.00, resultado);
		
	}

	@Test
	void deveDarExcecaoAoSacar() {
		ContaBancaria conta = ContaCorrente.builder().saldo(500.00).build();
		
		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
			conta.sacar(501.00);
		});
		
		assertEquals("Valor do saque não deve ultrapassar o saldo disponível: R$500.0", thrown.getMessage());
		
	}

	@Test
	void deveAplicarTarifa() {
		ContaBancaria conta = ContaCorrente.builder().saldo(500.00).build();
		((ContaCorrente) conta).cobrarTarifaMensal();
		
		double resultado = conta.consultarSaldo();
		
		assertEquals(440.00, resultado);
		
	}
	
	

}
