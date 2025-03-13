public class MusicPlayer {
    private AudioEffect audioEffect;

    public MusicPlayer() {
        this.audioEffect = new AudioEffect();
    }

    public void play(String song) {
        audioEffect.play(song);
    }

    public void setAudioEffect(AudioEffect audioEffect) {
        this.audioEffect = audioEffect;
    }
}