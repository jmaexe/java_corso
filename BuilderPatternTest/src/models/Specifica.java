package models;

public class Specifica {
    private String nome;
    private String descrizione;

    public Specifica(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public Specifica(String nome) {
        this.nome = nome;

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + nome + " -  descrizione: " + descrizione;
    }
}
