package models;

public class Prodotto {

    private String nome;
    private double prezzo;
    private String codice;

    public Prodotto(String nome, double prezzo, String codice) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.codice = codice;
    }

    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return " nome:" + nome + ", codice:" + codice + ", prezzo:" + prezzo;
    }
}