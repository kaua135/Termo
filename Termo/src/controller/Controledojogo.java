package controller;

import model.Bancodepalavras;
import model.Jogador;
import model.Jogo;
import view.Visaodojogo;

public class Controledojogo {

    private Jogo jogo;
    private Visaodojogo view;
    private Jogador jogador;

    public Controledojogo() {
        view = new Visaodojogo();
    }

    public void iniciar() {

        String nome = view.lerNome();

        jogador = new Jogador(nome);

        jogo = new Jogo(jogador);

        int tentativas = 6;

        while (tentativas > 0) {

            System.out.println("\nTentativas restantes: " + tentativas);

            String palavra =
                    view.lerTentativa();

            if (palavra.length() != 5) {
                System.out.println("A palavra deve ter 5 letras.");
                continue;
            }

            if (!palavra.matches("[a-zA-Z]+")){
                System.out.println("Digite apenas letras.");

                continue;
            }
            if (!Bancodepalavras.getInstancia().existePalavra(palavra)){
                System.out.println("Essa palavra não existe");

                continue;
            }

            String resultado =
                    jogo.verificar(palavra);

            view.mostrarResultado(resultado);

            if (jogo.venceu(palavra)) {

                jogador.adicionarVitoria();

                System.out.println("\nParabéns, " + jogador.getNome() + "! Você venceu!");

                return;
            }

            tentativas--;
        }

        jogador.adicionarDerrota();

        System.out.println("\nVocê perdeu.");

        System.out.println("A palavra era: " + jogo.getPalavraSecreta());
    }
}