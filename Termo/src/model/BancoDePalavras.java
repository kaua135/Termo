package model;

import java.util.ArrayList;
import java.util.Random;

public class BancoDePalavras {

    private static BancoDePalavras instancia;

    private ArrayList<String> palavras;

    private BancoDePalavras() {
        palavras = new ArrayList<>();

        palavras.add("CARRO");
        palavras.add("LIVRO");
        palavras.add("GATOS");
        palavras.add("PRAIA");
        palavras.add("TERRA");
        palavras.add("FESTA");
        palavras.add("NUVEM");
        palavras.add("SONHO");
        palavras.add("CHATO");
        palavras.add("VELHO");
        palavras.add("AMIGO");
        palavras.add("ANEIS");
        palavras.add("ANUAL");
        palavras.add("SEXTA");
        palavras.add("VIDEO");
        palavras.add("FLORA");
        palavras.add("JOIAS");
        palavras.add("MARCO");
        palavras.add("JUNHO");
        palavras.add("ABRIL");
        palavras.add("AVIÃO");
        palavras.add("VASCO");
        palavras.add("CASAS");
        palavras.add("PREGO");


    }

    public static BancoDePalavras getInstancia() {
        if (instancia == null) {
            instancia = new BancoDePalavras();
        }

        return instancia;
    }

    public boolean existePalavra(String Palavra) {
        return palavras.contains(Palavra.toUpperCase());
    }

    public String gerarPalavra() {
        Random random = new Random();
        int indice = random.nextInt(palavras.size());
        return palavras.get(indice);
    }
}