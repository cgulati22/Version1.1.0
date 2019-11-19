package prj5;

import java.awt.Shape;

public class Glyph 
{
    private int[] rightPercentages;
    private int[] leftPercentages;
    private Song song;
    private Student[] student;
    private int numStudents;
    private Position position;
    private FileReader reader;
    
    public Glyph(Position pos, Song song)
    {
        rightPercentages = new int[reader.getYes().length];
        reader = new FileReader();
        this.position = pos;
        this.song = song;
    }
    
    public int[] getRightPercentages()
    {
        
        for (int i = 0; i < rightPercentages.length; i++)
        {
            int likes = reader.getYes()[i];
            int dislikes = reader.getNo()[i];
            int total = likes + dislikes;
            rightPercentages[i] = (likes/total);
        }
        
        
        return rightPercentages;
    }
    
    public int[] getLeftPercentages()
    {
        for (int i = 0; i < leftPercentages.length; i++)
        {
            int likes = reader.getYes()[i];
            int dislikes = reader.getNo()[i];
            int total = likes + dislikes;
            leftPercentages[i] = (total / numStudents);
        }
        
        return leftPercentages;
    }
    
    public Song getSong()
    {
        return song;
    }
    
    public Position getPosition()
    {
        return position;
    }
}
   