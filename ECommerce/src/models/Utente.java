package models;

public class Utente {
    private String nome;
    private String cognome;
    private String email;
    private String codiceFiscale;
    private String indirizzo;

    private Ruolo ruolo;

    public Utente(String nome, String cognome, String email, String codiceFiscale, String indirizzo, Ruolo ruolo) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.codiceFiscale = codiceFiscale;
        this.indirizzo = indirizzo;
        this.ruolo = ruolo;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public Ruolo getRuolo() {
        return ruolo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setRuolo(Ruolo ruolo) {
        this.ruolo = ruolo;
    }

    @Override
    public String toString() {
        return " codiceFiscale:" + codiceFiscale + ", cognome:" + cognome + ", email:" + email + ", indirizzo:"
                + indirizzo + ", nome:" + nome + ", ruolo:" + ruolo;
    }
}