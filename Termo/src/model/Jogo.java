package model;

import java.util.ArrayList;

public class Jogo {

    private Palavra palavraSecreta;
    private ArrayList<Jogada> jogadas;
    private Jogador jogador;

    public Jogo(Jogador jogador) {
        this.jogador = jogador;

        String palavra =
                BancoDePalavras.getInstancia()
                        .gerarPalavra();

        palavraSecreta = new Palavra(palavra);
        jogadas = new ArrayList<>();
    }

    public String verificar(String tentativa) {

        tentativa = tentativa.toUpperCase();

        String palavra = palavraSecreta.getTexto();

        String resultado = "";

        for (int i = 0; i < 5; i++) {

            char letra = tentativa.charAt(i);

            if (letra == palavra.charAt(i)) {
                resultado += "V";
            }
            else if (palavra.contains("" + letra)) {
                resultado += "A";
            }
            else {
                resultado += "X";
            }
        }

        jogadas.add(
                new Jogada(tentativa, resultado));

        return resultado;
    }

    public boolean venceu(String tentativa) {
        return tentativa.equalsIgnoreCase(
                palavraSecreta.getTexto());
    }

    public String getPalavraSecreta() {
        return palavraSecreta.getTexto();
    }
}