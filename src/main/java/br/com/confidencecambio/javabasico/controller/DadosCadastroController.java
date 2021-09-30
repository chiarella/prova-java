package br.com.confidencecambio.javabasico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.confidencecambio.javabasico.service.DadosCadastroService;

@RestController
@RequestMapping(value = "/v1/dados")
public class DadosCadastroController {

	@Autowired
	private DadosCadastroService service;

    @GetMapping(value = "peso/{peso}/altura/{altura}")
    public ResponseEntity<Double> imcDados(@PathVariable Double peso, @PathVariable Double altura) {

    	if ((peso != null && altura != null) && (peso > 10 && altura > 0.10)) {
    		return new ResponseEntity<Double>(service.calcular(peso, altura), HttpStatus.OK);
    	} else {
    		return ResponseEntity.noContent().build();
    	}
    		   	
    }
	
}
