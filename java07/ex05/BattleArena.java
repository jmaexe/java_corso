public class BattleArena {


    public static void startBattle(GameCharacter knight,GameCharacter archer) {
        
        System.out.println("Battle starts between " + knight.name + " and " + archer.name);
        while(knight.health > 0 || archer.health > 0) {
            knight.attack(archer);
            if(archer.health <= 0) {
                break;
            } else {
            archer.attack(knight);
            }
        }

        System.out.println((knight.health > 0 ? archer.name: knight.name) + " has been defeated" );
    }
    
}