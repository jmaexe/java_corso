public class DeepCopyTest {
    public static void main(String[] args) {
        String[] songs = {
                "fae",
                "agege",
                "bsb"
        };

        Playlist original = new Playlist(songs);
        Playlist copy = new Playlist(original);
        original.printSongs();
        copy.printSongs();

        System.out.println(original.getSongs() == copy.getSongs()); // This should print false
    }
}
