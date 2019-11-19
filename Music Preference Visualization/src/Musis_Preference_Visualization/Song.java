package Musis_Preference_Visualization;

import prj5.CompareHobby;
import prj5.CompareMajor;
import prj5.CompareState;
import prj5.FileReader;

public class Song 
{
    private String artist;
    private String songTitle;
    private int releaseYear;
    private String genre;
    private int numHobby;
    private int numMajor;
    private int numRegion;
    private CompareHobby compareHobby;
    private CompareMajor compareMajor;
    private CompareState compareState;
    private FileReader reader;
    
    public Song(String a, String st, int ry, String g)
    {
        artist = a;
        songTitle = st;
        releaseYear = ry;
        genre = g;
    }
    public String getArtist() {
        return artist;
    }
    public String getSongTitle() {
        return songTitle;
    }
    public int getYear() {
        return releaseYear;
    }
    public String getGenre() {
        return genre;
    }
}