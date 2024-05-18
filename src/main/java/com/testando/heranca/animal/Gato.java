package com.testando.heranca.animal;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Gato extends Animal{
	
	@Override
	public String emitirSom() {
		return "Miado";
	}
	
	public String arranharMoveis() {
		return "Arranha os móveis";
	}

}
