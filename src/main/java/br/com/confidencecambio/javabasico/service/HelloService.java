package br.com.confidencecambio.javabasico.service;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class HelloService {

    private static final String valorPadrao = "Mundo";

    public String retornaValorValido(@Nullable String nome) {
        return Optional.ofNullable(nome).orElse(valorPadrao);
    }
    
    public String retornaNome(String nome) {
    	
    	System.out.println("passou");
    	return nome;
    }

//	public void retornaNome(String nome) {
//		// TODO Auto-generated method stub
//		
//	}
}
