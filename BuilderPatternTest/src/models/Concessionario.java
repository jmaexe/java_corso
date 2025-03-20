package models;

public class Concessionario {
    private Builder builder;

    public Concessionario(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public Auto make(BuilderType type) {
        this.builder.reset();
        switch (type) {
            case BuilderType.AUTOECONOMICA:
                builder.buildSpecifica("ABS", "bababa");
                builder.buildSpecifica("colore", "rosso");
                return ((AutoEconomicaBuilder) builder).getResult();
            case BuilderType.AUTOSPORTIVA:
                builder.buildSpecifica("ABS", "bobob");
                builder.buildSpecifica("colore", "verde");
                builder.buildSpecifica("radiobella", "potente");
                return ((AutoSportivaBuilder) builder).getResult();
            default:
                System.out.println("errore nel tipo di builder selezionato!");
                return null;
        }
    }

}
