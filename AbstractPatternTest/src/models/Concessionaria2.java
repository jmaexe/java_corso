package models;

public class Concessionaria2 {

    public Concessionaria2() {

    }

    public Auto creaAuto(VeicoloFactory factory) {
        return factory.creaAuto();
    }

    public Moto creaMoto(VeicoloFactory factory) {
        return factory.creaMoto();
    }

}
