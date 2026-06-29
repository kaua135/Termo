package model;

public class Jogada {

    private String tentativa;
    private String resultado;

    public Jogada(String tentativa, String resultado) {
        this.tentativa = tentativa.toUpperCase();
        this.resultado = resultado;
    }

    public String getTentativa() {
        return tentativa;
    }

    public String getResultado() {
        return resultado;
    }
}