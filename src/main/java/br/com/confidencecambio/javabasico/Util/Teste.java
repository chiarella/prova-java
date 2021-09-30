package br.com.confidencecambio.javabasico.Util;

import br.com.confidencecambio.javabasico.entity.ClienteEntity;
import br.com.confidencecambio.javabasico.entity.DadosCadastroEntity;

public class Teste {

	public static void main(String[] args) {

		DadosCadastroEntity dados = new DadosCadastroEntity();
		
		String nomeComEsp = "    Anderson Chiarella     ";
		String nomeCompleto = "Anderson Chiarella Fernandes";
		String nomeCompletoTresSobrenome = "Anderson Chiarella Ciclano Fernandes";

		String nome = dados.salvandoNomeRegras("");
		System.out.println("EXEMPLO DE NOME	VAZIO:" + nome);
		
		String nome2 = dados.salvandoNomeRegras(nomeCompleto);
		System.out.println("EXEMPLO DE NOME CORRETO:" + nome2);

		// Nome não pode conter espaços extras no início e no fim
		// APENAS utilizar o .trim()
		System.out.println("NOME SALVO SEM ESPAÇO (UTILIZAR .TRIM()):" + nomeComEsp.trim());
		
		// Deve ser possível obter o primeiro nome. Exemplo: Se o nome for "João Soares
		// Silva", deve retornar "João".
		String primeiroNome = dados.obtendoPrimeiroNome(nomeCompleto);
		System.out.println("PRIMEIRO NOME:"  + primeiroNome);

		// Retornar o último nome. Exemplo: Se o nome for "João Soares Silva", deve
		// retornar "Soares Silva".
		String ultimoNome = dados.retornandoUltimoNome(nomeCompleto);
		System.out.println("ULTIMO NOME (DE ACORDO COM O DOCUMENTO):" + ultimoNome);

		// Retornar o nome todo em letras maiúsculas.
		String nomeMaiusculo = dados.retornarMaiusculo(nomeCompleto);
		System.out.println("NOME TO EM MAIUSCULO só utilizar o toUpperCase()):" +nomeMaiusculo);

		// Retornar o nome abreviado. Exemplo: Se o nome for "João Soares Silva",
		// retornar "João S. Silva".
		String nomeAbreviado = dados.retornarAbreviado(nomeCompleto);
		System.out.println("NOME COMPLETO:" + nomeAbreviado);

		/*
		 * Retornar o nome abreviado. Exemplo: Se o nome for "João Soares Silva",
		 * retornar "João S. Silva". e caso o nome passar de 2 SOBRENOMES, esse é o
		 * método correto a chamar.
		 */
		String nomeAbreviado2 = dados.retornarAbreviadoMaiorqueTresNomes(nomeCompletoTresSobrenome);
		System.out.println("NOME COMPLETO COM 3 SOBRENOMES:" + nomeAbreviado2);
		
		System.out.println("");
		
		System.out.println("Classe CLiente, Gerente e Robo utilizando herança");
		
		String nomeDoCliente =  "Jõao Soares Silva";
		ClienteEntity cliente = new ClienteEntity();
		String retorno = cliente.retornarMaiusculo(nomeDoCliente);
		System.out.println(retorno);

	}

}
