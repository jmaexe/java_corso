package models;

public class FactoryDiLusso implements VeicoloFactory {

    @Override
    public Auto creaAuto() {
        System.out.println("creo auto di lusso");
        return new AutoDiLusso();
    }

    @Override
    public Moto creaMoto() {
        System.out.println("creo moto di lusso");
        return new MotoDiLusso();
    }

}
