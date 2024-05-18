package com.testando.heranca.animal;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Animal {
	
	public String emitirSom() {
		return "Grunido";
	}

}
