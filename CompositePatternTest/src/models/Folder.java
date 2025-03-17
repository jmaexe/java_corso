package models;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Componente {

    private String nome;
    private List<Componente> componenti;

    public Folder(String nome) {
        this.nome = nome;
        this.componenti = new ArrayList<Componente>();
    }

    public Folder(String nome, List<Componente> componenti) {
        this.nome = nome;
        this.componenti = componenti;
    }

    public void addComponente(Componente componente) {
        this.componenti.add(componente);
    }

    public void removeComponente(Componente componente) {
        this.componenti.remove(componente);
    }

    public List<Componente> getComponenti() {
        return this.componenti;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }

    public long getDimensioneTotale() {

        long app = 0;
        for (Componente componente : componenti) {
            if (componente instanceof File) {
                app += ((File) componente).getDimensione();
            } else {
                app += ((Folder) componente).getDimensioneTotale();
            }
        }
        return app;
    }

    @Override
    public String toString() {
        return "\nCartella " + this.nome + " (" + this.getDimensioneTotale() + "): \n" + this.componenti;
    }
}