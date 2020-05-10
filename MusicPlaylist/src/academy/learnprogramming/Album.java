package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {


    private static ArrayList<Song> songs = new ArrayList<Song>();
    private String albumName;
    private String artist;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
    }

    public static ArrayList<Song> getSongs() {
        return songs;
    }

    public String getAlbumName() {
        return albumName;
    }

    public boolean addNewSong(String title, double duration){
        if(findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }else{
            return false;
        }
    }

    private Song findSong(String title){
         for(Song checkedSong: this.songs){                 // Same as for(int i=0;i<songs.size();i++)
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber -1;
        if((index>=0)&& (index <= this.songs.size())) {
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist){
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a song with title " + title);
        return false;
    }
}
