package models;

public class FactoryEconomica implements VeicoloFactory {

    @Override
    public Auto creaAuto() {
        System.out.println("creo auto economiche");
        return new AutoEconomica();
    }

    @Override
    public Moto creaMoto() {
        System.out.println("creo moto economiche");
        return new MotoEconomica();
    }

}
