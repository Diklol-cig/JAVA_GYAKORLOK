import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private Object songs;

    public Playlist(){
        ArrayList<Song> songs = new ArrayList<Song>();
    }

    public void add(Song zene){
        this.songs.add(zene);
    }
}
