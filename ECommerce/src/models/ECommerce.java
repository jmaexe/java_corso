package models;

import java.util.ArrayList;
import java.util.List;

public class ECommerce {
    private String indirizzo;
    private List<Prodotto> prodotti;
    private List<Utente> utenti;

    public ECommerce(String indirizzo, List<Prodotto> prodotti, List<Utente> utenti) {
        this.indirizzo = indirizzo;
        this.prodotti = prodotti;
        this.utenti = utenti;
    }

    public ECommerce(String indirizzo) {
        this.indirizzo = indirizzo;
        this.prodotti = new ArrayList<Prodotto>();
        this.utenti = new ArrayList<Utente>();
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public List<Prodotto> getProdotti() {
        return prodotti;
    }

    public List<Utente> getUtenti() {
        return utenti;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setProdotti(List<Prodotto> prodotti) {
        this.prodotti = prodotti;
    }

    public void setUtenti(List<Utente> utenti) {
        this.utenti = utenti;
    }

    public void registraUtente(Utente utente) {
        this.utenti.add(utente);
    }

    @Override
    public String toString() {
        return " indirizzo: " + indirizzo + ",\nutenti : " + utenti.toString() + "\nprodotti: " + prodotti.toString();
    }

}
