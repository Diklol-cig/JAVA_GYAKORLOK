public class Song {
    private String title;
    private String artist;
    private int length;
    
    public Song(String title, String artist, int length){
        setTitle(title);
        setArtist(artist);
        setLength(length);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setLength(int length) {
        this.length = length;
    }

    
}
