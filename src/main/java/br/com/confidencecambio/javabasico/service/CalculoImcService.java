package br.com.confidencecambio.javabasico.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class CalculoImcService {

	public BigDecimal retornaCalculoImc(BigDecimal weight, BigDecimal height) {
		
		return weight.divide(height.pow(2), RoundingMode.HALF_EVEN);

	}
}
