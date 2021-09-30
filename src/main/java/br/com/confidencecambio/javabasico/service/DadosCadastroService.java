package br.com.confidencecambio.javabasico.service;

import org.springframework.stereotype.Service;

@Service
public class DadosCadastroService {

	public Double calcular(Double peso, Double altura) {
		
		Double imc = peso / (altura * altura);
				
		return imc;
		
	}
	
	
	

}
