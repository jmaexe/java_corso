package models;

public class Concessionaria {

    public Concessionaria() {

    }

    public Auto creaAuto(VeicoloFactory factory) {
        return factory.creaAuto();
    }

    public Moto creaMoto(VeicoloFactory factory) {
        return factory.creaMoto();
    }

}
