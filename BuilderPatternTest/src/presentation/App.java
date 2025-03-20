package presentation;

import models.AutoEconomicaBuilder;
import models.BuilderType;
import models.Concessionario;

public class App {
    public static void main(String[] args) throws Exception {

        AutoEconomicaBuilder autoEconomicaBuilder = new AutoEconomicaBuilder();
        Concessionario concessionario = new Concessionario(autoEconomicaBuilder);

        System.out.println(concessionario.make(BuilderType.AUTOECONOMICA));
    }
}
