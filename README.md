TRABALHO M3 – POO
RELATÓRIO DO PROJETO – JOGO TERMO
Nome: Kauã de Melo Buchele

1. Introdução
O projeto desenvolvido é uma versão simplificada do jogo Termo, no qual o jogador precisa descobrir uma palavra secreta de cinco letras em até seis tentativas.
A cada palavra digitada, o sistema informa se as letras estão corretas e se estão na posição certa, ajudando o jogador a encontrar a resposta antes que as tentativas acabem.

2. Objetivo do Sistema
Desenvolver um jogo de adivinhação de palavras de cinco letras, permitindo ao usuário tentar descobrir uma palavra secreta escolhida aleatoriamente pelo sistema.
O sistema deve:
Escolher uma palavra aleatória;
Permitir até seis tentativas;
Informar se as letras estão corretas;
Exibir mensagens de vitória ou derrota;
Armazenar as tentativas realizadas;
Registrar as estatísticas do jogador.

3. Requisitos Funcionais
Iniciar uma nova partida;
Ler o nome do jogador;
Selecionar uma palavra aleatória de cinco letras;
Validar a entrada do usuário;
Permitir apenas palavras de cinco letras;
Permitir apenas caracteres alfabéticos;
Verificar cada tentativa realizada;
Exibir o resultado das tentativas;
Informar vitória ou derrota.

4. Requisitos Não Funcionais
O sistema foi desenvolvido em Java;
O programa é executado em modo console;
O código está organizado em pacotes;
O sistema utiliza os padrões MVC e Singleton.

5. Padrões de Projeto Utilizados
5.1 Arquitetura MVC (Model-View-Controller)
O padrão MVC foi utilizado para deixar o projeto mais organizado, separando cada responsabilidade do sistema.
Model
Responsável pelos dados e pelas regras do jogo.
Classes:
Palavra;
Jogada;
Jogador;
Jogo;
BancoDePalavras.
View
Responsável pela interação com o usuário.
Classe:
VisaoDeJogo.
Controller
Responsável por controlar o funcionamento do jogo.
Classe:
ControleDeJogo.
A utilização do MVC facilita a manutenção do código e torna o sistema mais organizado e fácil de entender.

5.2 Padrão Singleton
O padrão Singleton foi aplicado na classe BancoDePalavras.
Seu objetivo é garantir que exista apenas uma instância responsável pelo armazenamento das palavras utilizadas pelo jogo.
A implementação foi feita utilizando:
Construtor privado;
Instância estática;
Método getInstancia() para acesso ao objeto.

5.3 Justificativa da Utilização do Singleton
O jogo necessita de apenas um banco de palavras durante toda a execução. Criar vários bancos de palavras seria desnecessário e poderia causar desperdício de memória e duplicação de informações.
Com o padrão Singleton, todas as partes do sistema utilizam a mesma lista de palavras, tornando o gerenciamento mais simples e organizado.
Além disso, o acesso ao banco de palavras é realizado através do método:
BancoDePalavras.getInstancia();
Comparando as duas abordagens:
Sem Singleton
Com Singleton
Várias listas de palavras
Apenas uma lista compartilhada
Maior consumo de memória
Menor consumo de memória
Possibilidade de inconsistências
Dados centralizados
Criação de objetos desnecessários
Apenas uma instância

Por esses motivos, o padrão Singleton mostrou-se a melhor opção para o projeto.

6. Classes do Sistema
Palavra
Representa a palavra secreta da partida.
Atributos:
texto.
Métodos:
getTexto().

Jogada
Representa uma tentativa realizada pelo jogador.
Atributos:
tentativa;
resultado.
Métodos:
getTentativa();
getResultado().

Jogador
Representa o usuário que está jogando.
Atributos:
nome;
vitórias;
derrotas.
Métodos:
adicionarVitoria();
adicionarDerrota().

Jogo
Responsável pelas regras da partida.
Atributos:
palavraSecreta;
jogadas;
jogador.
Métodos:
verificar();
venceu();
getPalavraSecreta().

BancoDePalavras
Responsável por armazenar e fornecer as palavras utilizadas pelo jogo.
Métodos:
getInstancia();
gerarPalavra();
existePalavra().

7. Relacionamentos entre Classes
Composição
O jogo possui uma Palavra.
O jogo possui várias Jogadas.
Associação
O jogo está associado a um Jogador.
Dependência
O jogo utiliza BancoDePalavras.
ControleDeJogo utiliza Jogo e VisaoDeJogo.
Main utiliza ControleDeJogo.

8. Funcionamento do Sistema
O jogador informa seu nome.
O sistema escolhe uma palavra aleatória.
O jogador possui seis tentativas para descobrir a palavra.
O sistema verifica se a entrada possui cinco letras e se contém apenas caracteres alfabéticos.
Após cada tentativa:
Verde: letra correta na posição correta;
Amarelo: letra existe na palavra, mas está na posição errada;
Cinza: letra não existe na palavra.
Caso a palavra seja descoberta, o jogador vence.
Caso as tentativas acabem, o sistema informa a palavra correta e registra a derrota.
