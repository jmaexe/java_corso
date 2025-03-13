public class FragileTest {

    public static void main(String[] args) {
        Quest quest = new Quest("bobobo",5);
        quest.complete();

        BattleQuest bossQuest = new BattleQuest("Destroy Ganon", 10);
        bossQuest.clearBattle();
        bossQuest.complete();
    }
}