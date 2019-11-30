package prj5;

public class GlyphList {
    private Glyph[] glyphList;  
    private Song[] songs;
    
    public GlyphList(Song[] songs) {
        for(int i = 0 ;i < songs.length; i++) {
            glyphList = new Glyph[songs.length];
            this.songs =songs;
            // TOP_LEFT, TOP_MIDDLE, TOP_RIGHT, MIDDLE_LEFT, MIDDLE_MIDDLE, MIDDLE_RIGHT, 
            //BOTTOM_LEFT, BOTTOM_MIDDLE, BOTTOM_RIGHT
            switch(i%9) {
                case 0:
                    glyphList[i] = new Glyph(Position.TOP_LEFT, this.songs[i]);
                    break;
                case 1:
                    glyphList[i] = new Glyph(Position.TOP_MIDDLE, this.songs[i]);
                    break;
                case 2:
                    glyphList[i] = new Glyph(Position.TOP_RIGHT, this.songs[i]);
                    break;
                case 3:
                    glyphList[i] = new Glyph(Position.MIDDLE_LEFT, this.songs[i]);
                    break;
                case 4:
                    glyphList[i] = new Glyph(Position.MIDDLE_MIDDLE, this.songs[i]);
                    break;
                case 5:
                    glyphList[i] = new Glyph(Position.MIDDLE_RIGHT, this.songs[i]);
                    break;
                case 6:
                    glyphList[i] = new Glyph(Position.BOTTOM_LEFT, this.songs[i]);
                    break;
                case 7:
                    glyphList[i] = new Glyph(Position.BOTTOM_MIDDLE, this.songs[i]);
                    break;
                case 8:
                    glyphList[i] = new Glyph(Position.BOTTOM_RIGHT, this.songs[i]);
                    break;
                default:
                    break;
                    
            }
        }
    }
    private void swap(Song[] song,int a, int b) {
        Song temp = song[a];
        song[a] = song[b];
        song[b] = temp;
        
    }
    public void sortByArtist()
    {
        for(int i = 1; i < songs.length; i++) {
            String key = songs[i].getArtist(); 
            int j = i - 1; 
  
            
            while (j >= 0 && songs[j].getArtist().compareTo(key)>0) { 
                songs[j + 1] = songs[j]; 
                j = j - 1; 
            } 
            swap(songs,j+1,i);
            
        } 
            
    }
    
    
    public void sortBySongTitle()
    {
        for(int i = 1; i < songs.length; i++) {
            String key = songs[i].getSongTitle(); 
            int j = i - 1; 
  
            
            while (j >= 0 && songs[j].getSongTitle().compareTo(key)>0) { 
                songs[j + 1] = songs[j]; 
                j = j - 1; 
            } 
            swap(songs,j+1,i);
        } 
    }
    
    public void sortByGenre()
    {
        for(int i = 1; i < songs.length; i++) {
            String key = songs[i].getGenre(); 
            int j = i - 1; 
  
            
            while (j >= 0 && songs[j].getGenre().compareTo(key)>0) { 
                songs[j + 1] = songs[j]; 
                j = j - 1; 
            } 
            swap(songs,j+1,i); 
        } 
    }
    
    public void sortByDate()
    {
        for(int i = 1; i < songs.length; i++) {
            int key = songs[i].getYear(); 
            int j = i - 1; 
  
            
            while (j >= 0 && songs[j].getYear() > key) { 
                songs[j + 1] = songs[j]; 
                j = j - 1; 
            } 
            swap(songs,j+1,i);
        } 
    }
    
 
    

}
