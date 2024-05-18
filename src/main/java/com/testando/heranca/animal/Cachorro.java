package com.testando.heranca.animal;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Cachorro extends Animal{
	
	@Override
	public String emitirSom() {
		return "Latido";
	}
	
	public String abanarRabo() {
		return "Abana o rabo";
	}

}
