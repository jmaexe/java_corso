public class BattleQuest extends Quest {

    private boolean enabled = false; 
    public BattleQuest(String name, double difficulty) {
        super(name, difficulty);
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    public void clearBattle() {
        setEnabled(true);    
    }
    @Override
    protected boolean validate() {
        return enabled;
    }

    
}