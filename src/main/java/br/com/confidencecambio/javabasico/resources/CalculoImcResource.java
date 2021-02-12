package br.com.confidencecambio.javabasico.resources;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.confidencecambio.javabasico.service.CalculoImcService;

@Validated
@RestController
public class CalculoImcResource {

	private CalculoImcService service;

	public CalculoImcResource(final CalculoImcService service) {

		this.service = service;
	}

	@RequestMapping(value = "/calculo", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<String> calculoImc(
			@RequestParam(value = "weight") @NotBlank BigDecimal weight,
			@RequestParam(value = "height") @NotBlank BigDecimal height) {

		var result = service.retornaCalculoImc(weight, height);
		return ResponseEntity.ok().body(String.format("{\"imc\": %s}", result));

	}
}
