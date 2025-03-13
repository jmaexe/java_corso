public class Knight extends GameCharacter {

    private static final  double DAMAGE = 40;
    public Knight(String name, double health) {
            super(name, health);
        }
    
    @Override
    public void attack(GameCharacter target) {
        target.health = target.health - DAMAGE;
        System.out.println(this.name + " swings a sword at " + target.name);
        System.out.println(target.name + " takes "+DAMAGE+" damage, remaining health : " + target.health);
        System.out.println();
    }

    
}