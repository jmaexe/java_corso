package models;

public class AutoEconomicaBuilder implements Builder {

    private AutoEconomica result;

    @Override
    public void reset() {
        result = new AutoEconomica();
    }

    @Override
    public void buildSpecifica(String nome, String descrizione) {
        result.addSpecifica(new Specifica(nome, descrizione));
    }

    public AutoEconomica getResult() {
        return this.result;
    }
}
