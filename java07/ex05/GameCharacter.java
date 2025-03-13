public abstract class GameCharacter {
    protected String name;
    protected double health;

    public GameCharacter(String name, double health) {
        this.name = name;
        this.health = health;
    }
    public abstract void attack(GameCharacter target);
    
}