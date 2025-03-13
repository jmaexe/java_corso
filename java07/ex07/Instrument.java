public abstract class Instrument {
    protected String name;

    public Instrument() {

    }

    public Instrument(String name) {
        this.name = name;
    }

    public abstract void playSound();

}