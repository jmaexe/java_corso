public class FinalTest {

    public static void main(String[] args) {
        GamingProfile player = new GamingProfile("player1");

        player.setUsername("player2");
        player.setUsername("player3");

        player = new HackedProfile(player);
        player.setUsername("player4");
    }
}