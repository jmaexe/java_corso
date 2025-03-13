package presentation;

import java.util.ArrayList;
import java.util.List;

import models.ECommerce;
import models.Prodotto;
import models.Utente;
import models.Ruolo;

public class App {
    public static void main(String[] args) throws Exception {
        // Creazione di alcuni prodotti di esempio
        List<Prodotto> prodotti = new ArrayList<>();
        prodotti.add(new Prodotto("Prodotto1", 10.99, "P001"));
        prodotti.add(new Prodotto("Prodotto2", 20.99, "P002"));
        prodotti.add(new Prodotto("Prodotto3", 30.99, "P003"));

        List<Utente> utenti = new ArrayList<>();
        utenti.add(new Utente("Mario", "Rossi", "mario.rossi@example.com", "MRORSS80A01H501Z", "Via Roma 1",
                Ruolo.CLIENTE));
        utenti.add(new Utente("Luigi", "Verdi", "luigi.verdi@example.com", "LVRDGN80A01H501Z", "Via Milano 2",
                Ruolo.AMMINISTRATORE));
        utenti.add(new Utente("Giulia", "Bianchi", "giulia.bianchi@example.com", "GLBCNH80A01H501Z", "Via Napoli 3",
                Ruolo.CLIENTE));

        ECommerce ecommerce = new ECommerce("www.sitobello.com", prodotti, utenti);

        System.out.println("ECommerce creato con successo:");
        System.out.println("Indirizzo: " + ecommerce.getIndirizzo());
        System.out.println("Prodotti: " + prodotti);
        System.out.println("Utenti: " + utenti);
    }
}
