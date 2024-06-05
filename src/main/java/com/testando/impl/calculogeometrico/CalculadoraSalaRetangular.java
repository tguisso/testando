package com.testando.impl.calculogeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

	@Override
	public double calcularArea(double base, double altura) {
		return base * altura;
	}

	@Override
	public double calcularPerimetro(double base, double altura) {
		double area = base + altura;
		return 2 * area;
	}

}
