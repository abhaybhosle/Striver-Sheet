package Programs;

public class MusicPlayer {

    // Static nested class
    static class Song {
        private String title;
        private String artist;

        // Constructor
        public Song(String title, String artist) {
            this.title = title;
            this.artist = artist;
        }

        // Method to play the song
        public void play() {
            System.out.println("Now playing " + title + " by " + artist);
        }
    }

    public static void main(String[] args) {
        Song song = new Song("Shape of You", "Ed Sheeran");
        song.play();
    }
}
