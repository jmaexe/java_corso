public class Module {
    private String name;
    private int initialValue;
    private Manager manager;

    public Module(String name, int initialValue) {
        this.name = name;
        this.initialValue = initialValue;
    }

    public void setListener(Manager manager) {
        this.manager = manager;
    }

    public int getInitialValue() {
        return initialValue;
    }

    public String getName() {
        return name;
    }

    public void updateValue(int newValue) {
        this.initialValue = newValue;
        manager.update(this);
    }
}
