import java.util.ArrayList;

public class Band {

    private ArrayList<Instrument> instruments;

    public Band() {
        this.instruments = new ArrayList<Instrument>();
    }

    public void addInstrument(Instrument instrument) {
        instruments.add(instrument);
    }

    public void performConcert() {
        for (Instrument instrument : instruments) {
            instrument.playSound();
        }
    }
}