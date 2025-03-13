import java.util.Arrays;

public class Playlist {
    private String[] songs;

    public Playlist(String[] songs) {
        this.songs = songs;
    }

    public Playlist(Playlist playlist) {
        this.songs = new String[playlist.getSongs().length];
        for (int i = 0; i < playlist.getSongs().length; i++) {
            this.songs[i] = playlist.getSongs()[i];
        }
    }

    public void printSongs() {
        for (String song : songs) {
            System.out.println(song + "\t");
        }
    }

    public String[] getSongs() {
        return songs;
    }

}
