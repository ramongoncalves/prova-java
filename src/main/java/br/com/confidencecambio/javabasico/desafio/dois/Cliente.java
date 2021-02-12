package br.com.confidencecambio.javabasico.desafio.dois;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Cliente {
	
	@NotNull(message = "Name cannot be null")
	@NotBlank
	private String name;
}
