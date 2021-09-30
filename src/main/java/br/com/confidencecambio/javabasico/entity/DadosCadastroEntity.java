package br.com.confidencecambio.javabasico.entity;

import java.util.ArrayList;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

//@Entity
public class DadosCadastroEntity {

	// @NotBlank(message = "O campo nome não pode estar em branco")
	@NotEmpty(message = "O campo nome não pode estar vazio")
	@NotNull(message = "O campo nome não pode ser nulo")
	private String nome;

	public String getNome() {
		return nome;
	}

	public String salvandoNomeRegras(String nome) {
		if (nome.equals("") || nome == null) {
			return "ERRO -> NOME NULO OU VAZIO";
		} else {
			return "NOME SALVO NO BANCO";
		}
	}

	public String obtendoPrimeiroNome(String nome) {
		return nome.substring(0, nome.indexOf(" "));
	}

	public String retornandoUltimoNome(String nome) {
		int um = nome.indexOf(" ");
		return nome.substring(um + 1);
	}

	public String retornarMaiusculo(String nome) {
		return nome.toUpperCase();
	}

	public String retornarAbreviado(String nome) {
		int um = nome.indexOf(" ");
		int dois = nome.lastIndexOf(" ");
		String primeiroNome = obtendoPrimeiroNome(nome);
		String segundoAbreviado = nome.substring(um + 1, dois);
		String ultimoNome = nome.substring(dois);
		return primeiroNome + " " + segundoAbreviado.substring(0, 1) + "." + ultimoNome;
	}

	public String retornarAbreviadoMaiorqueTresNomes(String nomeCompleto) {
		ArrayList<String> nomes2 = new ArrayList<>();
		StringBuilder listaString = new StringBuilder();
		for (String str : nomeCompleto.split(" ")) {
			if (nomes2.size() == 1) {
				nomes2.add(str.substring(0, 1) + ".");
				listaString.append(str.substring(0, 1) + ".");
				listaString.append(" ");
			} else {
				nomes2.add(str);
				listaString.append(str);
				listaString.append(" ");
			}
		}
		return listaString.toString();
	}
}
