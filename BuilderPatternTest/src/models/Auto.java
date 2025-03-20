package models;

import java.util.ArrayList;
import java.util.List;

public class Auto {
    private List<Specifica> specifiche;

    public Auto(List<Specifica> specifiche) {
        this.specifiche = specifiche;
    }

    public Auto() {
        this.specifiche = new ArrayList<>();
    }

    public void addSpecifica(Specifica specifica) {
        this.specifiche.add(specifica);
    }

    public void removeSpecifica(Specifica specifica) {
        this.specifiche.remove(specifica);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + specifiche;
    }
}