public class CompositionSubClassingTest {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.play("Song 1");

        player.setAudioEffect(new EchoEffect());
        player.play("Song 2");

        player.setAudioEffect(new BassBoostEffect());
        player.play("Song 3");

        MusicPlayer bassBoostPlayer = new BassBoostMusicPlayer();
        bassBoostPlayer.play("Song 4");
        player.setAudioEffect(new EchoEffect());
        bassBoostPlayer.play("Song 5");
    }
}