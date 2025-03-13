package presentation;

import models.Concessionaria;
import models.Concessionaria2;
import models.FactoryDiLusso;
import models.FactoryEconomica;

public class App {
    public static void main(String[] args) throws Exception {
        // int sceltaVeicolo = -1;
        // FactoryDiLusso factoryDiLusso = new FactoryDiLusso();
        // FactoryEconomica factoryEconomica = new FactoryEconomica();
        // Concessionaria2 concessionaria2 = new Concessionaria2();
        // do {
        // sceltaVeicolo = InputTastiera.leggiInt("-1 crea moto\n-2 crea auto\n-0
        // esci");
        // int sceltaTipo = -1;
        // sceltaTipo = InputTastiera.leggiInt("-1 di lusso\n-2 economica");
        // switch (sceltaVeicolo) {
        // case 1:
        // if (sceltaTipo == 1)
        // System.out.println(concessionaria2.creaMoto(factoryDiLusso));
        // else
        // System.out.println(concessionaria2.creaMoto(factoryEconomica));
        // break;
        // case 2:
        // if (sceltaTipo == 2) {
        // System.out.println(concessionaria2.creaAuto(factoryDiLusso));
        // } else
        // System.out.println(concessionaria2.creaMoto(factoryEconomica));
        // default:
        // break;
        // }
        // } while (sceltaVeicolo != 0);
        FactoryDiLusso factoryDiLusso = new FactoryDiLusso();
        FactoryEconomica factoryEconomica = new FactoryEconomica();
        Concessionaria concessionaria = new Concessionaria(factoryDiLusso);
        System.out.println(concessionaria.creaAuto());
        System.out.println();

    }
}
