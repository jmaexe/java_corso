public class Archer extends GameCharacter {
    private static final double DAMAGE = 45;
    public Archer(String name, double health) {
            super(name, health);
        }
    
        @Override
    public void attack(GameCharacter target) {
        target.health = target.health - 45;
        System.out.println(this.name + " shoots an arrow at " + target.name);
        System.out.println(target.name + " takes "+DAMAGE+" damage, remaining health : " + target.health);
        System.out.println();
    }

    
}