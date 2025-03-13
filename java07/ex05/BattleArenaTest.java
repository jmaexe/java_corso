public class BattleArenaTest {

    public static void main(String[] args) {
        GameCharacter knight = new Knight("Arthur", 100);
        GameCharacter archer = new Archer("Robin", 80);

        BattleArena.startBattle(knight, archer);
    }
}