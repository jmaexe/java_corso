public class BandConcertTest {

    public static void main(String[] args) {
        Band band = new Band();

        band.addInstrument(new Guitar());
        band.addInstrument(new Drum());
        band.addInstrument(new Piano());

        band.performConcert();
    }
}