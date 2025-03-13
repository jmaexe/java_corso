package models;

public class Concessionaria {
    private VeicoloFactory factory;

    public Concessionaria(VeicoloFactory factory) {
        this.factory = factory;
    }

    public void setFactory(VeicoloFactory factory) {
        this.factory = factory;
    }

    public VeicoloFactory getFactory() {
        return factory;
    }

    public Auto creaAuto() {
        return factory.creaAuto();
    }

    public Moto creaMoto() {
        return factory.creaMoto();
    }

    @Override
    public String toString() {
        return "concessionaria : " + factory;
    }
}
