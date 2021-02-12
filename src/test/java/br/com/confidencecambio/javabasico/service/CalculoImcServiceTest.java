package br.com.confidencecambio.javabasico.service;


import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class CalculoImcServiceTest {

    private CalculoImcService service;

    @Before
    public void init(){
         service= new CalculoImcService();
    }


    @Test
    public void testExecutaCalculo(){
    	var valor1 = new BigDecimal(70);
    	var valor2 = new BigDecimal(1.70);
        var valorEsperado = 24.22;
        BigDecimal valorValido = service.retornaCalculoImc(valor1, valor2);
        assertEquals(valorEsperado,valorValido);
    }



}