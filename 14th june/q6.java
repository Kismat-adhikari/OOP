
interface Playlist{
    void addSong(String song);
    void removeSong(String song);
}

class MediaPlayer{
    void play(){
        System.out.println("Playing media...");
    }
    void pause(){
        System.out.println("Media paused.");
    }
    void stop(){
        System.out.println("Media stopped.");
    }
}

class VideoPlayer extends MediaPlayer implements Playlist{
    public void addSong(String song){
        System.out.println("Added to playlist: "+song);
    }
    public void removeSong(String song){
        System.out.println("Removed from playlist: "+song);
    }

    void rewind(){
        System.out.println("Rewinding video...");
    }
    void fastForward(){
        System.out.println("Fast forwarding video...");
    }
}

public class q6{
    public static void main(String args[]){
        VideoPlayer player=new VideoPlayer();

        player.play();
        player.pause();
        player.rewind();
        player.fastForward();
        player.stop();

        player.addSong("Song A");
        player.removeSong("Song A");
    }
}
