package Musis_Preference_Visualization;

import java.awt.Shape;

public class Glyph 
{
    private int[] rightPercentages;
    private int[] leftPercentages;
    private Song song;
    private Student[] student;
    private Position position;
    
    public Glyph(Position pos, Song song)
    {
        this.position = pos;
        this.song = song;
    }
    
    public int[] getRightPercentages()
    {
        return rightPercentages;
    }
    
    public int[] getLeftPercentages()
    {
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
    
    private int[] calculateRight()
    {
        int[] right;
        return null;
    }
    
    private int[] calculateLeft()
    {
        int[] left;
        return null;
    }
    
    private Shape constructVertBar()
    {
        return null;
    }
    
    public Shape constructGlyph()
    {
        return null;
    }
}
    