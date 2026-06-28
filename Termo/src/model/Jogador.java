package model;

public class Jogador {

    private String nome;
    private int vitorias;
    private int derrotas;

    public Jogador(String nome) {
        this.nome = nome;
        this.vitorias = 0;
        this.derrotas = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void adicionarVitoria() {
        vitorias++;
    }

    public void adicionarDerrota() {
        derrotas++;
    }
}