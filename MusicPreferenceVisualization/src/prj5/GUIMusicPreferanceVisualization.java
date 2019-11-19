/**
 * 
 */
package prj5;

import CS2114.Window;
import java.awt.Color;
import CS2114.Button;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.WindowSide;

/**
 * @author socce
 *
 */
public class GUIMusicPreferanceVisualization {
    //fields
    private Window window;
    private Glyph glyph;
    private Button sortByArtistName;
    private Button sortBySongTitle;
    private Button sortByReleaseYear;
    private Button sortByGenre;
    private Button next;
    private Button previous;
    private Button quit;
    private Button representHobby;
    private Button representRegion;
    private Button representMajor;
    private final static int SPACER = 50;
    private int windowW;
    private int windowH;

    
    //private DoubleLinkedList<Glyph> glyphs;
    
    public GUIMusicPreferanceVisualization()
    {
        
        window = new Window("Project 5");
        this.windowW = window.getWidth();
        this.windowH = window.getHeight();
        int x = (windowW - (2*SPACER))/3;
        int y = (windowH - (2*SPACER))/3;
        //this.glyph = new Glyph(Position.TOP_LEFT, null);
        
        previous = new Button("<- Prev");
        window.addButton(previous, WindowSide.NORTH);
        
        sortByArtistName = new Button("Sort by Artist Name");
        window.addButton(sortByArtistName, WindowSide.NORTH);
        
        sortBySongTitle = new Button("Sort by Song Title");
        window.addButton(sortBySongTitle, WindowSide.NORTH);
        
        sortByReleaseYear = new Button("Sort by Release Year");
        window.addButton(sortByReleaseYear, WindowSide.NORTH);
        
        sortByGenre = new Button("Sort by Genre");
        window.addButton(sortByGenre, WindowSide.NORTH);
        
        next = new Button("Next ->");
        window.addButton(next, WindowSide.NORTH);
               
        representHobby = new Button("Represent Hobby");
        window.addButton(representHobby, WindowSide.SOUTH);
        
        representMajor  = new Button("Represent Major");
        window.addButton(representMajor, WindowSide.SOUTH);
        
        representRegion = new Button("Represent Region");
        window.addButton(representRegion, WindowSide.SOUTH);
        
        quit = new Button("Quit");
        window.addButton(quit, WindowSide.SOUTH);
        
        TextShape titel = new TextShape(599, 150, "Hobby Lengend", Color.BLACK);
        titel.setBackgroundColor(Color.WHITE);
        window.addShape(titel);
        
        TextShape hobby1 = new TextShape(599, 170, "Read", Color.MAGENTA);
        hobby1.setBackgroundColor(Color.WHITE);
        window.addShape(hobby1);
        
        TextShape hobby2 = new TextShape(599, 186, "Art", Color.BLUE);
        hobby2.setBackgroundColor(Color.WHITE);
        window.addShape(hobby2);
        
        Color newColor = new Color(255, 204, 0);
        TextShape hobby3 = new TextShape(599, 202, "Sports", newColor);
        hobby3.setBackgroundColor(Color.WHITE);
        window.addShape(hobby3);
        
        TextShape hobby4 = new TextShape(599, 218, "Music", Color.GREEN);
        hobby4.setBackgroundColor(Color.WHITE);
        window.addShape(hobby4);
        
        TextShape titelSong = new TextShape(620, 240, "Song Title", Color.BLACK);
        titelSong.setBackgroundColor(Color.WHITE);
        window.addShape(titelSong);
        
        TextShape likes = new TextShape(660, 260, "Likes", Color.BLACK);
        likes.setBackgroundColor(Color.WHITE);
        window.addShape(likes);
        
        TextShape heard = new TextShape(600, 260, "Heard", Color.BLACK);
        heard.setBackgroundColor(Color.WHITE);
        window.addShape(heard);
        
        Shape pole = new Shape(650, 250, 5, 30, Color.BLACK);
        window.addShape(pole);
        
        Shape pole1 = new Shape(SPACER + (x/2) - (5/2), SPACER - 10, 5, y/2, Color.BLACK);
        window.addShape(pole1);
        
        Shape pole2 = new Shape(SPACER + (80) - (35), SPACER, 120, 10, Color.MAGENTA);
        window.addShape(pole2);
        
        Shape pole3 = new Shape(SPACER + (x/2) - (5/2) - 19, SPACER + 10, 100, 10, Color.BLUE);
        window.addShape(pole3);
        
        Shape pole4 = new Shape(SPACER + (x/2) - (5/2) - 19, SPACER + 20, 100, 10, newColor);
        window.addShape(pole4);
        
        Shape pole5 = new Shape(SPACER + (x/2) - (5/2) - 35, SPACER + 30, 150, 10, Color.GREEN);
        window.addShape(pole5);
        
        TextShape namee = new TextShape(100, 5, "Hotel California", Color.BLACK);
        namee.setBackgroundColor(Color.WHITE);
        window.addShape(namee);
        
        TextShape namee2 = new TextShape(100, 23, "By the Eagles", Color.BLACK);
        namee2.setBackgroundColor(Color.WHITE);
        window.addShape(namee2);
        
        //window.addButton()
        //this.glyphs = new DoubleLinkedList<Glyph>();
        
    }
    

}
