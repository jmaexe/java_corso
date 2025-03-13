public class Publisher {

    public int initialState;
    private Subscriber subscriber;

    public Publisher(int initialState) {
        this.initialState = initialState;
    }

    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    public void changeState(int newState) {
        this.initialState = newState;
        subscriber.stampa(this.getState());
    }

    public int getState() {
        return initialState;
    }

}
