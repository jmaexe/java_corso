package models;

public class AutoSportivaBuilder implements Builder {

    private AutoSportiva result;

    @Override
    public void reset() {
        result = new AutoSportiva();
    }

    @Override
    public void buildSpecifica(String nome, String descrizione) {
        result.addSpecifica(new Specifica(nome, descrizione));
    }

    public AutoSportiva getResult() {
        return this.result;
    }
}
