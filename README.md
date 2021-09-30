**Teste de Java Básico com Spring-Boot**


Prova de avaliação dos conhecimentos básicos de linguagem Java.

Para fazer a prova é necessário ter o java 11 e o maven 3.

O candidato deve ser implementar 2 desafios:

* Criar um serviço REST que recebe como parametros peso e altura, retornando o **IMC** que pode ser calculado pela formula abaixo:
  
    Obs: Projeto subindo na porta 8888
    Criado as classes dentro do respectivo SpringMVC: 
        DadosCadastroController
            link/Endepoint para o Get para acessar a fórmula, passamdo peso 85 kilos e altura 1 metro e 89 cm : 
             http://localhost:8888/v1/dados/peso/85/altura/1.89
        DadosCadastroService    
            Regra: ` imc = Peso/Altura²`


* Dada uma classe Cliente, uma classe Gerente e uma classe Robo, todas devem ter um nome no qual deve atender aos seguintes requisitos:

    Obs: A idéia é a utilização de herança
        Classes RoboEntity, GerenteEntity e ClienteEntity utilizam os métodos, atributos e etc. da classe DadosCadastroEntity e essa em questão possuir as "travas" necessárias abaixo.

`Não é necessário expor um serviço, queremos ver a lógica e organização`

    Criado Classe Teste no Package "util" para testes do requisito abaixo:

    Obs: se fosse um serviço estariam utilizando: 
    - Nome não pode ser nulo: @NotNull 
    - Nome não pode ser vazio: @NotEmpty
    - Nome não pode conter espaços extras no início e no fim: utilizar .trim()

    - Deve ser possível obter o primeiro nome. Exemplo: Se o nome for "João Soares Silva", deve retornar "João".
    - Retornar o último nome. Exemplo: Se o nome for "João Soares Silva", deve retornar "Soares Silva".
    - Retornar o nome todo em letras maiúsculas.
    - Retornar o nome abreviado. Exemplo: Se o nome for "João Soares Silva", retornar "João S. Silva".
        
    
Após terminar o candidato deverá versionar a prova no git hub e nos mandar o repositório. 
* Enviar para: lhsilva@travelexbank.com.br, msales@travelexbank.com.br, rlisboa@travelexbank.com.br

Links uteis:
* https://chiarella.github.io/portifolio/
* https://github.com/chiarella
* https://github.com/chiarella?tab=repositories



