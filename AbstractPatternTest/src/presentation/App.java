package presentation;

import models.Concessionaria;
import models.FactoryDiLusso;
import models.FactoryEconomica;

public class App {
    public static void main(String[] args) throws Exception {
        int sceltaVeicolo = -1;
        FactoryDiLusso factoryDiLusso = new FactoryDiLusso();
        FactoryEconomica factoryEconomica = new FactoryEconomica();
        Concessionaria concessionaria2 = new Concessionaria();
        do {
            sceltaVeicolo = InputTastiera.leggiInt("-1 crea moto\n-2 crea auto\n-0 esci\nInserisci la tua scelta : ");
            int sceltaTipo = -1;
            sceltaTipo = InputTastiera.leggiInt("-1 di lusso\n-2 economica\nInserisci la tua scelta : ");
            switch (sceltaVeicolo) {
                case 1:
                    if (sceltaTipo == 1)
                        System.out.println(concessionaria2.creaMoto(factoryDiLusso));
                    else
                        System.out.println(concessionaria2.creaMoto(factoryEconomica));
                    break;
                case 2:
                    if (sceltaTipo == 2) {
                        System.out.println(concessionaria2.creaAuto(factoryDiLusso));
                    } else
                        System.out.println(concessionaria2.creaMoto(factoryEconomica));
                default:
                    break;
            }
        } while (sceltaVeicolo != 0);

    }
}
