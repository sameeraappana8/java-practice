package academy.learnprogramming;

import com.sun.source.tree.LiteralTree;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
	// write your code here
    Album album = new Album("Happiness", "Jonas brothers" );
    album.addNewSong("Sucker", 3.5);
    album.addNewSong("Happiness 2.0", 4.5);
    album.addNewSong("Cool", 4.32);
    album.addNewSong("Wives", 3.30);
    albums.add(album);

    album = new Album("Red", "Taylor Swift");
    album.addNewSong("Red", 4.3);
        album.addNewSong("I knew you were trouble", 4.2);
        album.addNewSong("We are never getting back together", 4.6);
        album.addNewSong("back to december", 3.35);
        albums.add(album);

    LinkedList<Song> playList = new LinkedList<Song>();
    albums.get(1).addToPlaylist("I knew you were trouble", playList);
    albums.get(0).addToPlaylist("Sucker", playList);
    albums.get(1).addToPlaylist("speed king", playList); //does not exist
    albums.get(1).addToPlaylist(3, playList);
    albums.get(0).addToPlaylist(4, playList);

    play(playList);

    }

    private static void play(LinkedList<Song> playList){
        Scanner scan = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist");
            return;
        }else{
            System.out.println("Now playing: " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = scan.nextInt();
            scan.nextLine();

            switch (action){
                case 0:
                    System.out.println("Exiting playlist.");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }

                    if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().toString());
                        }else{
                            System.out.println("we have reached the end of the playlist");
                            forward = false;
                        }
                    break;

                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else{
                        System.out.println("we have reached the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                        } else{
                            System.out.println("We are at the start of the list");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else{
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() >0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        } else if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                    }
                    break;

            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n"+
                "1 - to play next song\n"+
                "2 - to play previous song\n"+
                "3 - to replay the current song\n"+
                "4 - list songs in the playlist\n"+
                "5 - print available actions\n"+
                "6 - delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iter = playList.iterator();
        System.out.println("==========================");
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("===========================");
    }












}
